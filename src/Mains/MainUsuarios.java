package Mains;

import Implementacao.Usuario;

public class MainUsuarios extends MainFuncionario {
	public static void main(String[] args) {
		do {
			Usuario usuario = new Usuario();
			System.out.println("Digite a opçãoo desejada: \n "
						+ "1 - Adicionar um novo usuário \n "
						+ "2 - Modificar um usuário \n "
						+ "3 - Excluir um usuário \n "
						+ "4 - Verificar todos produtos comprados \n "
						+ "5 - Voltar");
			try {
				MainPrincipal.setOpcao(Integer.parseInt(s.nextLine()));
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
					default:
						System.out.println("Opção invalida!!");
						MainPrincipal.setSistemaSecundario(false);
						break;
				}
			}catch(NumberFormatException e) {
				System.out.println("Valor inválido !!");
			}
		}while(MainPrincipal.isSistemaSecundario());
	}
}
