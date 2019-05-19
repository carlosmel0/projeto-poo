package com.casanova.modelo;

public class VendaPrazo extends Venda {
	private Cliente cliente;

	public VendaPrazo(Cliente cliente) {
		super();
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	
	
	

}
