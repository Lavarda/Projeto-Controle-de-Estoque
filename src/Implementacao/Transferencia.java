package Implementacao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.sun.tools.jdeprscan.scan.Scan;

import Connections.ConnectionDB;

public class Transferencia implements TransferenciaInterface {
	
	private int codTransferencia;
	private int codProduto ;
	private int codResponsavelTransferido;
	private String dataSaida;
	protected static Scanner scan = new Scanner(System.in);
	public Transferencia() {
		
	}
	public Transferencia(int codTransferencia, int codProduto, int codResponsavelTransferido, String dataSaida) {
		this.codTransferencia = codTransferencia ;
		this.codProduto = codProduto; 
		this.codResponsavelTransferido = codResponsavelTransferido;
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
	public int getCodResponsavelTransferido() {
		return codResponsavelTransferido;
	}
	public void setCodResponsavelTransferido(int codResponsavelTransferido) {
		this.codResponsavelTransferido = codResponsavelTransferido;
	}
	public String getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}	
	
	public void mostrarTransferencia() {
		System.out.println(this.getCodTransferencia() + " " + this.getCodProduto() + " " +
						   this.getCodResponsavelTransferido()+ " " + this.getDataSaida() );
	}
	
	public void buscaTransferencia() {
		
	}
	@Override
	public void buscaTransferencia(int codTransferencia) {
		
	}
	@Override
	public void TransferirProduto(int codProduto, int codTransferido, String dataSaidaTransferencia) {
		
	}
	@Override
	public void TransferirProduto() {
		
	}
	@Override
	public void historicoTransferencias() {
		
	}
}
