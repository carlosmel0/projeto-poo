package com.casanova.negocio.modelo;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
	private double debito;
	private List<Venda> compras;
	
	
	public Cliente(String nome, String cpf) {
		super(nome, cpf);
		this.debito = 00.00;
		this.setCompras(new ArrayList<Venda>());
	}
	
	public double getDebito() {
		return debito;
	}	
	
	public void pagamento(double valor) {
		this.debito -= valor;
	}

	public List<Venda> getCompras() {
		for(int i = 0; i < this.compras.size(); i++) {
			System.out.println(this.compras.get(i));
		}
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
