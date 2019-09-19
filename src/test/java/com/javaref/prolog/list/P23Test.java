package com.javaref.prolog.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Extract a given number of randomly selected elements from a list.")
class P23Test {

  @Test
  void rnd_select() {
    final var list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
    var result = P23.rnd_select(list, 3);
    System.out.println(result);
    assertEquals(5, result.size());
  }
}