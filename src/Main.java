
import entity.ComplexExpression;

public class Main {
    public static void main(String[] args) {
        ComplexExpression result = ExpressionParser.parse(args);
        System.out.println(result.execute());
    }
}
