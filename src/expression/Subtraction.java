package expression;

import entity.ComplexExpression;
import entity.ComplexNumber;
import entity.Operation;

import java.util.List;

public class Subtraction extends ComplexExpression {
    public Subtraction(Operation op, List<ComplexNumber> args) {
        super(op, args);
    }

    @Override
    public ComplexNumber executeOneOperation(ComplexNumber number, ComplexNumber arg) {
        number.subtraction(arg);
        return number;
    }
}
