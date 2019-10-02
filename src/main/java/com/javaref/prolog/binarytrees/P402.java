package com.javaref.prolog.binarytrees;

import com.javaref.prolog.Node;

import java.util.ArrayList;
import java.util.List;

public class P402 {

  public static Node<String> cBalTree(int nodes) {
    if (nodes == 0) return null;

    int nodesAfterRoot = nodes - 1;
    int maxDepth = (int) Math.floor(nodesAfterRoot / 2);
    int minDepth = nodesAfterRoot - maxDepth;

    Node<String> tree = new Node<>("X", cBalTree(minDepth), cBalTree(maxDepth));
    System.out.println(tree);
    if (minDepth != maxDepth) {
      tree = new Node<>("X", cBalTree(maxDepth), cBalTree(minDepth));
      System.out.println(tree);
    }
    return tree;
  }
 
}
