package Implementacao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class Fornecedor{
	
	private Scanner s = new Scanner(System.in);
	private ConnectionDB db = new ConnectionDB();
	private String nomeFornecedor;
	private String produtoFornecido;
	private String dataEntrega;
	private String cnpjForncedor;
	
	public Fornecedor(String nomeFornecedor, String produtoFornecido, String dataEntrega, String cnpjFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
		this.produtoFornecido = produtoFornecido;
		this.dataEntrega = dataEntrega;
		this.cnpjForncedor = cnpjFornecedor;
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
	
	public int cadastrarCategoria(String nmCat) throws SQLException {
		
		int count = 1;
		String sql_verify = "select cod_categoria from categoria_produtos";
		ResultSet result = db.SelectQuery(sql_verify);
		while ( result.next() ) {
			count = count + 1;
		}
		
		System.out.println("Nome da categoria a ser inserida: " + nmCat);
		
		String sql = "insert into categoria_produtos(cod_categoria , nome_categoria) values(?,?)";
		PreparedStatement stm = db.preparedStament(sql);
		stm.setInt(1, count + 1);
		stm.setString(2, nmCat);
		db.runPreparedStatment(stm);
		
		return (count + 1);
	}
	
	public ResultSet verificarProduto(String nm) throws SQLException {
		String sqlVerify = "select nome_produto from produtos where nome_produto = ?";
		PreparedStatement stmVerify = db.preparedStament(sqlVerify);
		stmVerify.setString(1, nm);
		ResultSet result = db.runPreparedSelect(stmVerify);
		
		return result;
	}
	
	public int categoriaProduto(String nomeCategoria) throws SQLException {

		int codCategoria = 0;
		System.out.println("Categoria : " + nomeCategoria);
		
		String sql = "select cod_categoria from categoria_produtos where nome_categoria = ?";
		PreparedStatement stm = db.preparedStament(sql);
		stm.setString(1, nomeCategoria);
		ResultSet result = db.runPreparedSelect(stm);
		while( result.next() ) {
			codCategoria = result.getInt("cod_categoria");
		}
		
		return codCategoria;
		
	}
	
	public void inserirProduto(String nm, Float pc, int codC, String nmCat) throws SQLException {
		ResultSet result = verificarProduto(nm);
		
		if ( result.next() ) {
			System.out.println("Produto já está cadastrado");
			return;
		} else {
			
			String sql = "insert into produtos(nome_produto,preco_produto,cod_categoria) values(?,?,?)";
			PreparedStatement stm = db.preparedStament(sql);
			stm.setString(1, nm);
			stm.setFloat(2, pc);
			
			if ( codC == 0 ) {
				int newCod = cadastrarCategoria(nmCat);
				System.out.println("new codigo" + newCod);
				stm.setInt(3, newCod);
			} else { 				
				stm.setInt(3, codC);
			}
			
			db.runPreparedStatment(stm);
			
			System.out.println("Produto cadastrado com sucesso");
		}
	
	}
	
	public void envioProduto() throws SQLException {
		db.Conectar();
		
		System.out.println("Nome do produto a ser enviado: ");
		String nomeProduto = s.nextLine();
		System.out.println("Preço do produto: ");
		Float precoProduto = s.nextFloat(); 
		System.out.println("Nome da categoria:");
		String nomeCategoria = s.nextLine();
		nomeCategoria = s.nextLine();

		int codCategoria = categoriaProduto(nomeCategoria);
		
		inserirProduto(nomeProduto,precoProduto,codCategoria,nomeCategoria);

		db.Desconectar();
	}
	
//	public static void main(String args[]) throws SQLException {
//		Fornecedor c = new Fornecedor("Nome Fornecedor","Produto Fornecido","Data entrega","Cnpj Fornecedor");
//		c.envioProduto();
//	}
	
}
