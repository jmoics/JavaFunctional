package com.lycsoftware.methodreference;

public class ProveedorComparaciones
{
    public int compararXNombre(final Persona per1,
                               final Persona per2)
    {
        return per1.getNombre().compareTo(per2.getNombre());
    }

    public int compararXEdad(final Persona per1,
                             final Persona per2)
    {
        return per1.getEdad().compareTo(per2.getEdad());
    }
}
