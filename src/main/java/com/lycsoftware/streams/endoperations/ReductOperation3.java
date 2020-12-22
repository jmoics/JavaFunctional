package com.lycsoftware.streams.endoperations;

import java.util.stream.IntStream;

public class ReductOperation3
{

    public static void main(final String[] args)
    {
        // aqui obtiene todas las estadisticas obtenidas en el primer ejemplo de manera mas optima
        System.out.println(IntStream.range(1, 20).summaryStatistics());

        System.out.println(IntStream.range(1, 20).summaryStatistics().getAverage());

        System.out.println(IntStream.range(1, 20).summaryStatistics().getSum());

        System.out.println(IntStream.range(1, 20).summaryStatistics().getCount());
    }

}
