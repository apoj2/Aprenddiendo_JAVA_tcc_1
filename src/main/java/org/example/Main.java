package org.example;

import clases.Cliente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //crear un objeto de la clase proucto
        Producto  producto = new Producto();

        //crear un objeto de la clase scanner

        Scanner LeaEntradaTeclado = new Scanner(System.in);

        //preguntarle al usuraio el nombre del rpoducto
        System.out.println("El producto se llama: " + producto.nombre);

        System.out.println("Ingresa El Nombre Del Producto");
        producto.nombre = LeaEntradaTeclado.next();

        System.out.println("El producto se llama: " + producto.nombre);


        //queiro crear un objeto de la clase cliente
        Cliente cliente = new Cliente();

        System.out.println("Ingresa tu nombre: ");
        cliente.nombreCliente = LeaEntradaTeclado.next();

        System.out.println("Ingresa tu cedula");
        cliente.cedulaCliente = LeaEntradaTeclado.next();

        System.out.println("Ingres la edad: ");
        cliente.edadCliente= LeaEntradaTeclado.nextByte();

        System.out.println("Ingrese el Celular: ");
        cliente.celularCliente = LeaEntradaTeclado.next();

        System.out.println("Ingrese si aplica o no descuento");
        cliente.aplicaDescuento = LeaEntradaTeclado.nextBoolean();


    }
}