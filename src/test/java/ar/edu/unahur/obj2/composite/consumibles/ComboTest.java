package ar.edu.unahur.obj2.composite.consumibles;
import org.junit.jupiter.api.Test;
import ar.edu.unahur.obj2.composite.consumibles.Comestibles.Tostado;
import ar.edu.unahur.obj2.composite.consumibles.Comestibles.TipoTostado;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ComboTest {
    @Test
    void testAgregarProducto() {
        Combo combo = new Combo("Combo 1", 5000.0);
        Tostado tostado = new Tostado("Tostado de jamon y queso", 1000.0, 200.0, TipoTostado.JAMON_Y_QUESO);
        combo.agregarProducto(tostado);
        assert(combo.getProductos().contains(tostado));
    }

    @Test
    void testCosto() {
        Combo combo = new Combo("Combo 1", 5000.0);
        Tostado tostado = new Tostado("Tostado de jamon y queso", 1000.0, 200.0, TipoTostado.JAMON_Y_QUESO);
        combo.agregarProducto(tostado);
        Double valorTipo = 2.0;
        Double valor = 1000.0 + 200.0 * valorTipo; 
        assertEquals(5000.0 + valor, combo.costo());

    }
}