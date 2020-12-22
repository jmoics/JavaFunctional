package com.lycsoftware.functional.bifunction;

public class Empleado
{
    private String nombre;
    private Double salario;

    public Empleado(final String nombre,
                    final double salario)
    {
        super();
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public void setNombre(final String nombre)
    {
        this.nombre = nombre;
    }

    public Double getSalario()
    {
        return this.salario;
    }

    public void setSalario(final Double salario)
    {
        this.salario = salario;
    }

}
