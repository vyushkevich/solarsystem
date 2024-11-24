package factoria5.sistemasolar;

import factoria5.sistemasolar.model.Planeta;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlanetaTest {

    @Test
    void testCalcularDensidad() {
        Planeta tierra = new Planeta("Tierra", 1, 5.972E24, 1.08321E12, 12742, 150, 
                                     Planeta.TipoPlaneta.TERRESTRE, true, 1.0, 0.997);
        assertEquals(5.51E12, tierra.calcularDensidad(), 0.01E12);
    }

    @Test
    void testEsPlanetaExterior() {
        Planeta jupiter = new Planeta("Júpiter", 79, 1.898E27, 1.43128E15, 139820, 778, 
                                      Planeta.TipoPlaneta.GASEOSO, true, 11.86, 0.41);
        assertTrue(jupiter.esPlanetaExterior());
    }
}

