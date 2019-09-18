package com.javaref.prolog;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class Utils {
  public static <T> List<T> listTail(List<T> list){
    if(list == null || list.isEmpty()) {
      throw new NoSuchElementException();
    }

    if(list.size()==1){
      return Collections.emptyList();
    }

    return list.subList(1, list.size());
  }
}
