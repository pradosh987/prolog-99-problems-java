package com.javaref.prolog.arithmetic;

public class P207 {
  public static int gcd(int a, int b) {
    if (a == b) return a;
    if (b == 0) return a;
    return a > b ? gcd(a - b, b) : gcd(a, b - a);
  }
}
