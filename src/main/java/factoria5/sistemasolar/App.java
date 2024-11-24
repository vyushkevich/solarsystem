package factoria5.sistemasolar;

import factoria5.sistemasolar.model.Planeta;
import factoria5.sistemasolar.view.PlanetaView;
import factoria5.sistemasolar.controller.PlanetaController;

public class App {
    public static void main(String[] args) {
        // Crear planetas
        Planeta tierra = new Planeta("Tierra", 1, 5.972E24, 1.08321E12, 12742, 150, 
                                     Planeta.TipoPlaneta.TERRESTRE, true, 1.0, 0.997);
        Planeta jupiter = new Planeta("Júpiter", 79, 1.898E27, 1.43128E15, 139820, 778, 
                                      Planeta.TipoPlaneta.GASEOSO, true, 11.86, 0.41);

        // Crear vistas
        PlanetaView view = new PlanetaView();

        // Controladores
        PlanetaController tierraController = new PlanetaController(tierra, view);
        PlanetaController jupiterController = new PlanetaController(jupiter, view);

        // Mostrar información
        System.out.println("=== Planeta Tierra ===");
        tierraController.mostrarInformacionPlaneta();

        System.out.println("\n=== Planeta Júpiter ===");
        jupiterController.mostrarInformacionPlaneta();
    }
}
