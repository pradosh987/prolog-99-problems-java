package com.javaref.prolog.list;

import java.util.*;

public class P26 {
  public static List<List> combination(List list, int n) {
    return combinationRecursive(list, n, Collections.emptyList());
  }

  private static List<List> combinationRecursive(List data, int sizeOfSolution, List candidateSolution) {
    if (reject(data, sizeOfSolution, candidateSolution)) {
      return Collections.emptyList();
    }

    if (accept(data, sizeOfSolution, candidateSolution)) {
      return Collections.singletonList(candidateSolution);
    }

    var nextCandidateSolution = nextCandidate(data, candidateSolution);
    var result = new ArrayList<List>();
    while (!nextCandidateSolution.isEmpty()) {
      data = nextExtension(data);
      result.addAll(combinationRecursive(data, sizeOfSolution, nextCandidateSolution));
      nextCandidateSolution = nextCandidate(data, candidateSolution);
    }

    return result;
  }

  private static boolean reject(List data, int sizeOfSolution, List candidateSolution) {
    return data.size() + candidateSolution.size() < sizeOfSolution;
  }

  private static boolean accept(List data, int sizeOfSolution, List candidateSolution) {
    return candidateSolution.size() == sizeOfSolution;
  }

  private static List nextCandidate(List data, List candidateSolution) {
    if (data.size() == 0) {
      return Collections.emptyList();
    } else {
      candidateSolution = new ArrayList<>(candidateSolution);
      candidateSolution.add(data.get(0));
      return candidateSolution;
    }
  }

  private static List nextExtension(List data) {
    if (data.size() == 0) {
      return Collections.emptyList();
    }
    return data.subList(1, data.size());
  }
}

