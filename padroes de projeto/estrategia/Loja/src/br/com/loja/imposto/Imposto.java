package br.com.loja.imposto;

import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;

/*interface com o metodo calcular
 */

public interface Imposto {
	
	
    BigDecimal calcular(Orcamento orcamento);
}
