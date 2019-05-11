package Implementacao;

public class Filiais {
	
	private ConnectionDB db = new ConnectionDB();
	private int codFilial;
	private String nomeFilial;
	private String telefoneFilial;
	private String cpnjFilial;
	private String bairroFilial;
	private int numeroEndereco;
	private String cidadeFilial;
	private String estado;
	private String cepFilial;

	public Filiais(int codFilial, String nomeFilial, String telefoneFilial, String cnpjFilial, String bairroFilial,
					int numeroEndereco, String cidadeFilial, String estado, String cepFilial) {
		
		this.codFilial = codFilial;
		this.nomeFilial = nomeFilial;
		this.telefoneFilial = telefoneFilial;
		this.cpnjFilial = cnpjFilial;
		this.bairroFilial = bairroFilial;
		this.numeroEndereco = numeroEndereco;
		this.cidadeFilial = cidadeFilial;
		this.estado = estado;
		this.cepFilial = cepFilial;
		
	}

	public int getCodFilial() {
		return codFilial;
	}

	public void setCodFilial(int codFilial) {
		this.codFilial = codFilial;
	}

	public String getNomeFilial() {
		return nomeFilial;
	}

	public void setNomeFilial(String nomeFilial) {
		this.nomeFilial = nomeFilial;
	}

	public String getTelefoneFilial() {
		return telefoneFilial;
	}

	public void setTelefoneFilial(String telefoneFilial) {
		this.telefoneFilial = telefoneFilial;
	}

	public String getCpnjFilial() {
		return cpnjFilial;
	}

	public void setCpnjFilial(String cpnjFilial) {
		this.cpnjFilial = cpnjFilial;
	}

	public String getBairroFilial() {
		return bairroFilial;
	}

	public void setBairroFilial(String bairroFilial) {
		this.bairroFilial = bairroFilial;
	}

	public int getNumeroEndereco() {
		return numeroEndereco;
	}

	public void setNumeroEndereco(int numeroEndereco) {
		this.numeroEndereco = numeroEndereco;
	}

	public String getCidadeFilial() {
		return cidadeFilial;
	}

	public void setCidadeFilial(String cidadeFilial) {
		this.cidadeFilial = cidadeFilial;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCepFilial() {
		return cepFilial;
	}

	public void setCepFilial(String cepFilial) {
		this.cepFilial = cepFilial;
	}
	
	public void receberProduto() {
		db.Conectar();
		db.Desconectar();
	}
}
