package Implementacao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Connections.ConnectionDB;

public abstract class Administrador extends Pessoa implements Autenticacao {
	private String senha;
	private String matricula;
	private String cargo;
	private int codCategoria;
	private static ConnectionDB conexao = new ConnectionDB();

	public Administrador(String matricula,String nome,String senha, String cargo,int codCategoria) {
		this.senha = senha;
		this.matricula = matricula;
		this.setNome(nome);
		this.cargo = cargo;
		this.codCategoria = codCategoria;
	}
	@Override
	public boolean realizarAutenticacao() {
		try {
			String nomeFuncionario = null;
			String senhaFuncionario = null;
			String nome = JOptionPane.showInputDialog("Insira seu nome");
			String senha = JOptionPane.showInputDialog("Insira sua senha");
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
				return true;
			}else{
				System.err.println("E-mail ou senha incorreto");
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			e.getMessage();
			return false;
		}finally {
			conexao.Desconectar();
		}
	}
	public void consultarfuncionarios(){
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
		public int getCodCategoria() {
			return codCategoria;
		}
		public void setCodCategoria(int codCategoria) {
			this.codCategoria = codCategoria;
		}
}
