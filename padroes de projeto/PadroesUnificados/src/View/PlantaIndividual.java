package View;

public class PlantaIndividual extends ComponentePlanta {
    private String nome;

    public PlantaIndividual(String nome) {
        this.nome = nome;
    }

    @Override
    public void mostrarPlanta() {
        System.out.println("Mostrando planta: " + nome);
    }
}