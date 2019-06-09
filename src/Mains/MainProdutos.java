package Mains;

import Implementacao.Produtos;

public class MainProdutos extends MainFuncionario{
	public static void main(String[] args) {
		do {
			Produtos produto = new Produtos();
			System.out.println("Digite a opção desejada: \n "
					+ "1 - Adicionar um novo Produto \n "
					+ "2 - Excluir um produto \n "
					+ "3 - Editar um Produto \n "
					+ "4 - Voltar");
			MainPrincipal.setOpcaoSecundaria(s.nextInt());
			switch (MainPrincipal.getOpcaoSecundaria()) {
				case 1:
					funcionario.requisitarInclusaoProduto(produto);			 								
					break;
				case 2:
					funcionario.requisitarExclusaoProduto(produto);
					break;
				case 3:
					funcionario.requisitarAlteracaoProduto(produto);
					break;
				case 4:
					MainPrincipal.setSistemaSecundario(false);
					break;
				default:
					System.out.println("Opção invalida!!");
					break;
			}
		}while(MainPrincipal.isSistemaSecundario());
		
	}
}
