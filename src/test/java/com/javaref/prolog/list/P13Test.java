package com.javaref.prolog.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.AbstractMap;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Run-length encoding of a list (direct solution).")
class P13Test {

  @Test
  void encodeDirect() {
    var list = Arrays.asList(1, 1, 1, 1, 2, 3, 3, 4, 4, 5, 6, 6, 6, 6);
    var expected = Arrays.asList(new AbstractMap.SimpleEntry<>(4, 1), 2,
        new AbstractMap.SimpleEntry<>(2, 3), new AbstractMap.SimpleEntry<>(2, 4), 5,
        new AbstractMap.SimpleEntry<>(4, 6));
    assertEquals(expected, P13.encodeDirect(list));
  }
}