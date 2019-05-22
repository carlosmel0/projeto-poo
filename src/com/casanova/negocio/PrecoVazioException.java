package com.casanova.negocio;

public class PrecoVazioException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public PrecoVazioException() {
		super("Preço vazio!");
	}
	public PrecoVazioException(String msg) {
		super(msg);
	}

}
