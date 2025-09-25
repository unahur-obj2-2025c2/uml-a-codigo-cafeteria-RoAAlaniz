package ar.edu.unahur.obj2.composite.consumibles.Comestibles;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import ar.edu.unahur.obj2.composite.consumibles.Comestible.Comestible;
import ar.edu.unahur.obj2.composite.consumibles.Comestible.Medialuna;
import ar.edu.unahur.obj2.composite.consumibles.Comestible.TipoMedialuna;
import ar.edu.unahur.obj2.composite.consumibles.Comestible.TipoTostado;
import ar.edu.unahur.obj2.composite.consumibles.Comestible.Tostado;


public class ComestibleTest {
    
    @Test
    void testPesoGramos() {
        Comestible tostadoJYQ = new Tostado("Tostado de jamon y queso", 100.0, 250.0, TipoTostado.JAMON_Y_QUESO);
        assertEquals(250.0, tostadoJYQ.getPesoGr());
    }

    @Test
    void testCostoTostadoJamonYQueso() {
        Double precioBase = 1500.0;
        Double valorTipo = 2.0;
        Comestible tostadoJYQ = new Tostado("Tostado de jamon y queso", precioBase, 250.0, TipoTostado.JAMON_Y_QUESO);
        Double valor = 250.0 * valorTipo; 
        assertEquals(valor, tostadoJYQ.costo());
    }

    @Test
    void testCostoTostadoSalameYQueso() {
        Double precioBase = 1500.0;
        Double valorTipo = 5.0;
        Comestible tostadoSYQ = new Tostado("Tostado de salame y queso", precioBase, 300.0, TipoTostado.SALAME_Y_QUESO);
        Double valor = 300.0 * valorTipo;
        assertEquals(valor, tostadoSYQ.costo());
    }

    @Test
    void testCostoMedialunaDeManteca(){
        Double precioBase = 1000.0;
        Double valorTipo = 2.5;
        Comestible medialuna1 = new Medialuna("Medialuna de manteca", precioBase, 200.0, TipoMedialuna.DE_MANTECA);
        Double valor = 200.0 * valorTipo; 
        assertEquals(valor, medialuna1.costo());
    }
}
