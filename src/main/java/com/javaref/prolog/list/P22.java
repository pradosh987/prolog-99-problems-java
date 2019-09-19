package com.javaref.prolog.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P22 {
  public static List<Integer> range(int start, int end) {
    var range = new ArrayList<Integer>();
    for (; start <= end; start++) {
      range.add(start);
    }
    return range;
  }

  public static List<Integer> rangeStream(int start, int end) {
    return IntStream.rangeClosed(start, end).boxed().collect(Collectors.toList());
  }
}
