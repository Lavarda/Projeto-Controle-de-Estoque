package Implementacao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Connections.ConnectionDB;

public class Gerente extends Administrador{
	private static ConnectionDB conexao = new ConnectionDB();
	public Gerente(String matricula, String nome, String senha,int codCategoria) {
		super(matricula, nome, senha,"Gerente", codCategoria);
	}
	
	public void incluirFuncionario(Funcionario f) {
		if(this.realizarAutenticacao() == true) {
			try {
				conexao.Conectar();
				String sql1 = "INSERT INTO funcionarios(cod_categoria,nome_funcionario,matricula_funcionario,senha_funcionario) VALUES (?,?,?,?)";
				String sql2 = "INSERT INTO cargo_funcionario (cod_funcionario)";
				//PreparedStatement stm = conexao.preparedStament(sql1);
				PreparedStatement stm2 = conexao.preparedStament(sql2);
				stm2.setString(2, f.getCargo());
				conexao.runPreparedStatment(stm2);
				//stm.setInt(1, f.getCodCategoria());
				//stm.setString(2,f.getNome());
				//stm.setString(3,f.getMatricula());
				//stm.setString(4,f.getSenha());
				//conexao.runPreparedStatment(stm);
				JOptionPane.showMessageDialog(null, "Inclusão de Funcionario realizada com sucesso!!!");
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				conexao.Desconectar();
			}
		}
	}
	public void excluirFuncionario(Funcionario f) {
		if(this.realizarAutenticacao() == true) {
			try {
				conexao.Conectar();
				String sql = "DELETE FROM funcionarios WHERE matricula_funcionario = ?";
				PreparedStatement stm = conexao.preparedStament(sql);
				stm.setString(1, f.getMatricula());
				conexao.runPreparedStatment(stm);
				JOptionPane.showMessageDialog(null, "Exclusão de Funcionario realizado com sucesso!!!");
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				conexao.Desconectar();
			}			
		}
			
	}
	public void editarSenhaFuncionario(Funcionario f, String novaSenha) {
		if(this.realizarAutenticacao() == true) {
			try {
				conexao.Conectar();
				String sql = "UPDATE funcionarios SET senha_funcionario = ? WHERE matricula_funcionario = ?";
				PreparedStatement stm = conexao.preparedStament(sql);
				stm.setString(1, novaSenha);
				stm.setString(2, f.getMatricula());
				conexao.runPreparedStatment(stm);
				JOptionPane.showMessageDialog(null, "Alteração de senha realizada com sucesso!!!");
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				conexao.Desconectar();
			}			
		}
	}
}
