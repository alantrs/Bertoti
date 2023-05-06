package observer;

public class SistemaDeResfriamento implements Observer {
	
	 public void update(int temperatura) {
	        if (temperatura > 28) {
	            System.out.println("Ligando o sistema de resfriamento...");
	        } else {
	            System.out.println("Desligando o sistema de resfriamento...");
	        }
	 }
}
