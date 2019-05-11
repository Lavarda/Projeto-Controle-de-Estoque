package Implementacao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Transferencia {
	
	private ConnectionDB db = new ConnectionDB();
	private int codTransferencia;
	private int codProduto ;
	private int codFornecedor; // mb not,transferencia apenas entre filiais
	private int codFilial;
	private String dataSaida;
	
	public Transferencia() {
		
	}
	
	public Transferencia(int codTransferencia, int codProduto, int codFornecedor, int codFilial, String dataSaida) {
		this.codTransferencia = codTransferencia ;
		this.codProduto = codProduto; 
		this.codFornecedor = codFornecedor;
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
		System.out.println("cod_transferencia cod_produto cod_fornecedor cod_filial data_saida");
		System.out.println(this.getCodTransferencia() + " " + this.getCodProduto() + " " +
						   this.getCodFornecedor() + " " + this.getCodFilial() + " " + this.getDataSaida() );
	}
	
	public void transferirProduto(int codTransferencia, int codProduto, int codFornecedor, int codFilial, String dataSaida) throws SQLException {
		db.Conectar();
		String qr = "insert into saida_produtos(cod_produto,cod_fornecedor,cod_filial,dt_saida_produto) values(?,?,?,?)";
		PreparedStatement stm = db.preparedStament(qr);
		
		stm.setInt(1, codTransferencia);
		stm.setInt(2, codProduto);
		stm.setInt(3, codFilial);
		stm.setString(4, dataSaida);
		
		db.runPreparedStatment(stm);
		
		System.out.println("Transferencia realizada com sucesso!");
		db.Desconectar();
	}

	public void historicoTransferencias() throws SQLException {
		db.Conectar();
		ResultSet result = db.SelectQuery("select * from saida_produtos");
		System.out.println("Historico de transferencias:");
		while (result.next() ) {
			Transferencia transf = new Transferencia(result.getInt("cod_saida_produto"),result.getInt("cod_produto"), result.getInt("cod_fornecedor"), result.getInt("cod_filial"),result.getString("dt_saida_produto"));
			transf.mostrarTransferencia();
		}
		
		db.Desconectar();
		
	}
	
	public static void main(String args[]) throws SQLException {
		Transferencia c = new Transferencia();
		c.historicoTransferencias();
		c.transferirProduto(6, 2, 10 , 2, "27/05/21");
	}
	
}
