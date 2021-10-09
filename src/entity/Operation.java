package entity;

public enum Operation {
    ADDITION("+"), DIVISION("-"), MULTIPLY("*"), SUBTRACTION("/");

    private final String string;

    Operation(String string) {
        this.string = string;
    }

    public static Operation fromString(String sign) {
        for (Operation op : Operation.values()) {
            if (op.string.equals(sign)) {
                return op;
            }
        }
        throw new IllegalArgumentException("Invalid sign" + sign);
    }
}
