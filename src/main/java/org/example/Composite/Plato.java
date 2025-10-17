package org.example.Composite;

public class Plato implements ElementoMenu{

    private String nombre;

    public Plato(String nombre) {
        this.nombre = nombre;
    }


    public void show(String indent) {
        System.out.println( indent +" Plato: " + nombre);
    }
}
