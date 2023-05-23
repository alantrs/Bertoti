package Model;

// Singleton Pattern
public class Estufa {
    private static Estufa instancia;
    private Fachada fachada;

    private Estufa() {
        this.fachada = new Fachada();
    }

    public static Estufa getInstancia() {
        if (instancia == null) {
            instancia = new Estufa();
        }
        return instancia;
    }

    public Fachada getFachada() {
        return this.fachada;
    }
}