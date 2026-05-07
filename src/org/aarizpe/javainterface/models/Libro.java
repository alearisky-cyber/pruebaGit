package org.aarizpe.javainterface.models;

import java.time.LocalDate;
import java.util.Date;

public class Libro extends Producto implements ILibro{

    private LocalDate fechaPublicacion;
    private String autor;
    private String titulo;
    private String editorial;

    public Libro(int precio, String titulo, String autor,LocalDate fechaPublicacion, String editorial) {
        super(precio);
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion= fechaPublicacion;
        this.editorial=editorial;
    }

    @Override
    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getEditorial() {
        return editorial;
    }

    @Override
    public double getPrecioVenta() {
        return (double)this.getPrecio();
    }


    @Override
    public String toString() {
        return "Libro:" +
                "\nTítulo: " + titulo +
                "\nAutor: " + autor +
                "\nEditorial: " + editorial +
                "\nfecha de publicación: " + fechaPublicacion+
                super.toString();
    }
}
