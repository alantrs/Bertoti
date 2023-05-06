public class App {

    public static void main(String[] args) {
        // Criar a estufa (Componente Composto)
        Area estufa = new Area("Estufa");

        // Adicionar áreas (Componente Composto)
        Area zona1 = new Area("Zona 1");
        Area zona2 = new Area("Zona 2");
        estufa.adicionar(zona1);
        estufa.adicionar(zona2);

        // Adicionar plantas (Componente Folha) à zona 1
        Planta planta1 = new Planta("Tomate", 25, 60);
        Planta planta2 = new Planta("Alface", 20, 70);
        zona1.adicionar(planta1);
        zona1.adicionar(planta2);

        // Adicionar plantas (Componente Folha) à zona 2
        Planta planta3 = new Planta("Cenoura", 18, 75);
        Planta planta4 = new Planta("Batata", 22, 65);
        Planta planta5 = new Planta("Morango", 23, 55);
        zona2.adicionar(planta3);
        zona2.adicionar(planta4);
        zona2.adicionar(planta5);
    }
}
