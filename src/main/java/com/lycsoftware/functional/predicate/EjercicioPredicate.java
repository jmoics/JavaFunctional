package com.lycsoftware.functional.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class EjercicioPredicate
{
    public static void main(final String[] args)
    {
        final Predicate<Integer> predicate = valor -> valor > 0;
        System.out.println(predicate.test(10));

        // ----------------
        final List<Empleado> listEmp = Arrays.asList(new Empleado("Jorge", 33, 8200, "Sistemas"),
                        new Empleado("Lucia", 29, 7200, "Contabilidad"),
                        new Empleado("Juan", 32, 5200, "RRHH"), new Empleado("Gracy", 33, 1200, "Ventas"),
                        new Empleado("Pedro", 18, 4200, "RRHH"), new Empleado("Miguel", 21, 2200, "Ventas"),
                        new Empleado("Pablo", 22, 3200, "Marketing"), new Empleado("Daniel", 26, 6200, "Logistica"),
                        new Empleado("Julio", 31, 10200, "Sistemas"));

        final Evaluador evaluador = new Evaluador();

        System.out.println("Empleados con salarios > 5000");
        final List<Empleado> empSalariosAltos = evaluador.evaluar(listEmp, empleado -> empleado.getSalario() > 5000);
        for (final Empleado emp : empSalariosAltos) {
            System.out.println(emp.getNombre());
        }

        System.out.println("Empleados que su nombre inicia con J");
        final List<Empleado> empNombreJ = evaluador.evaluar(listEmp, empleado -> empleado.getNombre().startsWith("J"));
        for (final Empleado emp : empNombreJ) {
            System.out.println(emp.getNombre());
        }

        System.out.println("Empleados jovenes");
        final List<Empleado> empleadoJoven = evaluador.evaluar(listEmp, empleado -> empleado.getEdad() < 25);
        for (final Empleado emp : empleadoJoven) {
            System.out.println(emp.getNombre());
        }

        // --------------
        final Funciones fun = new Funciones();
        for (final Empleado emp : empleadoJoven) {
            final double nuevoSalario = fun.incrementoSalario(emp, 10, (salario,
                                                                        incremento) -> salario
                                                                                        + (salario * incremento / 100));
            emp.setSalario(nuevoSalario);
        }
        for (final Empleado emp : empleadoJoven) {
            System.out.println("Nombre: " + emp.getNombre() + ", Salario: " + emp.getSalario());
        }

        System.out.println("Empleados mayores");
        final List<Empleado> empleadosViejos = evaluador.evaluarNegado(listEmp, empleado -> empleado.getEdad() < 25);
        for (final Empleado emp : empleadosViejos) {
            System.out.println(emp.getNombre());
        }
    }
}
