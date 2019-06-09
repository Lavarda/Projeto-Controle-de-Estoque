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
			 System.out.println("Voc√™ deseja logar como : \n1 - Funcionario \n2 - Gerente \n3 - Sair");
			 opcao = s.nextInt();
			 
			 switch (opcao) {
			 	case 1 : 
			 		
			 		Funcionario funcionario = new Funcionario();
			 		funcionario.realizarAutenticacao();
			 		
			 		do {
			 			System.out.println("Digite a area que deseja modificar : \n 1 - Produtos \n 2 - Fornecedores \n 3 - Filiais \n 4 - Usu√°rios \n 5 - Rel√°torios \n 6 - Transfer√™ncias \n 7 - Sair");
			 			opcao = s.nextInt();
			 			switch ( opcao ) {
			 				case 1:
			 					
			 					do {
			 						Produtos produto = new Produtos();
			 						System.out.println("Digite o que deseja fazer: \n 1 - Adicionar um novo Produto \n 2 - Excluir um produto \n 3 - Editar um Produto \n 4 - Voltar");
			 						opcaoSecundaria = s.nextInt();
			 						switch (opcaoSecundaria) {
			 							case 1:
			 								produto.inserirProduto();			 								
			 								break;
			 							case 2:
			 								produto.excluirProduto();
			 								break;
			 							case 3:
			 								produto.alterarProduto();
			 								break;
			 							case 4:
			 								sistemaSecundario = false;
			 						}
			 						
			 					} while ( sistemaSecundario );
			 					break;
			 				case 2:
			 					Fornecedor fornecedor = new Fornecedor();
			 					System.out.println("Fornecedores");
			 					break;
			 				case 3:
			 					System.out.println("Filiais");
			 					break;
			 				case 4:
			 					System.out.println("Usu√°rios");
			 					break;
			 				case 5:
			 					System.out.println("Rel√°torios");
			 					break;
			 				case 6:
			 					System.out.println("Transf√™rencias");
			 					break;
			 				case 7:
			 					sistema = false;
			 					System.out.println("Saiu do sistema");
			 					break;
			 				default:
			 					System.out.println("OpÁ„o inv·lida!!");
			 					sistema = false;
			 					break;
			 			}
			 		} while ( sistema );
			 		
			 		break;
			 	case 2 :
			 		 Gerente gerente = new Gerente();
			 		 gerente.realizarAutenticacao();
			 		 	do {
			 		 		System.out.println("Digite a opÁ„o desejada: \n" + "1 - Adcionar um novo Funcionario \n" + 
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
			 		 		default:
			 		 			System.out.println("OpÁ„o invalida");
			 		 			sistema = false;
			 		 			break;
			 		 		}
			 		 	} while(sistema);
			 		break;
			 	case 3 :
			 		sistema = false;
			 		System.out.println("Saiu do sistema");
			 }
		 } while ( sistema );
		 
		 // Inicializar interfaces
	//		 new InterfacePrincipal().setVisible(true);		 
		 
		 // Metodos de exclus√£o e modifica√ß√£o est√£o via console abaixo o resto as interfaces fazem.
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