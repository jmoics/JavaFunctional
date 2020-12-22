package com.lycsoftware.streams.endoperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReductOperation2
{

    public static void main(final String[] args)
    {
        final int[] numeros = { 4, 5, 9, 7, 23, 56, 12, 45, 98, 23, 34, 32, 54, 12, 5, 2, 9, 28, 8, 7 };

        // en la primera iteracion el valor left sera el 0 que colocamos como primer parametro,
        // luego sera el acumulado
        final int suma = IntStream.of(numeros).reduce(0, (left,
                                                          right) -> left + right);
        final int suma2 = IntStream.of(numeros).reduce(0, Integer::sum);
        System.out.println("La suma es: " + suma);

        final Path path1 = Paths.get("Parrafo.txt");

        // Eliminaremos todas las comas de un texto linea a linea usando reduce para concatenar
        String texto = "";
        try (Stream<String> lines = Files.lines(path1)) {
            texto = lines.map(linea -> linea.replace(",", ""))
                            .reduce(texto, (line1,
                                         line2) -> line1.concat("\n").concat(line2));
        } catch (final Exception e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Parrafo2.txt"))) {
            bw.write(texto);
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

}
