package com.casanova.negocio;

public class CpfInvalidoException extends Exception{

	private static final long serialVersionUID = 1L;
	CpfInvalidoException(){
		super("CPF Inválido: ");
	}
	CpfInvalidoException(String msg){
		super(msg);
	}

}
