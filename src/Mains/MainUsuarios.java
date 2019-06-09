package Mains;

import Implementacao.Usuario;

public class MainUsuarios extends MainFuncionario {
	public static void main(String[] args) {
		do {
			Usuario usuario = new Usuario();
			System.out.println("Digite a opção desejada: \n "
						+ "1 - Adicionar um novo usuário \n "
						+ "2 - Modificar um usuário \n "
						+ "3 - Excluir um usuário \n "
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
					System.out.println("Opção invalida!!");
					break;
			}
		}while(MainPrincipal.isSistemaSecundario());
	}
}
