package com.casanova.negocio;

public class NomeVazioException extends Exception {

	private static final long serialVersionUID = 1L;

	public NomeVazioException() {
		super("Nome Vazio!");
	}

	public NomeVazioException(String msg) {
		super(msg);
	}
	
	
}
