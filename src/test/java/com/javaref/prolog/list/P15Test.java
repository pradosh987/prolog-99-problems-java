package com.javaref.prolog.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Duplicate the elements of a list a given number of times.")
class P15Test {

  @Test
  void dupli() {
    var list = Arrays.asList(1, 2, 3, 3, 4);
    var expected = Arrays.asList(1, 1,1,2,2, 2, 3,3,3, 3, 3, 3, 4,4, 4);
    assertEquals(expected, P15.dupli(list, 3));
    System.out.println(P15.dupli(list,3));
  }
}