package br.com.loja;

import br.com.loja.imposto.CalculadoraImposto;
import br.com.loja.imposto.ICMS;
import br.com.loja.imposto.ISS;
import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class App {

    public static void main(String[] args) {

    	// Crio um orcamento
        Orcamento orcamento = new Orcamento(new BigDecimal("1000"));
        // Crio a calculadora
        CalculadoraImposto calculadora = new CalculadoraImposto();
        // Printo o orcamento e crio o imposto com o new
        System.out.println(calculadora.calcular(orcamento, new ISS()));


    }
}
