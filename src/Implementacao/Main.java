package Implementacao;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import Connections.ConnectionDB;
import interfaces.InterfacePrincipal;

public class Main {
	
	private static boolean sistema = true;
	private static boolean sistemaSecundario = true;
	private static int opcao;
	private static int opcaoSecundaria;
	private static Scanner s = new Scanner(System.in);
	
	 public static void main(String[] args) throws SQLException {
		 
		 
		 do {
			 System.out.println("Você deseja logar como : \n1 - Funcionario \n2 - Gerente \n3 - Sair");
			 opcao = s.nextInt();
			 
			 switch (opcao) {
			 	case 1 : 
			 		
			 		Funcionario funcionario = new Funcionario();
			 		funcionario.realizarAutenticacao();
			 		
			 		do {
			 			System.out.println("Digite a area que deseja modificar : \n 1 - Produtos \n 2 - Fornecedores \n 3 - Filiais \n 4 - Usuários \n 5 - Relátorios \n 6 - Transferências \n 7 - Sair");
			 			opcao = s.nextInt();
			 			switch ( opcao ) {
			 				case 1:
			 					
			 					do {
			 						Produtos produto = new Produtos();
			 						System.out.println("Digite o que deseja fazer: \n 1 - Adicionar um novo Produto \n 2 - Excluir um produto \n 3 - Editar um Produto \n 4 - Voltar");
			 						opcaoSecundaria = s.nextInt();
			 						switch (opcaoSecundaria) {
			 							case 1:
			 								funcionario.requisitarInclusaoProduto(produto);;			 								
			 								break;
			 							case 2:
			 								funcionario.requisitarExclusaoProduto(produto);
			 								break;
			 							case 3:
			 								funcionario.requisitarAlteracaoProduto(produto);
			 								break;
			 							case 4:
			 								sistemaSecundario = false;
			 						}
			 						
			 					} while ( sistemaSecundario );
			 					break;
			 					
			 				case 2:
			 					
			 					do {
			 						Fornecedor fornecedor = new Fornecedor();
			 						System.out.println("Digite o que deseja fazer: \n 1 - Adicionar um novo Fornecedor \n 2 - Excluir um Fornecedor \n 3 - Voltar");
			 						opcaoSecundaria = s.nextInt();
			 						switch (opcaoSecundaria) {
										case 1:
											funcionario.requisitarInclusaoFornecedor(fornecedor);
											break;
										case 2:
											funcionario.requisitarExclusaoFornecedor(fornecedor);
											break;
										case 3:
											sistemaSecundario = false;
									}
			 					} while ( sistemaSecundario );
			 					break;
			 					
			 				case 3:
			 					
			 					do {
			 						Filiais filial = new Filiais();
			 						System.out.println("Digite o que deseja fazer: \n 1 - Adicionar uma nova Filial \n 2 - Excluir uma Filial \n 3 - Voltar");
			 						opcaoSecundaria = s.nextInt();
			 						switch ( opcaoSecundaria ) {
			 							case 1:
			 								funcionario.requisitarInclusaoFilial(filial);
			 								break;
			 							case 2:
			 								funcionario.requisitarExclusaoFilial(filial);
			 								break;
			 							case 3:
			 								sistemaSecundario = false;
			 						}
			 						
			 					} while ( sistemaSecundario );
			 					break;
			 					
			 				case 4:
			 					System.out.println("Usuários");
			 					break;
			 				case 5:
			 					System.out.println("Relátorios");
			 					break;
			 				case 6:
			 					System.out.println("Transfêrencias");
			 					break;
			 				case 7:
			 					sistema = false;
			 					System.out.println("Saiu do sistema");
			 					break;
			 			}
			 		} while ( sistema );
			 		
			 		break;
			 	case 2 :
			 		Gerente gerente = new Gerente("1231231232","asdfasdfads","asdasdasda", Categoria.TODAS);
			 		break;
			 	case 3 :
			 		sistema = false;
			 		System.out.println("Saiu do sistema");
			 }
		 } while ( sistema );
		 
		 // Inicializar interfaces
	//		 new InterfacePrincipal().setVisible(true);		 
		 
		 // Metodos de exclusão e modificação estão via console abaixo o resto as interfaces fazem.
	//		 Funcionario f = new Funcionario("1122330","Teste","123456",Cargos.GERENTE,Categoria.NENHUMA);
	//		 f.requisitarExclusaoUsuario(new Usuario() );
	//		 f.requisitarAlteracaoUsuario(new Usuario() );
	//		 f.requisitarExclusaoProduto(new Produtos() );
	//		 f.requisitarAlteracaoProduto(new Produtos() );
		 
		 // Relatorios do banco :
	//		 Relatorios.estoqueInteiro();
	//		 Relatorios.devolucoesFornecedor();
	//		 Relatorios.numerosFornecedores("SC");
	//		 Relatorios.recebidosFornecedor();
	//		 Relatorios.usuariosCidade("Florianopolis");
	 }

}