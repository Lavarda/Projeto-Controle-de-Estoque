package Implementacao;


import java.sql.PreparedStatement;
import java.sql.SQLException;


import Connections.ConnectionDB;

public class Gerente extends Administrador{
	
	public Gerente(String matricula, String nome, String senha,Categoria categoria) {
		super(matricula, nome, senha,Cargos.GERENTE, categoria);
	}
	
	public Gerente() {
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
				stm.setInt(5, funcionario.getCargo().getcodCargo());
				ConnectionDB.runPreparedStatment(stm);
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				ConnectionDB.Desconectar();
			}
		}
	}
	public void incluirFuncionario() {
		int codCategoriaFuncionario;
		String nomeFuncionario;
		String matriculaFuncionario;
		String senhaFuncionario;
		int codCargoFuncionario;
		try {
			System.out.println("Informe os dados do Funcionario: ");
			System.out.println("========= CATEGORIA ===========");
			codCategoriaFuncionario = Categoria.returnUserValueCodCategoria();
			System.out.println("========= NOME ===========");
			nomeFuncionario = Administrador.s.next();
			System.out.println("========= MATRICULA ===========");
			matriculaFuncionario = Administrador.s.next();
			System.out.println("========= SENHA ===========");
			senhaFuncionario = Administrador.s.next();
			codCargoFuncionario = Cargos.returnUserValueCodCargos();
			ConnectionDB.Conectar();
			String sql = "INSERT INTO funcionarios(cod_categoria,nome_funcionario,matricula_funcionario,senha_funcionario,cod_cargo) VALUES (?,?,?,?,?)";
			PreparedStatement stm = ConnectionDB.preparedStament(sql);
			stm.setInt(1,codCategoriaFuncionario);
			stm.setString(2,nomeFuncionario);
			stm.setString(3,matriculaFuncionario);
			stm.setString(4,senhaFuncionario);
			stm.setInt(5, codCargoFuncionario);
			ConnectionDB.runPreparedStatment(stm);
			System.out.println("Funcionario Cadastrado com sucesso!!");

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionDB.Desconectar();
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
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				ConnectionDB.Desconectar();
			}			
		}
			
	}
	public void excluirFuncionario() {
		if(this.realizarAutenticacao() == true) {
			String matriculaFuncionario;
			try {
				System.out.println("Digite a matricula do funcionario que deseja excluir: ");
				matriculaFuncionario = Administrador.s.next();
				ConnectionDB.Conectar();
				String sql = "DELETE FROM funcionarios WHERE matricula_funcionario = ?";
				PreparedStatement stm = ConnectionDB.preparedStament(sql);
				stm.setString(1, matriculaFuncionario);
				ConnectionDB.runPreparedStatment(stm);
				System.out.println("Funcionario excluido com sucesso!!");

			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				ConnectionDB.Desconectar();
			}			
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
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				ConnectionDB.Desconectar();
			}			
		}
	}
	public void editarSenhaFuncionario() {
		if(this.realizarAutenticacao() == true) {
			String matriculaFuncionario;
			String novaSenhaFuncionario;
			try {
				System.out.println("Digite a matricula do funcionario que deseja alterar senha: ");
				matriculaFuncionario = Administrador.s.next();
				System.out.println("Digite sua nova senha: ");
				novaSenhaFuncionario = Administrador.s.next();
				ConnectionDB.Conectar();
				String sql = "UPDATE funcionarios SET senha_funcionario = ? WHERE matricula_funcionario = ?";
				PreparedStatement stm = ConnectionDB.preparedStament(sql);
				stm.setString(1, novaSenhaFuncionario);
				stm.setString(2, matriculaFuncionario);
				ConnectionDB.runPreparedStatment(stm);
				System.out.println("Nova Senha Cadastrada com sucesso!!");
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				ConnectionDB.Desconectar();
			}			
		}
	}
	
	/*public void incluirFuncionario(Funcionario funcionario , File file) {
	try {
		
		FileWriter arq = new FileWriter(file,true);
		arq.write("Matricula: " + funcionario.getMatricula() + "|" + "Nome: " + funcionario.getNome() + "|" + "Senha: " + funcionario.getSenha() + "|" +
		"Cargo: " + funcionario.getCargo().getcodCargo() + "|" + "Categoria: " + funcionario.getCategoria().getCodCategoria() + "\n");
		arq.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
}*/
	
	/*public void excluirFuncionario(Funcionario funcionario, File file) {
	try {
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		FileWriter fileWriter = new FileWriter(file);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		String linha = bufferedReader;
		while (linha != null) {
			
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
}*/
}