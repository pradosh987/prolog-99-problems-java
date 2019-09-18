package com.javaref.prolog.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Find the last but one element of a list.")
class P02Test {
  private final List<Integer> list = Arrays.asList(1, 5, 4, 7, 9, 25, 46);
  private final LinkedList<Integer> linkedList = new LinkedList<>(list);

  @Test
  void secondLast() {
    assertEquals(25, P02.secondLast(list));
  }

  @Test
  void secondLastRecursive() {
    assertEquals(25, P02.secondLastRecursive(linkedList));
  }
}