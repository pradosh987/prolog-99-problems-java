package com.javaref.prolog.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Remove the K'th element from a list.")
class P20Test {

  @Test
  void remoteAt() {
    final var list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
    var result = P20.removeAt(list, 5);
    assertEquals(5, result[0]);
    assertEquals(Arrays.asList(1, 2, 3, 4, 6, 7, 8), result[1]);
  }
}