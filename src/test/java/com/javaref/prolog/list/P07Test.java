package com.javaref.prolog.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Flatten a nested list structure.")
class P07Test {

  @Test
  void flatten() {
    var list = Arrays.asList(1, Arrays.asList(2, Arrays.asList(3,4),5));
    assertEquals(Arrays.asList(1,2,3,4,5), P07.flatten(list));
  }
}