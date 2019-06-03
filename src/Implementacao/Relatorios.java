package Implementacao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Connections.ConnectionDB;

public class Relatorios {
	
	public static void devolucoesFornecedor(){
		// Produtos devolvidos do fornecedor
		ConnectionDB.Conectar();
		String sql = "select nome_fornecedor,dt_saida_produto,nome_produto,preco_produto from transferencia_fornecedor tf inner join fornecedor f on (tf.cod_fornecedor = f.cod_fornecedor) join produtos p on (tf.cod_produto = p.cod_produto );";
		PreparedStatement stm = ConnectionDB.preparedStament(sql);
		try {
			ResultSet result = ConnectionDB.runPreparedSelect(stm);
			System.out.println("Produtos enviados pelo fornecedor : ");
			
			while( result.next() ) {
				System.out.println(result.getString("nome_fornecedor") + " " + result.getString("dt_saida_produto") + " " + result.getString("nome_produto") + " " + result.getFloat("preco_produto"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ConnectionDB.Desconectar();
	}
	
	public static void recebidosFornecedor() {
		// Produtos recebidos do fornecedor
		ConnectionDB.Conectar();
		String sql = "select nome_fornecedor,dt_entrada_produto,nome_produto,preco_produto from entrada tf inner join fornecedor f on (tf.cod_fornecedor = f.cod_fornecedor) join produtos p on (tf.cod_produto = p.cod_produto )";
		PreparedStatement stm = ConnectionDB.preparedStament(sql);
		try {
			ResultSet result = ConnectionDB.runPreparedSelect(stm);
			System.out.println("Produtos recebidos do fornecedor : ");
			while( result.next() ) {
				System.out.println(result.getString("nome_fornecedor") + " " + result.getString("dt_entrada_produto") + " " + result.getString("nome_produto") + " " + result.getFloat("preco_produto"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ConnectionDB.Desconectar();
	}
	
	public static void estoqueInteiro() {
		// Mostrar todos os produtos e suas categorias
		ConnectionDB.Conectar();
		String sql = "select nome_produto,nome_categoria from produtos p full outer join categoria c on (p.cod_categoria = c.cod_categoria);";
		PreparedStatement stm = ConnectionDB.preparedStament(sql);
		try{
			ResultSet result = ConnectionDB.runPreparedSelect(stm);
			System.out.println("Todos os produtos em estoque");
			while( result.next() ) {
				System.out.println(result.getString("nome_produto") + " " + result.getString("nome_categoria"));
			}
		} catch ( SQLException e) {
			e.printStackTrace();
		}
		ConnectionDB.Desconectar();
	}
	
	public static void numerosFornecedores(String estado) throws SQLException{
		// Todos os fornecedores do estado que você passar 
		ConnectionDB.Conectar();
		String sql = "select estado_usuario from endereco_usuario where estado_usuario = 'SC' UNION ALL select estado_fornecedor from endereco_fornecedor where estado_fornecedor = ?;";
		PreparedStatement stm = ConnectionDB.preparedStament(sql);
		stm.setString(1, estado);

		try{
			ResultSet result = ConnectionDB.runPreparedSelect(stm);
			System.out.println("Todos os fornecedores do estado fornecido");
			while( result.next() ) {
				System.out.println(result.getString("estado_usuario"));
			}
		} catch ( SQLException e) {
			e.printStackTrace();
		}
		ConnectionDB.Desconectar();
	}
	
		
	public static void usuariosCidade(String cidade) throws SQLException{
		// Todos os usuarios cadastrados de tal cidade 
		ConnectionDB.Conectar();
		String sql = "select nome_usuario from cadastro_usuario where cod_usuario in (select cod_usuario from endereco_usuario where cidade_usuario = ?);";
		PreparedStatement stm = ConnectionDB.preparedStament(sql);
		stm.setString(1, cidade);

		try{
			ResultSet result = ConnectionDB.runPreparedSelect(stm);
			System.out.println("Todos os fornecedores do estado fornecido");
			while( result.next() ) {
				System.out.println(result.getString("nome_usuario"));
			}
		} catch ( SQLException e) {
			e.printStackTrace();
		}
		ConnectionDB.Desconectar();
	}
	
}
