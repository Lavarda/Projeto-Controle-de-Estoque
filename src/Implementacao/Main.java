package Implementacao;

public class Main {
	 public static void main(String args[]) {
		 Funcionario a = new Funcionario("aaa@aaaa.com","123456","111.222.333-44");
		 System.out.println(a.getCpf()+ " | " + a.getEmail());
		 System.out.println(a.getSenha());
		 a.realizarAutenticacao("aaa@aaaa.com","123456");
		 
	    }
	
}