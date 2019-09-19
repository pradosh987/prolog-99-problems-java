package com.javaref.prolog.list;

import java.util.AbstractMap;
import java.util.List;
import java.util.stream.Collectors;

public class P11 {
  public static <T> List<Object> cleanEncode(List<AbstractMap.SimpleEntry<Integer, T>> list) {
    return list.stream().map(entry -> entry.getKey() == 1 ? entry.getValue() : entry).collect(Collectors.toList());
  }
}
