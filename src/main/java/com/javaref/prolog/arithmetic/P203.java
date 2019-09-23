package com.javaref.prolog.arithmetic;

import com.javaref.prolog.list.P10;

import java.util.AbstractMap;
import java.util.List;

public class P203 {
  public static  List<AbstractMap.SimpleEntry<Integer, Integer>> primeFactorsMult(int num) {
    return P10.encode(P202.primeFactors(num));
  }
}
