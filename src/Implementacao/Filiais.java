package Implementacao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import Connections.ConnectionDB;

public class Filiais {
	
	private ConnectionDB db = new ConnectionDB();
	private String nomeFilial;
	private Scanner s = new Scanner(System.in);
	private String telefoneFilial;
	private String cpnjFilial;
	private String bairroFilial;
	private int numeroEndereco;
	private String cidadeFilial;
	private String estado;
	private String cepFilial;
	
	public Filiais() {
		
	}

	public Filiais(String nomeFilial, String telefoneFilial, String cnpjFilial, String bairroFilial,
					int numeroEndereco, String cidadeFilial, String estado, String cepFilial) {

		this.nomeFilial = nomeFilial;
		this.telefoneFilial = telefoneFilial;
		this.cpnjFilial = cnpjFilial;
		this.bairroFilial = bairroFilial;
		this.numeroEndereco = numeroEndereco;
		this.cidadeFilial = cidadeFilial;
		this.estado = estado;
		this.cepFilial = cepFilial;
		
	}

	public String getNomeFilial() {
		return nomeFilial;
	}

	public void setNomeFilial(String nomeFilial) {
		this.nomeFilial = nomeFilial;
	}

	public String getTelefoneFilial() {
		return telefoneFilial;
	}

	public void setTelefoneFilial(String telefoneFilial) {
		this.telefoneFilial = telefoneFilial;
	}

	public String getCpnjFilial() {
		return cpnjFilial;
	}

	public void setCpnjFilial(String cpnjFilial) {
		this.cpnjFilial = cpnjFilial;
	}

	public String getBairroFilial() {
		return bairroFilial;
	}

	public void setBairroFilial(String bairroFilial) {
		this.bairroFilial = bairroFilial;
	}

	public int getNumeroEndereco() {
		return numeroEndereco;
	}

	public void setNumeroEndereco(int numeroEndereco) {
		this.numeroEndereco = numeroEndereco;
	}

	public String getCidadeFilial() {
		return cidadeFilial;
	}

	public void setCidadeFilial(String cidadeFilial) {
		this.cidadeFilial = cidadeFilial;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCepFilial() {
		return cepFilial;
	}

	public void setCepFilial(String cepFilial) {
		this.cepFilial = cepFilial;
	}
	
	public void cadastroFilial() throws SQLException {
		db.Conectar();
		String sql = "insert into filiais(nome_filial,cnpj_filial) values (?,?)";

		PreparedStatement stm = db.preparedStament(sql);
		
		stm.setString(1, this.getNomeFilial() );
		stm.setString(2, this.getCpnjFilial() );
		
		db.runPreparedStatment(stm);
		
		System.out.println("Filial inserida");
		
		String sql_endereco = "insert into endereco_filial(cep_filial,cidade_filial,bairro_filial,estado_filial,numero_loja_filial) "
							  + "values(?,?,?,?,?)";
		PreparedStatement stm_endereco = db.preparedStament(sql_endereco);
		
		stm_endereco.setString(1, this.getCepFilial() );
		stm_endereco.setString(2, this.getCidadeFilial() );
		stm_endereco.setString(3, this.getBairroFilial() );
		stm_endereco.setString(4, this.getEstado() );
		stm_endereco.setInt(5, this.getNumeroEndereco() );
		
		db.runPreparedStatment(stm_endereco);
		
		System.out.println("Dados de endereço de filial inseridos");
		
		db.Desconectar();
	}
	
	public void editFilial() {
		db.Conectar();
//		String sql = "update filial"
		db.Desconectar();
	}
	
	public void removeFilial() throws SQLException {
		db.Conectar();
		System.out.println("Digite o cnpj da filial que deseja remover: ");
		String cnpj_filial = s.nextLine();
		
		String sql = "delete from filiais where cnpj_filial = ?";
		PreparedStatement stm = db.preparedStament(sql);
		stm.setString(1, cnpj_filial);
		db.runPreparedStatment(stm);
		
		db.Desconectar();
	}
	
	public static void main(String args[]) throws SQLException {
//		Filiais f = new Filiais("Filial Teste","48 998548350","11234566","Extreitu",12,"Florianopolis","SC","88070150");
//		f.cadastroFilial();
//		Filiais f = new Filiais();
//		f.removeFilial();
	}
}
