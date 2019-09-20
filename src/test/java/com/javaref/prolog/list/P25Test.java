package com.javaref.prolog.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Generate a random permutation of the elements of a list.")
class P25Test {

  @Test
  void rndPermutation() {
    final List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
    List<Integer> result = P25.rndPermutation(list);
    System.out.println(result);
    Collections.sort(result);
    assertEquals(list, result);

  }
}