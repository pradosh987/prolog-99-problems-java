package com.javaref.prolog.list;

import java.util.*;
import java.util.AbstractMap.SimpleEntry;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P12 {
  public static <T> List<T> decode(List<Object> list) {
    return list.stream().flatMap(entry -> {
      if (entry instanceof SimpleEntry) {
        SimpleEntry<Integer, T> e = (SimpleEntry<Integer, T>) entry;
        return Collections.nCopies(e.getKey(), e.getValue()).stream();
      } else {
        return Stream.of((T) entry);
      }
    }).collect(Collectors.toList());
  }
}
