package Implementacao;

import java.util.*;

public class Usuario extends Pessoa{
	
	ArrayList<Produtos> produtos = new ArrayList<Produtos>();
	Scanner s = new Scanner(System.in);
	boolean contem = false;

	public Usuario(String nome,String email,String numeroCelular,
				   String cpf, int rg,String dataNascimento, String endereco, String sexo, String estadoCivil) {
		super(nome,email,numeroCelular,cpf,rg,dataNascimento,endereco,sexo,estadoCivil);
	}
	
	public ArrayList<Produtos> produtosComprados() {
		// String codigoProduto,String nomeProduto, String descricao, float preco
		// Recebe do banco uma lista de produtos comprados e mostra na tela do usuario
		produtos.add(new Produtos(1,"Cerveja","é top",5));
		produtos.add(new Produtos(2,"Vodka","é top 2",5));
		produtos.add(new Produtos(3,"Agua","é top 2",5));
		produtos.add(new Produtos(4,"Refri","é top 2",5));
		
//		for( Produtos i : produtos) {
//			i.mostrarProduto();
//		}
		
		return produtos;
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
    
	
	public static void main(String args[]) {
		Usuario c = new Usuario("Vitor Lavarda","vitorlavarda.souza@gmail.com","(48) 9854-8350","123.123.13",11123123,"21/07/2000","Rua tal","M","Solteiro");
		c.dadosPessoa();
		c.produtosComprados();
		String buscaProduto = c.pesquisarProduto();
		if(buscaProduto.equals("false")){
			System.out.println("O Produto não foi encontrado");
		}else {
			System.out.println("Produto encontrado");
		}
	}
	
}
