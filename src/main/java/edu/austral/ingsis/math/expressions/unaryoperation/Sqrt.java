package edu.austral.ingsis.math.expressions.unaryoperation;

import edu.austral.ingsis.math.Expression;
import java.util.Map;

public class Sqrt extends UnaryOperation {

  public Sqrt(Expression expression) {
    super(expression);
  }

  @Override
  public double evaluate(Map<String, Double> values) {
    return Math.sqrt(super.getExpression().evaluate(values));
  }

  @Override
  public String toString() {
    return "sqrt(" + super.getExpression().toString() + ")";
  }
}
