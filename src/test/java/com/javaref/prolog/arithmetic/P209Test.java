package com.javaref.prolog.arithmetic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculate Euler's totient function phi(m).")
class P209Test {

  @Test
  void totientPhi() {
    assertEquals(4, P209.totientPhi(10));
    assertEquals(4, P209.totientPhi(1));
  }
}