package com.javaref.prolog.list;

import java.util.LinkedList;
import java.util.List;

public class P07 {
  public static <T> List<T> flatten(List<T> list) {
    List<T> flatList = new LinkedList<>();
    list.forEach(element -> {
      if(element instanceof List){
        flatList.addAll(flatten((List<T>) element));
      } else {
        flatList.add(element);
      }
    });
    return flatList;
  }
}
