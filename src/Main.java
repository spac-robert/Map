
import entity.ComplexExpression;
import validator.ValidationException;

public class Main {
    public static void main(String[] args) {

        try {
            ComplexExpression result = ExpressionParser.parse(args);
            if (result != null) {
                System.out.println(result.execute());
            }
        } catch (ValidationException e) {
            System.out.println(e);
        }
    }
}
