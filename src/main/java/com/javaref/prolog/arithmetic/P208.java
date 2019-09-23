package com.javaref.prolog.arithmetic;

public class P208 {
  public static boolean coPrime(int a, int b) {
    return P207.gcd(a, b) == 1;
  }
}
