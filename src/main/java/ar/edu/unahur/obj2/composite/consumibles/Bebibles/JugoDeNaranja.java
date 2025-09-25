package ar.edu.unahur.obj2.composite.consumibles.Bebibles;

public class JugoDeNaranja extends Bebible{
    public JugoDeNaranja(String nombre, Double precioBase, Integer capacidad) {
        super(nombre, precioBase, capacidad);
    }

    @Override
    public Double doCosto() {
        return 6.0;
    }
}