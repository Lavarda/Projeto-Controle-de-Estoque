package Implementacao;

public enum Cargos {
//Somente para realizar commit esse comentário
	VENDEDOR(1),
	ASSISTENTE_ADMINISTRATIVO(2),
	GERENTE(3);
	
	private int codCargo;
	
	Cargos(int codCargo){
		this.codCargo = codCargo;
	}
	
	public int getcodCargo() {
		return this.codCargo;
	}
}
