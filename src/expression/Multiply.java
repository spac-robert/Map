package expression;

import entity.ComplexExpression;
import entity.ComplexNumber;
import entity.Operation;

import java.util.List;

public class Multiply extends ComplexExpression {

    public Multiply(Operation op, List<ComplexNumber> args) {
        super(op, args);
    }

    @Override
    public ComplexNumber executeOneOperation(ComplexNumber number, ComplexNumber arg) {
        number.multiply(arg);
        return number;
    }
}
