package com.lycsoftware.functional.comparator;

import java.time.LocalDate;

public class Persona
    implements Comparable<Persona>
{
    private int idPersona;
    private String nombre;
    private LocalDate fechaNac;

    public Persona()
    {
        // TODO Auto-generated constructor stub
    }

    public Persona(final int idPersona,
                   final String nombre)
    {
        super();
        this.idPersona = idPersona;
        this.nombre = nombre;
    }

    public Integer getIdPersona()
    {
        return this.idPersona;
    }

    public void setIdPersona(final int idPersona)
    {
        this.idPersona = idPersona;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public void setNombre(final String nombre)
    {
        this.nombre = nombre;
    }

    public LocalDate getFechaNac()
    {
        return this.fechaNac;
    }

    public void setFechaNac(final LocalDate fechaNac)
    {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString()
    {
        return String.format("persona{idPersona: %1s, nombre: %2s}", this.idPersona, this.nombre);
    }

    @Override
    public int compareTo(final Persona o)
    {
        final int result = this.nombre.compareTo(o.getNombre());
        return result;
    }

}
