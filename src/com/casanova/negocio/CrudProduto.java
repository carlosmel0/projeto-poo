package com.casanova.negocio;

import com.casanova.dados.IRepositorioProduto;
import com.casanova.dados.RepositorioProduto;
import com.casanova.negocio.modelo.Produto;


public class CrudProduto {
	private IRepositorioProduto repProduto;
	
	public CrudProduto() {
		repProduto = new RepositorioProduto();
	}
	
	
	public void cadastrarProduto(Produto produto) throws NomeVazioException {
		if (produto.getNome() == null || produto.getNome().isEmpty()) {
			throw new NomeVazioException();
		}
		repProduto.inserirProduto(produto);;
		
	}

}
