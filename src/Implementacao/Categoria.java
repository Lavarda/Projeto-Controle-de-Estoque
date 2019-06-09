package Implementacao;

import java.util.EnumSet;
import java.util.Scanner;

public enum Categoria {
	NENHUMA(0),
	ACHOCOLATADOS(1),
	AGUA_POTAVEL(2),
	BEBIDAS_A_BASE_DE_ANIS(4),
	BEBIDAS_ALCOOLICAS(5),
	BEBIDAS_DE_SOJA(6),
	BEBIDAS_ENERGETICAS(7),
	BEBIDAS_ESPORTIVAS(8),
	CAFES(9),
	CHAS(10),
	TODAS(11);
	private final int codCategoria;
	
	private Categoria(int codCategoria) {
		this.codCategoria = codCategoria;		
	}
	
	public int getCodCategoria() {
		return codCategoria;
	}
	public static int returnUserValueCodCategoria() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Selecione a opção desejada de Categorias: ");
		for (Categoria categorias : EnumSet.allOf(Categoria.class)) {
			System.out.println(categorias.name() + " " + "("+ categorias.getCodCategoria() +")");
		}
		int result = scanner.nextInt();
		scanner.close();
		return result;
	}
	
}