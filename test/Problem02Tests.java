import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Problem02Tests {
  @Test(timeout = 10)
  public void testGetTrue() {
    assertTrue(Problem02.getTrue());
  }

  @Test(timeout = 10)
  public void testCalculateFibonacciSum8() {
    int limit = 8;
    int expected = 10;
    int actual = Problem02.calculateFibonacciSum(limit);
    assertEquals(expected, actual);
  }

  @Test(timeout = 10)
  public void testCalculateFibonacciSum34() {
    int limit = 34;
    int expected = 44;
    int actual = Problem02.calculateFibonacciSum(limit);
    assertEquals(expected, actual);
  }

  @Test(timeout = 10)
  public void testCalculateFibonacciSum4M() {
    int limit = 4_000_000;
    int expected = 4613732;
    int actual = Problem02.calculateFibonacciSum(limit);
    assertEquals(expected, actual);
  }
}
