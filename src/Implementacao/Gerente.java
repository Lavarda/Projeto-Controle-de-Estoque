package Implementacao;

public class Gerente extends Funcionario {
	
	public Gerente(double salario,String setor,String dataAdmissao) {
		super(salario,setor,dataAdmissao);
	}

	@Override
	public String toString() {
		return "[" + getSalario() + "\n" + getCargo() + "\n" + getSetor()+ "\n" + getDataAdmissao() + "\n" + getEndereco() + "\n"
				+ getSexo() + "\n" + getNome() + "\n" + getEmail() + "\n"+ getNumeroCelular() + "\n"
				+ getCpf() + "\n" + getRg() + "\n" + getDataNascimento() + "\n" + getEstadoCivil() + "]";
	}
	
	
}
