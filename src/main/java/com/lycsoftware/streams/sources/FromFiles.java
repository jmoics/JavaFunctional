package com.lycsoftware.streams.sources;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFiles
{

    public static void main(final String[] args)
    {
        final Path path1 = Paths.get("Parrafo.txt");

        // Se hace de esta forma para que el archivo se cierre una vez se
        try (Stream<String> lines = Files.lines(path1)) {
            lines.forEach(linea -> {
                System.out.println("linea: ");
                System.out.println(linea);
            });
        } catch (final IOException e) {
            e.printStackTrace();
        }

        final Path dir = Paths.get(".");
        System.out.printf("%nEl arbol de archivos del proyecto para: %s es %n", dir.toAbsolutePath());

        try (Stream<Path> paths = Files.walk(dir)) {
            paths.forEach(System.out::println);
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

}
