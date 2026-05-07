package org.aarizpe.javainterface;

import org.aarizpe.javainterface.models.*;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProyectoCatalogo {

    public static void main(String[] args) {

        IProducto  [] productos = new IProducto[6];
        productos[0] = new Iphone(22000,"Apple", "Negro", "Iphone 16");
        productos[1]= new TvLcd(50000,"Samsung", 55);
        productos[2]= new Libro(500, "Programacion orientada a objetos con java", "Luli Luli", LocalDate.of(2023,6,5), "Editorial Porrua");
        productos[3]= new Comics(380, "Sailoor Moon galaxia suprema", "Naoko takeuchi",  LocalDate.of(2020,5,12), "Comics bonitos", "Sailon Moon");
        productos[4] = new Iphone(48000,"Apple", "Blanco", "Iphone 22");
        productos[5]= new TvLcd(70000,"Samsung", 70);

        for(IProducto i: productos){
            System.out.println(i);
            System.out.println("...............");
            System.out.println();
        }
    }
}