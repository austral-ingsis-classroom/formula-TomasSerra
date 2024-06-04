package edu.austral.ingsis.math;

import edu.austral.ingsis.math.expressions.Constant;
import edu.austral.ingsis.math.expressions.binaryoperation.*;
import edu.austral.ingsis.math.expressions.unaryoperation.Module;
import edu.austral.ingsis.math.expressions.unaryoperation.Parenthesis;
import java.util.HashMap;
import org.junit.jupiter.api.*;

public class ResolutionTest {

  /** Case 1 + 6 */
  @Test
  public void shouldResolveSimpleFunction1() {
    final Double result = 7d;
    Expression expression = new Addition(new Constant(1), new Constant(6));

    Assertions.assertEquals(result, expression.evaluate(new HashMap<>()));
  }

  /** Case 12 / 2 */
  @Test
  public void shouldResolveSimpleFunction2() {
    final Double result = 6d;
    Expression expression = new Division(new Constant(12), new Constant(2));

    Assertions.assertEquals(result, expression.evaluate(new HashMap<>()));
  }

  /** Case (9 / 2) * 3 */
  @Test
  public void shouldResolveSimpleFunction3() {
    final Double result = 13.5;
    Expression expression =
        new Multiplication(
            new Parenthesis(new Division(new Constant(9), new Constant(2))), new Constant(3));

    Assertions.assertEquals(result, expression.evaluate(new HashMap<>()));
  }

  /** Case (27 / 6) ^ 2 */
  @Test
  public void shouldResolveSimpleFunction4() {
    final Double result = 20.25;
    Expression expression =
        new Power(
            new Parenthesis(new Division(new Constant(27), new Constant(6))), new Constant(2));

    Assertions.assertEquals(result, expression.evaluate(new HashMap<>()));
  }

  /** Case 36 ^ (1/2) */
  @Test
  public void shouldResolveSimpleFunction5() {
    final Double result = 6d;
    Expression expression =
        new Power(
            new Constant(36), new Parenthesis(new Division(new Constant(1), new Constant(2))));

    Assertions.assertEquals(result, expression.evaluate(new HashMap<>()));
  }

  /** Case |136| */
  @Test
  public void shouldResolveSimpleFunction6() {
    final Double result = 136d;
    Expression expression = new Module(new Constant(136));

    Assertions.assertEquals(result, expression.evaluate(new HashMap<>()));
  }

  /** Case |-136| */
  @Test
  public void shouldResolveSimpleFunction7() {
    final Double result = 136d;
    Expression expression = new Module(new Constant(-136));

    Assertions.assertEquals(result, expression.evaluate(new HashMap<>()));
  }

  /** Case (5 - 5) * 8 */
  @Test
  public void shouldResolveSimpleFunction8() {
    final Double result = 0d;
    Expression expression =
        new Multiplication(
            new Parenthesis(new Substraction(new Constant(5), new Constant(5))), new Constant(8));

    Assertions.assertEquals(result, expression.evaluate(new HashMap<>()));
  }
}
