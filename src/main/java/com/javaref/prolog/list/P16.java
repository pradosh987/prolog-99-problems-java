package com.javaref.prolog.list;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class P16 {
  public static <T> List<T> drop(List<T> list, final int n) {
    var newList = new LinkedList<T>(list);
    var iterator = newList.listIterator();
    int removedElements = 0;
    while (iterator.hasNext()) {
      iterator.next();
      if((iterator.previousIndex() + 1 + removedElements) % n == 0){
        iterator.remove();
        ++removedElements;
      }
    }
    return newList;
  }
}
