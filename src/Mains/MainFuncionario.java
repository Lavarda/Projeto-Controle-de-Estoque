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
 						+ "4 - UsuÃ¡rios \n "
 						+ "5 - RelatÃ³rios \n "
 						+ "6 - TransferÃªncias \n "
 						+ "7 - Sair");
 				try {
 					MainPrincipal.setOpcao(Integer.parseInt(s.nextLine()));
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
 		 					MainPrincipal.main(args);
 		 					break;
 		 				default:
 		 					System.out.println("Opção invalida!!");
 		 					MainPrincipal.setSistema(false);
 		 					break;
 	 				}
 				}catch(NumberFormatException e){
 					System.out.println("Valor inválido!!");
 				} 				 
			}while(MainPrincipal.isSistema());
		}
	}
}
