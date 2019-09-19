package com.javaref.prolog.list;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class P15 {
  public static <T> List<T> dupli(List<T> list, final int n) {
    return list.stream().flatMap(item -> Collections.nCopies(n, item).stream()).collect(Collectors.toList());
  }
}
