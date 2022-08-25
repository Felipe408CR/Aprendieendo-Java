package Clases;

public class Cliente {

    // ATRIBUTOS

    public  String nombre;
    public String cedula;
    public int edad;
    public String celular;
    public boolean aplicaDescuento;

    // CONTRUCTOR

    public Cliente() {
    }

    public Cliente(String nombre, String cedula, int edad, String celular, boolean aplicaDescuento) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.celular = celular;
        this.aplicaDescuento = aplicaDescuento;
    }

    // METODO

    public String saludar(){
        return "oe";
    }

}
