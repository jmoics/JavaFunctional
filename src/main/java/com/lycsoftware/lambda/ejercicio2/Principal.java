package com.lycsoftware.lambda.ejercicio2;

public class Principal
{

    public static void main(final String[] args)
    {
        // ambiguedad de metodos
        // engine((x, y) -> x + y);

        // dos formas de evitar la ambiguedad
        engine((final long x, final long y) -> x + y); // agregando tipos a los parametros

        // Functional Interface en el contexto de casteo de un lambda
        engine((CalculadoraInt)(x, y) -> x + y); // haciendo un cast hacia la interfaz que deseamos

        final CalculadoraInt cal = (x, y) -> x + y;
        engine(cal); // construyendo la implementacion de la interfaz aparte
    }

    private static void engine(final CalculadoraInt cal)
    {

    }

    private static void engine(final CalculadoraLong cal)
    {

    }
}
