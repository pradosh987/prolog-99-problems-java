package com.javaref.prolog.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Lotto: Draw N different random numbers from the set 1..M.")
class P24Test {

  @Test
  void lotto() {
    assertEquals(6, P24.lotto(6, 400).size());
  }
}