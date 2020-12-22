package com.lycsoftware.functional.unaryoperator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class EjercicioUnaryOp
{

    public static void main(final String[] args)
    {
        // Hereda de function, pero la diferencia es que devuelve el mismo tipo del valor de entrada
        final List<Integer> list = Arrays.asList(1, 3, 6, 7, 3, 89, 243, 57, 98);

        final List<Integer> listActual = operadorUnary(num -> num * num, list);

        listActual.forEach(num -> System.out.println(num));
    }

    private static List<Integer> operadorUnary(final UnaryOperator<Integer> uOp,
                                               final List<Integer> list)
    {
        final List<Integer> listActual = new ArrayList<>();
        list.forEach(num -> listActual.add(uOp.apply(num)));

        return listActual;
    }
}
