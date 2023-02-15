package br.com.loja.imposto;

import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;

/* o imposto ISS implementa a interface,
 * e faz seu metodo calcular de acordo com sua regra de negocio
 */

public class ISS implements Imposto{

    public BigDecimal calcular(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
