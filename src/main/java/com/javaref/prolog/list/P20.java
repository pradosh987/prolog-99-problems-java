package com.javaref.prolog.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class P20 {
  public static <T> List<T> remoteAt(List<T> list, final int at) {
    var newList = new ArrayList<>(list);
    var iter = newList.listIterator(at - 1);
    iter.next();
    iter.remove();
    return newList;
  }
}
