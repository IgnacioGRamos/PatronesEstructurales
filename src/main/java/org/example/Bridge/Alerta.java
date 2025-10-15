package org.example.Bridge;

public class Alerta extends Notificacion {

    public Alerta(CanalEnvio canal) {
        super(canal);
    }

    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando alerta...");
        canal.enviar();
    }
}
