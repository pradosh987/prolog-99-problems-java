package com.javaref.prolog.arithmetic;

import java.util.AbstractMap;
import java.util.List;

public class P210 {
  public static int totient_phi(int m) {
    if (m == 1) return 1;
    List<AbstractMap.SimpleEntry<Integer, Integer>> primeFactors = P203.primeFactorsMult(m);
    double result = 1;
    for (AbstractMap.SimpleEntry<Integer, Integer> primeFactor : primeFactors) { // key = m, value = p
      result = result * (primeFactor.getValue() - 1) * Math.pow(primeFactor.getValue(), primeFactor.getKey() - 1);
    }
    return (int) result;
  }
}
