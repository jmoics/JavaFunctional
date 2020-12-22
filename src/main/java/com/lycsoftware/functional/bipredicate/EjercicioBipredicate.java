package com.lycsoftware.functional.bipredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class EjercicioBipredicate
{
    public static void main(final String[] args)
    {
        final BiPredicate<Integer, Integer> bp = (x,
                                                  y) -> x < y;
        System.out.println(bp.test(10, 20));

        final List<Empleado> listEmp = Arrays.asList(new Empleado("Jorge", 33, 8200, "Sistemas"),
                        new Empleado("Lucia", 29, 7200, "Contabilidad"),
                        new Empleado("Juan", 32, 5200, "RRHH"), new Empleado("Gracy", 33, 1200, "Ventas"),
                        new Empleado("Pedro", 18, 4200, "RRHH"), new Empleado("Miguel", 21, 2200, "Ventas"),
                        new Empleado("Pablo", 22, 3200, "Marketing"), new Empleado("Daniel", 26, 6200, "Logistica"),
                        new Empleado("Julio", 31, 10200, "Sistemas"));

        final Evaluador eval = new Evaluador();

        final BiPredicate<Integer, String> primerCriterio = (edad,
                                                             departamento) -> (edad >= 25)
                                                                             && departamento.equals("Ventas");

        final BiPredicate<Integer, String> segundoCriterio = (edad,
                                                             departamento) -> (edad >= 25)
                                                                              && departamento.equals("Contabilidad");

        final BiPredicate<Integer, String> criterio = primerCriterio.or(segundoCriterio);

        System.out.println("Empleados de mostrador o ventas mayores a 25 años");
        final List<Empleado> listActual = eval.evaluar(listEmp, criterio);

        for (final Empleado emp : listActual) {
            System.out.println("Nombre: " + emp.getNombre() + ", Edad: " + emp.getEdad() + ", Departamento: "
                            + emp.getDepartamento());
        }
    }
}
