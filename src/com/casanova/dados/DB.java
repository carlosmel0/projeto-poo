package com.casanova.dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DB {
	private static Connection conn;
	private final String url = "jdbc:sqlite:./bd/banco.db";
	private static DB singleton = null;
	
	public DB() throws SQLException {
		this.connect();
		this.criarBanco();
		
	}
	
	private void criarBanco() throws SQLException {
		String sqlFuncionario=" CREATE TABLE IF NOT EXISTS Funcionario (" +
								"id integer PRIMARY KEY AUTOINCREMENT,"+
								"nome TEXT, cpf TEXT, cargo INTEGER, usuario TEXT, senha TEXT" +
								");";
		Statement stmt = conn.createStatement();
		stmt.execute(sqlFuncionario);
		String sqlProduto = "CREATE TABLE IF NOT EXISTS Produto (" +
							"id integer PRIMARY KEY AUTOINCREMENT," +
							"nome TEXT, codigo INTEGER, precoCompra REAL, precoVenda REAL, quantidade INTEGER"+
							");";
		stmt.execute(sqlProduto);
		
							
	
	}
	
	public static DB getSingleton() throws SQLException {
		if (singleton == null) {
			singleton = new DB();
		}
		return singleton;
	}
	
	
	private Connection connect() throws SQLException {        
        DB.conn = DriverManager.getConnection(url);
        return conn;
    }
	
	public Connection getConnection() {
		return DB.conn;
	}
	
	
	

}
