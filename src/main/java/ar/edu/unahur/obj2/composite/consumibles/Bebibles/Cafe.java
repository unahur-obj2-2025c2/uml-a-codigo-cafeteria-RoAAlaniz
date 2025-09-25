package ar.edu.unahur.obj2.composite.consumibles.Bebibles;

public class Cafe extends Bebible{
    private Boolean conLeche;

    public Cafe(String nombre, Double precioBase, Integer capacidad, Boolean conLeche) {
        super(nombre, precioBase, capacidad);
        this.conLeche = conLeche;
    }

    public Boolean getConLeche() {
        return conLeche;
    }

    public void setConLeche(Boolean conLeche) {
        this.conLeche = conLeche;
    }

    @Override
    public Double doCosto() {
        return super.costo() + (conLeche ? 5.0 : 0.0);
    }
}