package Implementacao;

public class Funcionario extends Pessoa {
	
	private double salario;
	private String cargo;
	private String setor;
	private String dataAdmissao;

	public Funcionario(double salario, String setor, String dataAdmissao) {
		this.salario = salario;
		this.setor = setor;
		this.dataAdmissao = dataAdmissao;
	}
	public Funcionario(double salario,String cargo,String setor,String dataAdmissao) {
		this.salario = salario;
		this.cargo = cargo;
		this.setor = setor;
		this.dataAdmissao = dataAdmissao;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}	
	
}
