package validator;

public class ValidatorComplexNumber {
    public static boolean isValid(String str) {
        String[] tokens = str.split("[\\Q+-\\Ei]");
        try {
            Double x = Double.parseDouble(tokens[0]);
            Double y = Double.parseDouble(tokens[1]);
            return true;
        }catch (ValidationException e){
            return false;
        }
    }
}
