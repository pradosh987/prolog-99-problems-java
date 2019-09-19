package com.javaref.prolog.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Insert an element at a given position into a list.")
class P21Test {

  @Test
  void insertAt() {
    final var list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
    assertEquals(Arrays.asList(1, 2, 3, 55, 4, 5, 6, 7, 8), P21.insertAt(list, 55, 4));
  }

  @Test
  void insertAtIterative() {
    final var list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
    assertEquals(Arrays.asList(1, 2, 3, 55, 4, 5, 6, 7, 8), P21.insertAtIterative(list, 55, 4));
  }
}