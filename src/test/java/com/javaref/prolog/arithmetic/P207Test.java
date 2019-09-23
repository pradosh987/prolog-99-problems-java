package com.javaref.prolog.arithmetic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Determine the greatest common divisor of two positive integer numbers.")
class P207Test {

  @Test
  void gcd() {
    assertEquals(9, P207.gcd(36, 63));
  }
}