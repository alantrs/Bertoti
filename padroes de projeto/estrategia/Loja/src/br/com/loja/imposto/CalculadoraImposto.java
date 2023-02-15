package br.com.loja.imposto;

import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraImposto {
	
	/* a principio existia as CLASSES CalculadoraImposto, Orcamento
	 * um ENUM imposto onde existiam o ICMS e o ISS
	
	 * para evitar que eu precise criar if's ou switch cases para cada imposto,
	 * criei uma interface com o metodo calcular...
	 * criei uma classe para cada imposto, onde eles implementam a interface,
	 * e cada um tem sua forma de no metodo calcular (polimorfismo)
	 */

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto){
        return imposto.calcular(orcamento);
    }
}
