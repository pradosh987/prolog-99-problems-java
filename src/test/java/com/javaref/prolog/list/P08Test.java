package com.javaref.prolog.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Eliminate consecutive duplicates of list elements.")
class P08Test {

  @Test
  void dedup() {
    var list = Arrays.asList("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e");
    assertEquals(Arrays.asList("a", "b", "c", "a", "d", "e"), P08.dedup(list));
  }
}