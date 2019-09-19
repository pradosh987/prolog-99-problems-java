package com.javaref.prolog.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.AbstractMap;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Run-length encoding of a list.")
class P10Test {

  @Test
  void encode() {
    var list = P09.zipConsecutive(Arrays.asList(1, 1, 1, 1, 2, 3, 3, 4, 4, 5, 6, 6, 6, 6));
    var expected = Arrays.asList(new AbstractMap.SimpleEntry<>(4, 1), new AbstractMap.SimpleEntry<>(1, 2),
        new AbstractMap.SimpleEntry<>(2, 3), new AbstractMap.SimpleEntry<>(2, 4), new AbstractMap.SimpleEntry<>(1, 5),
        new AbstractMap.SimpleEntry<>(4, 6));

    var result = P10.encode(list);
    assertEquals(expected, result);
  }

  @Test
  void encodeStream() {
    var list = P09.zipConsecutive(Arrays.asList(1, 1, 1, 1, 2, 3, 3, 4, 4, 5, 6, 6, 6, 6));
    var expected = Arrays.asList(new AbstractMap.SimpleEntry<>(4, 1), new AbstractMap.SimpleEntry<>(1, 2),
        new AbstractMap.SimpleEntry<>(2, 3), new AbstractMap.SimpleEntry<>(2, 4), new AbstractMap.SimpleEntry<>(1, 5),
        new AbstractMap.SimpleEntry<>(4, 6));

    var result = P10.encodeStream(list);
    assertEquals(expected, result);
  }
}