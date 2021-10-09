package expression;

import entity.ComplexExpression;
import entity.ComplexNumber;
import entity.Operation;

import java.util.Arrays;

public class Division extends ComplexExpression {
    public Division(Operation op, ComplexNumber[] args) {
        super(op, Arrays.asList(args));
    }

    @Override
    public ComplexNumber executeOneOperation(Operation op) {
        return null;
    }
}
