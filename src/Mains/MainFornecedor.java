package Mains;

import Implementacao.Fornecedor;

public class MainFornecedor extends MainFuncionario{
	public static void main(String[] args) {
		do {
				Fornecedor fornecedor = new Fornecedor();
				System.out.println("Digite a opção desejada: \n "
						+ "1 - Adicionar um novo Fornecedor \n "
						+ "2 - Excluir um Fornecedor \n "
						+ "3 - Voltar");
				MainPrincipal.setOpcaoSecundaria(s.nextInt());
				switch (MainPrincipal.getOpcaoSecundaria()) {
					case 1:
						funcionario.requisitarInclusaoFornecedor(fornecedor);
						break;
					case 2:
						funcionario.requisitarExclusaoFornecedor(fornecedor);
						break;
					case 3:
						MainPrincipal.setSistemaSecundario(false);
						break;
					default:
						System.out.println("Opção invalida!!");
						break;
					}
			} while (MainPrincipal.isSistemaSecundario());
	}
}
