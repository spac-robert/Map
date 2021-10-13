import entity.ComplexExpression;
import entity.ComplexNumber;
import entity.Operation;
import expression.ExpressionFactory;
import validator.ValidationException;
import validator.ValidatorComplexNumber;

import java.util.LinkedList;
import java.util.List;

public class ExpressionParser {

    private static ComplexNumber parseComplexNumber(String str) {
        double re = 1.0;
        double im = 1.0;
        //Generic case
        if (str.charAt(0) == '-') {
            re = -1.0;
            str = str.substring(1);
        }
        String[] tokens = str.split("[\\Q+-\\Ei]");
        if (str.contains("-")) {
            im = -1.0;
        }
        re = re * Double.parseDouble(tokens[0]);
        im = im * Double.parseDouble(tokens[1]);
        return new ComplexNumber(re, im);
    }

    public static ComplexExpression parse(String[] args) {
        List<ComplexNumber> complexNumbers = new LinkedList<>();
        for (int i = 0; i < args.length && args[i] != null; i = i + 2) {
            if (ValidatorComplexNumber.isValid(args[i])) {
                complexNumbers.add(parseComplexNumber(args[i]));
            } else {
                throw new ValidationException("Nu e bine");
            }
        }

        try {
            Operation operation = Operation.fromString(args[1]);
            ExpressionFactory expressionFactory = ExpressionFactory.getInstance();

            return expressionFactory.createExpression(operation, complexNumbers);
        } catch (IllegalArgumentException e) {
            throw new ValidationException(e);
        }
    }

}
