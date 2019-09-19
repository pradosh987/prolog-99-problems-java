package com.javaref.prolog.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Extract a slice from a list.")
class P18Test {

  @Test
  void slice() {
    final var list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    assertEquals(Arrays.asList(3, 4, 5, 6, 7), P18.slice(list, 3, 7));
  }
}