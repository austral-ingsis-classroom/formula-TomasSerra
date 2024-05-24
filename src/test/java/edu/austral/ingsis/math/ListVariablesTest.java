package edu.austral.ingsis.math;

import edu.austral.ingsis.math.expressions.Constant;
import edu.austral.ingsis.math.expressions.Variable;
import edu.austral.ingsis.math.expressions.binaryoperation.*;
import edu.austral.ingsis.math.expressions.unaryoperation.Module;
import edu.austral.ingsis.math.expressions.unaryoperation.Parenthesis;
import org.junit.jupiter.api.*;

import java.util.Set;


public class ListVariablesTest {

  /** Case 1 + 6 */
  @Test
  public void shouldListVariablesFunction1() {
    final Set<String> result = Set.of();
    Expression expression = new Addition(new Constant(1), new Constant(6));

    Assertions.assertEquals(result, expression.getVariables());
  }

  /** Case 12 / div */
  @Test
  public void shouldListVariablesFunction2() {
    final Set<String> result = Set.of("div");
    Expression expression = new Division(new Constant(12), new Variable("div"));

    Assertions.assertEquals(result, expression.getVariables());
  }

  /** Case (9 / x) * y */
  @Test
  public void shouldListVariablesFunction3() {
    final Set<String> result = Set.of("x", "y");
    Expression expression = new Multiplication(new Parenthesis(new Division(new Constant(9), new Variable("x"))), new Variable("y"));

    Assertions.assertEquals(result, expression.getVariables());
  }

  /** Case (27 / a) ^ b */
  @Test
  public void shouldListVariablesFunction4() {
    final Set<String> result = Set.of("a", "b");
    Expression expression = new Power(new Parenthesis(new Division(new Constant(27), new Variable("a"))), new Variable("b"));

    Assertions.assertEquals(result, expression.getVariables());
  }

  /** Case z ^ (1/2) */
  @Test
  public void shouldListVariablesFunction5() {
    final Set<String> result = Set.of("z");
    Expression expression = new Power(new Variable("z"), new Parenthesis(new Division(new Constant(1), new Constant(2))));

    Assertions.assertEquals(result, expression.getVariables());
  }

  /** Case |value| - 8 */
  @Test
  public void shouldListVariablesFunction6() {
    final Set<String> result = Set.of("value");
    Expression expression = new Substraction(new Module(new Variable("value")), new Constant(8));

    Assertions.assertEquals(result, expression.getVariables());
  }

  /** Case (5 - i) * 8 */
  @Test
  public void shouldListVariablesFunction8() {
    final Set<String> result = Set.of("i");
    Expression expression = new Multiplication(new Parenthesis(new Substraction(new Constant(5), new Variable("i"))), new Constant(8));

    Assertions.assertEquals(result, expression.getVariables());
  }
}
