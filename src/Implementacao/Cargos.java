package Implementacao;

import Connections.ConnectionDB;

public enum Cargos {
	
	GERENTE(1),ANALISTA(2),ASSISTENTE(3),VENDEDOR(4);
	
	private int codCargo;
	
	Cargos(int codCargo){
		this.codCargo = codCargo;
	}
	
	public int getcodCargo() {
		return this.codCargo;
	}
}
