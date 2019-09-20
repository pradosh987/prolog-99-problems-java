package com.javaref.prolog.list;

import java.util.ArrayList;
import java.util.List;

public class P25 {
  public static <T> List<T> rndPermutation(List<T> list) {
    return P23.rnd_select(list, list.size());
  }
}
