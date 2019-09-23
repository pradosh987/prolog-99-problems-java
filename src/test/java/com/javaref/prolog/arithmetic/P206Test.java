package com.javaref.prolog.arithmetic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P206Test {

  @Test
  void goldbachList() {
    P206.goldbachList(9, 20);
  }

  @Test
  void goldbachListLarge() {
    assertEquals(4, P206.goldbachListLarge(1, 2000, 50));
  }
}