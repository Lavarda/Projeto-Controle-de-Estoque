package Mains;

import Implementacao.Funcionario;

public class MainFuncionario extends MainPrincipal{
	protected static Funcionario funcionario = new Funcionario();
	public static void main(String[] args) {
		
		boolean autenticacao = funcionario.realizarAutenticacao();
		if (autenticacao == true) {
			do {
 				System.out.println("Digite a area que deseja modificar : \n "
 						+ "1 - Produtos \n "
 						+ "2 - Fornecedores \n "
 						+ "3 - Filiais \n "
 						+ "4 - Usu�rios \n "
 						+ "5 - Relat�rios \n "
 						+ "6 - Transfer�ncias \n "
 						+ "7 - Sair");
 				MainPrincipal.setOpcao(s.nextInt());
 				switch(MainPrincipal.getOpcao()) {
 				case 1:
 					MainProdutos.main(args);
 					break;
 				case 2:
 					MainFornecedor.main(args);
 					break;
 				case 3:
 					MainFilial.main(args);
 					break;
 				case 4:
 					MainUsuarios.main(args);
 					break;
 				case 5:
 					MainRelatorios.main(args);
 					break;
 				case 6:
 					MainTransferencias.main(args);
 					break;
 				case 7:
 					MainPrincipal.setSistema(false);
 					break;
 				default:
 					System.out.println("Op��o inv�lida!!");
 					MainPrincipal.setSistema(false);
 					break;
 				}
			}while(MainPrincipal.isSistema());
		}
	}
}
