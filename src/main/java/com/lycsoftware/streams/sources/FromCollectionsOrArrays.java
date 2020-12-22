package com.lycsoftware.streams.sources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromCollectionsOrArrays
{

    public static void main(final String[] args)
    {
        final IntStream numStream = Arrays.stream(new int[] { 1, 2, 3, 4, 5, 6 });
        numStream.forEach(System.out::println);

        final Stream<String> strStream = Arrays.stream(new String[] { "Jorge", "Lucia", "Juancho", "Dorotea" });
        strStream.forEach(System.out::println);

        final Set<String> langSet = new HashSet<>();
        langSet.add("Java");
        langSet.add("C++");
        langSet.add("VB");

        final Stream<String> langStream = langSet.stream();
        langStream.forEach(System.out::println);

        final List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("s01", 17, 1.65, 15));
        estudiantes.add(new Estudiante("s02", 12, 1.55, 16));
        estudiantes.add(new Estudiante("s03", 15, 1.75, 12));
        estudiantes.add(new Estudiante("s04", 17, 1.70, 15));
        estudiantes.add(new Estudiante("s05", 18, 1.66, 14));
        estudiantes.add(new Estudiante("s06", 19, 1.68, 17));

        System.out.println("Stream de estudiantes");
        estudiantes.parallelStream()
                        .forEach(estudiante -> System.out.println(estudiante.getCodigo()));
    }

}
