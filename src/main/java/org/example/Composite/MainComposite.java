package org.example.Composite;

public class MainComposite {

    public static void main(String[] args) {


        System.out.println("\nPrueba de Patron Composite\n");

        // Crear platos individuales
        Plato plato1 = new Plato("Ensalada César");
        Plato plato2 = new Plato("Sopa de Tomate");
        Plato plato3 = new Plato("Pasta Alfredo");
        Plato plato4 = new Plato("Pizza Margarita");

        // // Crear un menú principal
        Menu menuPrincipal = new Menu("Menú Principal");
        menuPrincipal.addElemento(plato1);
        menuPrincipal.addElemento(plato2);

        // // Crear un submenú para entrantes
        Menu menuEntrantes = new Menu("Entrantes");
        menuEntrantes.addElemento(plato3);
        menuEntrantes.addElemento(plato4);

        menuPrincipal.addElemento(menuEntrantes);

        // Mostrar el menú completo
        menuPrincipal.show("");

        System.out.println("\nFin de la prueba de Patron Composite");
    }
}