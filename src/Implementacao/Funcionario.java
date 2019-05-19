package Implementacao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Connections.ConnectionDB;

public class Funcionario extends Pessoa implements Autenticacao{
	private Cargos cargo;
	private String senha;
	private String matricula;
	private static ConnectionDB conexao = new ConnectionDB();
	public Funcionario(String matricula,String nome,String senha) {
		this.senha = senha;
		this.matricula = matricula;
		this.setNome(nome);
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
	public void realizarAutenticacao(String nome, String senha) {
		try {
			String nomeFuncionario = null,senhaFuncionario = null;
			conexao.Conectar();
			String sql = "SELECT nome_funcionario,senha_funcionario from funcionarios where matricula_funcionario = ?";
			PreparedStatement preparedStatement = conexao.preparedStament(sql);
			preparedStatement.setString(1, this.getMatricula());
			ResultSet result = conexao.runPreparedSelect(preparedStatement);
			while(result.next()) {
				nomeFuncionario = result.getString("nome_funcionario");
				senhaFuncionario = result.getString("senha_funcionario");
			}
			System.out.println(nomeFuncionario + " | " + senhaFuncionario);			
			if(nome.equals(nomeFuncionario) && senha.equals(senhaFuncionario)) {
				System.out.println("Login realizado com sucesso!!!");
			}else{
				System.err.println("E-mail ou senha incorreto");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			e.getMessage();
		}finally {
			conexao.Desconectar();
		}
	}
	
//-------------- GETTERS E SETTERS ------------------//

	public Cargos getCargo() {
		return cargo;
	}
	public void setCargo(Cargos cargo) {
		this.cargo = cargo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
