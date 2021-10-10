
import entity.ComplexExpression;

public class Main {
    public static void main(String[] args) {
        /**
         * To do the multiply and subtraction functions in Complex number
         * and then to implement the onOperation method in Multiply and Subtraction classes
         */
        ComplexExpression result = ExpressionParser.parse(args);
        System.out.println(result.execute());
    }
}
