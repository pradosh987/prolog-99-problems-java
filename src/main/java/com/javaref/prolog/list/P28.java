package com.javaref.prolog.list;

import java.util.ArrayList;
import java.util.List;

public class P28 {
  public static <T> List<List<T>> lsort(List<List<T>> list) {
    return bubbleSort(list);
  }

  public static <T> List<List<T>> bubbleSort(List<List<T>> list) {
    var sortedList = new ArrayList<>(list);
    for (int i = 0; i < sortedList.size() - 1; i++) {
      for (int j = 0; j < sortedList.size() - 1 - i; j++) {
        if (sortedList.get(j).size() > sortedList.get(j + 1).size()) {
          var tmp = sortedList.get(j);
          sortedList.set(j, sortedList.get(j + 1));
          sortedList.set(j + 1, tmp);
        }
      }
    }
    return sortedList;
  }
}
