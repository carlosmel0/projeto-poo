package com.casanova.negocio;
import com.casanova.modelo.Produto;
import com.mysql.jdbc.Connection;
import com.casanova.dados.*;
import com.casanova.modelo.*;

public class Aplicacao {

	public static void main(String[] args) {
		
		Produto prod01 = new Produto("Cimento", "554412", 12.50, 25.00, 10);
		Produto prod02 = new Produto("Cola", "6451132", 10.00, 15.90, 10);
		Cliente cliente = new Cliente("Jose Carlos", "15464859816");
		
		VendaPrazo vend1 = new VendaPrazo(cliente);
		vend1.adicionaProduto(prod01, 5);
		vend1.adicionaProduto(prod02, 5);
		cliente.adicionaCompra(vend1);
		System.out.println(vend1.getTotal());
		System.out.println(prod01.getQuantidade());
		System.out.println(prod02.getQuantidade());
		System.out.println(vend1.getData());
		
		
		System.out.println(cliente.getCompras());
		
		Connection conn = (Connection) DB.getConnection();
		DB.closeConnection();
		
		
		
		

	}

}
