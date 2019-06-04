package Implementacao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import Connections.ConnectionDB;

public class Filiais {
	
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
		ConnectionDB.Conectar();
		String sql = "insert into filiais_table(nome_filial,cnpj_filial,telefone_filial,cep_filial,cidade_filial,bairro_filial,estado_filial,numero_loja_filial) values (?,?,?,?,?,?,?,?)";

		PreparedStatement stm = ConnectionDB.preparedStament(sql);
		
		stm.setString(1, this.getNomeFilial() );
		stm.setString(2, this.getCpnjFilial() );
		stm.setString(3, this.getTelefoneFilial() );
		stm.setString(4, this.getCepFilial() );
		stm.setString(5, this.getCidadeFilial() );
		stm.setString(6, this.getBairroFilial() );
		stm.setString(7, this.getEstado() );
		stm.setInt(8, this.getNumeroEndereco() );		
		
		ConnectionDB.runPreparedStatment(stm);
		
		System.out.println("Dados de endereço de filial inseridos");
		
		ConnectionDB.Desconectar();
	}
	
//	public void editFilial() {
//		db.Conectar();
//		String sql = ""
//		
//		db.Desconectar();
//	}
	
	public void removeFilial() throws SQLException {
		ConnectionDB.Conectar();
		System.out.println("Digite o cnpj da filial que deseja remover: ");
		String cnpj_filial = s.nextLine();
		
		String sql = "delete from filiais_table where cnpj_filial = ?";
		PreparedStatement stm = ConnectionDB.preparedStament(sql);
		stm.setString(1, cnpj_filial);
		ConnectionDB.runPreparedStatment(stm);
		
		ConnectionDB.Desconectar();
	}
	
//	public static void main(String args[]) throws SQLException {
//		Filiais f = new Filiais("Filial Teste","48 998548350","11234566","Extreitu",12,"Florianopolis","SC","88070150");
//		f.cadastroFilial();
//		Filiais f = new Filiais();
//		f.removeFilial();
//	}
}
