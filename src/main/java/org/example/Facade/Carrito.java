package org.example.Facade;


import java.util.ArrayList;
import java.util.List;

public class Carrito {

    List<Producto> productos;

    public Carrito() {
        this.productos = new ArrayList<>();
    }

    public void mostrarProductos() {
        System.out.println("Mostrando productos en el carrito.");
        for ( Producto producto : productos) {
            System.out.println("- " + producto.getNombre());
        }
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println( producto.getNombre() +" agregado al carrito.");
    }

    public Double calcularTotal() {
        Double total = 0.0;
        for ( Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

}
