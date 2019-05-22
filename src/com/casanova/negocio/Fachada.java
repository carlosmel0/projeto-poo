package com.casanova.negocio;

import com.casanova.negocio.modelo.Produto;

public class Fachada {
	
	private CrudProduto crudProduto;
	private CrudFuncionario crudFuncionario;
	private static Fachada singleton = null;

	public static Fachada getSingleton() {
		if (singleton == null) {
			singleton = new Fachada();
		}
		return singleton;
	}
	
	private Fachada () {
		crudProduto = new CrudProduto();
	}
	
	public void cadastrarProduto(Produto produto) throws NomeVazioException, NumberFormatException {
		this.crudProduto.cadastrarProduto(produto);
		
	}
	

}
