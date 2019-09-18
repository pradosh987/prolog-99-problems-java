package com.javaref.prolog.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Reverse a list.")
class P05Test {
  private final List<Integer> list = Arrays.asList(1, 5, 4, 7, 9, 25, 46);
  private final LinkedList<Integer> linkedList = new LinkedList<>(list);
  private final List<Integer> reversedList = Arrays.asList(46, 25, 9, 7, 4, 5, 1);

  @Test
  void reverseList() {
    assertEquals(reversedList, P05.reverseList(list));
  }

  @Test
  void reverseListRecursive() {
    assertEquals(new LinkedList<>(reversedList), P05.reverseListRecursive(linkedList));
  }

  @Test
  void testReverseList() {
    assertEquals(new LinkedList<>(reversedList), P05.reverseList(linkedList));
  }
}