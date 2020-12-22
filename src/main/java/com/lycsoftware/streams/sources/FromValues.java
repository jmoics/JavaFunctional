package com.lycsoftware.streams.sources;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromValues
{

    public static void main(final String[] args)
    {
        final Stream<String> stream = Stream.of("Jorge", "Juancho", "Miguel", "Daniel");
        stream.forEach(System.out::println);

        final String[] arreglo = { "Jorge", "Juancho", "Miguel", "Daniel" };
        final Stream<String> stream2 = Stream.of(arreglo);
        stream2.forEach(System.out::println);

        final Stream<Estudiante> streamEstudiantes = Stream.<Estudiante>builder()
                        .add(new Estudiante("n01", 17, 1.70, 17))
                        .add(new Estudiante("n02", 18, 1.70, 15))
                        .build();
        streamEstudiantes.forEach(estudiante -> System.out.println(estudiante.getCodigo()));

        final IntStream unoAVeinte = IntStream.range(1, 21);
        final IntStream unoAVeinte2 = IntStream.rangeClosed(1, 20);
    }

}
