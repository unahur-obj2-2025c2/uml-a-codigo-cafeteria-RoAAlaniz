package ar.edu.unahur.obj2.composite.consumibles;

public class Medialuna extends Comestible{
    private TipoMedialuna tipo;

    public Medialuna(String nombre, Double precioBase, Double pesoGr, TipoMedialuna tipo) {
        super(nombre, precioBase, pesoGr);
        this.tipo = tipo;
    }

    public TipoMedialuna getTipo() {
        return tipo;
    }

    public void setTipo(TipoMedialuna tipo) {
        this.tipo = tipo;
    }

    @Override 
    public Double doCosto(){
        return switch(tipo){
            case TipoMedialuna.DE_MANTECA -> 2.5;
            case TipoMedialuna.DE_GRASA -> 1.25;
            case TipoMedialuna.CON_DULCE_DE_LECHE -> 3.25;
            default -> 0.0;
        };
    }
}