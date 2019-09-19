package com.javaref.prolog.list;

import java.util.List;

public class P19 {
  public static <T> List<T> rotate(List<T> list, final int index) {
    final int n = index > 1 ? index : index + list.size();
    var splitedLists = P17.split(list, n);
    splitedLists.get(1).addAll(splitedLists.get(0));
    return splitedLists.get(1);
  }
}
