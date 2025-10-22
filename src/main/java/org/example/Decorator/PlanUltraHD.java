package org.example.Decorator;

public class PlanUltraHD extends PlanDecorador{

    public PlanUltraHD(Plan plan) {
        super(plan);
    }

    public String descripcion() {
        return plan.descripcion() + " + UltraHD";
    }

    public Double costo() {
        return plan.costo() + 1000.0;
    }

}
