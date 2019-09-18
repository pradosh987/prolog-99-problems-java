package com.javaref.prolog.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Find the last element of a list.")
class P01Test {
  private final List<Integer> list = Arrays.asList(1, 5, 4, 7, 9, 25, 46);
  private final LinkedList<Integer> linkedList = new LinkedList<>(list);

  @Test
  void last() {
    assertEquals(46, P01.last(list));
  }

  @Test
  void lastRecursive() {
    assertEquals(46, P01.lastRecursive(linkedList));
  }
}