import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class Problem03Tests {
  @Test(timeout = 10)
  public void testIsPrime() {
    assertTrue(Problem03.isPrime(5));
    assertTrue(Problem03.isPrime(3));
    assertTrue(Problem03.isPrime(7));
    assertTrue(Problem03.isPrime(11));
    assertTrue(Problem03.isPrime(13));
    assertTrue(Problem03.isPrime(17));

    assertFalse(Problem03.isPrime(4));
    assertFalse(Problem03.isPrime(6));
    assertFalse(Problem03.isPrime(9));
    assertFalse(Problem03.isPrime(15));
  }

  @Test(timeout = 10)
  public void testFactorize() {
    ArrayList<Long> expected = new ArrayList<>();
    expected.add(2L);
    expected.add(3L);
    expected.add(4L);
    expected.add(6L);

    ArrayList<Long> actual = Problem03.factorize(12);
    assertEquals(expected, actual);
  }

  @Test(timeout = 10)
  public void testPrimeFactorize() {
    ArrayList<Long> expected = new ArrayList<>();
    expected.add(2L);
    expected.add(3L);

    ArrayList<Long> actual = Problem03.primeFactorize(12);
    assertEquals(expected, actual);
  }

  @Test(timeout = 10)
  public void testPrimeFactorizeBigger() {
    ArrayList<Long> expected = new ArrayList<>();
    expected.add(5L);
    expected.add(7L);
    expected.add(13L);
    expected.add(29L);

    ArrayList<Long> actual = Problem03.primeFactorize(13195);
    assertEquals(expected, actual);
  }

  // @Test(timeout = 10)
  // public void testPrimeFactorizeBiggest() {
  // ArrayList<Long> expected = new ArrayList<>();
  // expected.add(5L);
  // expected.add(7L);
  // expected.add(13L);
  // expected.add(29L);

  // ArrayList<Long> actual = Problem03.primeFactorize(600851475143L);
  // assertEquals(expected, actual);
  // }

  @Test(timeout = 10)
  public void testLargestPrimeFactor() {
    long expected = 29;
    long actual = Problem03.largestPrimeFactor(13195);
    assertEquals(expected, actual);
  }

  @Test(timeout = 10)
  public void testLargestPrimeFactorBiggest() {
    long expected = 6857;
    long actual = Problem03.largestPrimeFactor(600851475143L);
    assertEquals(expected, actual);
  }
}
