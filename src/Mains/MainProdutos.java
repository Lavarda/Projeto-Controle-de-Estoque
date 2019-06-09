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
					+ "4 - Listar todos os produtos \n "
					+ "5 - Voltar");
			try {
				MainPrincipal.setOpcaoSecundaria(Integer.parseInt(s.nextLine()));
				switch (MainPrincipal.getOpcaoSecundaria()) {
					case 1:
						funcionario.requisitarInclusaoProduto(produto);	
						MainPrincipal.setSistemaSecundario(true);
						break;
					case 2:
						funcionario.requisitarExclusaoProduto(produto);
						MainPrincipal.setSistemaSecundario(true);
						break;
					case 3:
						funcionario.requisitarAlteracaoProduto(produto);
						MainPrincipal.setSistemaSecundario(true);
						break;
					case 4:
						funcionario.requistarListagemProdutos(produto);
						break;
					case 5:
						MainFuncionario.main(args);
						break;
					default:
						System.out.println("OpÃ§Ã£o invalida!!");
						break;
				}
			}catch(NumberFormatException e){
				System.out.println("Valor inválido !!");
			}
		}while(MainPrincipal.isSistemaSecundario());
		
	}
}
