package org.example.Bridge;

public class Email implements CanalEnvio {

    @Override
    public void enviar() {
        System.out.println("Enviando por email...");
    }



}
