package Implementacao;

public class Main {
	 public static void main(String args[]) {	
		 	Gerente julia = new Gerente("129876", "Julia Amaro", "123senha", 3);
		 	Funcionario f =  new Funcionario("112344","Guilherme Steinert","40028922","",1);
		 	julia.incluirFuncionario(f);
	    }
	
}