package edu.austral.ingsis.math.expressions;

import edu.austral.ingsis.math.Expression;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Variable implements Expression {
  private final String name;

  public Variable(String name) {
    this.name = name;
  }

  @Override
  public double evaluate(Map<String, Double> values) {
    return values.get(name);
  }

  public String toString() {
    return name;
  }

  @Override
  public Set<String> getVariables() {
    return new HashSet<>(Set.of(name));
  }
}
