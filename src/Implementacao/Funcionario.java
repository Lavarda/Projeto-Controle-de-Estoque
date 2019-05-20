package Implementacao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Connections.ConnectionDB;

public class Funcionario extends Administrador{
	ConnectionDB conexao = new ConnectionDB();
	public Funcionario(String matricula, String nome, String senha, String cargo) {
		super(matricula, nome, senha, cargo);
	}
	public void consultarfuncionario(){
			try {
				String nomeFuncionario = null;
				String cargoFuncionario = null;
				String matriculaFuncionario = null;
				String salarioFuncionario = null;
				String telefoneFuncionario = null;
				String sql = "SELECT * FROM vw_funcionarios WHERE matricula_funcionario = ?";
				conexao.Conectar();
				PreparedStatement preparedStatement = conexao.preparedStament(sql);
				preparedStatement.setString(1, this.getMatricula());
				ResultSet result = conexao.runPreparedSelect(preparedStatement);
				while(result.next()) {
					nomeFuncionario = result.getString("nome_funcionario");
					cargoFuncionario = result.getString("cargo_funcionario");
					matriculaFuncionario = result.getString("matricula_funcionario");
					salarioFuncionario = result.getString("salario_funcionario");
					telefoneFuncionario = result.getString("telefone_funcionario");
				}
				System.out.println("Nome: "+ nomeFuncionario + "\n" + "Cargo: " + cargoFuncionario + "\n" +"Matricula: "
						+ matriculaFuncionario + "\n" + "Salário: " + salarioFuncionario + "\n" + "Telefone: " + telefoneFuncionario);
			} catch (SQLException e) {
				e.printStackTrace();
				e.getMessage();
			}finally {
				conexao.Desconectar();
			}	
	}
//--------------------- METODOS PRODUTOS ------------------------//
	public void requisitarInclusaoProdutos(Produtos p) {
		try {
			p.inserir();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*public void requisitarexclusaoProdutos(String codProduto,Produtos p) {
		try {
			
			p.excluir();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void requisitarAlteracaoProdutos(String codProduto, Produtos p) {
		try {
			p.alterar();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
//--------------------- METODOS USUÁRIO -------------------//
	
	public void requisitarInclusaoUsuario(Usuario u) {
	}
	public void requisitarAlteracaoUsuario(Usuario u) {
	}
	public void requisitarExclusaoUsuario(Usuario u) {

	}
}
