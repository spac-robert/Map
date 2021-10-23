package entity;

import java.util.List;

public abstract class ComplexExpression {
    private final Operation op;
    private final ComplexNumber[] complexNumbers;

    public ComplexExpression(Operation op, List<ComplexNumber> args) {
        this.op = op;
        this.complexNumbers = args.toArray(new ComplexNumber[0]);
    }

    public abstract ComplexNumber executeOneOperation(ComplexNumber number, ComplexNumber arg);

    //return the expression result
    public ComplexNumber execute() {
        ComplexNumber number = complexNumbers[0];
        for (int i = 1; i < complexNumbers.length && complexNumbers[i] != null; i++) {
            number = executeOneOperation(number, complexNumbers[i]);
        }
        return number;

    }
}
