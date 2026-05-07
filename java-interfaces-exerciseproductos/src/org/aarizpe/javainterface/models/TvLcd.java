package org.aarizpe.javainterface.models;

public class TvLcd extends Electronico {
    private int pulgada;

    public TvLcd(int precio, String fabricante, int pulgada) {
        super(precio, fabricante);
        this.pulgada = pulgada;
    }

    public int getPulgada() {
        return pulgada;
    }

    @Override
    public double getPrecioVenta() {
        return (double)this.getPrecio();
    }


    @Override
    public String toString() {
        return "TvLcd:" +
                "\nPulgada: " + pulgada+
                super.toString();
    }
}
