package com.javaref.prolog;

public class Node<T> {
  private T value;
  private Node left;
  private Node right;

  public Node(T value, Node left, Node right) {
    this.value = value;
    this.left = left;
    this.right = right;
  }

  public T getValue() {
    return value;
  }

  public Node getLeft() {
    return left;
  }

  public Node getRight() {
    return right;
  }

  public void setLeft(Node left) {
    this.left = left;
  }

  public void setRight(Node right) {
    this.right = right;
  }

  public boolean hasLeft() {
    return left != null;
  }

  public boolean hasRight() {
    return right != null;
  }

  public int depth() {
    return Math.max(
        (hasLeft() ? 1 + left.depth() : 0),
        (hasRight() ? 1 + right.depth() : 0)
    );
  }

  public int maxDepth() {
    return depth();
  }

  public int minDepth() {
    return Math.min(
        (hasLeft() ? 1 + left.depth() : 0),
        (hasRight() ? 1 + right.depth() : 0)
    );
  }

  public int nodes() {
    return 1 + (hasLeft() ? left.nodes() : 0) + (hasRight() ? right.nodes() : 0);
  }

  @Override
  public String toString() {
    return "T(" + value + ", " + (hasLeft() ? getLeft() : "null") + ","
        + (hasRight() ? getRight() : "null") + ")";
  }
}
