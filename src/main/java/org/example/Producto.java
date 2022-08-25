package org.example;

public class Producto {

    // ATRIBUTOS

    String nombre;
    int precioUnitario;
    String descripcion;

    // CONSTRUCTOR

    public Producto() {

    }

    public Producto(String nombre, int precioUnitario, String descripcion) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.descripcion = descripcion;
    }

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    // METODOS

    public double calcularIVA(){
        return 0.0;
    }

}
