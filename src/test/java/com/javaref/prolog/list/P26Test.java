package com.javaref.prolog.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Generate the combinations of K distinct objects chosen from the N elements of a list")
class P26Test {

  @Test
  void combination() {
    var list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
    var result = P26.combination(list, 3);
    assertEquals(220, result.size());
    result.forEach(System.out::println);
  }


}