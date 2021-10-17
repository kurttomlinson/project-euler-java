import java.util.ArrayList;

// The prime factors of 13195 are 5, 7, 13 and 29.

// What is the largest prime factor of the number 600851475143 ?

public class Problem03 {
  public static long largestPrimeFactor(long n) {
    for (long divisor = 2; divisor < n; divisor++) {
      if (n % divisor == 0) {
        // divisor is a factor!
        long smallerFactor = divisor;
        long largerFactor = n / smallerFactor;
        if (isPrime(largerFactor)) {
          return largerFactor;
        }
      }
    }
    return -1;
  }

  public static boolean isPrime(long n) {
    for (long divisor = 2; divisor < n; divisor++) {
      if (n % divisor == 0) {
        // has a factor --> composite!
        return false;
      }
    }
    // has no factors --> prime!
    return true;
  }

  public static ArrayList<Long> factorize(long n) {
    ArrayList<Long> factors = new ArrayList<>();

    for (long divisor = 2; divisor < n; divisor++) {
      if (n % divisor == 0) {
        // divisor is a factor of n!
        factors.add(divisor);
      }
    }
    return factors;
  }

  public static ArrayList<Long> primeFactorize(long n) {
    ArrayList<Long> factors = factorize(n);
    ArrayList<Long> primeFactors = new ArrayList<>();

    for (long factor : factors) {
      if (isPrime(factor)) {
        primeFactors.add(factor);
      }
    }

    return primeFactors;
  }
}
