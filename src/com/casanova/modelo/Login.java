package com.casanova.modelo;
public class Login {
	protected Pessoa pessoa;
	protected String nomeUsuario;
	protected String senha;
	
	public Login() {
	}
	
	public Login(String nomeUsuario, String senha, Pessoa pessoa) {
		this.pessoa = pessoa;
		this.nomeUsuario = nomeUsuario;
		this.senha = senha;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	
	

}
