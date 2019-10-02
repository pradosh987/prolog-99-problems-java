package com.javaref.prolog.binarytrees;

import com.javaref.prolog.Node;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Binary search trees (dictionaries)")
class P404Test {

  @Test
  void construct() {
    var list = Arrays.asList(3, 2, 5, 7, 1);
    var expected = new Node<>(3, new Node(2, new Node(1, null, null), null), new Node(5, null, new Node(7, null, null)));
    assertEquals(expected, P404.construct(list));
    assertEquals(expected, P404.constructStream(list));

    assertTrue(P403.symmetric(P404.construct(Arrays.asList(5, 3, 18, 1, 4, 12, 21))));
    assertFalse(P403.symmetric(P404.construct(Arrays.asList(3, 2, 5, 7, 4))));
  }
}