package entity;

public enum Operation {
    ADDITION("+"), DIVISION("/"), MULTIPLICATION("*"), SUBTRACTION("-");

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

    private boolean isNotOperation(String op, String s) {
        return !s.equals(op);
    }
}
