package com.javaref.prolog.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class P05 {
  public static <T> List<T> reverseList(List<T> list) {
    var reversedList = new ArrayList<>(list);
    for (int i = 0; i < list.size(); i++) {
      reversedList.set(list.size() - 1 - i, list.get(i));
    }
    return reversedList;
  }

  public static <T> LinkedList<T> reverseList(LinkedList<T> list){
    LinkedList<T> reversedList = new LinkedList<>();
    for(T element: list){
      reversedList.addFirst(element);
    }
    return reversedList;
  }

  public static <T> LinkedList<T> reverseListRecursive(LinkedList<T> list) {
    return reverseListRecursiveInternal(list, new LinkedList<T>());
  }

  private static <T> LinkedList<T> reverseListRecursiveInternal(LinkedList<T> oldList, LinkedList<T> newList) {
    if (oldList.isEmpty()) {
      return newList;
    }
    newList.addFirst(oldList.getFirst());
    return reverseListRecursiveInternal(new LinkedList<T>(oldList.subList(1, oldList.size())), newList);
  }
}
