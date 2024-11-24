package factoria5.sistemasolar.controller;

import factoria5.sistemasolar.model.Planeta;
import factoria5.sistemasolar.view.PlanetaView;

public class PlanetaController {

    private Planeta planeta;
    private PlanetaView view;

    public PlanetaController(Planeta planeta, PlanetaView view) {
        this.planeta = planeta;
        this.view = view;
    }

    public void mostrarInformacionPlaneta() {
        view.mostrarPlaneta(planeta);
        view.mostrarDensidad(planeta.calcularDensidad());
        view.mostrarEsExterior(planeta.esPlanetaExterior());
    }
}
