package observer;

public class App {
	
	public static void main(String[] args) {
		
		Observado sensor = new Observado();
        Observer controleDeUmidade = new ControleDeUmidade();
        Observer sistemaDeResfriamento = new SistemaDeResfriamento();
        
        sensor.registrarObserver(controleDeUmidade);
        sensor.registrarObserver(sistemaDeResfriamento);
        
        // Simula a leitura da temperatura da estufa
        int temperatura = 25;
        sensor.setTemperatura(temperatura);
        
        // Altera a temperatura da estufa e notifica os observadores
        temperatura = 30;
        sensor.setTemperatura(temperatura);
        
        temperatura = 20;
        sensor.setTemperatura(temperatura);
        
        // Remove um dos observadores
        sensor.removerObserver(sistemaDeResfriamento);
        
        temperatura = 28;
        sensor.setTemperatura(temperatura);
    }
	
}
