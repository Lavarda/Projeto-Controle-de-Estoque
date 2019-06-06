package Implementacao;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import Connections.ConnectionDB;
import interfaces.InterfacePrincipal;

public class Main {
	
	
	 public static void main(String[] args) throws SQLException {
		 
		 // Inicializar interfaces
		 new InterfacePrincipal().setVisible(true);		 
		 
		 // Metodos de exclusão e modificação estão via console abaixo o resto as interfaces fazem.
		 Funcionario f = new Funcionario("1122330","Teste","123456",Cargos.GERENTE,Categoria.NENHUMA);
		 f.requisitarExclusaoUsuario(new Usuario() );
		 f.requisitarAlteracaoUsuario(new Usuario() );
		 f.requisitarExclusaoProduto(new Produtos() );
		 f.requisitarAlteracaoProduto(new Produtos() );
		 
		 // Relatorios do banco :
		 Relatorios.estoqueInteiro();
		 Relatorios.devolucoesFornecedor();
		 Relatorios.numerosFornecedores("SC");
		 Relatorios.recebidosFornecedor();
		 Relatorios.usuariosCidade("Florianopolis");
	 }

}