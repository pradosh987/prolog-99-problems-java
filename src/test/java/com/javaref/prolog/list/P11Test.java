package com.javaref.prolog.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.AbstractMap;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Modified run-length encoding.")
class P11Test {

  @Test
  void cleanEncode() {
    var list = P10.encode(Arrays.asList(1, 1, 1, 1, 2, 3, 3, 4, 4, 5, 6, 6, 6, 6));
    var expected = Arrays.asList(new AbstractMap.SimpleEntry<>(4, 1), 2,
        new AbstractMap.SimpleEntry<>(2, 3), new AbstractMap.SimpleEntry<>(2, 4), 5,
        new AbstractMap.SimpleEntry<>(4, 6));
    assertEquals(expected, P11.cleanEncode(list));
    System.out.println(P11.cleanEncode(list));
  }
}