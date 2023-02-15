package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

/* o imposto ICMS implementa a interface,
 * e faz seu metodo calcular de acordo com sua regra de negocio
 */

public class ICMS implements Imposto {

    public BigDecimal calcular(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
