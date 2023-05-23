package Controller;

import View.EstrategiaIrrigacao;

// Strategy Pattern
public class EstufaController {
        private EstrategiaIrrigacao estrategia;

        public EstufaController(EstrategiaIrrigacao estrategia) {
            this.estrategia = estrategia;
        }

        public void controlarIrrigacao() {
            estrategia.regarPlantas();
        }

}
