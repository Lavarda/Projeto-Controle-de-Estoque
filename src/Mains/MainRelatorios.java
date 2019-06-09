package Mains;

public class MainRelatorios extends MainFuncionario{
	public static void main(String[] args) {
		do {
				System.out.println("Digite a opção desejada: \n "
						+ "1 - Relatório de devoluções aos fornecedores \n "
						+ "2 - Relatório de itens recebidos pelo fornecedor \n "
						+ "3 - Relatório do estoque \n "
						+ "4 - NÃºmero de fornecedores de determinado estado \n "
						+ "5 - Usuários cadastrados de determinada cidade \n "
						+ "6 - Voltar");
				try {
					MainPrincipal.setOpcao(Integer.parseInt(s.nextLine()));
					switch ( MainPrincipal.getOpcaoSecundaria() ) {
						case 1:
							funcionario.requisitarRelatorioDevolucoes();
							break;
						case 2:
							funcionario.requisitarRelatoriosRecebiveis();
							break;
						case 3:
							funcionario.requisitarRelatorioEstoque();
							break;
						case 4:
							funcionario.requisitarRelatoriosFornecedores();
							break;
						case 5:
							funcionario.requisitarRelatoriosUsuarios();
							break;
						case 6:
							MainFuncionario.main(args);
							break;
						default:
							System.out.println("Opção invalida!!");
							break;
					}
				}catch(NumberFormatException e) {
					System.out.println("Valor inválido !!");
				}
			} while ( MainPrincipal.isSistemaSecundario());
	}
}
