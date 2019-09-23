package com.javaref.prolog.arithmetic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("A list of prime numbers.")
class P204Test {

  @Test
  void primeRange() {
    assertEquals(Arrays.asList(101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191,
        193, 197, 199), P204.primeRange(100, 200));
  }
}