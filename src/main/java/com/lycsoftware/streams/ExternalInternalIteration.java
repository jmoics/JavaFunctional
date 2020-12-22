package com.lycsoftware.streams;

import java.util.Arrays;
import java.util.List;

public class ExternalInternalIteration
{
    public static void main(final String[] args)
    {
        // Iteracion Externa
        final List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        int suma = 0;

        for (final Integer num : numeros) {
            if (num % 2 == 1) {
                final int cuadrado = num * num;
                suma = suma + cuadrado;
            }
        }
        System.out.println("Resultado de la suma de cuadrados: " + suma);

        // Iteracion interna
        final int suma2 = numeros.stream()
                        .filter(num -> num % 2 == 1) // operacion intermedia
                        .map(num -> num * num) // operacion intermedia
                        .reduce(0, Integer::sum); // operacion terminal
    }
}
