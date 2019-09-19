package com.javaref.prolog.list;

import java.util.LinkedList;
import java.util.List;

public class P18 {
  public static <T> List<T> slice(List<T> list, final int startIndex, final int endIndex) {
    var slicedList = new LinkedList<T>();
    var iterator = list.listIterator();
    while (iterator.hasNext()) {
      var element = iterator.next();
      if (iterator.previousIndex() + 1 >= startIndex && iterator.previousIndex() + 1 <= endIndex) {
        slicedList.add(element);
      }
    }
    return slicedList;
  }
}
