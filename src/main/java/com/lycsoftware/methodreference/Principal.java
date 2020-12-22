package com.lycsoftware.methodreference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Principal
{
    public static void main(final String[] args)
    {
        final List<Persona> personas = Arrays.asList(new Persona("Jorge", 34, "jmoics@gmail.com"),
                        new Persona("Julio", 24, "Julio@gmail.com"), new Persona("Lucia", 22, "Lucia@gmail.com"),
                        new Persona("Pepe", 27, "Pepe@gmail.com"), new Persona("Chris", 27, "Chris@gmail.com"),
                        new Persona("Lucho", 21, "Lucho@gmail.com"), new Persona("Pancho", 44, "Pancho@gmail.com"),
                        new Persona("Daisy", 35, "Daisy@gmail.com"), new Persona("Roger", 31, "Roger@gmail.com"),
                        new Persona("Leo", 45, "Leo@gmail.com"), new Persona("Abril", 27, "Abril@gmail.com"),
                        new Persona("Katty", 12, "Katty@gmail.com"));

        System.out.println("Personas sin ordenar: ");
        personas.forEach(p -> System.out.println(p));

        Collections.sort(personas, (p1,
                                    p2) -> p1.getEdad().compareTo(p2.getEdad()));

        Collections.sort(personas, (p1,
                                    p2) -> Persona.comparaXEdad(p1, p2));

        // Utilizamos metodos referenciados en el caso especifico que una expresion lambda llame a
        // un metodo ya existente, como en el ejemplo anterior
        // Caso 1: con un metodo static
        Collections.sort(personas, Persona::comparaXEdad);

        // Caso 2: con un metodo de instancia
        final ProveedorComparaciones comparador = new ProveedorComparaciones();
        Collections.sort(personas, comparador::compararXNombre);

        personas.forEach(System.out::println);

        // Caso 3: invocamos a partir del tipo como si fuese metodo static pese a que no lo es
        Collections.sort(personas, (p1,
                                    p2) -> p1.compararXEdad2(p2));
        Collections.sort(personas, Persona::compararXEdad2);

        // Caso 4: method reference a un constructor
        final List<String> numeros = Arrays.asList("2", "4", "45", "76", "23", "21", "12", "7", "98", "23", "12", "44");

        getResults(numeros, str -> new Integer(str));
        getResults(numeros, Integer::new).forEach(System.out::println);
        ;
    }

    private static List<Integer> getResults(final List<String> data,
                                            final Function<String, Integer> func)
    {
        final List<Integer> result = new ArrayList<>();
        data.forEach(strNum -> result.add(func.apply(strNum)));
        return result;
    }
}
