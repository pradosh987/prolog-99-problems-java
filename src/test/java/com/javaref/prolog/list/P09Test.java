package com.javaref.prolog.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Pack consecutive duplicates of list elements into sublists.")
class P09Test {

  @Test
  void zipConsecutive() {
    var list = Arrays.asList(1, 1, 1, 1, 2, 3, 3, 4, 4, 5, 6, 6, 6, 6);
    var expected = Arrays.asList(Arrays.asList(1, 1, 1, 1), Arrays.asList(2), Arrays.asList(3, 3), Arrays.asList(4, 4),
        Arrays.asList(5), Arrays.asList(6, 6, 6, 6));
    assertEquals(expected, P09.zipConsecutive(list));
  }
}