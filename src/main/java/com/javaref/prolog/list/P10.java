package com.javaref.prolog.list;

import java.util.AbstractMap.SimpleEntry;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;


public class P10 {
  public static <T> List<SimpleEntry<Integer, T>> encode(List<List<T>> list) {
    List<SimpleEntry<Integer, T>> encodedData = new LinkedList<>();
    for (List<T> tList : list) {
      encodedData.add(new SimpleEntry<>(tList.size(), tList.get(0)));
    }
    return encodedData;

  }

  public static <T> List<SimpleEntry<Integer, T>> encodeStream(List<List<T>> list) {
    return list.stream().map(item -> new SimpleEntry<>(item.size(), item.get(0))).collect(Collectors.toList());
  }
}
