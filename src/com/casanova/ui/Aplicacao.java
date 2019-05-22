package com.casanova.ui;
import java.util.Scanner;

import com.casanova.negocio.Fachada;
import com.casanova.negocio.NomeVazioException;
import com.casanova.negocio.modelo.Funcionario;
import com.casanova.negocio.modelo.Produto;

public class Aplicacao {

	private static Scanner sc;

	public static void main(String[] args) {
		boolean aux = true;
		sc = new Scanner(System.in);
		
		while(aux) {
			System.out.println("Digite um numero de acordo com a função: ");
			System.out.println("1 - Cadastrar produto: \n 2 - Cadastrar funcionario: ");
			
			
			int a = sc.nextInt();
			switch(a) {
			case 1:
				try {
				System.out.println("Digite o nome do produto: ");
				String nome = sc.next();
				System.out.println("Digite o código do produto: ");
				int codigo = sc.nextInt();
				System.out.println("Digite o valor de compra do produto: ");
				double precoCompra = sc.nextDouble();
				System.out.println("Digite o valor de venda do produto: ");
				double precoVenda = sc.nextDouble();
				System.out.println("Digite a quantidade de produtos: ");
				int quantidade = sc.nextInt();
				Produto produto = new Produto(nome,codigo,precoCompra, precoVenda, quantidade);
				Fachada.getSingleton().cadastrarProduto(produto);
				
	
				}catch(NomeVazioException e){
					System.out.println(e.getMessage());
				}catch(NumberFormatException e) {
					System.out.println(e.getMessage());
				}
			case 2:
				System.out.println("Digite o nome do funcionario: ");
				String nome = sc.next();
				System.out.println("Digite o cpf do funcionario(sem pontos e traços:");
				String cpf = sc.next();
				System.out.println("Digite digite o cargo: 01 se gerente ou 02 se vendedor: ");
				int cargo = sc.nextInt();
				System.out.println("Digite um nome de usuario: ");
				String usuario = sc.next();
				System.out.println("Digite uma senha: ");
				String senha = sc.next();
				Funcionario funcionario = new Funcionario(nome, cpf, cargo, usuario, senha);
				
				
			}
			
			
		}
		
		
		
		

	}



}
