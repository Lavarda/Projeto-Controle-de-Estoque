package Mains;


import Implementacao.Gerente;

public class MainGerente extends MainPrincipal {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		boolean autenticacao = gerente.realizarAutenticacao();
		if (autenticacao == true) {
			do {
				System.out.println("Digite a opção desejada: \n "
		 					+ "1 - Adcionar um novo Funcionario \n "
		 					+ "2 - Excluir um Funcionario \n "
		 					+ "3 - Alterar Senha Funcionario \n "
		 					+ "4 - Voltar");
				try {
					MainPrincipal.setOpcao(Integer.parseInt(s.nextLine()));
					switch(MainPrincipal.getOpcao()) {case 1:
			 				gerente.incluirFuncionario();
			 				break;
			 			case 2:
			 				gerente.excluirFuncionario();
			 				break;
			 			case 3:
			 				gerente.editarSenhaFuncionario();
			 				break;
			 			case 4:
			 				MainPrincipal.main(args);
			 				break;
			 			default:
		 				System.out.println("Op��o invalida!!");
		 				MainPrincipal.setSistema(false);
		 				 break;
					}
				}catch(NumberFormatException e) {
					System.out.println("Valor Inv�lido!!");
				}
			}while(MainPrincipal.isSistema());
		}
	}
}
