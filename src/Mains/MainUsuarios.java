package Mains;

import Implementacao.Usuario;

public class MainUsuarios extends MainFuncionario {
	public static void main(String[] args) {
		do {
			Usuario usuario = new Usuario();
			System.out.println("Digite a op��o desejada: \n "
						+ "1 - Adicionar um novo usu�rio \n "
						+ "2 - Modificar um usu�rio \n "
						+ "3 - Excluir um usu�rio \n "
						+ "4 - Verificar todos produtos comprados \n "
						+ "5 - Voltar");
			MainPrincipal.setOpcaoSecundaria(s.nextInt());
			switch (MainPrincipal.getOpcaoSecundaria()) {
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
					MainPrincipal.setSistemaSecundario(false);
					break;
				default:
					System.out.println("Op��o invalida!!");
					break;
			}
		}while(MainPrincipal.isSistemaSecundario());
	}
}
