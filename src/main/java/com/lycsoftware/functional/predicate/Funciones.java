package com.lycsoftware.functional.predicate;

import java.util.function.BiFunction;

public class Funciones
{
    public double incrementoSalario(final Empleado emp,
                                    final double incremento,
                                    final BiFunction<Double, Double, Double> bi)
    {
        return bi.apply(emp.getSalario(), incremento);
    }
}
