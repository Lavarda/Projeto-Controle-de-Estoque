package Implementacao;
import java.text.ParseException;
import View.*;


public class Main {
	 public static void main(String args[]) {
	    	ConnectionDB db = new ConnectionDB();
	    	db.Conectar(); // Conectar com o DB
	    	//db.SelectQuery("SELECT * FROM cadastro_usuario"); // Fazer querys de consulta no banco.
	    	//db.InsertQuery("DELETE table filiais"); // Fazer query de modificação UPDATE,INSERT e DELETE.
	    	db.Desconectar(); // Desconectar do DB.
	    	
	    }
	
}