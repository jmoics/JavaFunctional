package com.lycsoftware.lambda.intro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class LambdaTestApp
{
    public static void main(final String[] args)
    {
        // Lo habitual es crear el objeto mediante una clase anonima:
        final Ficticia fun = new Ficticia()
        {
            @Override
            public void aceptar()
            {
                System.out.println("Hola Mundo");
            }
        };

        // Usando lambdas sería así:
        final Ficticia fun2 = () -> {
            System.out.println("Hola Mundo");
        };

        // al tener solo una expresion, podemos prescindir de las llaves
        final Ficticia fun3 = () -> System.out.println("Hola Mundo");

        // podriamos colocar el tipo en los argumentos, pero no es necesario ya que el compilador lo infiere
        final Ficticia2 fun4 = (final int valor1,
                                int valor2) -> {
            valor2 = valor1 + valor2;
            return (valor1 * valor2);
        };

        // se puede prescindir del return ya que solo se tiene una expresion
        final Ficticia2 fun5 = (valor1,
                                valor2) -> valor1 * valor2;
    }

    private void ejemploSwing()
    {
        final JButton button = new JButton();
        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(final ActionEvent e)
            {
                System.out.println("Action Listener clase anonima ->" + e.getActionCommand());
            }
        });

        button.addActionListener(
                        event -> System.out.println("Action Listener con lambda -> " + event.getActionCommand()));
    }

}
