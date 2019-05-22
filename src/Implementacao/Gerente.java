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
				String sql = "INSERT INTO funcionarios(cod_categoria,nome_funcionario,matricula_funcionario,senha_funcionario) VALUES (?,?,?,?)";
				PreparedStatement stm = conexao.preparedStament(sql);
				stm.setInt(1, f.getCodCategoria());
				stm.setString(2,f.getNome());
				stm.setString(3,f.getMatricula());
				stm.setString(4,f.getSenha());
				conexao.runPreparedStatment(stm);
				JOptionPane.showMessageDialog(null, "Inclusão de Funcionario realizada com sucesso!!!");
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				conexao.Desconectar();
			}
		}
	}
	public void excluirFuncionario(String matricula) {
		if(this.realizarAutenticacao() == true) {
		}
			
	}
	public void editarFuncionario(String matricula) {
		if(this.realizarAutenticacao() == true) {
			
		}
	}
}
