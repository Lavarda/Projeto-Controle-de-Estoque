package Connections;

import java.sql.*;

import javax.swing.JOptionPane;

public class ConnectionDB {

    private Connection db = null; // Conexão
    private Statement query; // Query
    private PreparedStatement stm = null; // Query modificavel
    private ResultSet result; // Resultado da query
    // HOST PADRÂO USAR QUANDO ESTIVER SEM O DB "jdbc:postgresql://127.0.0.1:5432/"
    private String URL = "jdbc:postgresql://192.168.4.204:5432/"; // url do servidor
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
    
    public ResultSet SelectQuery(String qr){
    	
    	try {
    		query = db.createStatement();
            this.result = query.executeQuery(qr);
            
     	} catch (SQLException sqlex) {
     		JOptionPane.showMessageDialog(null, "erro na query");
     		sqlex.printStackTrace();
     	}
		return result;
    	
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
    
    public PreparedStatement preparedStament(String qr) {	
		try {
			stm = db.prepareStatement(qr);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return stm;
    }
    
    public ResultSet runPreparedSelect(PreparedStatement qr) throws SQLException {
    	
    	try {
			this.result = qr.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;

    }
    
    public void runPreparedStatment(PreparedStatement qr) throws SQLException {
    	try {
			qr.executeUpdate();
			db.commit();
		} catch (SQLException e) {
			db.rollback();
			e.printStackTrace();
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
