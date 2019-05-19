package com.casanova.modelo;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private Pessoa dados;
	private double debito;
	private List<Venda> compras;
	
	
	public Cliente(String nome, String cpf) {
		super();
		this.dados = new Pessoa(nome, cpf);
		this.debito = 00.00;
		this.setCompras(new ArrayList<Venda>());
	}
	
	public Pessoa getDados() {
		return dados;
	}
	
	public void setDados(Pessoa dados) {
		this.dados = dados;
	}
	
	public double getDebito() {
		return debito;
	}	
	
	public void pagamento(double valor) {
		this.debito -= valor;
	}

	public List<Venda> getCompras() {
		return compras;
	}

	public void setCompras(List<Venda> compras) {
		this.compras = compras;
	}
	public void adicionaCompra(VendaPrazo compra) {
		this.debito += compra.getTotal();
		this.compras.add(compra);
	}
	
	
	
	
}
