package Implementacao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Connections.ConnectionDB;

public class TransferenciaFornecedor extends Transferencia{

	
	public TransferenciaFornecedor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TransferenciaFornecedor(int codTransferencia, int codProduto, int codResponsavelTransferido,
			String dataSaida) {
		super(codTransferencia, codProduto, codResponsavelTransferido, dataSaida);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void buscaTransferencia() {
		// Busca de transferencia para fornecedor	
				String qr = "select * from transferencia_fornecedor where cod_saida = ?";
				int codSaidaProdutoFornecedor;
				try {
					System.out.println("Digite o Código de Saída de Fornecedor: \n");
					codSaidaProdutoFornecedor = Integer.parseInt(scan.nextLine());
					ConnectionDB.Conectar();
					PreparedStatement stm = ConnectionDB.preparedStament(qr);
					stm.setInt(1, codSaidaProdutoFornecedor);
					ResultSet result = ConnectionDB.runPreparedSelect(stm);
					while ( result.next() ) {
						Transferencia transf = new Transferencia(result.getInt("cod_saida"),result.getInt("cod_produto"), result.getInt("cod_fornecedor"), result.getString("dt_saida_produto"));
						transf.mostrarTransferencia();
					}
				} catch (SQLException | NumberFormatException e) {
					e.printStackTrace();
				}finally {
					ConnectionDB.Desconectar();
				}			
	}

	@Override
	public void buscaTransferencia(int codTransferencia) {
		// Busca de transferencia para fornecedor	
				String qr = "select * from transferencia_fornecedor where cod_saida = ?";
				try {
					ConnectionDB.Conectar();
					PreparedStatement stm = ConnectionDB.preparedStament(qr);
					stm.setInt(1, codTransferencia);
					ResultSet result = ConnectionDB.runPreparedSelect(stm);
					while ( result.next() ) {
						TransferenciaFornecedor transf = new TransferenciaFornecedor(result.getInt("cod_saida"),result.getInt("cod_produto"), result.getInt("cod_fornecedor"), result.getString("dt_saida_produto"));
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
		// Transferencia de produto para um fornecedor utilizando a tabela saida_produto.
				String qr = "insert into transferencia_fornecedor(cod_produto,dt_saida_produto,cod_fornecedor) values(?,?,?)";
				try {
					ConnectionDB.Conectar();
					PreparedStatement stm = ConnectionDB.preparedStament(qr);
					stm.setInt(1, codProduto);
					stm.setString(2, dataSaidaTransferencia);
					stm.setInt(3, codResponsavelTransferido);
					ConnectionDB.runPreparedStatment(stm);
					System.out.println("Transferencia realizada com sucesso!");
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					ConnectionDB.Desconectar();	
				}			
	}

	@Override
	public void TransferirProduto() {
		// Transferencia de produto para um fornecedor utilizando a tabela saida_produto.
				String qr = "insert into transferencia_fornecedor(cod_produto,dt_saida_produto,cod_fornecedor) values(?,?,?)";
				int codProduto;
				int codFornecedor;
				String dataSaidaProduto;
				try {
					System.out.println("Digite os valores abaixo para inserção \n");
					System.out.println("Código do Produto: \n");
					codProduto = Integer.parseInt(scan.nextLine());
					System.out.println("Código do Fornecedor: \n");
					codFornecedor = Integer.parseInt(scan.nextLine());
					System.out.println("Data de Saída do Produto");
					dataSaidaProduto = scan.nextLine();
					ConnectionDB.Conectar();
					PreparedStatement stm = ConnectionDB.preparedStament(qr);
					stm.setInt(1, codProduto);
					stm.setString(2, dataSaidaProduto);
					stm.setInt(3, codFornecedor);
					ConnectionDB.runPreparedStatment(stm);
					System.out.println("Transferencia realizada com sucesso!");
				} catch (SQLException | NumberFormatException e) {
					e.printStackTrace();
				}finally {
					ConnectionDB.Desconectar();	
				}		
	}

	@Override
	public void historicoTransferencias() {
		try {
			System.out.println("Historico de transferencias fornecedores:");
			ConnectionDB.Conectar();
			ResultSet result = ConnectionDB.SelectQuery("select * from transferencia_fornecedor");
			while (result.next() ) {
				Transferencia transf = new Transferencia(result.getInt("cod_saida"),result.getInt("cod_produto"), result.getInt("cod_fornecedor"), result.getString("dt_saida_produto"));
				transf.mostrarTransferencia();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionDB.Desconectar();
		}				
	}

}
