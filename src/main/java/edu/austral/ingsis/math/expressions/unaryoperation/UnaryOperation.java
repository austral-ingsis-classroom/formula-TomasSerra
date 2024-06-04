package edu.austral.ingsis.math.expressions.unaryoperation;

import edu.austral.ingsis.math.Expression;
import java.util.Set;

public abstract class UnaryOperation implements Expression {
  protected final Expression expression;

  public UnaryOperation(Expression expression) {
    this.expression = expression;
  }

  public Expression getExpression() {
    return expression;
  }

  @Override
  public Set<String> getVariables() {
    return this.expression.getVariables();
  }
}
