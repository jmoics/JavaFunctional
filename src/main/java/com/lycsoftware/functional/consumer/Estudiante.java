package com.lycsoftware.functional.consumer;

public class Estudiante
{
    private String nombre;
    private double clasificacion;

    public Estudiante(final String nombre,
                      final double clasificacion)
    {
        super();
        this.nombre = nombre;
        this.clasificacion = clasificacion;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public void setNombre(final String nombre)
    {
        this.nombre = nombre;
    }

    public double getClasificacion()
    {
        return this.clasificacion;
    }

    public void setClasificacion(final double clasificacion)
    {
        this.clasificacion = clasificacion;
    }

}
