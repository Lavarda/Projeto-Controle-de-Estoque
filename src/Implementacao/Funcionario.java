package Implementacao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Connections.ConnectionDB;

public class Funcionario extends Pessoa implements Autenticacao{
	//private Cargos cargo;
	//private String dataAdmissao;
	private String senha;
	private static ConnectionDB conexao = new ConnectionDB();
	public Funcionario(String email,String senha,String cpf) {
		this.senha = senha;
		this.setEmail(email);
		this.setCpf(cpf);
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Funcionario(String nome,String email,String cpf,String rg,String dataNascimento) {
		this.setNome(nome);
		this.setEmail(email);
		this.setCpf(cpf);
		this.setRg(rg);
		this.setDataNascimento(dataNascimento);	
	}
	public void consultarfuncionario(String cpf){
			try {
				conexao.Conectar();
				String sql = "SELECT * FROM funcionarios WHERE cpf_funcionario = ?";
				PreparedStatement preparedStatement = conexao.preparedStament(sql);
				preparedStatement.setString(1, cpf);
				ResultSet result = conexao.runPreparedSelect(preparedStatement);
				while(result.next()) {
					String codFuncionario,emailFuncionario,nomeFuncionario,cpfFuncionario,dataNascimentoFuncionario;
					codFuncionario = result.getString("cod_funcionario");
					emailFuncionario = result.getString("email_funcionario");
					nomeFuncionario = result.getString("nome_funcionario");
					cpfFuncionario = result.getString("cpf_funcionario");
					dataNascimentoFuncionario = result.getString("dt_nascimento_funcionario");
					System.out.println(codFuncionario + "|" + emailFuncionario + "|" + nomeFuncionario + "|"
					+ cpfFuncionario + "|" + dataNascimentoFuncionario);
				}
				conexao.Desconectar();
			} catch (SQLException e) {
				e.printStackTrace();
				e.getMessage();
			}
}
	public void insertProduto() {
		
	}
	
	public void deleteProduto() {
		
		
	}
	
	public void updateProduto() {
		
	}
	
	public void insertCliente() {
		
	}
	
	public void deleteCliente() {
		
	}
	
	public void updateCliente() {
		
	}
	@Override
	public void realizarAutenticacao(String email, String senha) {
		try {
			String emailFuncionario = null,senhaFuncionario = null;
			conexao.Conectar();
			String sql = "SELECT email_funcionario,senha_funcionario from funcionarios where cpf_funcionario = ?";
			PreparedStatement preparedStatement = conexao.preparedStament(sql);
			preparedStatement.setString(1, this.getCpf());
			ResultSet result = conexao.runPreparedSelect(preparedStatement);
			while(result.next()) {
				System.out.println(emailFuncionario = result.getString("email_funcionario"));
				System.out.println(senhaFuncionario = result.getString("senha_funcionario"));
			}
			
			if(email != emailFuncionario && senha != senhaFuncionario ) {
				System.err.println("email ou senha incorretos");
			}else{
				System.out.println("Login realizado com sucesso!!!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			e.getMessage();
		}finally {
			conexao.Desconectar();
		}
	}
	
	
	
	
	
}
