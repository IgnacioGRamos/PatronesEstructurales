package org.example.Facade;

public class MainFacade {

    public static void main(String[] args) {
        Carrito carrito = new Carrito();
        Pago pago = new Pago();
        Envio envio = new Envio();

        TiendaFacade tiendaFacade = new TiendaFacade(carrito, pago, envio);
        tiendaFacade.Comprar();
    }
}
