package edu.austral.ingsis.math;

import java.util.Map;
import java.util.Set;

public interface Expression {
  public double evaluate(Map<String, Double> values);

  public String toString();

  public Set<String> getVariables();
}
