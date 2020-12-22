package com.lycsoftware.functional.function;

import java.util.function.Function;

public class DatosComensal
{
    public static Object getDatoComensal(final Comensal com,
                                         final Function<Comensal, Object> func)
    {
        return func.apply(com);
    }

    public static void main(final String[] args)
    {
        final Comensal com = new Comensal("Jorge", 252.6, 10);
        final String nombreCom = (String) getDatoComensal(com, x -> x.getNombre());

        System.out.println("El nombre del comensal es: " + nombreCom);
    }
}
