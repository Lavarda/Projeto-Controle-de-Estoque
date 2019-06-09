package Mains;

import java.util.Scanner;

public class MainPrincipal {
	private static boolean sistema = true;
	private static boolean sistemaSecundario = true;
	private static int opcao;
	private static int opcaoSecundaria;
	protected static Scanner s = new Scanner(System.in);
	
	public static boolean isSistema() {
		return sistema;
	}
	public static void setSistema(boolean sistema) {
		MainPrincipal.sistema = sistema;
	}
	public static boolean isSistemaSecundario() {
		return sistemaSecundario;
	}
	public static void setSistemaSecundario(boolean sistemaSecundario) {
		MainPrincipal.sistemaSecundario = sistemaSecundario;
	}
	public static int getOpcao() {
		return opcao;
	}
	public static void setOpcao(int opcao) {
		MainPrincipal.opcao = opcao;
	}
	public static int getOpcaoSecundaria() {
		return opcaoSecundaria;
	}
	public static void setOpcaoSecundaria(int opcaoSecundaria) {
		MainPrincipal.opcaoSecundaria = opcaoSecundaria;
	}	
	
	public static void main(String[] args) {
		
		do {
			System.out.println("Você deseja logar como : \n "
			 		+ "1 - Funcionario \n "
			 		+ "2 - Gerente \n "
			 		+ "3 - Sair");
			 opcao = s.nextInt();
			 switch(opcao) {
			 case 1:
				 MainFuncionario.main(args);
				 break;
			 case 2:
				 MainGerente.main(args);
				 break;
			 case 3:
				 sistema = false;
			 default:
				 System.out.println("Op��o Inv�lida!!");
				 sistema = false; 
			 }
		}while(sistema);
	}
}
