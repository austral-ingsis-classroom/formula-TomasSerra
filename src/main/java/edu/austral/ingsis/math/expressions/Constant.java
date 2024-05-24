package edu.austral.ingsis.math.expressions;

import edu.austral.ingsis.math.Expression;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Constant implements Expression {
    private final double value;

    public Constant(double value) {
        this.value = value;
    }

    @Override
    public double evaluate(Map<String, Double> values) {
        return value;
    }

    @Override
    public String toString() {
        if(isInteger(value)) return "" + (int) value;
        return "" + value;
    }

    @Override
    public Set<String> getVariables() {
        return new HashSet<>();
    }

    private static boolean isInteger(Double value) {
        return value % 1 == 0;
    }
}
