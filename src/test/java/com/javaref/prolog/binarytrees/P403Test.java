package com.javaref.prolog.binarytrees;

import com.javaref.prolog.Node;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Symmetric binary trees")
class P403Test {

  @Test
  void symmetric() {
    Node<String> node = new Node<>("X", null, null);
    var tree = new Node<>("X", node, node);
    assertTrue(P403.symmetric(tree));

    var tree2 = new Node<>("X", node, new Node<>("X", null, node));
    assertFalse(P403.symmetric(tree2));

    var tree3 = new Node<>("X", tree, tree);
    assertTrue(P403.symmetric(tree3));
  }
}