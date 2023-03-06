package observer;

public class ControleDeUmidade implements Observer {
	
	public void update(int temperatura) {
        if (temperatura > 30) {
            System.out.println("Aumentando a umidade...");
        } else if (temperatura < 20) {
            System.out.println("Diminuindo a umidade...");
        } else {
            System.out.println("Temperatura dentro da faixa de normalidade.");
        }
    }

}
