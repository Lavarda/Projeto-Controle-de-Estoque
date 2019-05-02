package Implementacao;


import java.sql.*;
import javax.swing.JOptionPane;

public class ConnectionDB {
	 /** Usada para a conexao com o banco de dados */
    private Connection con = null;
    
    /** Usada para realizar as instrucoes SQL */
    public Statement stmt; 
    
    /** Retorna os dados das tabelas do banco */
    public ResultSet rs; 
    
    /**Usada para receber o endereco da base de dados*/
    private String endereco;
    
    /**Usada para receber o nome do usuario do banco */
    private String usuario;
    
    /**Usada para receber a senha do usuario do banco */
    private String senha; 

    public void Conectar(String strEnd, String strUsuario, String strSenha) {
        endereco = strEnd; 
        usuario = strUsuario;
        senha = strSenha;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(endereco, usuario, strSenha);
            stmt = con.createStatement();
       
        } catch (ClassNotFoundException cnfe) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar o driver");
            cnfe.printStackTrace();
         
        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null, "erro na query");
            sqlex.printStackTrace();
        }
    }
    
    public void Desconectar() {
        try {
            con.close();
        } catch (SQLException onConClose) {
            JOptionPane.showMessageDialog(null, "Erro ao desconectar o banco");
            onConClose.printStackTrace();
        }
    }
    
    public static void main(String args[]) {
    	ConnectionDB con = new ConnectionDB();
//    	jdbc:postgresql://localhost:5432/projeto_01
    	con.Conectar("jdbc:postgresql://127.0.0.1:5432/projeto_estoque", "projeto_estoque", "projeto_estoque123");
    }
}