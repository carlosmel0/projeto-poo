package com.casanova.negocio;

public class CargoInvalidoException extends Exception{
	public CargoInvalidoException() {
		super("Cargo inv�lido!");
	}
	public CargoInvalidoException(String msg) {
		super(msg);
	}

}
