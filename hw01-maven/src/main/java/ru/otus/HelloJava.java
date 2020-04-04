package ru.otus;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class HelloJava {
  private static final int MEASURE_COUNT = 1;

  public static void main(String... args) {
    List<Integer> someNumbers = new ArrayList<>();
    int min = 0;
    int max = 100;
    int length = 50;
    for (int i = 0; i < length; i++) {
      someNumbers.add(ThreadLocalRandom.current().nextInt(min, max + 1));
    }

    System.out.println("I want show you numbers greater than 25:");
    someNumbers.forEach((number) -> {
      if (number > 25) System.out.print(number + " ");
    });
  }

  private static void calcTime(Runnable runnable) {
    long startTime = System.nanoTime();
    for (int i = 0; i < MEASURE_COUNT; i++) {
      runnable.run();
    }
    long finishTime = System.nanoTime();
    long timeNs = (finishTime - startTime) / MEASURE_COUNT;
    System.out.println("Time spent: " + timeNs + "ns (" + timeNs / 1_000_000 + "ms)");
  }
}
