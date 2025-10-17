package org.example.Composite;

import java.util.ArrayList;
import java.util.List;

public class Menu implements ElementoMenu{

    private String nombre;
    private List<ElementoMenu> platos;

    public Menu(String nombre) {
        this.nombre = nombre;
        this.platos = new ArrayList<>();
    }

    public void addElemento(ElementoMenu elemento) {
        platos.add(elemento);
    }

    public void removeElemento(ElementoMenu elemento) {
        platos.remove(elemento);
    }

    public void show(String indent) {
        System.out.println( indent + " Menu: " + nombre);
        for (ElementoMenu elemento : platos) {
            elemento.show(indent + "   ");
        }
    }
}
