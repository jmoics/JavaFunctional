package com.lycsoftware.functional.bifunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Calculadora
{
    public String calc(final BiFunction<Integer, Integer, String> bi,
                       final Integer b1,
                       final Integer b2)
    {
        return bi.apply(b1, b2);
    }

    public List<Double> calc2(final BiFunction<Double, Double, Double> bi,
                              final List<Empleado> empLst,
                              final Double incremento)
    {
        final List<Double> lstSal = new ArrayList<>();
        for (final Empleado emp : empLst) {
            lstSal.add(bi.apply(emp.getSalario(), incremento));
        }

        return lstSal;
    }
}
