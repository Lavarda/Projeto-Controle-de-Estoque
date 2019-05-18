package Implementacao;

public class Fornecedor{
	
	private String nomeFornecedor;
	private String produtoFornecido;
	private String dataEntrega;
	private String cnpjForncedor;
	
	public Fornecedor(String nomeFornecedor, String produtoFornecido, String dataEntrega, String cnpjFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
		this.produtoFornecido = produtoFornecido;
		this.dataEntrega = dataEntrega;
		this.cnpjForncedor = cnpjFornecedor;
	}

	public String getNomeFornecedor() {
		return nomeFornecedor;
	}

	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}

	public String getProdutoFornecido() {
		return produtoFornecido;
	}

	public void setProdutoFornecido(String produtoFornecido) {
		this.produtoFornecido = produtoFornecido;
	}

	public String getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(String dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public String getCnpjForncedor() {
		return cnpjForncedor;
	}

	public void setCnpjForncedor(String cnpjForncedor) {
		this.cnpjForncedor = cnpjForncedor;
	}
	
	public void envioProduto() {
		Produtos produtoEnviado = new Produtos(1,"Nome","Descrição", 0);
		produtoEnviado.mostrarProduto();
		
		// Enviar produto para o estoque
	}
	
	public static void main(String args[]) {
		Fornecedor c = new Fornecedor("Nome Fornecedor","Produto Fornecido","Data entrega","Cnpj Fornecedor");
		c.envioProduto();
	}
	
}
