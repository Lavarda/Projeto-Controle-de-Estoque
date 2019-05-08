package Implementacao;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConnectionDB {

    private Connection db = null; // Conexão
    public Statement query; // Query
    public ResultSet result; // Resultado da query
    private String URL = "jdbc:postgresql://192.168.6.153:5432/"; // url do servidor
    private String USER = "groupaps"; // usuario do db
    private String PASSWORD = "aps2019-1"; // senha do usuario
    private String DATABASE = "projeto_estoque"; // banco 
    
    public void Conectar() {
        
    	try {
            Class.forName("org.postgresql.Driver");
            db = DriverManager.getConnection(this.URL + this.DATABASE, this.USER, this.PASSWORD);
            db.setAutoCommit(false);
            if( db != null ) {
            	System.out.println("Conexão realizada com sucesso!");
            }
        } catch (ClassNotFoundException cnfe) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar o driver");
            cnfe.printStackTrace();
        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null, "erro na query");
            sqlex.printStackTrace();
        }
    }
    
    public void SelectQuery(String qr){
    	
    	try {
    		query = db.createStatement();
            ResultSet result = query.executeQuery(qr);
            while (result.next()) {
        	  String nome = result.getString("nome_usuario");
        	  System.out.println(nome + "\n");
        	}
     	} catch (SQLException sqlex) {
     		JOptionPane.showMessageDialog(null, "erro na query");
     		sqlex.printStackTrace();
     	}
    	
    }
    
    public void InsertQuery(String qr){
    	
    	try {
    		Statement stmt = db.createStatement();
//    		Statement query = db.prepareStatement(qr);
    		stmt.executeUpdate(qr);
    		db.commit();
    	} catch ( Exception e) {
    		try {
				db.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
    		System.out.println(e);
    	}
    	
    }
    
    public void Desconectar() {
        try {
			db.close();
        	System.out.println("Conexão cancelada com sucesso!");
        } catch (SQLException onConClose) {
            JOptionPane.showMessageDialog(null, "Erro ao desconectar o banco");
            onConClose.printStackTrace();
        }
    }
    
    public static void main(String args[]) {
    	ConnectionDB db = new ConnectionDB();
    	db.Conectar(); // Conectar com o DB
//    	db.SelectQuery("SELECT * FROM cadastro_usuario"); // Fazer querys de consulta no banco.
//    	db.InsertQuery("insert into venda_produtos(cod_produto,cod_usuario,dt_compra_produto) values(1,23,'10')"); // Fazer query de modificação UPDATE,INSERT e DELETE.
    	db.Desconectar(); // Desconectar do DB.
    	
    }
}
