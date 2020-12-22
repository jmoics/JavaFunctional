package com.lycsoftware.functional.function;

public class Comensal
{
    private String nombre;
    private double montoPedido;
    private int mesa;

    public Comensal(final String nombre,
                    final double montoPedido,
                    final int mesa)
    {
        super();
        this.nombre = nombre;
        this.montoPedido = montoPedido;
        this.mesa = mesa;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public void setNombre(final String nombre)
    {
        this.nombre = nombre;
    }

    public double getMontoPedido()
    {
        return this.montoPedido;
    }

    public void setMontoPedido(final double montoPedido)
    {
        this.montoPedido = montoPedido;
    }

    public int getMesa()
    {
        return this.mesa;
    }

    public void setMesa(final int mesa)
    {
        this.mesa = mesa;
    }

}
