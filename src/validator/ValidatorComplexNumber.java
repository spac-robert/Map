package validator;

public class ValidatorComplexNumber {
    public static boolean isValid(String str) {
        String[] tokens = str.split("[\\Q+-\\Ei]");
        if (tokens.length > 1) {
            return tokens[0].matches("[0-9]+") && tokens[1].matches("[0-9]+");
        }
        return false;
    }
}
