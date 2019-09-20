package com.javaref.prolog.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class P23 {
  public static <T> List<T> rnd_select(List<T> list, int numberOfElements) {
    Random random = new Random();
    List<T> newList = new ArrayList<>();
    for (int i = 0; i < numberOfElements; i++) {
      var randomIndex = random.nextInt(list.size()) + 1; // + 1 because indexing start at 1 for remoteAt method
      var temp = P20.removeAt(list, randomIndex);
      newList.add((T)temp[0]);
      list = (List<T>)temp[1];
    }
    return newList;
  }
}
