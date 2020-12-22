package com.lycsoftware.functional.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EjercicioComparator
{
    public static void main(final String[] args)
    {
        final List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(2, "Jorge"));
        personas.add(new Persona(1, "Ruben"));
        personas.add(new Persona(4, "Samuel"));
        personas.add(new Persona(3, "Miguel"));

        System.out.println("Lista de Personas desordenadas: " + personas);

        Collections.sort(personas);
        System.out.println("Lista de Personas ordenadas: " + personas);

        Collections.sort(personas, (per1,
                                    per2) -> per1.getIdPersona().compareTo(per2.getIdPersona()));
        System.out.println("Lista de Personas ordenadas por Id: " + personas);
    }
}
