package edu.austral.ingsis.math;

import edu.austral.ingsis.math.expressions.Constant;
import edu.austral.ingsis.math.expressions.Variable;
import edu.austral.ingsis.math.expressions.binaryoperation.*;
import edu.austral.ingsis.math.expressions.unaryoperation.Module;
import edu.austral.ingsis.math.expressions.unaryoperation.Parenthesis;
import java.util.Map;
import org.junit.jupiter.api.*;

public class ResolutionWithVariablesTest {

  /** Case 1 + x where x = 3 */
  @Test
  public void shouldResolveFunction1() {
    final Double result = 4d;
    Expression expression = new Addition(new Constant(1), new Variable("x"));
    Map<String, Double> values = Map.of("x", 3d);

    Assertions.assertEquals(result, expression.evaluate(values));
  }

  /** Case 12 / div where div = 4 */
  @Test
  public void shouldResolveFunction2() {
    final Double result = 3d;
    Expression expression = new Division(new Constant(12), new Variable("div"));
    Map<String, Double> values = Map.of("div", 4d);

    Assertions.assertEquals(result, expression.evaluate(values));
  }

  /** Case (9 / x) * y where x = 3 and y = 4 */
  @Test
  public void shouldResolveFunction3() {
    final Double result = 12d;
    Expression expression =
        new Multiplication(
            new Parenthesis(new Division(new Constant(9), new Variable("x"))), new Variable("y"));
    Map<String, Double> values = Map.of("x", 3d, "y", 4d);

    Assertions.assertEquals(result, expression.evaluate(values));
  }

  /** Case (27 / a) ^ b where a = 9 and b = 3 */
  @Test
  public void shouldResolveFunction4() {
    final Double result = 27d;
    Expression expression =
        new Power(
            new Parenthesis(new Division(new Constant(27), new Variable("a"))), new Variable("b"));
    Map<String, Double> values = Map.of("a", 9d, "b", 3d);

    Assertions.assertEquals(result, expression.evaluate(values));
  }

  /** Case z ^ (1/2) where z = 36 */
  @Test
  public void shouldResolveFunction5() {
    final Double result = 6d;
    Expression expression =
        new Power(
            new Variable("z"), new Parenthesis(new Division(new Constant(1), new Constant(2))));
    Map<String, Double> values = Map.of("z", 36d);

    Assertions.assertEquals(result, expression.evaluate(values));
  }

  /** Case |value| - 8 where value = 8 */
  @Test
  public void shouldResolveFunction6() {
    final Double result = 0d;
    Expression expression = new Substraction(new Module(new Variable("value")), new Constant(8));
    Map<String, Double> values = Map.of("value", 8d);

    Assertions.assertEquals(result, expression.evaluate(values));
  }

  /** Case |value| - 8 where value = 8 */
  @Test
  public void shouldResolveFunction7() {
    final Double result = 0d;
    Expression expression = new Substraction(new Module(new Variable("value")), new Constant(8));
    Map<String, Double> values = Map.of("value", 8d);

    Assertions.assertEquals(result, expression.evaluate(values));
  }

  /** Case (5 - i) * 8 where i = 2 */
  @Test
  public void shouldResolveFunction8() {
    final Double result = 24d;
    Expression expression =
        new Multiplication(
            new Parenthesis(new Substraction(new Constant(5), new Variable("i"))), new Constant(8));
    Map<String, Double> values = Map.of("i", 2d);

    Assertions.assertEquals(result, expression.evaluate(values));
  }
}
