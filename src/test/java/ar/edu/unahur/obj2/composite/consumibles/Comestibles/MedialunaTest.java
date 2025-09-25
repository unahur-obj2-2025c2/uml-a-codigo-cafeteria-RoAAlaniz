package ar.edu.unahur.obj2.composite.consumibles.Comestibles;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MedialunaTest {
    //CREACION
    Medialuna medialuna1 = new Medialuna("Medialuna de manteca", 1000.0, 200.0, TipoMedialuna.DE_MANTECA);
    
    
    @Test
    void testGetTipo() {
        
        TipoMedialuna valor = TipoMedialuna.DE_MANTECA;
        assertEquals(valor, medialuna1.getTipo());
    }
}
