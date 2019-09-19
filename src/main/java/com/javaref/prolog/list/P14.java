package com.javaref.prolog.list;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P14 {
  public static <T> List<T> dupli(List<T> list) {
    return list.stream().flatMap(item -> Collections.nCopies(2, item).stream()).collect(Collectors.toList());
  }
}
