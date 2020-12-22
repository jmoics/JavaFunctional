package com.lycsoftware.functional.bifunction;

import java.util.Arrays;
import java.util.List;

public class EjercicioBiFunction
{
    public static void main(final String[] args)
    {
        final Calculadora cal = new Calculadora();
        final String res = cal.calc((x,
                  y) -> ": " + (x * y), 60, 20);

        System.out.println("El resultado es: " + res);


        final List<Empleado> lstEmp = Arrays.asList(new Empleado("Jorge", 4400.4), new Empleado("Juan", 4400.4),
                        new Empleado("Jose", 2800.4), new Empleado("Daniel", 2300.4), new Empleado("Pablo", 4100.4),
                        new Empleado("Lucia", 7400.4), new Empleado("Miguel", 5400.4), new Empleado("Pedro", 5400.4),
                        new Empleado("Gracy", 8400.4));

        final List<Double> salarios = cal.calc2((salario,
                                                 incremento) -> salario + (salario * (incremento / 100)),
                        lstEmp, 16.0);

        for (final Double salario : salarios) {
            System.out.println(salario);
        }
    }
}
