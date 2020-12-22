package com.lycsoftware.lambda.ejercicio1;

public class LambdaTest
{
    public static void main(final String[] args)
    {
        final FunctionTest f = () -> System.out.println("Hola Mundo");
        f.saludar();

        LambdaTest.miMetodoSaludar(f);

        LambdaTest.showSum((a, b) -> System.out.println("Esto es una suma -> " + (a + b)), 5, 10);
        LambdaTest.showSum((a, b) -> System.out.println("Esto es una multiplicacion -> " + a * b), 5, 10);

        engine((x,y) -> x + y);
        engine((x,y) -> x * y);
        engine((x,y) -> x - y);
        engine((x,y) -> x / y);
    }

    private static void miMetodoSaludar(final FunctionTest param)
    {
        param.saludar(); // el metodo ya tiene una implementacion realizada arriba.
    }

    private static void showSum(final Operaciones op,
                         final int param1,
                         final int param2)
    {
        op.operacion(param1, param2);
    }

    private static void engine(final Calculadora cal)
    {
        final int x = 2, y = 5;
        final int resultado = cal.calcular(x, y);
        System.out.println(resultado);
    }
}
