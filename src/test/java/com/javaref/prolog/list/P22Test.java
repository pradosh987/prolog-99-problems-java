package com.javaref.prolog.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Create a list containing all integers within a given range.")
class P22Test {

  @Test
  void range() {
    assertEquals(Arrays.asList(-3, -2, -1, 0, 1, 2, 3), P22.range(-3, 3));
  }

  @Test
  void rangeStream() {
    assertEquals(Arrays.asList(-3, -2, -1, 0, 1, 2, 3), P22.rangeStream(-3, 3));
  }
}