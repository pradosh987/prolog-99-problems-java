package com.javaref.prolog.list;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class P02 {
  public static <T> T secondLast(List<T> list) {
    if (list == null || list.size() < 2) {
      throw new NoSuchElementException();
    }
    return list.get(list.size() - 2);
  }

  public static <T> T secondLastRecursive(LinkedList<T> list) {
    if (list == null || list.size() < 2) {
      throw new NoSuchElementException();

    }
    if (list.size() == 2) {
      return list.get(0);
    }
    return secondLastRecursive(new LinkedList<>(list.subList(1, list.size())));
  }
}
