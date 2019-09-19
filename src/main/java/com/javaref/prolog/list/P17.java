package com.javaref.prolog.list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class P17 {
  public static <T> List<List<T>> split(final List<T> list, final int n) {
    var list1 = new LinkedList<T>();
    var list2 = new LinkedList<T>();
    var iterator = list.listIterator();
    while (iterator.hasNext()) {
      var element = iterator.next();
      if (iterator.previousIndex() < n) {
        list1.add(element);
      } else {
        list2.add(element);
      }
    }
    return new LinkedList<>(Arrays.asList(list1, list2));
  }
}
