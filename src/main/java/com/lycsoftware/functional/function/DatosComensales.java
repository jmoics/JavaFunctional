package com.lycsoftware.functional.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class DatosComensales
{
    public static void main(final String[] args)
    {
        final List<Comensal> listaComensales = Arrays.asList(new Comensal("Jorge", 10, 5), new Comensal("Juan", 10, 5),
                        new Comensal("Pedro", 10, 5), new Comensal("Julio", 10, 5), new Comensal("Pablo", 10, 5),
                        new Comensal("Jose", 10, 5), new Comensal("Carlos", 10, 5));

        final List<Object> nombresComensales = getDatosComensales(listaComensales, nC -> nC.getNombre());

        System.out.println("La lista de nombres de comensales es la siguiente: ");
        for (final Object nomCom : nombresComensales) {
            System.out.println("El nombre es: " + nomCom);
        }

        final List<Object> montoComensales = getDatosComensales(listaComensales, nC -> nC.getMontoPedido());

        System.out.println("La lista de montos de comensales es la siguiente: ");
        for (final Object monCom : montoComensales) {
            System.out.println("El monto es: " + monCom);
        }

        final List<Object> mesaComensales = getDatosComensales(listaComensales, nC -> nC.getMesa());

        System.out.println("La lista de mesas de comensales es la siguiente: ");
        for (final Object mesaCom : mesaComensales) {
            System.out.println("La mesa es: " + mesaCom);
        }
    }

    private static List<Object> getDatosComensales(final List<Comensal> listaCom,
                                                   final Function<Comensal, Object> func)
    {
        final List<Object> listaDatos = new ArrayList<>();
        for (final Comensal com : listaCom) {
            listaDatos.add(func.apply(com));
        }
        return listaDatos;
    }
}
