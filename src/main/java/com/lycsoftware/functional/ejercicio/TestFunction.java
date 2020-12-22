package com.lycsoftware.functional.ejercicio;

import java.util.function.Function;

public class TestFunction
{
    public static void main(final String[] args)
    {
        final Function<Integer, String> converterOld = new Function<Integer, String>()
        {
            @Override
            public String apply(final Integer t)
            {
                return t.toString();
            }
        };
        final Function<Integer, String> converter = x -> x.toString();

        System.out.println(converter.apply(30).length());
    }
}
