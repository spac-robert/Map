package expression;

import entity.ComplexExpression;
import entity.ComplexNumber;
import entity.Operation;

import java.util.List;

public class Addition extends ComplexExpression {
    public Addition(Operation op, List<ComplexNumber> args) {
        super(op, args);
    }

    //maybe I don't need the operation as a parameter in executeOneOperation
    @Override
    public ComplexNumber executeOneOperation(Operation op, ComplexNumber number, ComplexNumber arg) {
        number.addition(arg);
        return number;
    }
}
