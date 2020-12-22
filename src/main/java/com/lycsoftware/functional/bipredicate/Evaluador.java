package com.lycsoftware.functional.bipredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class Evaluador
{
    public List<Empleado> evaluar(final List<Empleado> lstEmp,
                                  final BiPredicate<Integer, String> eval)
    {
        final List<Empleado> lstNewEmp = new ArrayList<>();
        for (final Empleado emp : lstEmp) {
            if (eval.test(emp.getEdad(), emp.getDepartamento())) {
                lstNewEmp.add(emp);
            }
        }
        return lstNewEmp;
    }
}
