package Implementacao;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

public class Main {
	 public static void main(String args[]) throws SQLException {
		 Relatorios.usuariosCidade("Florianopolis");
	 }
//		 File fileFuncionarios = new File("C:\\Users\\Pichau\\Documents\\ArquivosTesteFileWritter\\Teste.txt");
//		 try {
//			fileFuncionarios.createNewFile();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		 	Funcionario f = new Funcionario("1122330","Gui","123456",Cargo.ASSISTENTE,Categoria.BEBIDA);
//		 	Funcionario h = new Funcionario("111333", "Joana", "aaa111", Cargo.ASSISTENTE, Categoria.DESTILADOS);
//		 	Gerente g = new Gerente(null, null, null, null);
//		 	g.incluirFuncionario(f, fileFuncionarios);
//		 	g.incluirFuncionario(h, fileFuncionarios);
//	    }
	
}