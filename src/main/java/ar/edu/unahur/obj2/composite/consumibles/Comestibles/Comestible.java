package ar.edu.unahur.obj2.composite.consumibles.Comestibles;

import ar.edu.unahur.obj2.composite.consumibles.Producto;

public abstract class Comestible extends Producto{
    protected Double pesoGr;

    public Comestible(String nombre, Double precioBase, Double pesoGr) {
        super(nombre, precioBase);
        this.pesoGr = pesoGr;
    }

    public Double getPesoGr() {
        return pesoGr;
    }

    public void setPesoGr(Double pesoGr) {
        this.pesoGr = pesoGr;
    }

    @Override
    public Double costo() {
        return pesoGr * doCosto();
    }

    public abstract Double doCosto();
}
