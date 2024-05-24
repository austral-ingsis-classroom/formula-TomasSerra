package edu.austral.ingsis.math.expressions.unaryoperation;

import edu.austral.ingsis.math.Expression;
import edu.austral.ingsis.math.expressions.binaryoperation.BinaryOperation;

import java.util.Map;

public class Parenthesis extends UnaryOperation {

        public Parenthesis(Expression expression) {
            super(expression);
        }

        @Override
        public double evaluate(Map<String, Double> values) {
            return super.getExpression().evaluate(values);
        }

        @Override
        public String toString() {
            return "(" + super.getExpression().toString() + ")";
        }
}
