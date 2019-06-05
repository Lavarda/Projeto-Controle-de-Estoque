package Implementacao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.*;

import Connections.ConnectionDB;

public class Usuario extends Pessoa{
	//Somente para realizar commit esse comentário
	private java.util.Date dataAtual = new Date();
	private String dataFormatada = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(dataAtual);
	
	
	public Usuario(String nome,String dataNascimento,String email,String cpf,
				   String rg,String numeroCelular,
				   String endereco, String sexo, String estadoCivil) 
	{
		super(nome,email,numeroCelular,cpf,rg,dataNascimento,endereco,sexo,estadoCivil);
	}
		
	public void cadastrarUsuario(Funcionario f){
		String sql = "insert into cadastro_usuario(nome_usuario,dt_nascimento_usuario,email_usuario,cpf_usuario"
				   + ",rg_usuario,dt_cadastro_usuario,cod_funcionario) values(?,?,?,?,?,?,?,?)";
		try {
			ConnectionDB.Conectar();
			PreparedStatement stm = ConnectionDB.preparedStament(sql);
			stm.setString(2, this.getNome() );
			stm.setString(3, this.getDataNascimento());
			stm.setString(4, this.getEmail());
			stm.setString(5, this.getCpf());
			stm.setString(6, this.getRg() );
			stm.setString(7, this.dataFormatada);
			stm.setInt(8,f.buscarCodFuncionario());
			ConnectionDB.runPreparedStatment(stm);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			ConnectionDB.Desconectar();
		}
	}
		
	public void modificaUsuario(){
		String sql = "UPDATE cadastro_usuario SET nome_usuario=?, dt_nascimento_usuario=?,email_usuario=?,cpf_usuario=?"
				+ "rg_usuario=? WHERE cpf_usuario=?";		
		try {
			ConnectionDB.Conectar();
			PreparedStatement stm = ConnectionDB.preparedStament(sql);
			stm.setString(1, this.getNome());
			stm.setString(2,this.getDataNascimento());
			stm.setString(3,this.getEmail());
			stm.setString(4,this.getCpf());
			stm.setString(5, this.getRg());
			ConnectionDB.runPreparedStatment(stm);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionDB.Desconectar();
		}
	}
	
	public void deletarUsuario(){		
		String sql = "delete from cadastro_usuario where nome_usuario = ?";
		try {
			ConnectionDB.Conectar();
			PreparedStatement stm = ConnectionDB.preparedStament(sql);
			stm.setString(1, this.getNome());
		}catch(SQLException e) {
			e.printStackTrace();
		}finally{
			ConnectionDB.Desconectar();
		}
}
	
	public void produtosComprados(){
		List<Integer> listaCodProdutos = new ArrayList<Integer>();
		List<String> ListaDataCompraProdutos = new ArrayList<String>();
		try {
			ConnectionDB.Conectar();
			String sql = "select * from venda where cpf_usuario = ?";
			PreparedStatement stm = ConnectionDB.preparedStament(sql);
			stm.setString(1, this.getCpf());
			ResultSet result = ConnectionDB.runPreparedSelect(stm);
			while( result.next() ) {
			listaCodProdutos.add(result.getInt("cod_produto"));
			ListaDataCompraProdutos.add(result.getString("dt_compra_produto"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionDB.Desconectar();
		}	
	}
	
//VERIFICAR ESTE METODO POIS NÃO CONDIZ COM A PROPOSTA DESTA CLASSE
	
	/*public void pesquisarProduto() throws SQLException{
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
        
	}*/	
}
