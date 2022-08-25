package org.example;

public class Producto {

    //Atributos
    String nombre;
    short precioUnitario;
    String descripcion;


    //contructor


    public Producto() {

    }

    public Producto(String nombre, short precioUnitario, String descripcion) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.descripcion = descripcion;
    }

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    //metodods
    public double calcularIVA(){

        return 0.0;
    }

}
