package org.example.Facade;

public class Envio {

    String direccion;

    public Envio(String direccion) {
        this.direccion = direccion;
    }

    public void procesarEnvio() {
        System.out.println("Procesando envio a: "+direccion);
    }
}
