package com.casanova.negocio;

import com.casanova.dados.IRepositorioProduto;
import com.casanova.dados.RepositorioProduto;
import com.casanova.negocio.modelo.Produto;


public class CrudProduto {
	private IRepositorioProduto repProduto;
	
	public CrudProduto() {
		repProduto = new RepositorioProduto();
	}
	
	
	public void cadastrarProduto(Produto produto) {
		if (produto.getNome() == null || produto.getNome().isEmpty()) {
			throw new NomeVazioException();
		}
		
		if (curso.getNome() == null || curso.getNome().isEmpty()) {
			throw new ExceptionNomeCursoVazio();
		}
		
		if (curso.getCoordenador() == null) {
			throw new ExceptionCoordenadorNulo();
		}
		
		repCurso.inserirCurso(curso);
		
		
		
		
		
	}

}
