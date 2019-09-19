package com.javaref.prolog.list;

import java.util.ArrayList;
import java.util.List;

public class P21 {
  public static <T> List<T> insertAt(List<T> list, T element, int at) {
    var newList = new ArrayList<>(list.subList(0, at - 1));
    newList.add(element);
    newList.addAll(list.subList(at - 1, list.size()));
    return newList;
  }

  public static <T> List<T> insertAtIterative(List<T> list, T element, int at) {
    var newList = new ArrayList<T>();
    var iterative = list.listIterator();
    while (iterative.hasNext()) {
      var e = iterative.next();
      if(iterative.nextIndex() == at){
        newList.add(element);
      }
      newList.add(e);
    }
    return newList;
  }
}
