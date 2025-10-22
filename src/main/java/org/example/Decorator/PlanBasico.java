package org.example.Decorator;

public class PlanBasico implements Plan{

    @Override
    public String descripcion() {
        return "Plan Basico";
    }

    @Override
    public Double costo() {
        return 1000.0;
    }
}
