package Mains;

import Implementacao.Filiais;

public class MainFilial extends MainFuncionario{
	public static void main(String[] args) {
		do {
			Filiais filial = new Filiais();
			System.out.println("Digite a opção desejada: \n "
						+ "1 - Adicionar uma nova Filial \n "
						+ "2 - Excluir uma Filial \n "
						+ "3 - Voltar");
			MainPrincipal.setOpcaoSecundaria(s.nextInt());
			switch (MainPrincipal.getOpcaoSecundaria()) {
				case 1:
					funcionario.requisitarInclusaoFilial(filial);			 								
					break;
				case 2:
					funcionario.requisitarExclusaoFilial(filial);
					break;
				case 3:
					MainPrincipal.setSistemaSecundario(false);
					break;
				default:
					System.out.println("Opção invalida!!");
					break;
			}
		}while(MainPrincipal.isSistemaSecundario());
		
	}
}
