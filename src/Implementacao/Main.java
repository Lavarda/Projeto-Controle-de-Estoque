package Implementacao;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import Connections.ConnectionDB;
import interfaces.InterfacePrincipal;

public class Main {
	
	private static boolean sistema = true;
	private static int opcao;
	
	 public static void main(String[] args) throws SQLException {
		 
		 do {
			 switch (opcao) {
			 	case 1 : 
			 		Funcionario funcionario = new Funcionario("12312312" , "asdfdsadf","123123", Cargos.VENDEDOR, Categoria.NENHUMA);
			 		break;
			 	case 2 :
			 		Gerente gerente = new Gerente("1231231232","asdfasdfads","asdasdasda", Categoria.TODAS);
			 		break;
			 	case 3 :
			 		sistema = false;
			 }
		 } while ( sistema );
		 
		 // Inicializar interfaces
//		 new InterfacePrincipal().setVisible(true);		 
		 
		 // Metodos de exclusão e modificação estão via console abaixo o resto as interfaces fazem.
//		 Funcionario f = new Funcionario("1122330","Teste","123456",Cargos.GERENTE,Categoria.NENHUMA);
//		 f.requisitarExclusaoUsuario(new Usuario() );
//		 f.requisitarAlteracaoUsuario(new Usuario() );
//		 f.requisitarExclusaoProduto(new Produtos() );
//		 f.requisitarAlteracaoProduto(new Produtos() );
		 
		 // Relatorios do banco :
//		 Relatorios.estoqueInteiro();
//		 Relatorios.devolucoesFornecedor();
//		 Relatorios.numerosFornecedores("SC");
//		 Relatorios.recebidosFornecedor();
//		 Relatorios.usuariosCidade("Florianopolis");
	 }

}