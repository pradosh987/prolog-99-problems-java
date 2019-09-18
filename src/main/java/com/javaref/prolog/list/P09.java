package com.javaref.prolog.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class P09 {
  public static <T> List<List<T>> zipConsecutive(List<T> list) {
    LinkedList<T> row;
    List<List<T>> newList = new LinkedList<>();
    newList.add(row = new LinkedList<>());
    for (T item : list) {
      if(row.isEmpty() || item == row.getFirst()){
        row.addFirst(item);
      } else {
        row = new LinkedList<>(Arrays.asList(item));
        newList.add(row);
      }
    }
    return newList;
  }
}
