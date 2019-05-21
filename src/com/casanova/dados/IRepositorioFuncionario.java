package com.casanova.dados;

import com.casanova.negocio.modelo.Funcionario;

public interface IRepositorioFuncionario {
	public void inserirFuncionario(Funcionario funcionario);
	public void mostrarFuncionario();
	public void atualizarFuncionario(Funcionario funcionario);

}
