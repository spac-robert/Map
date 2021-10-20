package validator;

public class ValidatorComplexNumber {
    public static boolean isValid(String str) {
        boolean isok = false;
        int nr = 0;
        if (str.charAt(0) == '-') {
            isok = true;
        }
        String[] tokens = str.split("[\\Q+-\\Ei]");
        try {
            if (isok) {
                nr++;
            }
            Double x = Double.parseDouble(tokens[nr]);
            Double y = Double.parseDouble(tokens[nr + 1]);
            if (isok) {
                x = x * (-1);
            }
            return true;
        } catch (ValidationException | IndexOutOfBoundsException e) {
            return false;
        }
    }
}
