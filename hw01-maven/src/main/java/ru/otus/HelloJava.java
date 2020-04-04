package ru.otus;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class HelloJava {

  public static void main(String... args) {
    List<Integer> someNumbers = Lists.newArrayList();
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
}
