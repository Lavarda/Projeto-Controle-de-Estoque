package Mains;

import Implementacao.Usuario;

public class MainUsuarios extends MainFuncionario {
	public static void main(String[] args) {
		do {
			Usuario usuario = new Usuario();
			System.out.println("Digite a op��oo desejada: \n "
						+ "1 - Adicionar um novo usu�rio \n "
						+ "2 - Modificar um usu�rio \n "
						+ "3 - Excluir um usu�rio \n "
						+ "4 - Verificar todos produtos comprados \n "
						+ "5 - Voltar");
			try {
				MainPrincipal.setOpcaoSecundaria(Integer.parseInt(s.nextLine()));
				switch (MainPrincipal.getOpcaoSecundaria()) {
					case 1:
						funcionario.requisitarInclusaoUsuario(usuario);			
					case 2:
						funcionario.requisitarAlteracaoUsuario(usuario);
					case 3:
						funcionario.requisitarExclusaoUsuario(usuario);
					case 4:
						funcionario.requisitarHistorioCompras(usuario);
					case 5:
						MainFuncionario.main(args);
						break;
					default:
						System.out.println("Op��o invalida!!");
						MainPrincipal.setSistemaSecundario(false);
						break;
				}
			}catch(NumberFormatException e) {
				System.out.println("Valor inv�lido !!");
			}
		}while(MainPrincipal.isSistemaSecundario());
	}
}
