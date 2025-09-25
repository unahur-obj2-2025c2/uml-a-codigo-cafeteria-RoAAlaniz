package ar.edu.unahur.obj2.composite.consumibles.Bebible;

import ar.edu.unahur.obj2.composite.consumibles.Producto;

public abstract class Bebible extends Producto{
    protected final Integer capacidad;

    public Bebible(String nombre, Double precioBase, Integer capacidad) {
        super(nombre, precioBase);
        this.capacidad = capacidad;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    @Override
    public Double costo() {
        return Double.min(super.costo(), capacidad * doCosto());
    }

    public abstract Double doCosto();
}