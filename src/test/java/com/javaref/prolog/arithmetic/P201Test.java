package com.javaref.prolog.arithmetic;

import com.javaref.prolog.list.P20;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Determine whether a given integer number is prime.")
class P201Test {

  @Test
  void isPrime() {
    assertTrue(P201.isPrime(7));
    assertTrue(P201.isPrime(2));
    assertFalse(P201.isPrime(12));
  }
}