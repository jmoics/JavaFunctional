package com.lycsoftware.streams.sources;

import java.util.Scanner;
import java.util.regex.Pattern;

public class FromStrings
{
    public static void main(final String[] args)
    {
        final Scanner sc = new Scanner(System.in);
        final String entrada = sc.nextLine();

        entrada.chars()
                        .filter(n -> !Character.isDigit((char) n) && !Character.isWhitespace((char) n))
                        .forEach(n -> System.out.print((char) n));

        final String str = "HTML, CSS, JAVASCRIPT, JAVA, C++, C#, RUBY";
        Pattern.compile(", ")
                        .splitAsStream(str)
                        .forEach(System.out::println);
    }
}
