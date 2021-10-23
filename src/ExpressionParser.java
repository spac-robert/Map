import entity.ComplexExpression;
import entity.ComplexNumber;
import entity.Operation;
import expression.ExpressionFactory;
import validator.ValidationException;
import validator.ValidatorComplexNumber;

import java.util.LinkedList;
import java.util.List;

public class ExpressionParser {
    private static final char sign = '-';

    private static ComplexNumber parseComplexNumber(String str) {
        double re = 1.0;
        double im = 1.0;
        //Generic case
        if (str.charAt(0) == sign) {
            re = -1.0;
            str = str.substring(1);
        }
        String[] tokens = str.split("[\\Q+-\\Ei]");
        if (str.contains(String.valueOf(sign))) {
            im = -1.0;
        }

        re = re * ValidatorComplexNumber.isNumber(tokens[0]);
        im = im * ValidatorComplexNumber.isNumber(tokens[1]);
        return new ComplexNumber(re, im);
    }

    public static ComplexExpression parse(String[] args) {
        try {
            List<ComplexNumber> complexNumbers = getComplexNumbers(args);

            Operation operation = Operation.fromString(args[1]);
            ExpressionFactory expressionFactory = ExpressionFactory.getInstance();

            return expressionFactory.createExpression(operation, complexNumbers);
        } catch (IllegalArgumentException e) {
            throw new ValidationException(e);
        }
    }

    private static List<ComplexNumber> getComplexNumbers(String[] args) {
        List<ComplexNumber> complexNumbers = new LinkedList<>();
        for (int i = 0; i < args.length && args[i] != null; i = i + 2) {
            complexNumbers.add(parseComplexNumber(args[i]));
        }
        return complexNumbers;
    }

}
