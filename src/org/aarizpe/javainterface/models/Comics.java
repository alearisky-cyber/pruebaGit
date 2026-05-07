package org.aarizpe.javainterface.models;

import java.time.LocalDate;

public class Comics extends Libro{
    private String personaje;

    public Comics(int precio, String titulo, String autor, LocalDate fechaPublicacion, String editorial, String personaje){
        super(precio, titulo, autor, fechaPublicacion, editorial);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }

    @Override
    public double getPrecioVenta() {
        return super.getPrecioVenta();
    }

    @Override
    public String toString() {
        return "Comics:" +
                "\nPersonaje: " + personaje+
                super.toString();
    }
}
