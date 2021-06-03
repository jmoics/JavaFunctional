package com.lycsoftware.streams.endoperations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.lycsoftware.streams.intermediateoperations.util.Empleado;
import com.lycsoftware.streams.intermediateoperations.util.Empleado.Genero;

public class Collect
{

    public static void main(final String[] args)
    {
        // Este es el objeto donde voy a almacenar los elementos de mi stream
        final Supplier<ArrayList<String>> proveedor = ArrayList::new;

        // Aqui tenemos el acumulador, el que añadira cada elemento del stream al proveedor definido
        // arriba
        // BiConsumer<ArrayList<String>, String> acumulador = (list, str) -> list.add(str);
        final BiConsumer<ArrayList<String>, String> acumulador = ArrayList::add;

        // Aquí tenemos el combinador, ya que por ejemplo al usar parallelStream, cada hijo generara
        // su propio proveedor, y al final deberan combinarse
        final BiConsumer<ArrayList<String>, ArrayList<String>> combinador = ArrayList::addAll;

        final List<Empleado> empleados = Empleado.empleados();
        final List<String> listNom = empleados.stream()
                        .map(Empleado::getNombre)
                        .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        System.out.println(listNom);

        // Usando Collectors
        final List<String> listNom2 = empleados.stream()
                        .map(Empleado::getNombre)
                        .collect(Collectors.toList());
        System.out.println(listNom2);

        final Set<String> listNom3 = empleados.stream()
                        .map(Empleado::getNombre)
                        .collect(Collectors.toSet());
        System.out.println(listNom3);

        final Collection<String> listNom4 = empleados.stream()
                        .map(Empleado::getNombre)
                        .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(listNom4);

        // Ahora con mapas
        final Map<Long, String> map = empleados.stream()
                        .collect(Collectors.toMap(Empleado::getId, Empleado::getNombre));
        System.out.println(map);

        final Map<Genero, String> map2 = empleados.stream()
                        .collect(Collectors.toMap(Empleado::getGenero, Empleado::getNombre,
                                        (nom1,
                                         nom2) -> String.join(", ", nom1, nom2)));
        System.out.println(map2);
    }

}
