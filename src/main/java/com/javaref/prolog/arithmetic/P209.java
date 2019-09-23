package com.javaref.prolog.arithmetic;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P209 {
  public static long totientPhi(int m) {
    if (m == 1) return 1;
    return IntStream.range(1, m).filter(i -> P208.coPrime(i, m)).boxed().count();
  }
}
