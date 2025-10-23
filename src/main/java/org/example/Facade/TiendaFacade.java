package org.example.Facade;

public class TiendaFacade {
    private Carrito carrito;
    private Pago pago;
    private Envio envio;

    public TiendaFacade( Carrito carrito, Pago pago, Envio envio) {
        this.carrito = carrito;
        this.pago = pago;
        this.envio = envio;
    }

    public void Comprar() {
        carrito.agregarProducto();
        pago.procesarPago();
        envio.procesarEnvio();
    }
}
