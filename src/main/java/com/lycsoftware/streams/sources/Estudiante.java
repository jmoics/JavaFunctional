package com.lycsoftware.streams.sources;

public class Estudiante
{
    private String codigo;
    private int edad;
    private double estatura;
    private double nota;

    public Estudiante(final String codigo,
                      final int edad,
                      final double estatura,
                      final double nota)
    {
        super();
        this.codigo = codigo;
        this.edad = edad;
        this.estatura = estatura;
        this.nota = nota;
    }

    public String getCodigo()
    {
        return this.codigo;
    }

    public void setCodigo(final String codigo)
    {
        this.codigo = codigo;
    }

    public int getEdad()
    {
        return this.edad;
    }

    public void setEdad(final int edad)
    {
        this.edad = edad;
    }

    public double getEstatura()
    {
        return this.estatura;
    }

    public void setEstatura(final double estatura)
    {
        this.estatura = estatura;
    }

    public double getNota()
    {
        return this.nota;
    }

    public void setNota(final double nota)
    {
        this.nota = nota;
    }

}
