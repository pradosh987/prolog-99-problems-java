package com.javaref.prolog.list;

import java.util.AbstractMap;
import java.util.LinkedList;
import java.util.List;

public class P13 {

  public static <T> List<Object> encodeDirect(List<T> list) {
    AbstractMap.SimpleEntry<Integer, T> active = null;
    var encoded = new LinkedList<>();

    for (T item : list) {
      if (active == null) {
        active = new AbstractMap.SimpleEntry<>(1, item);
      } else if (active.getValue() == item) {
        active = new AbstractMap.SimpleEntry<>(active.getKey() + 1, item);
      } else {
        encoded.add(active.getKey() == 1 ? active.getValue() : active);
        active = new AbstractMap.SimpleEntry<>(1, item);
      }
    }
    encoded.add(active.getKey() == 1 ? active.getValue() : active);
    return encoded;
  }
}
