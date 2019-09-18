package com.javaref.prolog.list;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class P03 {
  public static <T> T getKthElement(List<T> list, int index) {
    return list.get(index - 1);
  }

  public static <T> T getKthElementRecursive(LinkedList<T> list, int index) {
    if (list == null || list.isEmpty()) {
      throw new NoSuchElementException();
    }
    if (index - 1 == 0) {
      return list.get(0);
    }
    return getKthElementRecursive(new LinkedList<T>(list.subList(1, list.size())), index - 1);
  }
}
