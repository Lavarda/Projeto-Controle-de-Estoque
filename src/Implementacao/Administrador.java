package Implementacao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Connections.ConnectionDB;

public abstract class Administrador extends Pessoa implements Autenticacao {
	private String senha;
	private String matricula;
	private Cargos cargo;
	private Categoria categoria;
	public Administrador(String matricula,String nome,String senha, Cargos cargo, Categoria categoria) {
		this.senha = senha;
		this.matricula = matricula;
		this.setNome(nome);
		this.cargo = cargo;
		this.categoria = categoria;
	}
	@Override
	public boolean realizarAutenticacao() {
		try {
			String nomeFuncionario = null;
			String senhaFuncionario = null;
			String nome = JOptionPane.showInputDialog("Insira seu nome");
			String senha = JOptionPane.showInputDialog("Insira sua senha");
			ConnectionDB.Conectar();
			String sql = "SELECT nome_funcionario,senha_funcionario from funcionarios where matricula_funcionario = ?";
			PreparedStatement preparedStatement = ConnectionDB.preparedStament(sql);
			preparedStatement.setString(1, this.getMatricula());
			ResultSet result = ConnectionDB.runPreparedSelect(preparedStatement);
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
			ConnectionDB.Desconectar();
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
		public Cargos getCargo() {
			return cargo;
		}
		public void setCargo(Cargos cargo) {
			this.cargo = cargo;
		}
		public Categoria getCategoria() {
			return categoria;
		}
		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}
		
}
