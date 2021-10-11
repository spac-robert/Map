package entity;

import java.util.List;

public abstract class ComplexExpression {
    public final Operation op;
    public final ComplexNumber[] args;

    public ComplexExpression(Operation op, List<ComplexNumber> args) {
        this.op = op;
        this.args = args.toArray(new ComplexNumber[0]);
    }

    public abstract ComplexNumber executeOneOperation(Operation op, ComplexNumber number, ComplexNumber arg);

    //return the expression result
    public ComplexNumber execute() {
        ComplexNumber number = args[0];
        for (int i = 1; i< args.length && args[i] != null; i++) {
            number = executeOneOperation(op,number,args[i]);
        }
        return number;
        //return executeOneOperation(op);
    }
}
