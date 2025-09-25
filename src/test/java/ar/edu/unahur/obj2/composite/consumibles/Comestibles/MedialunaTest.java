package ar.edu.unahur.obj2.composite.consumibles.Comestibles;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.composite.consumibles.Comestible.Medialuna;
import ar.edu.unahur.obj2.composite.consumibles.Comestible.TipoMedialuna;

public class MedialunaTest {
    //CREACION
    Medialuna medialuna1 = new Medialuna("Medialuna de manteca", 1000.0, 200.0, TipoMedialuna.DE_MANTECA);
    
    
    @Test
    void testGetTipo() {
        
        TipoMedialuna valor = TipoMedialuna.DE_MANTECA;
        assertEquals(valor, medialuna1.getTipo());
    }
}
