package Implementacao;

//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.text.DateFormat;
//import java.util.*;
//import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;
import Connections.ConnectionDB;

public class Produtos { 
    private String nomeProduto;
    private double preco;
    private int codigoCategoria;
    static ConnectionDB db = new ConnectionDB();

    public Produtos(String nomeProduto, double preco, int codigoCategoria) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.codigoCategoria = codigoCategoria;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCodigoCategoria() {
        return codigoCategoria;
    }

    public void setCodigoCategoria(int codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }
    
    public void mostrarProduto() {
    	System.out.println(this.nomeProduto + " " + this.preco +  " " + this.codigoCategoria);
    }
    
    public void inserir() throws Exception {
    	db.Conectar();
       try {
    	 String sql = "INSERT INTO PRODUTOS (nome_produto, preco_produto, cod_categoria) VALUES (?, ?, ?)";
        PreparedStatement stm = db.preparedStament(sql);
        stm.setString(1, this.getNomeProduto());
        stm.setDouble(2, this.getPreco());
        stm.setInt(3,this.getCodigoCategoria());
        db.runPreparedStatment(stm);
		JOptionPane.showMessageDialog(null, "Produto cadastrado com exito.");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Erro ao inserir dados \nErro: "+ex);
		}
       db.Desconectar();
    }
    
    public void alterar(int codProduto) throws Exception {
    	db.Conectar();
    	try{
    		String sql = "UPDATE PRODUTOS SET nome_produto=?, preco_produto=?,cod_categoria=? WHERE cod_produto=?";
    		PreparedStatement stm = db.preparedStament(sql);
    		stm.setString(1, this.getNomeProduto());
    		stm.setDouble(2, this.getPreco());
    		stm.setInt(3, this.getCodigoCategoria());
    		stm.setInt(4, codProduto );
    		db.runPreparedStatment(stm);
    		JOptionPane.showMessageDialog(null, "Produto alterado com exito.");
    	} catch (SQLException ex) {
    		JOptionPane.showMessageDialog(null,"Erro ao alterar dados \nErro: "+ex);
    	}
    	db.Desconectar();
    }
    
    public void excluir( int codProduto ) throws Exception {
    	db.Conectar();
        try{
        	String sql = "DELETE FROM PRODUTOS WHERE cod_produto=?";
        	PreparedStatement stm = db.preparedStament(sql);
        	stm.setInt(1, codProduto);
        	db.runPreparedStatment(stm);
        	JOptionPane.showMessageDialog(null, "Produto excluido com exito.");
        } catch (SQLException ex) {
        	JOptionPane.showMessageDialog(null, "Erro ao excluir dados \nErro: "+ex);
        }
        db.Desconectar();
    }
    public static void listarTodos() throws Exception {
    	db.Conectar();
    		String sql = "SELECT * FROM PRODUTOS ORDER BY nome_produto";
    		PreparedStatement stm = db.preparedStament(sql);
    		try {
    		ResultSet result = stm.executeQuery();
    		String lista = "";
    		while(result.next()) {
    			lista= lista + result.getInt("cod_produto") + " - " + result.getString("nome_produto") + " - " + result.getDouble("preco_produto") + " - " + result.getInt("cod_categoria") + " - " + result.getInt("qntd_produto") + "\n";
    		}
    		JOptionPane.showMessageDialog(null, lista);
    		}catch(SQLException ex) {
    			JOptionPane.showMessageDialog(null, "Erro ao listar dados \nErro: "+ex);
    		}
    }
    
    public static void main(String[]args) throws Exception {
    	String selecao = JOptionPane.showInputDialog("Selecione:\n1 - Inserir produto\n2 - Alterar produto\n3- Excluir produto\n4 - Listar produtos\n0 - Sair");
    	while(!selecao.equals("0")){
    		if(selecao.equals("1"))	{
    			Produtos p = new Produtos("Whiskey", 4.0, 2);
    			p.inserir();
    		} else if(selecao.equals("2")){
    			Produtos p = new Produtos("Schin", 4.0, 2);
    			p.alterar(4);
    		} else if(selecao.equals("3")){
    			Produtos p = new Produtos("Schin", 4.0, 2);
    			p.excluir(8);
    		} else if (selecao.equals("4")) {
    			listarTodos();
    		}
    			System.exit(0);
    	}
    }
}
