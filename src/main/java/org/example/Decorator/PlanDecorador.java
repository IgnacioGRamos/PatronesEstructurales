package org.example.Decorator;

abstract public class PlanDecorador implements Plan {

    Plan plan;

    public PlanDecorador(Plan plan) {
        this.plan = plan;
    }

    @Override
    public String descripcion() {
        return this.plan.descripcion();
    }

    public Double costo() {
        return this.plan.costo();
    }
}
