package com.lycsoftware.functional.predicate;

public class Empleado
{
    private String nombre;
    private int edad;
    private double salario;
    private String departamento;

    public Empleado(final String nombre,
                    final int edad,
                    final double salario,
                    final String departamento)
    {
        super();
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public void setNombre(final String nombre)
    {
        this.nombre = nombre;
    }

    public int getEdad()
    {
        return this.edad;
    }

    public void setEdad(final int edad)
    {
        this.edad = edad;
    }

    public double getSalario()
    {
        return this.salario;
    }

    public void setSalario(final double salario)
    {
        this.salario = salario;
    }

    public String getDepartamento()
    {
        return this.departamento;
    }

    public void setDepartamento(final String departamento)
    {
        this.departamento = departamento;
    }

}
