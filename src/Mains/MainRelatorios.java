package Mains;

public class MainRelatorios extends MainFuncionario{
	public static void main(String[] args) {
		do {
				System.out.println("Digite a op��o desejada: \n "
						+ "1 - Relat�rio de devolu��es aos fornecedores \n "
						+ "2 - Relat�rio de itens recebidos pelo fornecedor \n "
						+ "3 - Relat�rio do estoque \n "
						+ "4 - Número de fornecedores de determinado estado \n "
						+ "5 - Usu�rios cadastrados de determinada cidade \n "
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
							System.out.println("Op��o invalida!!");
							break;
					}
				}catch(NumberFormatException e) {
					System.out.println("Valor inv�lido !!");
				}
			} while ( MainPrincipal.isSistemaSecundario());
	}
}
