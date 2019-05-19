package com.casanova.modelo;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Venda {
	private List<Produto> produtos;
	private double total;
	private Date data;
	
	
	public Venda() {
		this.data = new Date();
		this.produtos = new ArrayList<>();
		this.total = 0.0;
	
	}
	
	
	public List<Produto> getProdutos() {
		return produtos;
	}


	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}


	public double getTotal() {
		return total;
		
	}


	public void setTotal(double total) {
		this.total = total;
	}
	
	public String getData() {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		return formato.format(this.data);
		
	}


	public void calculoTotal(){
		for(Produto prod : this.produtos) {
			this.total += prod.getPrecoVenda();
			
		}
	}
	
	public void adicionaProduto(Produto produto, int quantidade) {
		this.produtos.add(produto);
		this.total += produto.getPrecoVenda() * quantidade;
		produto.removerQuantidade(quantidade);
	}
	
}
