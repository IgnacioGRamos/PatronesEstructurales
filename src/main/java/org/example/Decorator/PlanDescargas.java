package org.example.Decorator;

public class PlanDescargas extends PlanDecorador{

    public PlanDescargas(Plan plan){
        super(plan);
    }

    public String descripcion() {
        return plan.descripcion() + " + Descargas Offline";
    }

    public Double costo() {
        return plan.costo() + 700.0;
    }
}
