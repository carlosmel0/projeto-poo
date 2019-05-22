package com.casanova.negocio;

public class CargoInvalidoException extends Exception{
	public CargoInvalidoException() {
		super("Cargo inválido!");
	}
	public CargoInvalidoException(String msg) {
		super(msg);
	}

}
