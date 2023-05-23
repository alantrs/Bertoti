package View;

import java.util.ArrayList;
import java.util.List;

public class GrupoPlantas extends ComponentePlanta {
    private List<ComponentePlanta> componentesPlanta = new ArrayList<>();
    private String nome;

    public GrupoPlantas(String nome) {
        this.nome = nome;
    }

    @Override
    public void adicionar(ComponentePlanta componentePlanta) {
        componentesPlanta.add(componentePlanta);
    }

    @Override
    public void remover(ComponentePlanta componentePlanta) {
        componentesPlanta.remove(componentePlanta);
    }

    @Override
    public void mostrarPlanta() {
        System.out.println("Mostrando grupo de plantas: " + nome);
        for (ComponentePlanta componente : componentesPlanta) {
            componente.mostrarPlanta();
        }
    }
}