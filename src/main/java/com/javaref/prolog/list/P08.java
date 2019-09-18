package com.javaref.prolog.list;

import java.util.ArrayList;
import java.util.List;

public class P08 {
  public static <T> List<T> dedup(List<T> list) {
    var newList = new ArrayList<T>();
    T previousElement = null;
    for (T element : list) {
      if (previousElement != element) {
        newList.add(element);
        previousElement = element;
      }
    }
    return newList;
  }
}
