package Connections;

import java.sql.*;

import javax.swing.JOptionPane;

public class ConnectionDB {

    private static Connection db = null; // Conexão
    private static Statement query; // Query
    private static PreparedStatement stm = null; // Query modificavel
    private static ResultSet result; // Resultado da query

    // HOST PADR�O USAR QUANDO ESTIVER SEM O DB "jdbc:postgresql://127.0.0.1:5432/"
    private static String URL = "jdbc:postgresql://localhost/"; // url do servidor 192.168.4.204:5432
    private static String USER = "guilherme"; // usuario do db groupaps
    private static String PASSWORD = "123456"; // senha do usuario aps2019-1
    private static String DATABASE = "projeto_estoque"; // banco projeto_estoque
    
    public static void Conectar() {
        
    	try {
            Class.forName("org.postgresql.Driver");
            db = DriverManager.getConnection(URL + DATABASE, USER, PASSWORD);
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
    
    public static ResultSet SelectQuery(String qr){
    	
    	try {
    		query = db.createStatement();
            result = query.executeQuery(qr);
            
     	} catch (SQLException sqlex) {
     		JOptionPane.showMessageDialog(null, "erro na query");
     		sqlex.printStackTrace();
     	}
		return result;
    	
    }
    
    public static void InsertQuery(String qr){
    	
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
    
    public static PreparedStatement preparedStament(String qr) {	
		try {
			stm = db.prepareStatement(qr);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return stm;
    }
    
    public static ResultSet runPreparedSelect(PreparedStatement qr) throws SQLException {
    	
    	try {
			result = qr.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;

    }
    
    public static void runPreparedStatment(PreparedStatement qr) throws SQLException {
    	try {
			qr.executeUpdate();
			db.commit();
		} catch (SQLException e) {
			db.rollback();
			e.printStackTrace();
		}
    }
    
    public static void Desconectar() {
        try {
			db.close();
        	System.out.println("Conexão cancelada com sucesso!");
        } catch (SQLException onConClose) {
            JOptionPane.showMessageDialog(null, "Erro ao desconectar o banco");
            onConClose.printStackTrace();
        }
    }
}
