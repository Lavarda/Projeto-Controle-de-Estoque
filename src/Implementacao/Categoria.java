package Implementacao;

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
		return this.codCategoria;
	}
	
}