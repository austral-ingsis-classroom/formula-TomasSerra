package edu.austral.ingsis.math.expressions.binaryoperation;

import edu.austral.ingsis.math.Expression;

import java.util.Map;
import java.util.Set;

public class Addition extends BinaryOperation{

    public Addition(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double evaluate(Map<String, Double> values) {
        return super.getLeft().evaluate(values) + super.getRight().evaluate(values);
    }

    @Override
    public String toString() {
        return super.getLeft().toString() + " + " + super.getRight().toString();
    }
}
