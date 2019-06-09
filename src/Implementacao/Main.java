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
			 		boolean autenticacao = funcionario.realizarAutenticacao();
			 		
			 		if ( autenticacao == true ) {
			 			do {
			 				
			 				System.out.println("Digite a area que deseja modificar : \n 1 - Produtos \n 2 - Fornecedores \n 3 - Filiais \n 4 - Usuários \n 5 - Relátorios \n 6 - Transferências \n 7 - Sair");
			 				opcao = s.nextInt();
			 				switch ( opcao ) {
				 				case 1:
				 					
				 					do {
				 						Produtos produto = new Produtos();
				 						System.out.println("Digite a opção desejada: \n 1 - Adicionar um novo Produto \n 2 - Excluir um produto \n 3 - Editar um Produto \n 4 - Voltar");
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
					 							break;
					 						default:
					 							System.out.println("Opção invalida!!");
					 							break;
				 						}
				 						
				 					} while ( sistemaSecundario );
				 					break;
			 					
				 				case 2:
				 					
				 					do {
				 						Fornecedor fornecedor = new Fornecedor();
				 						System.out.println("Digite a opção desejada: \n 1 - Adicionar um novo Fornecedor \n 2 - Excluir um Fornecedor \n 3 - Voltar");
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
					 							break;
					 						default:
					 							System.out.println("Opção invalida!!");
					 							break;
					 						}
				 					} while ( sistemaSecundario );
				 					break;
				 					
				 				case 3:
				 					
				 					do {
				 						Filiais filial = new Filiais();
				 						System.out.println("Digite a opção desejada: \n 1 - Adicionar uma nova Filial \n 2 - Excluir uma Filial \n 3 - Voltar");
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
					 							break;
					 						default:
					 							System.out.println("Opção invalida!!");
					 							break;
					 						}
				 						
				 					} while ( sistemaSecundario );
				 					break;
				 					
				 				case 4:
				 					
				 					do {
				 						Usuario usuario = new Usuario();
				 						System.out.println("Digite a opção desejada: \n 1 - Adicionar um novo usuário \n 2 - Modificar um usuário \n 3 - Excluir um usuario \n 4 - Verificar todos produtos comprados \n 5 - Voltar");
				 						opcaoSecundaria = s.nextInt();
				 						switch ( opcaoSecundaria ) {
					 						case 1:
					 							funcionario.requisitarInclusaoUsuario(usuario);
					 							break;
					 						case 2:
					 							funcionario.requisitarAlteracaoUsuario(usuario);
					 							break;
					 						case 3:
					 							funcionario.requisitarExclusaoUsuario(usuario);
					 							break;
					 						case 4:
					 							funcionario.requisitarHistorioCompras(usuario);
					 							break;
					 						case 5:
					 							sistemaSecundario = false;
					 							break;
					 						default:
					 							System.out.println("Opção invalida!!");
					 							break;
					 						}
				 					} while ( sistemaSecundario );
				 					break;
				 					
				 				case 5:
				 					do {
					 					System.out.println("Digite a opção desejada: \n 1 - Relátorio de devoluções aos fornecedores \n 2 - Relátorio de itens recebidos pelo fornecedor \n 3 - Relátorio do estoque \n 4 - Número de fornecedores de determinado estado \n 5 - Usuários cadastrados de determinada cidade \n 6 - Voltar");
					 					opcaoSecundaria = s.nextInt();
					 					switch ( opcaoSecundaria ) {
					 						case 1:
					 							funcionario.requisitarRelatorioDevolucoes();
					 							break;
					 						case 2:
					 							funcionario.requisitarRelatoriosRecebiveis();
					 							break;
					 						case 3:
					 							funcionario.requisitarRelatorioEstoque();
					 							break;
					 						case 4:
					 							funcionario.requisitarRelatoriosFornecedores();
					 							break;
					 						case 5:
					 							funcionario.requisitarRelatoriosUsuarios();
					 							break;
					 						case 6:
					 							sistemaSecundario = false;
					 							break;
					 						default:
					 							System.out.println("Opção invalida!!");
					 							break;
					 					}
				 					} while ( sistemaSecundario );
				 					break;
				 				case 6:
				 					System.out.println("Digite a opção desejada: \n 1 - ");
				 					System.out.println("Transfêrencias");
				 					break;
				 				case 7:
				 					sistema = false;
				 					System.out.println("Saiu do sistema");
				 					break;
				 				default:
				 					System.out.println("Opção invalida!!");
				 					break;
			 				}
			 			} while ( sistema );
			 		}
			 		break;
			 	case 2 :
			 		Gerente gerente = new Gerente();
			 		boolean autenticacaoGerente = gerente.realizarAutenticacao();
			 		if ( autenticacaoGerente == true ) {
			 			do {
		 		 			System.out.println("Digite a opção desejada: \n" + "1 - Adcionar um novo Funcionario \n" + 
		 		 					"2 - excluir um Funcionario \n" + "3 - Alterar Senha Funcionario \n" + "4 - Voltar");
		 		 			opcao = s.nextInt();
		 		 			switch(opcao) {
			 		 			case 1:
			 		 				gerente.incluirFuncionario();
			 		 				break;
			 		 			case 2:
			 		 				gerente.excluirFuncionario();
			 		 				break;
			 		 			case 3:
			 		 				gerente.editarSenhaFuncionario();
			 		 				break;
			 		 			case 4:
			 		 				sistema = false;
			 		 				break;
			 		 			default:
			 		 				System.out.println("Opção invalida");
			 		 				break;
			 		 			}		 		 			
			 			} while(sistema);
			 		} else {
			 			autenticacaoGerente = gerente.realizarAutenticacao();
			 		}
		 			break;
			 	case 3 :
			 		sistema = false;
			 		System.out.println("Saiu do sistema");
			 }
		 } while ( sistema );
		 
		 //new InterfacePrincipal().setVisible(true);		 
	 }

}