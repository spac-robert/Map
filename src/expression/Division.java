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
    public ComplexNumber executeOneOperation(Operation op) {
        ComplexNumber complexNumber = args[0];
        for (int i = 1; i < args.length && args[i] != null; i++) {
            complexNumber.division(args[i]);
        }
        return complexNumber;
    }
}
