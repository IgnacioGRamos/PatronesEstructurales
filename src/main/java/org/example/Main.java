package org.example;


import org.example.Adapter.adapterImpresora;
import org.example.Bridge.Alerta;
import org.example.Bridge.Email;
import org.example.Bridge.Recordatorio;
import org.example.Bridge.SMS;

public class Main {
    public static void main(String[] args) {


        System.out.println("Prueba de Patron Adapter\n");

        adapterImpresora adapter = new adapterImpresora();
        adapter.imprimir("texto", "documento.txt");
        adapter.imprimir("pdf", "documento.pdf");
        adapter.imprimir("docx", "documento.docx"); // Tipo no soportado

        System.out.println("\nFin de la prueba de Patron Adapter\n");

        System.out.println("\n// --------------------------------------------------\n");

        System.out.println("\nPrueba de Patron Bridge\n");

        Email email = new Email();
        SMS sms = new SMS();

        Alerta alertaEmail = new Alerta(email);
        alertaEmail.enviarNotificacion();

        Recordatorio recordatorioSMS = new Recordatorio(sms);
        recordatorioSMS.enviarNotificacion();

        System.out.println("\nFin de la prueba de Patron Bridge");

        System.out.println("\n// --------------------------------------------------\n");

    }
}