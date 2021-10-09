package entity;

import java.util.List;

public abstract class ComplexExpression {
    public final Operation op;
    public final ComplexNumber[] args;

    public ComplexExpression(Operation op, List<ComplexNumber> args) {
        this.op = op;
        this.args = args.toArray(new ComplexNumber[0]);
    }

    // A + B + C
    // complexOp(+, [complexOp(+, [a,b]), c])
    public abstract ComplexNumber executeOneOperation(Operation op);

    //return the expression result
    public ComplexNumber execute() {
//        ComplexNumber number = args[0];
//        for (int i = 1; args[i] != null; i++) {
//            return executeOneOperation(op);
//        }
//        return number;
        return executeOneOperation(op);
    }
}
