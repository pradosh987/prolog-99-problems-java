package com.javaref.prolog.arithmetic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Calculate Euler's totient function phi(m) (2).")
class P210Test {

  @Test
  void totient_phi() {
    assertEquals(4, P210.totient_phi(10));
    assertEquals(1, P210.totient_phi(1));
  }
}