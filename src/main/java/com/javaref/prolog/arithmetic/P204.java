package com.javaref.prolog.arithmetic;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P204 {
  public static List<Integer> primeRange(int lowerLimit, int upperLimit) {
    return IntStream.rangeClosed(lowerLimit, upperLimit).filter(P201::isPrime).boxed().collect(Collectors.toList());
  }
}
