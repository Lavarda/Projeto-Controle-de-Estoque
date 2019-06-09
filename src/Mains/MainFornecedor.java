package Mains;

import Implementacao.Fornecedor;

public class MainFornecedor extends MainFuncionario{
	public static void main(String[] args) {
		do {
				Fornecedor fornecedor = new Fornecedor();
				System.out.println("Digite a op��o desejada: \n "
						+ "1 - Adicionar um novo Fornecedor \n "
						+ "2 - Excluir um Fornecedor \n "
						+ "3 - Voltar");
				try {
					MainPrincipal.setOpcaoSecundaria(Integer.parseInt(s.nextLine()));
					switch (MainPrincipal.getOpcaoSecundaria()) {
						case 1:
							funcionario.requisitarInclusaoFornecedor(fornecedor);
							break;
						case 2:
							funcionario.requisitarExclusaoFornecedor(fornecedor);
							break;
						case 3:
							MainFuncionario.main(args);
							break;
						default:
							System.out.println("Op��o invalida!!");
							break;
						}
				}catch(NumberFormatException e) {
					System.out.println("Valor inv�lido !!");
				}
			} while (MainPrincipal.isSistemaSecundario());
	}
}
