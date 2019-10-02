package com.javaref.prolog;

import java.util.Objects;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Node<?> node = (Node<?>) o;
    return getValue().equals(node.getValue()) &&
        Objects.equals(getLeft(), node.getLeft()) &&
        Objects.equals(getRight(), node.getRight());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getValue(), getLeft(), getRight());
  }
}
