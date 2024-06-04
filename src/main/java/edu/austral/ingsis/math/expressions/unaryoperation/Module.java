package edu.austral.ingsis.math.expressions.unaryoperation;

import edu.austral.ingsis.math.Expression;
import java.util.Map;

public class Module extends UnaryOperation {

  public Module(Expression expression) {
    super(expression);
  }

  @Override
  public double evaluate(Map<String, Double> values) {
    return Math.abs(super.getExpression().evaluate(values));
  }

  @Override
  public String toString() {
    return "|" + super.getExpression().toString() + "|";
  }
}
