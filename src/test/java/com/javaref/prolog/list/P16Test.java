package com.javaref.prolog.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Drop every N'th element from a list.")
class P16Test {

  @Test
  void drop() {
    var list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    var expected = Arrays.asList(1, 2, 4, 5, 7, 8);
    assertEquals(expected, P16.drop(list, 3));
  }
}