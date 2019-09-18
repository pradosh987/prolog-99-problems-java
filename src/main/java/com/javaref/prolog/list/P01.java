package com.javaref.prolog.list;

import java.util.List;
import java.util.NoSuchElementException;

public class P01 {

  public static <T> T last(List<T> list) {
    return list.get(list.size() - 1);
  }

  public static <T> T lastRecursive(List<T> list) {
    if (list == null || list.isEmpty()) {
      throw new NoSuchElementException();
    }
    if (list.size() > 1) {
      return lastRecursive(list.subList(1, list.size()));
    }
    return list.get(0);
  }

}
