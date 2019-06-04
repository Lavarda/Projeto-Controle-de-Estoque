package Implementacao;

public enum Categoria {
	BEBIDA(1),CERVEJA(2),SUCOS(3),DESTILADOS(4);
	private final int codCategoria;
	
	private Categoria(int codCategoria) {
		this.codCategoria = codCategoria;		
	}

	public int getCodCategoria() {
		return this.codCategoria;
	}
	
}