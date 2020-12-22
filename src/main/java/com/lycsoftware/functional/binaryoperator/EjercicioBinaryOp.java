package com.lycsoftware.functional.binaryoperator;

import java.util.function.BinaryOperator;

public class EjercicioBinaryOp
{

    public static void main(final String[] args)
    {
        final BinaryOperator<Integer> bOp = (num1,
                                             num2) -> num1 * num2;
        System.out.println("Resultado: " + bOp.apply(5, 8));

        //usando el metodo minBy
        final BinaryOperator<Integer> bOp2 = BinaryOperator.minBy((final Integer n1,
                                                                   final Integer n2) -> n1.compareTo(n2));
        System.out.println("El numero menor de 10 y 20 es: " + bOp2.apply(10, 20));

        // revisar la implementacion del compareTo en Integer que es compatible con el compare

        // usando el metodo maxBy
        final BinaryOperator<Integer> bOp3 = BinaryOperator.maxBy((final Integer n1,
                                                                   final Integer n2) -> n1.compareTo(n2));
        System.out.println("El numero mayor de 10 y 20 es: " + bOp3.apply(10, 20));
    }

}
