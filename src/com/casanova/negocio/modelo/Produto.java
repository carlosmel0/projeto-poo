package com.casanova.negocio.modelo;

public class Produto {
	private String nome;
	private int codigo;
	private double precoCompra;
	private double precoVenda;
	private double lucroProduto;
	private int quantidade;
	
	public Produto() {
		
	}

	public Produto(String nome,int codigo, double precoCompra, double precoVenda, int quantidade) {
		this.nome = nome;
		this.codigo = codigo;
		this.precoCompra = precoCompra;
		this.precoVenda = precoVenda;
		this.quantidade = quantidade;
		this.lucroProduto = calcularLucro();
		
	}

	public double getLucroProduto() {
		return lucroProduto;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPrecoCompra() {
		return precoCompra;
	}

	public void setPrecoCompra(double precoCompra) {
		this.precoCompra = precoCompra;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public int getQuantidade() {
		return quantidade;
	}
	public void removerQuantidade(int numero) {
		if(numero <= this.quantidade){
			this.quantidade -= numero;
		}
	}
	public double calcularLucro() {
		return this.lucroProduto = (this.precoVenda - this.precoCompra);
		
	}

	
	

}
