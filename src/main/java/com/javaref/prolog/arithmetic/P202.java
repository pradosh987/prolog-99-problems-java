package com.javaref.prolog.arithmetic;

import java.util.*;


public class P202 {
  public static List<Integer> primeFactors(int num) {
    Set<Integer> primeSeed = new TreeSet<>(Arrays.asList(2, 3, 5, 7, 11));
    List<Integer> primeFactors = new ArrayList<>();

    int currentFactor = 2;
    while (currentFactor <= num) {
      if (num % currentFactor == 0) {
        primeFactors.add(currentFactor);
        num = num / currentFactor;
        if (num == 1) return primeFactors;
        currentFactor = 2;
      } else {
        currentFactor = nextPrime(currentFactor, primeSeed);
        primeSeed.add(currentFactor);
      }
    }
    return Collections.emptyList(); // This is unrechable code
  }

  private static int nextPrime(int num, Set<Integer> primeSeed) {
    while (true) {
      if (isPrime(num++, primeSeed)) return num;
    }
  }

  private static boolean isPrime(int number, Set<Integer> primeSeed) {
    if (number <= ((TreeSet<Integer>) primeSeed).last()) {
      return primeSeed.contains(number);
    } else {
      return P201.isPrime(number);
    }
  }
}
