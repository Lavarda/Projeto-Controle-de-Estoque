package Implementacao;

import Connections.ConnectionDB;

public enum Cargos {
	
	GERENTE(1),ANALISTA(2),ASSISTENTE(3),VENDEDOR(4);
	
	private int codCargo;
	
	Cargos(int codCargo){
		this.codCargo = codCargo;
	}
	
	public void incluirFuncionario(int codCargo) {
		if (codCargo == 1) {
		}else {
			System.err.println("Este funcion�rio n�o tem permiss�o para incluir,editar,ou excluir um ou mais funcion�rios");
		}	
	}
	
	public void excluirFuncionario(int codCargo) {
		if(codCargo == 1) {
		}else {
			System.err.println("Este funcion�rio n�o tem permiss�o para incluir,editar,ou excluir um ou mais funcion�rios");
		}
		
	}
}
