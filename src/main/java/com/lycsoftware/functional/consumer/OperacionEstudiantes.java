package com.lycsoftware.functional.consumer;

import java.util.List;
import java.util.function.Consumer;

public class OperacionEstudiantes
{
    public void aceptarTodos(final List<Estudiante> lstEst,
                             final Consumer<Estudiante> cons)
    {
        for (final Estudiante est : lstEst) {
            cons.accept(est);
        }
    }
}
