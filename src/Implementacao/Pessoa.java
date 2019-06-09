package Implementacao;

public  abstract class Pessoa {
	
	private String nome;
	private String email;
	private String numeroCelular;
	private String cpf;
	private String rg;
	private String dataNascimento;
	private String endereco;
	private String sexo;
	private String estadoCivil;
	
	public Pessoa() {
		
	}
	public Pessoa(String nome,String email,String numeroCelular, String cpf, String rg,String dataNascimento, String endereco, String sexo, String estadoCivil) {
		this.nome = nome;
		this.email = email;
		this.numeroCelular = numeroCelular;
		this.cpf = cpf;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumeroCelular() {
		return numeroCelular;
	}

	public void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = numeroCelular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	public void dadosPessoa() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Email: " + this.email);
		System.out.println("Numero de Celular: " + this.numeroCelular);
		System.out.println("Cpf: " + this.cpf);
		System.out.println("Data de nascimento: " + this.dataNascimento);
		System.out.println("Endereço: " + this.endereco);
		System.out.println("RG: " + this.rg);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("Estado Civil: " + this.estadoCivil);
	}
}