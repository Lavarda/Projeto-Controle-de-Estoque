package Implementacao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Connections.ConnectionDB;

public class TransferenciaFiliais extends Transferencia{
	
	public TransferenciaFiliais() {
		super();
	}
	public TransferenciaFiliais(int codTransferencia, int codProduto, int codResponsavelTransferido, String dataSaida) {
		super(codTransferencia, codProduto, codResponsavelTransferido, dataSaida);
	}
	
	@Override
	public void buscaTransferencia() {
		// Busca de transferencia para filiais
		String qr = "select * from transferencia_filial where cod_transferencia = ?";
		int codTranferenciaFilial;
		try {
			System.out.println("Digite o c�digo de Tranferencia para Filiais: \n");
			codTranferenciaFilial =  Integer.parseInt(scan.nextLine());
			ConnectionDB.Conectar();
			PreparedStatement stm = ConnectionDB.preparedStament(qr);
			stm.setInt(1, codTranferenciaFilial);
			ResultSet result = ConnectionDB.runPreparedSelect(stm);
			while ( result.next() ) {
				TransferenciaFiliais transf = new TransferenciaFiliais(result.getInt("cod_transferencia"),result.getInt("cod_produto"), result.getInt("cod_filial"), result.getString("dt_saida_produto_transferencia"));
				transf.mostrarTransferencia();	
			}
		} catch (SQLException | NumberFormatException e) {
			System.out.println("Erro ao realizar transferencia" + e);
		}finally {
			ConnectionDB.Desconectar();
		}			
	}

	@Override
	public void buscaTransferencia(int codTransferencia) {
		// Busca de transferencia para filiais
				String qr = "select * from transferencia_filial where cod_transferencia = ?";
				try {
					ConnectionDB.Conectar();
					PreparedStatement stm = ConnectionDB.preparedStament(qr);
					stm.setInt(1, codTransferencia);
					ResultSet result = ConnectionDB.runPreparedSelect(stm);
					while ( result.next() ) {
						Transferencia transf = new Transferencia(result.getInt("cod_transferencia"),result.getInt("cod_produto"), result.getInt("cod_filial"), result.getString("dt_saida_produto_transferencia"));
						transf.mostrarTransferencia();	
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					ConnectionDB.Desconectar();
				}
			}
	@Override
	public void TransferirProduto(int codProduto, int codResponsavelTransferido, String dataSaidaTransferencia) {
		// Transferencia de produtos para filiais transferencia_saida_produto usando o cod_filial
				String qr = "insert into transferencia_filial(cod_produto,dt_saida_produto_transferencia,cod_filial) values(?,?,?)";
				
				try {
					ConnectionDB.Conectar();
					PreparedStatement stm = ConnectionDB.preparedStament(qr);
					stm.setInt(1, codProduto);
					stm.setString(2, dataSaidaTransferencia);
					stm.setInt(3, codResponsavelTransferido);
					System.out.println("Transferencia realizada com sucesso!");
					ConnectionDB.runPreparedStatment(stm);
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					ConnectionDB.Desconectar();
				}		
	}

	@Override
	public void TransferirProduto() {
		// Transferencia de produtos para filiais transferencia_saida_produto usando o cod_filial
				String qr = "insert into transferencia_filial(cod_produto,dt_saida_produto_transferencia,cod_filial) values(?,?,?)";
				int codProduto;
				int codfilial;
				String dataSaidaProduto;
				try {
					System.out.println("Digite os valores abaixo para inserção \n");
					System.out.println("Código do Produto: \n");
					codProduto = Integer.parseInt(scan.nextLine());
					System.out.println("Código do Fornecedor: \n");
					codfilial = Integer.parseInt(scan.nextLine());
					System.out.println("Data de Sa�da do Produto");
					dataSaidaProduto = scan.nextLine();
					ConnectionDB.Conectar();
					PreparedStatement stm = ConnectionDB.preparedStament(qr);
					stm.setInt(1, codProduto);
					stm.setString(2, dataSaidaProduto);
					stm.setInt(3, codfilial);
					System.out.println("Transferencia realizada com sucesso!");
					ConnectionDB.runPreparedStatment(stm);
				} catch (SQLException | NumberFormatException e) {
					System.out.println("Erro ao realizar transferencia" + e);
				}finally {
					ConnectionDB.Desconectar();
				}		
	}

	@Override
	public void historicoTransferencias() {
		try {
			System.out.println("Historico de transferencias filiais:");
			ConnectionDB.Conectar();
			ResultSet result = ConnectionDB.SelectQuery("select * from transferencia_filial");
			while (result.next() ) {
				Transferencia transf = new Transferencia(result.getInt("cod_transferencia"),result.getInt("cod_produto"), result.getInt("cod_filial"), result.getString("dt_saida_produto_transferencia"));
				transf.mostrarTransferencia();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionDB.Desconectar();
		}				
	}
	
	
}
