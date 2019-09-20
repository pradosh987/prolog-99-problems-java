package com.javaref.prolog.list;

import java.util.List;

public class P24 {
  public static List<Integer> lotto(int numberOfElements, int upperBound) {
    var range = P22.range(1, upperBound);
    return P23.rnd_select(range, numberOfElements);
  }
}
