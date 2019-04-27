package classes;

public class Produtos { 
  
    private String codigoProduto;
    private String nomeProduto;
    private String descricao;
    private float preco;
  
    public Produto(String codigoProduto,String nomeProduto, String descricao, float preco){
    
      this.codigoProduto = codigoProduto;
      this.nomeProduto = nomeProduto;
      this.descricao = descricao;
      this.preco = preco;
	    
    }
    public String getCodigoProduto() {
	return codigoProduto;
    }
    public void setCodigoProduto(String codigoProduto) {
	this.codigoProduto = codigoProduto;
    }
    public String getNomeProduto() {
	return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
	this.nomeProduto = nomeProduto;
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
  
}
