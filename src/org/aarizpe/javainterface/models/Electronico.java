package org.aarizpe.javainterface.models;

public abstract class Electronico extends Producto  implements IElectronico{
    private String Fabricante;

    public Electronico() {
    }

    public Electronico(int precio, String fabricante) {
        super(precio);
        Fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return Fabricante;
    }

    @Override
    public String toString() {
        return "\nFabricante: "+getFabricante()+
                super.toString();
    }
}
