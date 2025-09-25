package ar.edu.unahur.obj2.composite.consumibles;

public class Tostado extends Comestible{
    private TipoTostado tipo;

    public Tostado(String nombre, Double precioBase, Double pesoGr, TipoTostado tipo) {
        super(nombre, precioBase, pesoGr);
        this.tipo = tipo;
    }

    public TipoTostado getTipo() {
        return tipo;
    }

    public void setTipo(TipoTostado tipo) {
        this.tipo = tipo;
    }

    @Override
    public Double doCosto() {
        return switch (tipo) {
            case TipoTostado.JAMON_Y_QUESO -> 2.0;
            case TipoTostado.SALAME_Y_QUESO -> 5.0;
        };
    }

}