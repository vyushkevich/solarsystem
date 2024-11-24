package factoria5.sistemasolar.model;

public class Planeta {

    // Enumeración para el tipo de planeta
    public enum TipoPlaneta {
        GASEOSO, TERRESTRE, ENANO
    }

    // Atributos
    private String nombre;
    private int cantidadSatelites;
    private double masa;
    private double volumen;
    private int diametro;
    private int distanciaMediaAlSol; // en millones de Km
    private TipoPlaneta tipo;
    private boolean observableASimpleVista;
    private double periodoOrbital; // en años
    private double periodoRotacion; // en días

    // Constructor
    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro,
                   int distanciaMediaAlSol, TipoPlaneta tipo, boolean observableASimpleVista,
                   double periodoOrbital, double periodoRotacion) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaMediaAlSol = distanciaMediaAlSol;
        this.tipo = tipo;
        this.observableASimpleVista = observableASimpleVista;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacion = periodoRotacion;
    }

    // Métodos para obtener atributos
    public String getNombre() { return nombre; }
    public int getCantidadSatelites() { return cantidadSatelites; }
    public double getMasa() { return masa; }
    public double getVolumen() { return volumen; }
    public int getDiametro() { return diametro; }
    public int getDistanciaMediaAlSol() { return distanciaMediaAlSol; }
    public TipoPlaneta getTipo() { return tipo; }
    public boolean isObservableASimpleVista() { return observableASimpleVista; }
    public double getPeriodoOrbital() { return periodoOrbital; }
    public double getPeriodoRotacion() { return periodoRotacion; }

    // Método para calcular la densidad
    public double calcularDensidad() {
        return volumen == 0 ? 0 : masa / volumen;
    }

    // Método para determinar si es un planeta exterior
    public boolean esPlanetaExterior() {
        double distanciaEnUA = distanciaMediaAlSol * 1000000.0 / 149597870.0;
        return distanciaEnUA > 3.4;
    }
}
