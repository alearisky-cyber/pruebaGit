package org.aarizpe.javainterface.models;

public class Iphone  extends Electronico{

    private String color;
    private String modelo;


    public Iphone(int precio,String fabricante, String color, String modelo) {
        super(precio, fabricante);
        this.color = color;
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    @Override
    public double getPrecioVenta(){
    return (double) this.getPrecio();
    }

    @Override
    public String toString() {
        return "Iphone: " +
                "\nModelo: " + modelo +
                "\nColor: " + color +
                super.toString();
    }
}
