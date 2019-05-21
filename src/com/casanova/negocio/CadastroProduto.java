package com.casanova.negocio;

import com.casanova.dados.IRepositorioProduto;
import com.casanova.negocio.modelo.Produto;

public class CadastroProduto {
	private IRepositorioProduto repProduto;
	
	public void cadastrarProduto(Produto produto) {
		repProduto.inserirProduto(produto);
		
	}

}
