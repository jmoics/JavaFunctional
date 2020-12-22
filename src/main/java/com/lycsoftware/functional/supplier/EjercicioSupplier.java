package com.lycsoftware.functional.supplier;

import java.util.function.Supplier;

public class EjercicioSupplier
{

    public static void main(final String[] args)
    {
        final Supplier<String> sup = () -> "Hola Jorge";
        System.out.println("El valor es: " + sup.get());
    }

}
