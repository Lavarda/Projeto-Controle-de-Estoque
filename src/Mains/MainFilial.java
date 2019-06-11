package Mains;

import Implementacao.Filiais;

public class MainFilial extends MainFuncionario{
	public static void main(String[] args) {
		do {
			Filiais filial = new Filiais();
			System.out.println("Digite a op��o desejada: \n "
						+ "1 - Adicionar uma nova Filial \n "
						+ "2 - Excluir uma Filial \n "
						+ "3 - Voltar");
			try {
				MainPrincipal.setOpcaoSecundaria(Integer.parseInt(s.nextLine()));
				switch (MainPrincipal.getOpcaoSecundaria()) {
					case 1:
						funcionario.requisitarInclusaoFilial(filial);			 								
						break;
					case 2:
						funcionario.requisitarExclusaoFilial(filial);
						break;
					case 3:
						MainFuncionario.main(args);
						break;
					default:
						System.out.println("Op��o invalida!!");
						break;
				}
				}catch(NumberFormatException e) {
					System.out.println("Valor inv�lido!!");
				}
		}while(MainPrincipal.isSistemaSecundario());
		
	}
}
