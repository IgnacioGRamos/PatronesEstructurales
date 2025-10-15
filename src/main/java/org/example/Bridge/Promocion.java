package org.example.Bridge;

public class Promocion extends Notificacion {

    public Promocion(CanalEnvio canal) {
        super(canal);
    }

    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando promocion...");
        canal.enviar();
    }
}
