package com.javaref.prolog.arithmetic;

import com.javaref.prolog.list.P26;

import java.util.Collections;
import java.util.List;

public class P205 {
  public static List<Integer> goldbach(int num) {
    List<Integer> range = P204.primeRange(2,num);
    for (List<Integer> list : P26.combination(range, 2)) {
      if(list.get(0) + list.get(1) == num) return list;
    }
    return Collections.emptyList();
  }
}
