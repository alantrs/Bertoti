import java.util.ArrayList;
import java.util.List;

public class Area {

    private String nome;
    private List<Componente> filhos = new ArrayList<Componente>();

    public Area(String nome) {
        this.nome = nome;
    }
    public void adicionar(Componente c) {
        filhos.add(c);
    }
    public void remover(Componente c) {
        filhos.remove(c);
    }
    public void exibirInfo() {
        System.out.println("Área: " + nome);
        for (Componente c : filhos) {
            c.exibirInfo();
        }
    }
}
