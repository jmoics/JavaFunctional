package com.lycsoftware.streams.endoperations;

import java.util.List;
import java.util.stream.IntStream;

import com.lycsoftware.streams.intermediateoperations.util.Empleado;

public class ReductOperation
{
    public static void main(final String[] args)
    {
        final int[] numeros = { 4, 5, 9, 7, 23, 56, 12, 45, 98, 23, 34, 32, 54, 12, 5, 2, 9, 28, 8, 7 };
        final List<Empleado> empleados = Empleado.empleados();

        System.out.println("La suma de elementos es: " + IntStream.of(numeros).sum());

        System.out.println("El promedio de elementos es: " + IntStream.of(numeros).average().getAsDouble());

        System.out.println("El maximo numero es: " + IntStream.of(numeros).max().getAsInt());

        System.out.println("La cantidad de elementos es: " + IntStream.of(numeros).count());

        System.out.println("La suma de salarios es: " + empleados.stream().mapToDouble(Empleado::getIngresos).sum());

        final Empleado emp = empleados.stream().max((e1,
                                                     e2) -> e1.getIngresos().compareTo(e2.getIngresos()))
                        .get();
        System.out.println("El empleado con el salario maximo es: " + emp.getNombre() + " - " + emp.getIngresos());
    }
}
