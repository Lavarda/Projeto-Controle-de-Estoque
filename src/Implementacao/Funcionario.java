package Implementacao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Connections.ConnectionDB;

public class Funcionario extends Administrador{
	
	public Funcionario() {
		
	}
	
	public Funcionario(String matricula, String nome, String senha, Cargos cargo, Categoria categoria) {
		super(matricula, nome, senha, cargo, categoria);
	}
	
	public void consultarfuncionario(){
		String sql = "SELECT * FROM vw_funcionarios WHERE matricula_funcionario = ?";
		String nomeFuncionario = null;
		String cargoFuncionario = null;
		String matriculaFuncionario = null;
		String salarioFuncionario = null;
		String telefoneFuncionario = null;
		try {
			ConnectionDB.Conectar();
			PreparedStatement preparedStatement = ConnectionDB.preparedStament(sql);
			preparedStatement.setString(1, this.getMatricula());
			ResultSet result = ConnectionDB.runPreparedSelect(preparedStatement);
			while(result.next()) {
				nomeFuncionario = result.getString("nome_funcionario");
				cargoFuncionario = result.getString("cargo_funcionario");
				matriculaFuncionario = result.getString("matricula_funcionario");
				salarioFuncionario = result.getString("salario_funcionario");
				telefoneFuncionario = result.getString("telefone_funcionario");
			}
			System.out.println("Nome: "+ nomeFuncionario + "\n" + "Cargo: " + cargoFuncionario + "\n" +"Matricula: "
					+ matriculaFuncionario + "\n" + "Sal�rio: " + salarioFuncionario + "\n" + "Telefone: " + telefoneFuncionario);
		} catch (SQLException e) {
			e.printStackTrace();
			e.getMessage();
		}finally {
			ConnectionDB.Desconectar();
		}	
	}
	
	@Override
	public String toString() {
		return "Funcionario [getSenha()=" + getSenha() +"\n"+ "getMatricula()=" + getMatricula()+"\n" + "getCargo()="
				+ this.getCargo() + "\n" +  "getCodCategoria()=" + getCategoria().getCodCategoria() +"\n" + " getNome()=" + getNome() + "]";
	}
	
	public int buscarCodFuncionario() {
		int codFuncionario = 0;
		try {
		String sql = "Select cod_funcionario from funcionarios where matricula_funcionario = ?";
		PreparedStatement stm = ConnectionDB.preparedStament(sql);
		System.out.println("Sua matricula: ");
		String matricula = s.nextLine();
		stm.setString(1, matricula);
		ResultSet rs = ConnectionDB.runPreparedSelect(stm);
		while(rs.next()) {
			codFuncionario = rs.getInt("cod_funcionario");
		}
		return codFuncionario;
		}catch(SQLException e){
			e.printStackTrace();
			System.err.println("Código do funcionario não foi encontrado!!!");
			return 0;
		}finally {
			ConnectionDB.Desconectar();
		}		
	}
	
	public void autenticacaoFuncionarios() {
		this.realizarAutenticacao();
	}
//--------------------- METODOS PRODUTOS ------------------------//
	public void requisitarInclusaoProduto(Produtos p) {
		p.inserirProduto();
	}
	public void requisitarAlteracaoProduto(Produtos p) {
		p.alterarProduto();
	}
	public void requisitarExclusaoProduto( Produtos p) {
		p.excluirProduto();
	}
	public void requistarListagemProdutos(Produtos p) {
		p.listarTodos();
	}
//--------------------- METODOS USU�RIO -------------------//
	
	public void requisitarInclusaoUsuario(Usuario u) {
		u.cadastrarUsuario();
	}
	public void requisitarAlteracaoUsuario(Usuario u) {
		u.modificaUsuario();
	}
	public void requisitarExclusaoUsuario(Usuario u) {
		u.deletarUsuario();;
	}
	public void requisitarHistorioCompras(Usuario u) {
		u.produtosComprados();
	}

//--------------------- METODOS FILIAIS ---------------------//
	
	public void requisitarInclusaoFilial(Filiais fil) {
		fil.cadastroFilial();
		
	}
	public void requisitarAlteracaoFilial() {
		
	}
	public void requisitarExclusaoFilial(Filiais fil) {
		fil.removeFilial();
	}

//--------------------- METODOS FORNECEDOR ------------------//
	public void requisitarInclusaoFornecedor(Fornecedor forn){
		forn.newFornecedor();
	}
	public void requisitarAlteracaoFornecedor(){
		
	}
	public void requisitarExclusaoFornecedor(Fornecedor forn){
		forn.removeFornecedor();
	}
	
// ------------------- METODOS RELATORIOS --------------------//
	
	public void requisitarRelatorioDevolucoes() {
		Relatorios.devolucoesFornecedor();
	}
	
	public void requisitarRelatoriosRecebiveis() {
		Relatorios.recebidosFornecedor();
	}
	
	public void requisitarRelatorioEstoque() {
		Relatorios.estoqueInteiro();
	}
	
	public void requisitarRelatoriosUsuarios() {
		System.out.println("Digite a cidade na qual deseja verificar os usuários: ");
		String cidade = s.nextLine();
		Relatorios.usuariosCidade(cidade);
	}
	
	public void requisitarRelatoriosFornecedores() {
		System.out.println("Digite o estado na qual deseja verificar os fornecedores: ");
		String estado = s.nextLine();
		Relatorios.numerosFornecedores(estado);
	}
// -------------------------- METODOS TRANSFERENCIAS -------------------//
	public void requisitarBuscaTransferenciasFiliais(TransferenciaFiliais transf) {
		transf.buscaTransferencia();
	}
	public void requisitarTransferenciaFiliais(TransferenciaFiliais transf) {
		transf.TransferirProduto();
	}
	public void requisitarhistoricoTransferenciasFiliais(TransferenciaFiliais transf) {
		transf.historicoTransferencias();
	}
	
	
	public void requisitarbuscaTransferenciasFornecedor(TransferenciaFornecedor transf) {
		transf.buscaTransferencia();
	}
	public void requisitarTransferenciaFornececedor(TransferenciaFornecedor transf) {
		transf.TransferirProduto();
	}
	public void requisitarhistoricoTransferenciasFornecedores(TransferenciaFornecedor transf) {
		transf.historicoTransferencias();
	}
	
}
