package Model;

public class Agricultor implements Observador {
    @Override
    public void atualizar(String mensagem) {
        System.out.println("Model.Agricultor notificado: " + mensagem);
    }
}