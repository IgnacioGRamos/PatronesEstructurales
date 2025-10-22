package org.example.Decorator;

public class PlanHD extends PlanDecorador{

    public PlanHD(Plan plan){
        super(plan);
    }

    public String descripcion() {
        return plan.descripcion() + " + HD";
    }

    public Double costo() {
        return plan.costo() + 500.0;
    }
}
