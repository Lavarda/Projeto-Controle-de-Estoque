package Implementacao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Connections.ConnectionDB;

public class Administrador extends Pessoa implements Autenticacao {
	private String senha;
	private String matricula;
	private String cargo;
	private static ConnectionDB conexao = new ConnectionDB();

	public Administrador(String matricula,String nome,String senha, String cargo) {
		this.senha = senha;
		this.matricula = matricula;
		this.setNome(nome);
		this.cargo = cargo;
	}
	public Administrador(String matricula,String nome,String senha) {
		this.senha = senha;
		this.matricula = matricula;
		this.setNome(nome);
	}
	
	public static ConnectionDB getConexao() {
		return conexao;
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
	
		public String getSenha() {
			return senha;
		}
		public void setSenha(String senha) {
			this.senha = senha;
		}
		public String getMatricula() {
			return matricula;
		}
		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}
		public String getCargo() {
			return cargo;
		}
		public void setCargo(String cargo) {
			this.cargo = cargo;
		}
}
