package com.javaref.prolog.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Find the K'th element of a list.")
class P03Test {
  private final List<Integer> list = Arrays.asList(1, 5, 4, 7, 9, 25, 46);
  private final LinkedList<Integer> linkedList = new LinkedList<>(list);

  @Test
  void getKthElement() {
    assertEquals(9, P03.getKthElement(list, 5));
  }

  @Test
  void getKthElementRecursive() {
    assertEquals(25, P03.getKthElementRecursive(linkedList, 6));
  }
}