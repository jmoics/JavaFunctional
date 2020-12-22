package com.lycsoftware.streams.intermediateoperations.util;

import java.util.Arrays;
import java.util.List;

public class Empleado
    implements Comparable
{
    private long id;
    private String nombre;
    private double ingresos;
    private Genero genero;
    private int edad;

    public static enum Genero
    {
        HOMBRE, MUJER
    }

    public Empleado(final long id,
                    final String nombre,
                    final double ingresos,
                    final Genero genero,
                    final int edad)
    {
        super();
        this.id = id;
        this.nombre = nombre;
        this.ingresos = ingresos;
        this.genero = genero;
        this.edad = edad;
    }

    public long getId()
    {
        return this.id;
    }

    public void setId(final long id)
    {
        this.id = id;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public void setNombre(final String nombre)
    {
        this.nombre = nombre;
    }

    public Double getIngresos()
    {
        return this.ingresos;
    }

    public void setIngresos(final double ingresos)
    {
        this.ingresos = ingresos;
    }

    public Genero getGenero()
    {
        return this.genero;
    }

    public void setGenero(final Genero genero)
    {
        this.genero = genero;
    }

    public boolean esHombre()
    {
        return Genero.HOMBRE.equals(this.genero);
    }

    public boolean esMujer()
    {
        return Genero.MUJER.equals(this.genero);
    }

    public int getEdad()
    {
        return this.edad;
    }

    public void setEdad(final int edad)
    {
        this.edad = edad;
    }

    @Override
    public int compareTo(final Object o)
    {
        return this.getNombre().compareTo(((Empleado) o).getNombre());
    }

    @Override
    public String toString()
    {
        return this.nombre;
    }

    public static List<Empleado> empleados()
    {
        return Arrays.asList(new Empleado(1, "Jorge Cueva", 8400.5, Genero.HOMBRE, 34),
                        new Empleado(2, "Lucia Castilla", 5600.5, Genero.MUJER, 24),
                        new Empleado(3, "Pedro Infante", 8300.5, Genero.HOMBRE, 34),
                        new Empleado(4, "Agustin Gamarra", 1400.5, Genero.HOMBRE, 33),
                        new Empleado(5, "Pancho Villa", 3460.5, Genero.HOMBRE, 30),
                        new Empleado(6, "Miguel Lopez", 1230.5, Genero.HOMBRE, 31),
                        new Empleado(7, "Juan Salazar", 4560.5, Genero.HOMBRE, 24),
                        new Empleado(8, "Daniel Meneses", 4350.5, Genero.HOMBRE, 29),
                        new Empleado(9, "Jose Pardo", 6460.5, Genero.HOMBRE, 28),
                        new Empleado(10, "Carmen Rodriguez", 4533.5, Genero.MUJER, 27),
                        new Empleado(11, "Margarita Diaz", 6531.5, Genero.MUJER, 32),
                        new Empleado(12, "Jose Diaz", 6253.5, Genero.HOMBRE, 30),
                        new Empleado(13, "Liz Cueva", 1638.5, Genero.MUJER, 34),
                        new Empleado(14, "Luis Zegarra", 6273.5, Genero.HOMBRE, 32),
                        new Empleado(15, "Carlos Martinez", 6353.5, Genero.HOMBRE, 33),
                        new Empleado(16, "Paula Cardenas", 1846.5, Genero.MUJER, 27),
                        new Empleado(17, "Jessica Ysasi", 2947.5, Genero.MUJER, 28),
                        new Empleado(18, "Patricia Moscon", 2434.5, Genero.MUJER, 20),
                        new Empleado(19, "Jonathan Camaro", 1244.5, Genero.HOMBRE, 28),
                        new Empleado(20, "Manuel Valladares", 2434.5, Genero.HOMBRE, 45),
                        new Empleado(21, "Eduardo Mendoza", 4576.5, Genero.HOMBRE, 38),
                        new Empleado(22, "Moises Concha", 1243.5, Genero.HOMBRE, 39),
                        new Empleado(23, "Pablo Samames", 8963.5, Genero.HOMBRE, 36),
                        new Empleado(24, "Tony Perez", 7554.5, Genero.HOMBRE, 37),
                        new Empleado(25, "Fernando Paula", 2345.5, Genero.HOMBRE, 55),
                        new Empleado(26, "Boris Cordova", 3450.5, Genero.HOMBRE, 45),
                        new Empleado(27, "Daysi Quiroz", 4579.5, Genero.MUJER, 34),
                        new Empleado(28, "Celeste Valencia", 3453.5, Genero.MUJER, 34));
    }
}
