package Implementacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Connections.ConnectionDB;

public class Gerente extends Administrador{
	public Gerente(String matricula, String nome, String senha,Categoria categoria) {
		super(matricula, nome, senha,Cargo.GERENTE, categoria);
	}
	
	public void incluirFuncionario(Funcionario funcionario) {
		if(this.realizarAutenticacao() == true) {
			try {
				ConnectionDB.Conectar();
				String sql = "INSERT INTO funcionarios(cod_categoria,nome_funcionario,matricula_funcionario,senha_funcionario,cod_cargo) VALUES (?,?,?,?,?)";
				PreparedStatement stm = ConnectionDB.preparedStament(sql);
				stm.setInt(1, funcionario.getCategoria().getCodCategoria());
				stm.setString(2,funcionario.getNome());
				stm.setString(3,funcionario.getMatricula());
				stm.setString(4,funcionario.getSenha());
				stm.setInt(5, funcionario.getCargo().getCodCargo());
				ConnectionDB.runPreparedStatment(stm);
				JOptionPane.showMessageDialog(null, "Inclusão de Funcionario realizada com sucesso!!!");
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				ConnectionDB.Desconectar();
			}
		}
	}
	
	public void incluirFuncionario(Funcionario funcionario , File file) {
		try {
			
			FileWriter arq = new FileWriter(file,true);
			arq.write("Matricula: " + funcionario.getMatricula() + "|" + "Nome: " + funcionario.getNome() + "|" + "Senha: " + funcionario.getSenha() + "|" +
			"Cargo: " + funcionario.getCargo().getCodCargo() + "|" + "Categoria: " + funcionario.getCategoria().getCodCategoria() + "\n");
			arq.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void excluirFuncionario(Funcionario funcionario) {
		if(this.realizarAutenticacao() == true) {
			try {
				ConnectionDB.Conectar();
				String sql = "DELETE FROM funcionarios WHERE matricula_funcionario = ?";
				PreparedStatement stm = ConnectionDB.preparedStament(sql);
				stm.setString(1, funcionario.getMatricula());
				ConnectionDB.runPreparedStatment(stm);
				JOptionPane.showMessageDialog(null, "Exclusão de Funcionario realizado com sucesso!!!");
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				ConnectionDB.Desconectar();
			}			
		}
			
	}
	public void excluirFuncionario(Funcionario funcionario, File file) {
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
			//String linha = bufferedReader;
			while (linha != null) {
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void editarSenhaFuncionario(Funcionario funcionario, String novaSenha) {
		if(this.realizarAutenticacao() == true) {
			try {
				ConnectionDB.Conectar();
				String sql = "UPDATE funcionarios SET senha_funcionario = ? WHERE matricula_funcionario = ?";
				PreparedStatement stm = ConnectionDB.preparedStament(sql);
				stm.setString(1, novaSenha);
				stm.setString(2, funcionario.getMatricula());
				ConnectionDB.runPreparedStatment(stm);
				JOptionPane.showMessageDialog(null, "Alteração de senha realizada com sucesso!!!");
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				ConnectionDB.Desconectar();
			}			
		}
	}
}