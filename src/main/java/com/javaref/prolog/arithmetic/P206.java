package com.javaref.prolog.arithmetic;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P206 {

  public static void goldbachList(int lowerLimit, int upperLimit) {
    IntStream.rangeClosed(lowerLimit, upperLimit)
        .filter(P206::isEven)
        .forEach(num -> {
          List<Integer> goldbackList = P205.goldbach(num);
          System.out.println(String.format("%d = %d + %d", num, goldbackList.get(0), goldbackList.get(1)));
        });
  }

  public static long goldbachListLarge(int lowerLimit, int upperlimit, int printLimit) {
    if (lowerLimit < 6) lowerLimit = 6;
    var result = IntStream.rangeClosed(lowerLimit, upperlimit)
        .filter(P206::isEven)
        .boxed()
        .map(P205::goldbach)
        .filter(item -> item.get(0) > 50 && item.get(1) > 50)
        .collect(Collectors.toList());

    result.stream().limit(printLimit).forEach(System.out::println);

    return result.stream().count();
  }

  private static boolean isEven(int num) {
    return num % 2 == 0;
  }
}
