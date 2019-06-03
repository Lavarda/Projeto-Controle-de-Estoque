package Implementacao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.*;
import java.io.*;

import Connections.ConnectionDB;

public class Usuario extends Pessoa{
	
	private Scanner s = new Scanner(System.in);
	static ConnectionDB db = new ConnectionDB();
	private java.util.Date dataAtual = new Date();
	private String dataFormatada = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(dataAtual);
	
	public Usuario(String nome,String email,String numeroCelular,
				   String cpf, String rg,String dataNascimento, String endereco, String sexo, String estadoCivil) {
		super(nome,email,numeroCelular,cpf,rg,dataNascimento,endereco,sexo,estadoCivil);
	}
	
	public void cadastrarUsuario() throws SQLException {
		ConnectionDB.Conectar();
		
		String sql = "insert into cadastro_usuario(cod_usuario,nome_usuario,dt_nascimento_usuario,email_usuario,cpf_usuario"
					  + ",rg_usuario,dt_cadastro_usuario,cod_funcionario) values(?,?,?,?,?,?,?,?)";
		
		PreparedStatement stm = ConnectionDB.preparedStament(sql);
		
		stm.setInt(1, 1);
		stm.setString(2, this.getNome() );
		stm.setString(3, this.getDataNascimento());
		stm.setString(4, this.getEmail());
		stm.setString(5, this.getCpf());
		stm.setString(6, this.getRg() );
		stm.setString(7, this.dataFormatada );
		stm.setInt(8, 1);
		
		ConnectionDB.runPreparedStatment(stm);
		ConnectionDB.Desconectar();
	}
		
	public void modifyUser() throws SQLException {
		ConnectionDB.Conectar();
		
		String sql = "update cadastro_usuario set ? = ? where ? = ?";
		
		PreparedStatement stm = ConnectionDB.preparedStament(sql);
		
		System.out.println("Digitar o nome da coluna que deseja modificar:");
		String column = s.nextLine();
		System.out.println("Digitar novo valor:");
		String modify = s.nextLine();
		System.out.println("Digitar a condição:");
		String condicion = s.nextLine();
		
		stm.setString(1, column);
		stm.setString(2, modify);
		stm.setString(3, column);
		stm.setString(4, condicion);
		
		System.out.println(stm);
		ConnectionDB.runPreparedStatment(stm);
		ConnectionDB.Desconectar();
	}
	
	public void deleteUser() throws SQLException {
		ConnectionDB.Conectar();
		
		String sql = "delete from cadastro_usuario where nome_usuario = ?";
		
		PreparedStatement stm = ConnectionDB.preparedStament(sql);
		
		stm.setString(1, this.getNome() );
		
		ConnectionDB.runPreparedStatment(stm);
		ConnectionDB.Desconectar();
	}
	
	public void produtosComprados(int codUsuario) throws SQLException {		
		ConnectionDB.Conectar();
		
		String sql = "select * from venda where cod_usuario = ?";
		PreparedStatement stm = ConnectionDB.preparedStament(sql);
		
		stm.setInt(1, codUsuario);
		
		ResultSet result = ConnectionDB.runPreparedSelect(stm);
		
		while( result.next() ) {
			System.out.println(result.getInt("cod_produto") + " " + result.getString("dt_compra_produto"));
		}
		
		
		ConnectionDB.Desconectar();
	}
	
	public void pesquisarProduto() throws SQLException{
		
		ConnectionDB.Conectar();
        
        System.out.println("Digite o nome do produto que deseja pesquisar: ");
        String nomeProduto = s.nextLine();
        
        String sql = "select * from produtos where nome_produto = ?";
        PreparedStatement stm = ConnectionDB.preparedStament(sql);
        
        stm.setString(1, nomeProduto);
        
        ResultSet result = ConnectionDB.runPreparedSelect(stm);
        
        while( result.next() ) {
        	System.out.println(result.getInt("cod_produto") + " " + result.getString("nome_produto") + " " + result.getFloat("preco_produto") + " " + result.getInt("cod_categoria"));
        }
        
        ConnectionDB.Desconectar();
        
    }
	
//	public static void main(String[] args) throws SQLException, IOException {
//		Usuario c = new Usuario("Vitor Lavarda","vitorlavarda.souza@gmail.com","(48) 9854-8350","123.123.13","11123123","21/02/20","Rua tal","M","Solteiro");
//		c.dadosPessoa();
//		c.produtosComprados(2);
//		c.pesquisarProduto();
//		c.cadastrarUsuario();
//		c.deleteUser();
//		c.modifyUser();
//	}
	
}
