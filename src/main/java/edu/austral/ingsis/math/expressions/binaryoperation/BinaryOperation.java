package edu.austral.ingsis.math.expressions.binaryoperation;

import edu.austral.ingsis.math.Expression;
import java.util.Set;

public abstract class BinaryOperation implements Expression {
  protected final Expression left;
  protected final Expression right;

  public BinaryOperation(Expression left, Expression right) {
    this.left = left;
    this.right = right;
  }

  public Expression getLeft() {
    return left;
  }

  public Expression getRight() {
    return right;
  }

  public Set<String> getVariables() {
    Set<String> variables = left.getVariables();
    variables.addAll(right.getVariables());
    return variables;
  }
}
