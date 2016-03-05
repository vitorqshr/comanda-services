package br.com.comanda.services.models;

import java.util.Date;

public class TipoPagamento {
	private int idTipoPagamento;
	private String forma;
	private double valor1, valor2, valor3, total;
	private boolean dinheiro, credito, debito, comissao;
	private Date dataPagamento;

}
