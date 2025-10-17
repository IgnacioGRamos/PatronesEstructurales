package org.example.Bridge;

public class MainBridge {

    public static void main(String[] args) {

        System.out.println("\nPrueba de Patron Bridge\n");

        Email email = new Email();
        SMS sms = new SMS();

        Alerta alertaEmail = new Alerta(email);
        alertaEmail.enviarNotificacion();

        Recordatorio recordatorioSMS = new Recordatorio(sms);
        recordatorioSMS.enviarNotificacion();

        System.out.println("\nFin de la prueba de Patron Bridge");

    }
}
