package com.javaref.prolog.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Decode a run-length encoded list.")
class P12Test {

  @Test
  void decode() {
    var expected = Arrays.asList(1, 1, 1, 1, 2, 3, 3, 4, 4, 5, 6, 6, 6, 6);
    List<Object> list = Arrays.asList(new AbstractMap.SimpleEntry<>(4, 1), 2,
        new AbstractMap.SimpleEntry<>(2, 3), new AbstractMap.SimpleEntry<>(2, 4), 5,
        new AbstractMap.SimpleEntry<>(4, 6));
    assertEquals(expected, P12.decode(list));
    System.out.println(P12.decode(list));
  }
}