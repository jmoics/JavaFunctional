package com.lycsoftware.methodreference;

public class Persona
{
    private String nombre;
    private Integer edad;
    private String email;

    public Persona(final String nombre,
                   final Integer edad,
                   final String email)
    {
        super();
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public void setNombre(final String nombre)
    {
        this.nombre = nombre;
    }

    public Integer getEdad()
    {
        return this.edad;
    }

    public void setEdad(final Integer edad)
    {
        this.edad = edad;
    }

    public String getEmail()
    {
        return this.email;
    }

    public void setEmail(final String email)
    {
        this.email = email;
    }

    @Override
    public String toString()
    {
        return "nombre: " + this.nombre + ", edad: " + this.edad;
    }

    public static int comparaXEdad(final Persona a,
                                    final Persona b)
    {
        return a.getEdad().compareTo(b.getEdad());
    }

    public int compararXEdad2(final Persona per) {
        return this.getEdad().compareTo(per.getEdad());
    }
}
