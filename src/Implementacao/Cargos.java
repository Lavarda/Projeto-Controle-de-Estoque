package Implementacao;

public enum Cargos {
	
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
