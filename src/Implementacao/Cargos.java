package Implementacao;

import java.util.EnumSet;
import java.util.Scanner;

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
	
	public static int returnUserValueCodCargos() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Selecione a opção desejada de Cargos: ");
		for (Cargos cargos : EnumSet.allOf(Cargos.class)) {
			System.out.println(cargos.name() + " " + "("+ cargos.getcodCargo() +")");
		}
		int result = scanner.nextInt();
		return result;
	}
}
