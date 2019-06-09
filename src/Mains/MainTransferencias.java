package Mains;

import Implementacao.TransferenciaFiliais;
import Implementacao.TransferenciaFornecedor;

public class MainTransferencias extends MainFuncionario {
	public static void main(String[] args) {
		do {
			System.out.println("Digite a op��o desejada: \n "
					+ "1 - Trasferencias � filiais \n "
					+ "2 - Transferencias � fornecedores \n "
					+ "3 - Voltar");
			try {
				MainPrincipal.setOpcaoSecundaria((Integer.parseInt(s.nextLine())));
				 switch(MainPrincipal.getOpcaoSecundaria()) {
				 case 1:
					 TransferenciaFiliais transferenciaFil = new TransferenciaFiliais();
					 System.out.println("1 - Busca de Transferencia \n "
					 		+ "2 - Nova Transferencia \n "
					 		+ "3 - Hist�rico de Transferencias \n "
					 		+ "4 - Voltar");
					MainPrincipal.setOpcao(Integer.parseInt(s.nextLine()));
					 switch(MainPrincipal.getOpcaoSecundaria()) {
					 case 1:
						 funcionario.requisitarBuscaTransferenciasFiliais(transferenciaFil);
						 break;
					 case 2:
						 if(funcionario.realizarAutenticacao() == true) {
							 funcionario.requisitarTransferenciaFiliais(transferenciaFil);
						 }
						 break;
					 case 3: 
						 funcionario.requisitarhistoricoTransferenciasFiliais(transferenciaFil);
						break;
					 case 4:
						 MainTransferencias.main(args);
						 break;
					 default:
		 				System.out.println("Op��o invalida!!");
		 				MainPrincipal.setSistemaSecundario(false);
		 				 break;
				 }
				 break;
			 case 2:
				 TransferenciaFornecedor transferenciaForn = new TransferenciaFornecedor();
				 System.out.println(" 1 - Busca de Transferencia \n "
				 		+ "2 - Nova Transferencia \n "
				 		+ "3 - Historico de Transferencias \n "
				 		+ "4 - Voltar");
				 MainPrincipal.setOpcaoSecundaria(s.nextInt());
				 switch(MainPrincipal.getOpcaoSecundaria()) {
					 case 1:
						 funcionario.requisitarbuscaTransferenciasFornecedor(transferenciaForn);
						 break;
					 case 2:
						 if(funcionario.realizarAutenticacao() == true) {
							 funcionario.requisitarTransferenciaFornececedor(transferenciaForn);
						 }
						 break;
					 case 3: 
						 funcionario.requisitarhistoricoTransferenciasFornecedores(transferenciaForn);
						 break;
					 case 4:
						 MainTransferencias.main(args);
					 default:
		 				System.out.println("Op��o invalida!!");
						 MainPrincipal.setSistemaSecundario(false);
		 				 break;
				 }
				 break;
			 case 3:
				 MainFuncionario.main(args);
				 break;
			 default:
				 System.out.println("Op��o invalida!!");
				 MainPrincipal.setSistemaSecundario(false);
				 break;
			}
			}catch(NumberFormatException e) {
				System.out.println("Valor invalido!!");
			}
		}while(MainPrincipal.isSistemaSecundario());
	}
}
