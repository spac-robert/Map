package expression;

import entity.ComplexExpression;
import entity.ComplexNumber;
import entity.Operation;

import java.util.List;

public class Addition extends ComplexExpression {
    public Addition(Operation op, List<ComplexNumber> args) {
        super(op, args);
    }

    @Override
    public ComplexNumber executeOneOperation(ComplexNumber number, ComplexNumber arg) {
        number.addition(arg);
        return number;
    }
}
