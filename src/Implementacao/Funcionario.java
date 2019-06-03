package Implementacao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Connections.ConnectionDB;

public class Funcionario extends Administrador{
	
	private static ConnectionDB conexao = new ConnectionDB();
	public Funcionario(String matricula, String nome, String senha, Cargo cargo, Categoria categoria) {
		super(matricula, nome, senha, cargo, categoria);
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
	
	@Override
	public String toString() {
		return "Funcionario [getSenha()=" + getSenha() +"\n"+ "getMatricula()=" + getMatricula()+"\n" + "getCargo()="
				+ getCargo() + "\n" +  "getCodCategoria()=" + getCategoria().getCodCategoria() +"\n" + " getNome()=" + getNome() + "]";
	}
//--------------------- METODOS PRODUTOS ------------------------//
	public void requisitarInclusaoProduto(Produtos p) {
		p.inserir();
	}
	public void requisitarAlteracaoProduto(Produtos p) {
		// ainda n sei o q eu vou modificar
	}
	public void requisitarExclusaoProduto( Produtos p) {
		p.excluir();
	}
//--------------------- METODOS USUÁRIO -------------------//
	
	public void requisitarInclusaoUsuario(Usuario u) {
		u.cadastrarUsuario(this.getMatricula());
	}
	public void requisitarAlteracaoUsuario(Usuario u) {
		// ainda n sei o q eu vou modificar
	}
	public void requisitarExclusaoUsuario(Usuario u) {
		u.deletarUsuario();
	}
	
	
}
