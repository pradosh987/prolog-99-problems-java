package com.javaref.prolog.list;

import java.util.LinkedList;
import java.util.List;

public class P04 {
  public static <T> int numOfElements(List<T> list) {
    return list.size();
  }

  public static <T> int numOfElementsRecursive(LinkedList<T> list) {
    return numOfElementRecursiveInternal(list, 0);
  }

  private static <T> int numOfElementRecursiveInternal(LinkedList<T> list, int previousCount) {
    if (list.isEmpty()) {
      return previousCount;
    }
    return numOfElementRecursiveInternal(new LinkedList<T>(list.subList(1, list.size())), ++previousCount);
  }
}
