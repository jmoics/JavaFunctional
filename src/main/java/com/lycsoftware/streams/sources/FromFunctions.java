package com.lycsoftware.streams.sources;

import java.util.Random;
import java.util.stream.Stream;

public class FromFunctions
{
    public static void main(final String[] args)
    {
        final Stream<Long> primerosDiez = Stream.iterate(1L, n -> n + 1).limit(10);
        primerosDiez.forEach(System.out::println);

        Stream.iterate(1L, n -> n + 1)
                        .filter(n -> n % 2 == 0)
                        .limit(20)
                        .forEach(System.out::println);

        System.out.println("Despues de 100");
        Stream.iterate(1L, n -> n + 1)
                        .filter(n -> n % 2 == 0)
                        .skip(100)
                        .limit(5)
                        .forEach(System.out::println);

        System.out.println("Números aleatorios");
        // Stream.generate(() -> Math.random())
        Stream.generate(Math::random)
                        .limit(5)
                        .forEach(System.out::println);

        new Random().ints()
                        .limit(5)
                        .forEach(System.out::println);
    }
}
