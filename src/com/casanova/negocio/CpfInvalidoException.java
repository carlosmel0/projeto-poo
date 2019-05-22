package com.casanova.negocio;

public class CpfInvalidoException extends Exception{

	private static final long serialVersionUID = 1L;
	CpfInvalidoException(){
		super("CPF Inv�lido: ");
	}
	CpfInvalidoException(String msg){
		super(msg);
	}

}
