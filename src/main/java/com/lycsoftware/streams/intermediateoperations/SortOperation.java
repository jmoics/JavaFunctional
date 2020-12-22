package com.lycsoftware.streams.intermediateoperations;

import java.util.Arrays;
import java.util.List;

import com.lycsoftware.streams.intermediateoperations.util.Empleado;

public class SortOperation
{
    public static void main(final String[] args)
    {
        System.out.println("\nNombres ordenados");
        Arrays.asList("Alfredo", "Maria", "Daniel", "Brenda")
                        .stream()
                        .sorted()
                        .forEach(System.out::println);

        System.out.println("\nNúmeros ordenados");
        Arrays.asList(1, 7, 3, 8, 9, 6, 4, 6, 2, 3, 12, 56, 98)
                        .stream()
                        .sorted()
                        .forEach(System.out::println);

        final List<Empleado> empleados = Empleado.empleados();
        empleados.stream()
                        .sorted()
                        .forEach(System.out::println);

        System.out.println("\nEmpleados ordenados por edad");
        empleados.stream()
                        .sorted((e1,
                                 e2) -> e1.getEdad() - e2.getEdad())
                        .forEach(emp -> System.out.println(emp.getNombre() + " - " + emp.getEdad()));

        System.out.println("\nEmpleados ordenados por ingreso");
        empleados.stream()
                        .sorted((e1,
                                 e2) -> e1.getIngresos().compareTo(e2.getIngresos()))
                        .forEach(emp -> System.out.println(emp.getNombre() + " - " + emp.getIngresos()));
    }
}
