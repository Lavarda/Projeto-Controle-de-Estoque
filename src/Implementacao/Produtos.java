package Implementacao;

//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.text.DateFormat;
//import java.util.*;
//import java.util.ArrayList;
import java.sql.*;
import java.util.Scanner;

import javax.swing.JOptionPane;
import Connections.ConnectionDB;

public class Produtos { 
	
    private String nomeProduto;
    private double preco;
    private Categoria categoria;
    static ConnectionDB db = new ConnectionDB();
	private Scanner s = new Scanner(System.in);
    
    public Produtos() {
    	
    }

    public Produtos(String nomeProduto, double preco, Categoria categoria) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.categoria = categoria;
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

    public Categoria getCategoria() {
        return this.categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    public void mostrarProduto() {
    	System.out.println(getNomeProduto() + " " + getNomeProduto() +  " " + getCategoria());
    }
    
    public void inserirProduto(){
    	ConnectionDB.Conectar();
       try {
    	 String sql = "INSERT INTO PRODUTOS (nome_produto, preco_produto, cod_categoria) VALUES (?, ?, ?)";
        PreparedStatement stm = ConnectionDB.preparedStament(sql);
        stm.setString(1, this.getNomeProduto());
        stm.setDouble(2, this.getPreco());
        stm.setInt(3,this.getCategoria().getCodCategoria());
        ConnectionDB.runPreparedStatment(stm); 
		JOptionPane.showMessageDialog(null, "Produto cadastrado com exito.");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Erro ao inserir dados \nErro: "+ex);
		}
       ConnectionDB.Desconectar();
    }
    
    public void alterarProduto(){
    	ConnectionDB.Conectar();
    	try{
    		String sql = "UPDATE PRODUTOS SET preco_produto = ? WHERE nome_produto=?";
			System.out.println("Nome do produto que deseja alterar o preço:");
			String nome_produto = s.nextLine();
			System.out.println("Novo preço:");
			Double preco = s.nextDouble(); 
    		PreparedStatement stm = ConnectionDB.preparedStament(sql);
    		stm.setDouble(1, preco);
    		stm.setString(2, nome_produto);
    		ConnectionDB.runPreparedStatment(stm);
    		JOptionPane.showMessageDialog(null, "Produto alterado com exito.");
    	} catch (SQLException ex) {
    		JOptionPane.showMessageDialog(null,"Erro ao alterar dados \nErro: "+ex);
    	}
    	ConnectionDB.Desconectar();
    }
    
    public void excluirProduto(){
    	ConnectionDB.Conectar();
        try{
			System.out.println("Codigo do produto que deseja excluir:");
			int cod_produto = s.nextInt(); 
        	String sql = "DELETE FROM estoque WHERE cod_produto=?";
        	PreparedStatement stm = ConnectionDB.preparedStament(sql);
        	stm.setInt(1, cod_produto );
        	ConnectionDB.runPreparedStatment(stm);
        	JOptionPane.showMessageDialog(null, "Produto excluido com exito.");
        } catch (SQLException ex) {
        	JOptionPane.showMessageDialog(null, "Erro ao excluir dados \nErro: "+ex);
        }
        ConnectionDB.Desconectar();
    }
    public static void listarTodos() throws Exception {
    	ConnectionDB.Conectar();
    		String sql = "SELECT * FROM PRODUTOS ORDER BY nome_produto";
    		PreparedStatement stm = ConnectionDB.preparedStament(sql);
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
}
