package org.example.Bridge;

public abstract class Notificacion {
    protected CanalEnvio canal;

    public Notificacion(CanalEnvio canal) {
        this.canal = canal;
    }

    abstract void enviarNotificacion();
}
