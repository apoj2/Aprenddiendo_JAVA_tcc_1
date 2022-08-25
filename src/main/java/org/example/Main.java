package org.example;

import clases.Cliente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //creo un objeto de la clas eproducto

        Producto producto= new Producto();
        System.out.println("El nombre del producto es: " + producto.nombre);

        Producto producto2 =  new Producto("empanada");
        System.out.println("El producto numero 2 es: " + producto2.nombre);

        Cliente cliente =  new Cliente("angel","1020103090", 18,"1002010001",true);
        System.out.println("El cliente numero 1 es: " +cliente.nombreCliente);


    }
}