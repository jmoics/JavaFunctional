package com.lycsoftware.functional.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class EjercicioConsumer
{
    public static void main(final String[] args)
    {
        final Consumer<String> consumer = x -> System.out.println(x);
        consumer.accept("Hola");


        final List<Estudiante> lstEstudiantes = Arrays.asList(new Estudiante("Lucia", 16),
                        new Estudiante("Roberto", 11), new Estudiante("Juan", 10.5), new Estudiante("Marga", 18),
                        new Estudiante("Edmundo", 11.5), new Estudiante("Pedro", 12), new Estudiante("Cecilia", 17),
                        new Estudiante("Hermenegildo", 13.5), new Estudiante("Miguel", 15),
                        new Estudiante("Pancha", 13), new Estudiante("Julio", 15.5), new Estudiante("Daniel", 06),
                        new Estudiante("Gringa", 05));

        final OperacionEstudiantes op = new OperacionEstudiantes();

        final Consumer<Estudiante> cons1 = e -> System.out
                        .println("Nombre: " + e.getNombre() + ", Calificacion: " + e.getClasificacion());
        System.out.println("Estudiantes sin calificacion actualizada:");
        op.aceptarTodos(lstEstudiantes, cons1);

        final Consumer<Estudiante> cons2 = e -> e
                        .setClasificacion(e.getClasificacion() + e.getClasificacion() * 15 / 100);
        /*op.aceptarTodos(lstEstudiantes, cons2);

        System.out.println("Estudiantes con calificacion actualizada:");
        op.aceptarTodos(lstEstudiantes, cons1);*/


        // ejemplo con andThen
        final Consumer<Estudiante> cons3 = cons2.andThen(cons1);
        System.out.println("Estudiantes con calificacion actualizada:");
        op.aceptarTodos(lstEstudiantes, cons3);
    }
}
