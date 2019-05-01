package classes;

public class Produtos { 
  
<<<<<<< HEAD
    private String codigoProduto;
    private String nomeProduto;
    private String descricao;
    private float preco;
  
    public Produtos(String codigoProduto,String nomeProduto, String descricao, float preco){
=======
    private int codigoProduto;
    private String nomeProduto;
    private String descricao; // fabricante(produzido por:), origem, peso, tipo, grad. alc,conteudo liquido, aditivos, validade, composição, importador, distribuidor, fornecedor, lote, ...
    private float preco;
  
    public Produtos(int codigoProduto,String nomeProduto, String descricao, float preco){
>>>>>>> 681330fc5b627daeb262a06634ab4e4dce33fabd
    
      this.codigoProduto = codigoProduto;
      this.nomeProduto = nomeProduto;
      this.descricao = descricao;
      this.preco = preco;
	    
    }
    public int getCodigoProduto() {
	return codigoProduto;
    }
    public void setCodigoProduto(int codigoProduto) {
	this.codigoProduto = codigoProduto;
    }
    public String getNomeProduto() {
	return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
	this.nomeProduto = nomeProduto;
<<<<<<< HEAD
	}
=======
    }
>>>>>>> 681330fc5b627daeb262a06634ab4e4dce33fabd
    public String getDescricao() {
	return descricao;
    }
    public void setDescricao(String descricao) {
	this.descricao = descricao;
    }
    public float getPreco() {
	return preco;
    }
    public void setPreco(float preco) {
	this.preco = preco;
    }
    
    public void mostrarProduto() {
    	System.out.println(this.codigoProduto + ' ' + this.nomeProduto + ' ' + this.descricao + ' ' + this.preco);
    }
  
}
