package edu.austral.ingsis.math;

import edu.austral.ingsis.math.expressions.Constant;
import edu.austral.ingsis.math.expressions.Variable;
import edu.austral.ingsis.math.expressions.binaryoperation.*;
import edu.austral.ingsis.math.expressions.unaryoperation.Module;
import edu.austral.ingsis.math.expressions.unaryoperation.Parenthesis;
import org.junit.jupiter.api.*;

public class PrintTest {

  /** Case 1 + 6 */
  @Test
  public void shouldPrintFunction1() {
    final String expected = "1 + 6";
    Expression expression = new Addition(new Constant(1), new Constant(6));

    Assertions.assertEquals(expected, expression.toString());
  }

  /** Case 12 / 2 */
  @Test
  public void shouldPrintFunction2() {
    final String expected = "12 / 2";
    Expression expression = new Division(new Constant(12), new Constant(2));

    Assertions.assertEquals(expected, expression.toString());
  }

  /** Case (9 / 2) * 3 */
  @Test
  public void shouldPrintFunction3() {
    final String expected = "(9 / 2) * 3";
    Expression expression =
        new Multiplication(
            new Parenthesis(new Division(new Constant(9), new Constant(2))), new Constant(3));

    Assertions.assertEquals(expected, expression.toString());
  }

  /** Case (27 / 6) ^ 2 */
  @Test
  public void shouldPrintFunction4() {
    final String expected = "(27 / 6) ^ 2";
    Expression expression =
        new Power(
            new Parenthesis(new Division(new Constant(27), new Constant(6))), new Constant(2));

    Assertions.assertEquals(expected, expression.toString());
  }

  /** Case |value| - 8 */
  @Test
  public void shouldPrintFunction6() {
    final String expected = "|value| - 8";
    Expression expression = new Substraction(new Module(new Variable("value")), new Constant(8));

    Assertions.assertEquals(expected, expression.toString());
  }

  /** Case (5 - i) * 8 */
  @Test
  public void shouldPrintFunction8() {
    final String expected = "(5 - i) * 8";
    Expression expression =
        new Multiplication(
            new Parenthesis(new Substraction(new Constant(5), new Variable("i"))), new Constant(8));

    Assertions.assertEquals(expected, expression.toString());
  }
}
