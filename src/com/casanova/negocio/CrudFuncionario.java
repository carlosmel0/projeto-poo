package com.casanova.negocio;

import com.casanova.dados.IRepositorioFuncionario;
import com.casanova.negocio.modelo.Funcionario;

public class CrudFuncionario {

	private IRepositorioFuncionario repFuncionario;
	
	public void cadastrarFuncionario(Funcionario funcionario) throws NomeVazioException, CpfInvalidoException, CargoInvalidoException {
		if(funcionario.getNome() == null || funcionario.getNome().isEmpty()) {
			throw new NomeVazioException();
		}
		if(funcionario.getCpf() == null || funcionario.getCpf().isEmpty() || funcionario.getCpf().length() != 11){
			throw new CpfInvalidoException();
		}
		if(funcionario.getCargo()<1 || funcionario.getCargo()>2) {
			throw new CargoInvalidoException();
		}
		if (funcionario.getLogin().getNomeUsuario() == null || funcionario.getLogin().getNomeUsuario().isEmpty()) {
			
		}
	}
	
}
