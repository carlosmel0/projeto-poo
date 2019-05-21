package com.casanova.dados;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.casanova.dados.DB;
import com.casanova.negocio.modelo.Produto;

public class RepositorioProduto implements IRepositorioProduto {
	
	public void inserirProduto(Produto produto) {

		try {
			Connection conn = DB.getSingleton().getConnection();
			String sql = "INSERT INTO Produto (nome,codigo, precoCompra, precoVenda, quantidade) VALUES(?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, produto.getNome());
			pstmt.setInt(2, produto.getCodigo());
			pstmt.setDouble(3, produto.getPrecoCompra());
			pstmt.setDouble(4, produto.getPrecoVenda());
			pstmt.setInt(5, produto.getQuantidade());
	        pstmt.executeUpdate();
	        System.out.print("Salvo");
					
		}catch (SQLException ex) {
			throw new DbException(ex.getMessage());
		}
		
		
	}

}
