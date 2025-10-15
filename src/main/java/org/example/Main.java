package org.example;


import org.example.Adapter.adapterImpresora;

public class Main {
    public static void main(String[] args) {


        System.out.println("Prueba de Patron Adapter\n");

        adapterImpresora adapter = new adapterImpresora();
        adapter.imprimir("texto", "documento.txt");
        adapter.imprimir("pdf", "documento.pdf");
        adapter.imprimir("docx", "documento.docx"); // Tipo no soportado

        System.out.println("\nFin de la prueba de Patron Adapter");

    }
}