package com.lycsoftware.lambda.ejercicio2;

public class PrincipalLambdaRetorno
{
    private static long varG = 10l;

    public static void main(final String[] args) {
        System.out.println(create().calculate(20, 5));
    }

    // Functional Interface en el contexto de retorno en un metodo a traves de un lambda
    private static CalculadoraLong create() {
        // no es posible crear otra variable x ya que se esta usando en el lambda, ya que el scope
        // del lambda es el mismo que el del metodo (podria usarse this incluso para las variables
        // de la clase).
        // long x;

        final long varL = 20l;

        return (x, y) -> x / y + varG + varL;
    }
}
