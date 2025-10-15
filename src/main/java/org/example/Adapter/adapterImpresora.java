package org.example.Adapter;

public class adapterImpresora implements impresora {

    private impresoraTexto impresoraTexto;
    private impresoraPDF impresoraPDF;

    public adapterImpresora() {
        this.impresoraTexto = new impresoraTexto();
        this.impresoraPDF = new impresoraPDF();
    }

    @Override
    public void imprimir(String tipo, String fileName) {
        if (tipo.equalsIgnoreCase("texto")) {
            impresoraTexto.imprimirTexto(fileName);
        } else if (tipo.equalsIgnoreCase("pdf")) {
            impresoraPDF.imprimirPDF(fileName);
        } else {
            System.out.println("Tipo de archivo no soportado: " + tipo);
        }
    }
}
