package com.casanova.modelo;

public class Funcionario extends Pessoa {
	public static final int CARGO_GERENTE = 01;
	public static final int CARGO_FUNCIONARIO = 02;
	
	private int cargo;
	private Login login;
	
	public Funcionario() {
		super();
	}

	public Funcionario(int cargo, Login login) {
		super();
		this.cargo = cargo;
		this.login = login;
	}

	
	

}
