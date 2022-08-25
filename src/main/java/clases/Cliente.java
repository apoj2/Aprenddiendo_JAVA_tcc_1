package clases;

public class Cliente {
    //atributos

    public String nombreCliente;
    public String cedulaCliente;
    public int edadCliente;
    public String celularCliente;
    public boolean aplicaDescuento;

    //contrctros

    public Cliente() {

    }

    public Cliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Cliente(String nombreCliente, String cedulaCliente, int edadCliente, String celularCliente, boolean aplicaDescuento) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.edadCliente = edadCliente;
        this.celularCliente = celularCliente;
        this.aplicaDescuento = aplicaDescuento;
    }

//metodo

    public String saludar(){

        return "Oe";
    }
}
