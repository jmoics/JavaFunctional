package com.lycsoftware.functional.biconsumer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BiConsumer;

public class EjercicioBiconsumer
{
    public static void main(final String[] args)
    {
        final BiConsumer<Double, Double> biCons = (num1,
                                                   num2) -> {
            final double mult = num1 * num2;
            System.out.println("La multiplicación es: " + mult);
        };

        biCons.accept(21.4, 2.8);

        final Map<String, String> map = new HashMap<>();
        final String[][] arr = { { "Jorge", "Peru" }, { "Raji", "India" }, { "Paolo", "Italia" } };

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i][0], arr[i][1]);
        }
        System.out.println("Usando forma tradicional de imprimir valores de un mapa");
        final Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        if (iter != null) {
            while (iter.hasNext()) {
                final Map.Entry<String, String> entry = iter.next();
                System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
            }
        }

        System.out.println("Usando forma Biconsumer de imprimir valores de un mapa");

        map.forEach((key,
                     value) -> System.out.println("Clave: " + key + ", Valor: " + value));
    }
}
