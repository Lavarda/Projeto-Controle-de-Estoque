package Implementacao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Connections.ConnectionDB;

public class Transferencia {
	
	private ConnectionDB db = new ConnectionDB();
	private int codTransferencia;
	private int codProduto ;
	private int codFornecedor;
	private int codFilial;
	private String dataSaida;
	
	public Transferencia() {
		
	}
	
	public Transferencia(int codTransferencia, int codProduto, int codFornecedor, String dataSaida) {
		this.codTransferencia = codTransferencia ;
		this.codProduto = codProduto; 
		this.codFornecedor = codFornecedor;
		this.dataSaida = dataSaida;
	}
	
	public Transferencia(int codTransferencia, int codProduto,String dataSaida,int codFilial) {
		this.codTransferencia = codTransferencia ;
		this.codProduto = codProduto; 
		this.codFilial = codFilial;
		this.dataSaida = dataSaida;
	}
	
	public int getCodTransferencia() {
		return codTransferencia;
	}

	public void setCodTransferencia(int codTransferencia) {
		this.codTransferencia = codTransferencia;
	}

	public int getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}

	public int getCodFornecedor() {
		return codFornecedor;
	}

	public void setCodFornecedor(int codFornecedor) {
		this.codFornecedor = codFornecedor;
	}

	public int getCodFilial() {
		return codFilial;
	}

	public void setCodFilial(int codFilial) {
		this.codFilial = codFilial;
	}

	public String getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}
	
	public void mostrarTransferencia() {
		System.out.println(this.getCodTransferencia() + " " + this.getCodProduto() + " " +
						   this.getCodFornecedor() + " " + this.getCodFilial() + " " + this.getDataSaida() );
	}
	
	public void buscaTransferenciaFiliais(int codTransferencia) throws SQLException {
		// Busca de transferencia para filiais
		db.Conectar();
		String qr = "select * from transferencia_filial where cod_transferencia = ?";
		PreparedStatement stm = db.preparedStament(qr);
		
		stm.setInt(1, codTransferencia);
		
		ResultSet result = db.runPreparedSelect(stm);
		while ( result.next() ) {
			Transferencia transf = new Transferencia(result.getInt("cod_transferencia"),result.getInt("cod_produto"), result.getInt("cod_filial"), result.getString("dt_saida_produto_transferencia"));
			transf.mostrarTransferencia();
		}
		
		db.Desconectar();
	}
	
	public void buscaTransferenciasFornecedor(int codSaidaProduto) throws SQLException {
		// Busca de transferencia para fornecedor
		db.Conectar();
		String qr = "select * from transferencia_fornecedor where cod_saida = ?";
		PreparedStatement stm = db.preparedStament(qr);
		
		stm.setInt(1, codSaidaProduto);
		
		ResultSet result = db.runPreparedSelect(stm);
		while ( result.next() ) {
			Transferencia transf = new Transferencia(result.getInt("cod_saida"),result.getInt("cod_produto"), result.getInt("cod_fornecedor"), result.getString("dt_saida_produto"));
			transf.mostrarTransferencia();
		}
		
		db.Desconectar();
	}
	
	public void transferirProdutoFornecedor(int codProduto, int codFornecedor, String dataSaida) throws SQLException {
		// Transferencia de produto para um fornecedor utilizando a tabela saida_produto.
		db.Conectar();
		String qr = "insert into transferencia_fornecedor(cod_produto,dt_saida_produto,cod_fornecedor) values(?,?,?)";
		PreparedStatement stm = db.preparedStament(qr);
		
		stm.setInt(1, codProduto);
		stm.setString(2, dataSaida);
		stm.setInt(3, codFornecedor);
		
		db.runPreparedStatment(stm);
		
		System.out.println("Transferencia realizada com sucesso!");
		db.Desconectar();
	
	}
	
	public void transferirProdutoFilial(int codProduto, int codFilial, String dataSaida) throws SQLException {
		// Transferencia de produtos para filiais transferencia_saida_produto usando o cod_filial
		db.Conectar();
		String qr = "insert into transferencia_filial(cod_produto,dt_saida_produto_transferencia,cod_filial) values(?,?,?)";
		PreparedStatement stm = db.preparedStament(qr);
		
		stm.setInt(1, codProduto);
		stm.setString(2, dataSaida);
		stm.setInt(3, codFilial);
		
		db.runPreparedStatment(stm);
		
		System.out.println("Transferencia realizada com sucesso!");
		db.Desconectar();
	}

	public void historicoTransferenciasFornecedores() throws SQLException {
		db.Conectar();
		ResultSet result = db.SelectQuery("select * from transferencia_fornecedor");
		System.out.println("Historico de transferencias fornecedores:");
		while (result.next() ) {
			Transferencia transf = new Transferencia(result.getInt("cod_saida"),result.getInt("cod_produto"), result.getInt("cod_fornecedor"), result.getString("dt_saida_produto"));
			transf.mostrarTransferencia();
		}
		
		db.Desconectar();
		
	}
	
	public void historicoTransferenciasFiliais() throws SQLException {
		db.Conectar();
		ResultSet result = db.SelectQuery("select * from transferencia_filial");
		System.out.println("Historico de transferencias filiais:");
		while (result.next() ) {
			Transferencia transf = new Transferencia(result.getInt("cod_transferencia"),result.getInt("cod_produto"), result.getInt("cod_filial"), result.getString("dt_saida_produto_transferencia"));
			transf.mostrarTransferencia();
		}
		
		db.Desconectar();
		
	}
	
//	public static void main(String args[]) throws SQLException {
//		Transferencia c = new Transferencia();
//		c.historicoTransferenciasFornecedores();
//		c.historicoTransferenciasFiliais();
//		c.transferirProdutoFilial(5,5,"10/02/2000");
//		c.transferirProdutoFornecedor( 5, 5, "10/02/2000");
//		c.buscaTransferenciasFornecedor(4);
//		c.buscaTransferenciaFiliais(4);
//	}
	
}
