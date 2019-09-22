package com.javaref.prolog.arithmetic;

import java.util.stream.IntStream;

public class P201 {
  public static boolean isPrime(int number) {
    if (number == 2) {
      return true;
    }
    int upperbound = (int) Math.round(Math.sqrt(number));
    System.out.println(upperbound);
    return !IntStream.rangeClosed(2, upperbound).anyMatch(i -> number % i == 0);
  }
}
