package com.javaref.prolog.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P27 {
  public static <T> List<List<List<T>>> group3(List<T> data, List<Integer> groupSize) {
    List<List<List<T>>> result = new ArrayList<>();
    for (List<T> group1 : P26.combination(data, groupSize.get(0))) {
      var rem = subtractList(group1, data);
      for (List<T> group2 : P26.combination(rem, groupSize.get(1))) {
        result.add(Arrays.asList(group1, group2, subtractList(group2, rem)));
      }
    }
    return result;
  }

  private static <T> List<T> subtractList(List<T> list, List<T> from) {
    return from.stream().filter(i -> !list.contains(i)).collect(Collectors.toList());
  }

}
