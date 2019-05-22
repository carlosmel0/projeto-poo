package com.casanova.negocio;

public class CodigoVazioException extends Exception{
	

	private static final long serialVersionUID = 1L;
	public CodigoVazioException() {
		super("Codigo do produto vazio!");
	}
	public CodigoVazioException(String msg) {
		super(msg);
	}
}
