package Implementacao;

public class Transferencia {
	private int cod_transferencia;
	private int cod_produto ;
	private int cod_fornecedor; // mb not,transferencia apenas entre filiais
	private int cod_filial;
	
	public Transferencia(int cod_transferencia, int cod_produto, int cod_fornecedor, int cod_filial) {
		this.cod_transferencia = cod_transferencia;
		this.cod_produto = cod_produto;
		this.cod_fornecedor = cod_fornecedor;
		this.cod_filial = cod_filial;
	}

	public int getCod_transferencia() {
		return cod_transferencia;
	}

	public void setCod_transferencia(int cod_transferencia) {
		this.cod_transferencia = cod_transferencia;
	}

	public int getCod_produto() {
		return cod_produto;
	}

	public void setCod_produto(int cod_produto) {
		this.cod_produto = cod_produto;
	}

	public int getCod_fornecedor() {
		return cod_fornecedor;
	}

	public void setCod_fornecedor(int cod_fornecedor) {
		this.cod_fornecedor = cod_fornecedor;
	}

	public int getCod_filial() {
		return cod_filial;
	}

	public void setCod_filial(int cod_filial) {
		this.cod_filial = cod_filial;
	}
	
	public void transferenciaProduto() {
		// Pegar cod_produto, cod_filial que foi transferido do banco
	}
	
}
