package com.javaref.prolog.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Find out whether a list is a palindrome.")
class P06Test {

  private final List<Integer> list1 = Arrays.asList(1, 2, 3, 2, 1);
  private final List<Integer> list2 = Arrays.asList(1, 2, 3, 2, 1, 5);
  private final List<Integer> list3 = Arrays.asList(1, 2, 3, 3, 2, 1);
  private final List<Integer> list4 = Arrays.asList(1, 2, 3, 3, 1);

  @Test
  void isPalindrome() {
    assertTrue(P06.isPalindrome(list1));
    assertFalse(P06.isPalindrome(list2));
    assertTrue(P06.isPalindrome(list3));
    assertFalse(P06.isPalindrome(list4));
  }
}