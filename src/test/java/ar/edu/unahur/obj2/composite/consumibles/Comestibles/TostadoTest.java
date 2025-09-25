package ar.edu.unahur.obj2.composite.consumibles.Comestibles;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TostadoTest {
    //CREACION
    Tostado tostado1 = new Tostado("Tostado de jamon y queso", 1000.0, 200.0, TipoTostado.JAMON_Y_QUESO);
    
    @Test
    void testSetTipo() {
        TipoTostado valor = TipoTostado.JAMON_Y_QUESO;
        assertEquals(valor, tostado1.getTipo());
    }
}