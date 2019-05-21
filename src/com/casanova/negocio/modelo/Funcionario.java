package com.casanova.negocio.modelo;

public class Funcionario extends Pessoa {
	public static final int CARGO_GERENTE = 01;
	public static final int CARGO_FUNCIONARIO = 02;
	
	private int cargo;
	private Login login = new Login();
	
	public Funcionario() {
		super();
	}

	public Funcionario(String nome, String cpf,int cargo, String usuarioLogin, String senha) {
		super(nome, cpf);
		this.cargo = cargo;
		this.login.setNomeUsuario(usuarioLogin);
		this.login.setSenha(senha);
	}

	public int getCargo() {
		return cargo;
	}

	public void setCargo(int cargo) {
		this.cargo = cargo;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}
	

	
	

}
