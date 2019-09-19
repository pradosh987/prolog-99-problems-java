package com.javaref.prolog.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Split a list into two parts; the length of the first part is given.")
class P17Test {

  @Test
  void split() {
    final var list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    final var expected = new LinkedList<>(Arrays.asList(Arrays.asList(1, 2, 3, 4, 5), Arrays.asList(6, 7, 8, 9)));
    assertEquals(expected, P17.split(list, 5));
  }
}