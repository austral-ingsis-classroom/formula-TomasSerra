package edu.austral.ingsis.math.expressions.binaryoperation;

import edu.austral.ingsis.math.Expression;
import java.util.Map;

public class Division extends BinaryOperation {

  public Division(Expression left, Expression right) {
    super(left, right);
  }

  @Override
  public double evaluate(Map<String, Double> values) {
    return super.getLeft().evaluate(values) / super.getRight().evaluate(values);
  }

  @Override
  public String toString() {
    return super.getLeft().toString() + " / " + super.getRight().toString();
  }
}
