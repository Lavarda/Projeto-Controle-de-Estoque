package Implementacao;

public class Funcionario extends Administrador{
	public Funcionario(String matricula, String nome, String senha, String cargo,int codCategoria) {
		super(matricula, nome, senha, cargo, codCategoria);
	}
	
//--------------------- METODOS PRODUTOS ------------------------//
	public void requisitarInclusaoProdutos(Produtos p) {
		try {
			p.inserir();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*public void requisitarexclusaoProdutos(String codProduto,Produtos p) {
		try {
			
			p.excluir();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void requisitarAlteracaoProdutos(String codProduto, Produtos p) {
		try {
			p.alterar();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
//--------------------- METODOS USUÁRIO -------------------//
	
	public void requisitarInclusaoUsuario(Usuario u) {
	}
	public void requisitarAlteracaoUsuario(Usuario u) {
	}
	public void requisitarExclusaoUsuario(Usuario u) {

	}
}
