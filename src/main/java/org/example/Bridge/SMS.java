package org.example.Bridge;

public class SMS implements CanalEnvio {

    @Override
    public void enviar() {
        System.out.println("Enviando por SMS...");
    }
}
