package org.example.Facade;

public class MainFacade {

    public static void main(String[] args) {
        Carrito carrito = new Carrito();
        Pago pago = new Pago();
        Envio envio = new Envio("Calle Falsa 123");

        Producto producto1 = new Producto("Laptop", 1000.0);
        Producto producto2 = new Producto("Smartphone", 500.0);
        Producto producto3 = new Producto("Tablet", 700.0);

        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        carrito.agregarProducto(producto3);

        TiendaFacade tiendaFacade = new TiendaFacade(carrito, pago, envio);
        tiendaFacade.Comprar();
    }
}
