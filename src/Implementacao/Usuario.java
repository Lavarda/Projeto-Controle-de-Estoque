package Implementacao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class Usuario extends Pessoa{
	
	ArrayList<Produtos> produtos = new ArrayList<Produtos>();
	Scanner s = new Scanner(System.in);
	boolean contem = false;
	static ConnectionDB db = new ConnectionDB();

	public Usuario(String nome,String email,String numeroCelular,
				   String cpf, int rg,String dataNascimento, String endereco, String sexo, String estadoCivil) {
		super(nome,email,numeroCelular,cpf,rg,dataNascimento,endereco,sexo,estadoCivil);
	}
	
	public void produtosComprados() throws SQLException {
		// String codigoProduto,String nomeProduto, String descricao, float preco
		// Recebe do banco uma lista de produtos comprados e mostra na tela do usuario
		
		db.Conectar();
		ResultSet result = db.SelectQuery("SELECT * FROM produtos");
		produtos.clear();
		while ( result.next() ) {
			Produtos produto = new Produtos(result.getInt("cod_produto"), result.getString("nome_produto"), result.getFloat("preco_produto"), result.getInt("cod_categoria") );
			produtos.add(produto);
		}		
		
		for( Produtos i : produtos) {
			System.out.println( i.getCodigoProduto() + " "  + i.getNomeProduto() + " " + i.getPreco() + " " + i.getCodigoCategoria());
		}
		
		db.Desconectar();
	}
	
	public String pesquisarProduto(){
        
        System.out.println("Digite o nome do produto que deseja pesquisar: ");
        String nomeProduto = s.nextLine(); 
        
        for(int i = 0; i < produtos.size(); i ++){
        	if(produtos.get(i).getNomeProduto().equals(nomeProduto)){
                contem = true;
                return nomeProduto;
            }else{
                contem = false;	
            }
        }
        
        return "false";
        
    }
    
	
	public static void main(String args[]) throws SQLException {
		Usuario c = new Usuario("Vitor Lavarda","vitorlavarda.souza@gmail.com","(48) 9854-8350","123.123.13",11123123,"21/07/2000","Rua tal","M","Solteiro");
//		c.dadosPessoa();
		c.produtosComprados();
		String buscaProduto = c.pesquisarProduto();
		if(buscaProduto.equals("false")){
			System.out.println("O Produto não foi encontrado");
		}else {
			System.out.println("Produto encontrado");
		}
	}
	
}
