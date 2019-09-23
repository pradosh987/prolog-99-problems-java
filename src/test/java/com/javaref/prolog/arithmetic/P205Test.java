package com.javaref.prolog.arithmetic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Goldbach's conjecture.")
class P205Test {

  @Test
  void goldbach() {
    assertEquals(Arrays.asList(5,23), P205.goldbach(28));
    assertTrue(P205.goldbach(29).isEmpty());
  }
}