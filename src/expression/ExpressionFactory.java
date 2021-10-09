package expression;

import entity.ComplexExpression;
import entity.ComplexNumber;
import entity.Operation;

import java.util.List;

public class ExpressionFactory {
    private static ExpressionFactory instance;

    private ExpressionFactory() {
    }

    public ComplexExpression createExpression(Operation operation, List<ComplexNumber> args) {

        switch (operation) {
            case ADDITION:
                return new Addition(operation, args);
            default:
                break;
        }
        return null;
    }

    public static ExpressionFactory getInstance() {
        if (instance == null) {
            instance = new ExpressionFactory();
        }
        return instance;
    }

}
