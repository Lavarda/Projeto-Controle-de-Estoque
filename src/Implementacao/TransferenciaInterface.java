package Implementacao;

public interface TransferenciaInterface {
	void buscaTransferencia();
	void buscaTransferencia(int codTransferencia);
	void mostrarTransferencia();
	void TransferirProduto(int codProduto,int codTransferido,String dataSaidaTransferencia);
	void TransferirProduto();
	void historicoTransferencias();
}
