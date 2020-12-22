package com.lycsoftware.streams.intermediateoperations;

import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

import com.lycsoftware.streams.intermediateoperations.util.Empleado;

public class MapOperation
{

    public static void main(final String[] args)
    {
        IntStream.rangeClosed(1, 5)
                        .map(new IntUnaryOperator()
                        {
                            @Override
                            public int applyAsInt(final int operand)
                            {
                                return operand * operand;
                            }
                        })
                        .forEach(System.out::println);

        IntStream.rangeClosed(1, 5)
                        .map(n -> n * 2)
                        .forEach(System.out::println);

        final List<Empleado> empleados = Empleado.empleados();
        System.out.println("Promedio de ingresos de personal femenino mayor a 25 años");
        final double suma = empleados.stream()
                        .filter(Empleado::esMujer)
                        .filter(emp -> emp.getEdad() > 25)
                        .mapToDouble(Empleado::getIngresos)
                        .sum();
        final double promedio = suma / empleados.stream()
                        .filter(Empleado::esMujer)
                        .filter(emp -> emp.getEdad() > 25)
                        .count();
        System.out.println("El Promedio es: " + promedio);

        System.out.println("\nEl cuadrado y cubo de los 10 primeros numeros");
        IntStream.rangeClosed(1, 10)
                        .flatMap(value -> IntStream.builder().add(value).add((int) Math.pow(value, 2))
                                        .add((int) Math.pow(value, 3)).build())
                        .forEach(System.out::println);

    }

}
