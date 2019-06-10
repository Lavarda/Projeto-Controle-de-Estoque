package Implementacao;

import java.util.EnumSet;
import java.util.Scanner;

public enum Categoria {
	ACHOCOLATADOS(1),
	AGUA(2),
	ALCOOLICAS(3),
	SOJA(4),
	ENERGETICAS(5),
	ESPORTIVAS(6), 
	CAFES(7),
	CHAS(8),
	TODAS(9);
	private final int codCategoria;
	
	private Categoria(int codCategoria) {
		this.codCategoria = codCategoria;		
	}
	
	public int getCodCategoria() {
		return codCategoria;
	}
	public static int returnUserValueCodCategoria() {
		int result;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Selecione a opção desejada de Categorias: ");
		for (Categoria categorias : EnumSet.allOf(Categoria.class)) {
			System.out.println(categorias.name() + " " + "("+ categorias.getCodCategoria() +")");
		}
		 result = scanner.nextInt();
		return result;
	}
	
}