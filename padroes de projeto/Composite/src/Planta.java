public class Planta implements Componente {
    private String nome;
    private float temperatura;
    private float umidade;

    public Planta(String nome, float temperatura, float umidade) {
        this.nome = nome;
        this.temperatura = temperatura;
        this.umidade = umidade;
    }

    public void exibirInfo() {
        System.out.println("Planta: " + nome + ", temperatura: " + temperatura + ", umidade: " + umidade);
    }
}
