package com.javaref.prolog.binarytrees;

import com.javaref.prolog.Node;

import java.util.List;

public class P404 {
  public static Node<Integer> construct(List<Integer> list) {
    var root = new Node<>(list.get(0), null, null);
    for (Integer value : list.subList(1, list.size())) {
      var node = new Node<>(value, null, null);
      add(root, node);
    }
    return root;
  }

  public static Node<Integer> constructStream(List<Integer> list) {
    var root = new Node<>(list.get(0), null, null);
    return list.subList(1, list.size()).stream()
        .map(val -> new Node(val, null, null))
        .reduce(root, P404::add, (old, n) -> n);
  }

  public static Node<Integer> add(Node<Integer> tree, Node<Integer> node) {
    var activeNode = tree;
    while (true) {
      if (node.getValue() < activeNode.getValue()) {
        if (activeNode.hasLeft()) {
          activeNode = activeNode.getLeft();
        } else {
          activeNode.setLeft(node);
          return tree;
        }
      } else {
        if (activeNode.hasRight()) {
          activeNode = activeNode.getRight();
        } else {
          activeNode.setRight(node);
          return tree;
        }
      }
    }
  }
}
