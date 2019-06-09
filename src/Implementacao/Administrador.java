package Implementacao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import Connections.ConnectionDB;

public abstract class Administrador extends Pessoa implements Autenticacao {
	
	protected static Scanner s = new Scanner(System.in);
	private String senha;
	private String matricula;
	private Cargos cargo;
	private Categoria categoria;
	
	public Administrador() {
		
	}

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
			String matriculaFuncionario = null;
			String senhaFuncionario = null;
			System.out.println("========= Realizando Auntenticação ==========");
			System.out.println("Digite matricula para acesso: ");
			String matricula = s.nextLine();
			System.out.println("Digite sua senha para acesso: ");
			String senha = s.nextLine();
			ConnectionDB.Conectar();
			String sql = "SELECT matricula_funcionario,senha_funcionario from funcionarios where matricula_funcionario = ?";
			PreparedStatement preparedStatement = ConnectionDB.preparedStament(sql);
			preparedStatement.setString(1, matricula);
			ResultSet result = ConnectionDB.runPreparedSelect(preparedStatement);
			while(result.next()) {
				matriculaFuncionario = result.getString("matricula_funcionario");
				senhaFuncionario = result.getString("senha_funcionario");
			}
			if(matricula.equals(matriculaFuncionario) && senha.equals(senhaFuncionario)) {
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
