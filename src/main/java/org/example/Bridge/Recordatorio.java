package org.example.Bridge;

public class Recordatorio extends Notificacion {

    public Recordatorio(CanalEnvio canal) {
        super(canal);
    }

    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando recordatorio...");
        canal.enviar();
    }
}
