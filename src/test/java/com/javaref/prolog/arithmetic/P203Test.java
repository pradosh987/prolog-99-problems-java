package com.javaref.prolog.arithmetic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.AbstractMap;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Determine the prime factors of a given positive integer and Construct a list containing the prime factors and their multiplicity.")
class P203Test {

  @Test
  void primeFactorsMult() {
    var exppected = Arrays.asList(
        new AbstractMap.SimpleEntry<>(2, 3),
        new AbstractMap.SimpleEntry<>(1, 5),
        new AbstractMap.SimpleEntry<>(1, 7)
    );
    assertEquals(exppected, P203.primeFactorsMult(315));
  }
}