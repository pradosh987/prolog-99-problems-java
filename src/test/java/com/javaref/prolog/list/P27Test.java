package com.javaref.prolog.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Group the elements of a set into disjoint subsets.")
class P27Test {

  @Test
  void group3() {
    var list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    var result = P27.group3(list, Arrays.asList(2, 3, 4));
    assertEquals(1260, result.size());
    result.forEach(System.out::println);
    assertEquals(756, P27.group3(list, Arrays.asList(2, 2, 5)).size());
  }
}