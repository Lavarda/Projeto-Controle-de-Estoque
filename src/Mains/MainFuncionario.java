package Mains;

import Implementacao.Funcionario;

public class MainFuncionario extends MainPrincipal{
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		boolean autenticacao = funcionario.realizarAutenticacao();
		if (autenticacao == true) {
			do {
 				System.out.println("Digite a area que deseja modificar : \n "
 						+ "1 - Produtos \n "
 						+ "2 - Fornecedores \n "
 						+ "3 - Filiais \n "
 						+ "4 - Usuários \n "
 						+ "5 - Relátorios \n "
 						+ "6 - Transferências \n "
 						+ "7 - Sair");
 				MainPrincipal.setOpcao(s.nextInt());
 				switch(MainPrincipal.getOpcao()) {
 				case 1:
 					break;
 				case 2:
 					break;
 				case 3:
 					break;
 				case 4:
 					break;
 				case 5:
 					break;
 				case 6:
 					break;
 				case 7:
 					break;
 				default:
 					break;
 				}
			}while(MainPrincipal.isSistema());
		}
	}
}
