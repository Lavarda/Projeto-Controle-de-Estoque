package Implementacao;

public class Produtos { 
  

    private int codigoProduto;
    private String nomeProduto;
    private float preco;
    private int codigoCategoria;
    
    public Produtos(int codigoProduto,String nomeProduto, float preco, int codigoCategoria){
    
      this.codigoProduto = codigoProduto;
      this.nomeProduto = nomeProduto;
      this.preco = preco;
      this.codigoCategoria = codigoCategoria;
	    
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
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getCodigoCategoria() {
		return codigoCategoria;
	}

	public void setCodigoCategoria(int codigoCategoria) {
		this.codigoCategoria = codigoCategoria;
	}

	public void mostrarProduto() {
    	System.out.println(" " + getCodigoProduto() + " " + getNomeProduto() + " " + getPreco() + " " + getCodigoCategoria() );
    }
  
}
