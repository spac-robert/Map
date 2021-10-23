package expression;

import entity.ComplexExpression;
import entity.ComplexNumber;
import entity.Operation;

import java.util.List;

public class Division extends ComplexExpression {
    public Division(Operation op, List<ComplexNumber> args) {
        super(op, args);
    }

    @Override
    public ComplexNumber executeOneOperation(ComplexNumber number, ComplexNumber arg) {
        number.division(arg);
        return number;
    }
}
