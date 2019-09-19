package com.javaref.prolog.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Rotate a list N places to the left.")
class P19Test {

  @Test
  void rotate() {
    final var list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
    assertEquals(Arrays.asList(4, 5, 6, 7, 8, 1, 2, 3), P19.rotate(list, 3));
    assertEquals(Arrays.asList(7, 8, 1, 2, 3, 4, 5, 6), P19.rotate(list, -2));
  }
}