package org.example.Decorator;

public class MainDecorador {

    public static void main(String[] args) {
        Plan planBasico = new PlanBasico();
        Plan planHD = new PlanHD(planBasico);
        Plan planUltraHD = new PlanUltraHD(planHD);
        Plan planDescargas = new PlanDescargas(planUltraHD);



        System.out.println("\nPrueba 1");
        System.out.println(planDescargas.descripcion()); // "Plan Basico + HD + UltraHD + Descargas Offline"
        System.out.println(planDescargas.costo()); // 2200.0

        System.out.println("\nPrueba 2");
        System.out.println(planHD.descripcion());
        System.out.println(planHD.costo());




    }
}
