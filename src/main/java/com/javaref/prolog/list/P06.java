package com.javaref.prolog.list;

import java.util.List;

public class P06 {
  public static <T> boolean isPalindrome(List<T> list) {
    for (int i = 0, j = list.size() - 1; i < list.size(); i++, j--) {
      if (list.get(i) != list.get(j)) {
        return false;
      }
    }
    return true;
  }
}
