package com.javaref.prolog.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class P20 {
  public static <T> Object[] removeAt(List<T> list, final int at) {
    var newList = new ArrayList<>(list);
    var iter = newList.listIterator(at - 1);
    var removedElement = iter.next();
    iter.remove();
    return new Object[] {removedElement, newList};
  }
}
