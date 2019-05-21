package com.casanova.dados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.casanova.negocio.modelo.Funcionario;

public class RepositorioFuncionario implements IRepositorioFuncionario {
	
	public void inserirFuncionario(Funcionario funcionario) throws DbException {
		try {
			Connection conn = DB.getSingleton().getConnection();
			String sql = "INSERT INTO Funcionario (nome, cpf, cargo, usuario, senha) VALUES(?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, funcionario.getNome());
			pstmt.setString(2, funcionario.getCpf());
			pstmt.setInt(3, funcionario.getCargo());
			pstmt.setString(4, funcionario.getLogin().getNomeUsuario());
			pstmt.setString(5, funcionario.getLogin().getSenha());
	        pstmt.executeUpdate();
	        System.out.print("Salvo");
					
		}catch (SQLException ex) {
			throw new DbException(ex.getMessage());
		}
		
		
	}
	public void mostrarFuncionario() throws DbException{
		try{
			Connection conn = DB.getSingleton().getConnection();
			ResultSet  resultSet = null;
			Statement statement = null;
			String query = "SELECT * FROM Funcionario; ";
			statement = conn.createStatement();
			resultSet = statement.executeQuery(query);
			
			while(resultSet.next()) {
				System.out.println("Dados Funcionarios");
				System.out.println(resultSet.getString("nome"));
			}
			
		}catch(SQLException e) {
			
		}
	}
	public void atualizarFuncionario(Funcionario funcionario) {
		
	}

}
