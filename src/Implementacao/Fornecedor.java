package Implementacao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import Connections.ConnectionDB;

public class Fornecedor{
	
	private Scanner s = new Scanner(System.in);
	private String nomeFornecedor;
	private String produtoFornecido;
	private String dataEntrega;
	private String cnpjForncedor;
	private String emailFornecedor;
	private String telefoneFornecedor;
	private String cepFornecedor;
	private String cidadeFornecedor;
	private String bairroFornecedor;
	private String estadoFornecedor;
	private int numeroLoja;
	
	public Fornecedor(String nomeFornecedor, String produtoFornecido, String dataEntrega, String cnpjFornecedor, String emailFornecedor, String telefoneFornecedor,
					  String cepFornecedor, String cidadeFornecedor,String bairroFornecedor, String estadoFornecedor, int numeroLoja) {
		
		this.nomeFornecedor = nomeFornecedor;
		this.produtoFornecido = produtoFornecido;
		this.dataEntrega = dataEntrega;
		this.cnpjForncedor = cnpjFornecedor;
		this.emailFornecedor = emailFornecedor;
		this.telefoneFornecedor = telefoneFornecedor;
		this.cepFornecedor = cepFornecedor;
		this.cidadeFornecedor = cidadeFornecedor;
		this.bairroFornecedor = bairroFornecedor;
		this.estadoFornecedor = estadoFornecedor;
		this.numeroLoja = numeroLoja;
	}

	public String getNomeFornecedor() {
		return nomeFornecedor;
	}

	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}

	public String getProdutoFornecido() {
		return produtoFornecido;
	}

	public void setProdutoFornecido(String produtoFornecido) {
		this.produtoFornecido = produtoFornecido;
	}

	public String getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(String dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public String getCnpjForncedor() {
		return cnpjForncedor;
	}

	public void setCnpjForncedor(String cnpjForncedor) {
		this.cnpjForncedor = cnpjForncedor;
	}
	
	public String getEmailFornecedor() {
		return emailFornecedor;
	}

	public void setEmailFornecedor(String emailFornecedor) {
		this.emailFornecedor = emailFornecedor;
	}

	public String getTelefoneFornecedor() {
		return telefoneFornecedor;
	}

	public void setTelefoneFornecedor(String telefoneFornecedor) {
		this.telefoneFornecedor = telefoneFornecedor;
	}

	public String getCepFornecedor() {
		return cepFornecedor;
	}

	public void setCepFornecedor(String cepFornecedor) {
		this.cepFornecedor = cepFornecedor;
	}

	public String getCidadeFornecedor() {
		return cidadeFornecedor;
	}

	public void setCidadeFornecedor(String cidadeFornecedor) {
		this.cidadeFornecedor = cidadeFornecedor;
	}

	public String getBairroFornecedor() {
		return bairroFornecedor;
	}

	public void setBairroFornecedor(String bairroFornecedor) {
		this.bairroFornecedor = bairroFornecedor;
	}

	public String getEstadoFornecedor() {
		return estadoFornecedor;
	}

	public void setEstadoFornecedor(String estadoFornecedor) {
		this.estadoFornecedor = estadoFornecedor;
	}

	public int getNumeroLoja() {
		return numeroLoja;
	}

	public void setNumeroLoja(int numeroLoja) {
		this.numeroLoja = numeroLoja;
	}

	public int cadastrarCategoria(String nmCat){
		
		int count = 1;
		String sql_verify = "select cod_categoria from categoria";		
		String sql = "insert into categoria(cod_categoria , nome_categoria) values(?,?)";
		try {
			ConnectionDB.Conectar();
			System.out.println("Nome da categoria a ser inserida: " + nmCat);
			PreparedStatement stm = ConnectionDB.preparedStament(sql);
			ResultSet result = ConnectionDB.SelectQuery(sql_verify);
			while ( result.next() ) {
				count = count + 1;
			}
			stm.setInt(1, count + 1);
			stm.setString(2, nmCat);
			ConnectionDB.runPreparedStatment(stm);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionDB.Desconectar();
			
		}
		return (count + 1);		
	}
	
	public ResultSet verificarProduto(String nm){
		ResultSet result = null;
		String sqlVerify = "select nome_produto from produtos where nome_produto = ?";
		PreparedStatement stmVerify = ConnectionDB.preparedStament(sqlVerify);
		try {
			ConnectionDB.Conectar();
			stmVerify.setString(1, nm);
			result = ConnectionDB.runPreparedSelect(stmVerify);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			ConnectionDB.Desconectar();
		}
		return result;		
	}
	
	public int categoriaProduto(String nomeCategoria){
		ResultSet result = null;
		int codCategoria = 0;
		String sql = "select cod_categoria from categoria where nome_categoria = ?";
		try {
			ConnectionDB.Conectar();
			System.out.println("Categoria : " + nomeCategoria);
			PreparedStatement stm = ConnectionDB.preparedStament(sql);
			stm.setString(1, nomeCategoria);
			result = ConnectionDB.runPreparedSelect(stm);
			while( result.next() ) {
				codCategoria = result.getInt("cod_categoria");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionDB.Desconectar();
		}		
		return codCategoria;
		
	}
	
	public void inserirProduto(String nm, Float pc, int codC, String nmCat){
		ResultSet result = null;
		try {
			ConnectionDB.Conectar();
			result = verificarProduto(nm);
			if ( result.next() ) {
				System.out.println("Produto já está cadastrado");
				return;
			} else {
				
				String sql = "insert into produtos(nome_produto,preco_produto,cod_categoria) values(?,?,?)";
				PreparedStatement stm = ConnectionDB.preparedStament(sql);
				stm.setString(1, nm);
				stm.setFloat(2, pc);
				
				if ( codC == 0 ) {
					int newCod = cadastrarCategoria(nmCat);
					System.out.println("new codigo" + newCod);
					stm.setInt(3, newCod);
				} else { 				
					stm.setInt(3, codC);
				}
				ConnectionDB.runPreparedStatment(stm);
				System.out.println("Produto cadastrado com sucesso");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionDB.Desconectar();
		}	
	}
	
	public void envioProduto(){
		System.out.println("Nome do produto a ser enviado: ");
		String nomeProduto = s.nextLine();
		System.out.println("Preço do produto: ");
		Float precoProduto = s.nextFloat(); 
		System.out.println("Nome da categoria:");
		String nomeCategoria = s.nextLine();
		nomeCategoria = s.nextLine();
		int codCategoria = categoriaProduto(nomeCategoria);
		inserirProduto(nomeProduto,precoProduto,codCategoria,nomeCategoria);
	}	
	
	public void newFornecedor(){
		String sql = "insert into fornecedor_table(nome_fornecedor,cnpj_fornecedor,email_fornecedor,telefone_fornecedor,"
					+ "cep_fornecedor,cidade_fornecedor,bairro_fornecedor,estado_fornecedor,numero_loja_fornecedor) values(?,?,?,?,?,?,?,?,?)";
		try {
			ConnectionDB.Conectar();
			PreparedStatement stm = ConnectionDB.preparedStament(sql);
			stm.setString(1, this.getNomeFornecedor() );
			stm.setString(2, this.getCnpjForncedor() );
			stm.setString(3, this.getEmailFornecedor() );
			stm.setString(4, this.getTelefoneFornecedor() );
			stm.setString(5, this.getCepFornecedor() );
			stm.setString(6, this.getCidadeFornecedor() );
			stm.setString(7, this.getBairroFornecedor() );
			stm.setString(8, this.getEstadoFornecedor() );
			stm.setInt(9, this.getNumeroLoja() );
			ConnectionDB.runPreparedStatment(stm);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionDB.Desconectar();
		}
	}
	
	public void editFornecedor() {
		
	}
	
	public void removeFornecedor() {
		String sql = "delete from fornecedor_table where nome_fornecedor = ?";
		try {
			ConnectionDB.Conectar();
			System.out.println("Digite o nome do fornecedor que deseja excluir : ");
			String nome = s.nextLine();
			PreparedStatement stm = ConnectionDB.preparedStament(sql);
			stm.setString(1, nome);
			ConnectionDB.runPreparedStatment(stm);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			ConnectionDB.Desconectar();

		}
	}
	
	public static void main(String args[]) throws SQLException {

		Fornecedor c = new Fornecedor("Nome Fornecedor","Produto Fornecido","Data entrega","Cnpj Fornecedor",
					 "vitorlavarda@gmail.com","48 998548350","88070150","Florianopolis","Estreito","SC",120);
//		c.envioProduto();
//		c.newFornecedor();
		c.removeFornecedor();
	}
	
}
