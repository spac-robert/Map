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
    public ComplexNumber executeOneOperation(Operation op) {

        ComplexNumber complexNumber = new ComplexNumber(0.0, 0.0);
        for (ComplexNumber x : this.args) {
            complexNumber.addition(x);
        }
        return complexNumber;
    }
}