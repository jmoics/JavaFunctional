package com.lycsoftware.streams.intermediateoperations;

import java.util.List;
import java.util.function.Predicate;

import com.lycsoftware.streams.intermediateoperations.util.Empleado;

public class FilterOperation
{

    public static void main(final String[] args)
    {
        final List<Empleado> empleados = Empleado.empleados();

        System.out.println("Empleados Mujeres");
        empleados.stream().filter(new Predicate<Empleado>()
        {
            @Override
            public boolean test(Empleado t)
            {
                return t.esMujer();
            }
        }).forEach(empM -> System.out.println(empM.getNombre()));


        System.out.println("\\nEmpleados Hombres");
        empleados.stream().filter(Empleado::esHombre)
            .forEach(empH -> System.out.println(empH.getNombre()));

        System.out.println("\\nEmpleados mayores a 25 años");
        empleados.stream().filter(emp -> emp.getEdad() > 25)
            .forEach(emp -> System.out.println(emp.getNombre() + " - " + emp.getEdad()));

        System.out.println("\nEmpleados masculino letra A");
        empleados.stream().filter(Empleado::esHombre).filter(emp -> emp.getNombre().startsWith("A"))
            .forEach(emp -> System.out.println(emp.getNombre() + " - " + emp.getEdad()));

        System.out.println("\nEmpleados Femeninos mayor a 25 años con ingresos mayor a 4000");
        final Predicate<Empleado> empFemenino = Empleado::esMujer;
        final Predicate<Empleado> empMayor25 = emp -> emp.getEdad() > 25;
        final Predicate<Empleado> empMayor4000 = emp -> emp.getIngresos() > 4000;

        final Predicate<Empleado> allCond = empFemenino.and(empMayor25).and(empMayor4000);
        empleados.stream().filter(allCond).forEach(emp -> System.out.println(
                        emp.getNombre() + " - " + emp.getGenero() + " - " + emp.getEdad() + " - " + emp.getIngresos()));

        System.out.println("Cantidad Total: " + empleados.stream().filter(allCond).count());
    }

}
