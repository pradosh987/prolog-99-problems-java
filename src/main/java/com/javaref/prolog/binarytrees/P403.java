package com.javaref.prolog.binarytrees;

import com.javaref.prolog.Node;

public class P403 {

  public static <T> boolean symmetric(Node<T> tree) {
    if (tree == null || !tree.hasLeft() || !tree.hasRight()) return false;
    return mirror(tree.getLeft(), tree.getRight());
  }

  private static <T> boolean mirror(Node<T> tree1, Node<T> tree2) {
    return ((tree1.hasLeft() && tree2.hasRight() && mirror(tree1.getLeft(), tree2.getRight()))
        || (!tree1.hasLeft() && !tree2.hasRight()))
        && ((tree1.hasRight() && tree2.hasLeft() && mirror(tree1.getRight(), tree2.getLeft()))
        || (!tree1.hasRight() || !tree2.hasLeft()));
  }
}
