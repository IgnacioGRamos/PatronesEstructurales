package org.example.Facade;

public class Pago {

    Double monto;

    public Pago() {
        this.monto = 0.0;
    }
    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public void procesarPago(Double monto) {
        setMonto(monto);
        System.out.println("Procesando pago de: $"+monto);
    }
}
