package Implementacao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.*;

import Connections.ConnectionDB;

public class Usuario extends Pessoa{
	
	private Scanner s = new Scanner(System.in);
	private java.util.Date dataAtual = new Date();
	private String dataFormatada = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(dataAtual);
	
	
	public Usuario() {	
	}
	
	public Usuario(String nome,String dataNascimento,String email,String cpf,
				   String rg,String numeroCelular,
				   String endereco, String sexo, String estadoCivil) 
	{
		super(nome,email,numeroCelular,cpf,rg,dataNascimento,endereco,sexo,estadoCivil);
	}
		
	public void cadastrarUsuario(){
		String sql = "insert into usuario_table(nome_usuario,dt_nascimento,email_usuario,sexo_usuario"
				   + ",estado_civil,cpf_usuario,rg_usuario,dt_cadastro,telefone_usuario,cep_usuario,cidade_usuario,bairro_usuario,estado_usuario,numero_residencia_usuario) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			ConnectionDB.Conectar();
			PreparedStatement stm = ConnectionDB.preparedStament(sql);
			System.out.println("Digite o nome do usu·rio que deseja cadastrar: ");
			String nomeUsuario = s.nextLine();
			System.out.println("Digite a data de nascimento do usu·rio que deseja cadastrar: ");
			String dataNascimento = s.nextLine();
			System.out.println("Digite o email do usu·rio que deseja cadastrar: ");
			String emailUsuario = s.nextLine();
			System.out.println("Digite o sexo do usu·rio que deseja cadastrar: ");
			String sexoUsuario = s.nextLine();
			System.out.println("Digite o estado civil do usu·rio que deseja cadastrar: ");
			String estadoCivilUsuario = s.nextLine();
			System.out.println("Digite o cpf do usu·rio que deseja cadastrar: ");
			String cpfUsuario = s.nextLine();
			System.out.println("Digite o rg do usu·rio que deseja cadastrar: ");
			String rgUsuario = s.nextLine();
			String dataCadastro = this.dataFormatada;
			System.out.println("Digite o telefone do usu·rio que deseja cadastrar: ");
			String telefoneUsuario = s.nextLine();
			System.out.println("Digite o cep do usu√°rio que deseja cadastrar: ");
			String cepUsuario = s.nextLine();
			System.out.println("Digite o cidade do usu·rio que deseja cadastrar: ");
			String cidadeUsuario = s.nextLine();
			System.out.println("Digite o bairro do usu·rio que deseja cadastrar: ");
			String bairroUsuario = s.nextLine();
			System.out.println("Digite o estado do usu·rio que deseja cadastrar: ");
			String estadoUsuario = s.nextLine();
			System.out.println("Digite o numero da residencia do usu·rio que deseja cadastrar: ");
			int numeroResidenciaUsuario = Integer.parseInt(s.nextLine());
			
			stm.setString(1, nomeUsuario);
			stm.setString(2, dataNascimento);
			stm.setString(3, emailUsuario);
			stm.setString(4, sexoUsuario);
			stm.setString(5, estadoCivilUsuario);
			stm.setString(6, cpfUsuario);
			stm.setString(7, rgUsuario);
			stm.setString(8, dataCadastro);
			stm.setString(9, telefoneUsuario);
			stm.setString(10, cepUsuario);
			stm.setString(11,cidadeUsuario);
			stm.setString(12, bairroUsuario);
			stm.setString(13, estadoUsuario);
			stm.setInt(14, numeroResidenciaUsuario);
			ConnectionDB.runPreparedStatment(stm);
		} catch (SQLException | NumberFormatException e) {
			System.out.println("Erro ao cadastrar usuario" + e);
		}finally{
			ConnectionDB.Desconectar();
		}
	}
		
	public void modificaUsuario(){
		String sql = "UPDATE usuario_table SET email_usuario=? WHERE cpf_usuario=?";		
		try {
			ConnectionDB.Conectar();
			System.out.println("Cpf que deseja alterar o email:");
			String cpf = s.nextLine(); 
			System.out.println("Novo email:");
			String email = s.nextLine(); 
			PreparedStatement stm = ConnectionDB.preparedStament(sql);
			stm.setString(1, email);
			stm.setString(2, cpf);
			ConnectionDB.runPreparedStatment(stm);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionDB.Desconectar();
		}
	}
	
	public void deletarUsuario(){		
		String sql = "delete from usuario_table where nome_usuario = ?";
		try {
			ConnectionDB.Conectar();
			System.out.println("Nome do usuario que deseja excluir:");
			String nome = s.nextLine(); 
			PreparedStatement stm = ConnectionDB.preparedStament(sql);
			stm.setString(1, nome);
			ConnectionDB.runPreparedStatment(stm);
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
		
	public void pesquisarProduto(){
        String sql = "select * from produtos where nome_produto = ?";
        
        try {
        	ConnectionDB.Conectar();
            System.out.println("Digite o nome do produto que deseja pesquisar: ");
            String nomeProduto = s.nextLine();
            PreparedStatement stm = ConnectionDB.preparedStament(sql);
			stm.setString(1, nomeProduto);
			 ResultSet result = ConnectionDB.runPreparedSelect(stm);
			 while( result.next() ) {
		        	System.out.println(result.getInt("cod_produto") + " " + result.getString("nome_produto") + " " + result.getFloat("preco_produto") + " " + result.getInt("cod_categoria"));
		        }
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
	        ConnectionDB.Desconectar();

		}  
	}	
}
