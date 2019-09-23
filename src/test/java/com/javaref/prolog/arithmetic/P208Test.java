package com.javaref.prolog.arithmetic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P208Test {

  @Test
  void coPrime() {
    assertTrue(P208.coPrime(35, 64));
  }
}