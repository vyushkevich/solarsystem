package factoria5.sistemasolar;

import factoria5.sistemasolar.model.Planeta;
import factoria5.sistemasolar.view.PlanetaView;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PlanetaViewTest {

    @Test
    void testMostrarPlaneta() {
        Planeta tierra = new Planeta("Tierra", 1, 5.972E24, 1.08321E12, 12742, 150, 
                                     Planeta.TipoPlaneta.TERRESTRE, true, 1.0, 0.997);
        PlanetaView view = new PlanetaView();

        
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

       
        view.mostrarPlaneta(tierra);

       
        String output = outContent.toString();
        assertTrue(output.contains("Nombre: Tierra"));
        assertTrue(output.contains("Cantidad de Satélites: 1"));
        assertTrue(output.contains("Masa (kg): 5.972E24"));
    }

    @Test
    void testMostrarDensidad() {
        Planeta tierra = new Planeta("Tierra", 1, 5.972E24, 1.08321E12, 12742, 150, 
                                     Planeta.TipoPlaneta.TERRESTRE, true, 1.0, 0.997);
        PlanetaView view = new PlanetaView();

        
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

      
        view.mostrarDensidad(tierra.calcularDensidad());

       
        String output = outContent.toString();
        assertTrue(output.contains("Densidad del Planeta:"));
    }

    @Test
    void testMostrarEsExterior() {
        Planeta tierra = new Planeta("Tierra", 1, 5.972E24, 1.08321E12, 12742, 150, 
                                     Planeta.TipoPlaneta.TERRESTRE, true, 1.0, 0.997);
        PlanetaView view = new PlanetaView();

        
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));


        view.mostrarEsExterior(tierra.esPlanetaExterior());

        
        String output = outContent.toString();
        assertTrue(output.contains("Es un planeta exterior: No"));
    }
}
