package com.javaref.prolog.arithmetic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Determine the prime factors of a given positive integer.")
class P202Test {

  @Test
  void primeFactors() {
    assertEquals(Arrays.asList(3, 3, 5, 7), P202.primeFactors(315));
    assertEquals(Arrays.asList(7, 13, 19), P202.primeFactors(1729));
  }
}