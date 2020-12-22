package com.lycsoftware.functional.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Evaluador
{
    public List<Empleado> evaluar(final List<Empleado> listEmp,
                                  final Predicate<Empleado> eval)
    {
        final List<Empleado> listEmpNew = new ArrayList<>();
        for (final Empleado emp : listEmp) {
            if (eval.test(emp)) {
                listEmpNew.add(emp);
            }
        }

        return listEmpNew;
    }

    public List<Empleado> evaluarNegado(final List<Empleado> listEmp,
                                        final Predicate<Empleado> eval)
    {
        final List<Empleado> listEmpNew = new ArrayList<>();
        for (final Empleado emp : listEmp) {
            if (eval.negate().test(emp)) {
                listEmpNew.add(emp);
            }
        }

        return listEmpNew;
    }
}
