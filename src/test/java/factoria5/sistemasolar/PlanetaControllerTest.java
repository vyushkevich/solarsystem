package factoria5.sistemasolar;

import factoria5.sistemasolar.model.Planeta;
import factoria5.sistemasolar.view.PlanetaView;
import factoria5.sistemasolar.controller.PlanetaController;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PlanetaControllerTest {

    @Test
    void testMostrarInformacionPlaneta() {
        Planeta tierra = new Planeta("Tierra", 1, 5.972E24, 1.08321E12, 12742, 150, 
                                     Planeta.TipoPlaneta.TERRESTRE, true, 1.0, 0.997);
        PlanetaView view = new PlanetaView();
        PlanetaController controller = new PlanetaController(tierra, view);

       
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

       
        controller.mostrarInformacionPlaneta();

       
        String output = outContent.toString();
        assertTrue(output.contains("Nombre: Tierra"));
        assertTrue(output.contains("Masa (kg): 5.972E24"));
        assertTrue(output.contains("Distancia Media al Sol (millones de km): 150"));
    }
}
