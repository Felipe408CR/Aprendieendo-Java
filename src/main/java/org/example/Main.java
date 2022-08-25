package org.example;

import Clases.Cliente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // crear un objeto de la clase producto

        Producto producto=new Producto();

        // crear un objeto de la clase Scanner

        Scanner entradaPorTeclado=new Scanner(System.in);

        // PREGUNTARLE AL USUARIO EL NOMBRE DEL PRODUCTO

        System.out.println("Digite el nombre del producto");
        producto.nombre=entradaPorTeclado.next();
        System.out.println("El producto es: "+producto.nombre);

        // Crear un objeto de la clase cliente

        Cliente cliente= new Cliente();

        // PEDIR DATOS

        System.out.println("Digite el nombre: ");
        cliente.nombre=entradaPorTeclado.next();

        System.out.println("Digite la cedula: ");
        cliente.cedula=entradaPorTeclado.next();

        System.out.println("Digite la edad: ");
        cliente.edad=entradaPorTeclado.nextByte();

        System.out.println("Digite el celular: ");
        cliente.celular=entradaPorTeclado.next();

        System.out.println("Digite si aplica descuento: ");
        cliente.aplicaDescuento=entradaPorTeclado.nextBoolean();


    }
}