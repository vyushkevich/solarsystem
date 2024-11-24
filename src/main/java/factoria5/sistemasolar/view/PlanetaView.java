package factoria5.sistemasolar.view;

import factoria5.sistemasolar.model.Planeta;

public class PlanetaView {

    public void mostrarPlaneta(Planeta planeta) {
        System.out.println("=== Información del Planeta ===");
        System.out.println("Nombre: " + planeta.getNombre());
        System.out.println("Cantidad de Satélites: " + planeta.getCantidadSatelites());
        System.out.println("Masa (kg): " + planeta.getMasa());
        System.out.println("Volumen (km³): " + planeta.getVolumen());
        System.out.println("Diámetro (km): " + planeta.getDiametro());
        System.out.println("Distancia Media al Sol (millones de km): " + planeta.getDistanciaMediaAlSol());
        System.out.println("Tipo de Planeta: " + planeta.getTipo());
        System.out.println("Observable a simple vista: " + planeta.isObservableASimpleVista());
        System.out.println("Periodo Orbital (años): " + planeta.getPeriodoOrbital());
        System.out.println("Periodo de Rotación (días): " + planeta.getPeriodoRotacion());
    }

    public void mostrarDensidad(double densidad) {
        System.out.println("Densidad del Planeta: " + densidad);
    }

    public void mostrarEsExterior(boolean esExterior) {
        System.out.println("Es un planeta exterior: " + (esExterior ? "Sí" : "No"));
    }
}
