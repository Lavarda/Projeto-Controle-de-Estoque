package Implementacao;

//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.text.DateFormat;
//import java.util.*;
//import java.util.ArrayList;
import java.sql.*;
import java.util.Scanner;

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
        
        System.out.println("Digite o nome do produto que deseja cadastrar: ");
        String nomeProduto = s.nextLine();
        System.out.println("Digite o preço do produto que deseja cadastrar: ");
        String preco = s.nextLine();
        double precoProduto = Double.parseDouble(preco);
        System.out.println("Digite o código da categoria do produto: ");
        int codCategoria = s.nextInt();
        
        stm.setString(1, nomeProduto);
        stm.setDouble(2, precoProduto);
        stm.setInt(3, codCategoria);
        
        ConnectionDB.runPreparedStatment(stm); 
        
		System.out.println("Produto cadastrado com exito.");
		} catch (SQLException ex) {
			System.out.println("Erro ao inserir dados \nErro: "+ex);
		}
       ConnectionDB.Desconectar();
    }
    
    public void alterarProduto(){
    	ConnectionDB.Conectar();
    	try{
    		String sql = "UPDATE PRODUTOS SET preco_produto = ? WHERE nome_produto=?";
			System.out.println("Nome do produto que deseja alterar o preÃ§o:");
			String nomeProduto = s.nextLine();
			System.out.println("Novo preÃ§o:");
			Double preco = s.nextDouble(); 
    		PreparedStatement stm = ConnectionDB.preparedStament(sql);
    		stm.setDouble(1, preco);
    		stm.setString(2, nomeProduto);
    		ConnectionDB.runPreparedStatment(stm);
    		System.out.println("Produto alterado com exito.");
    	} catch (SQLException ex) {
    		System.out.println("Erro ao alterar dados");
    	}
    	ConnectionDB.Desconectar();
    }
    
    public void excluirProduto(){
    	ConnectionDB.Conectar();
        try{
			System.out.println("Codigo do produto que deseja excluir:");
			int codProduto = s.nextInt(); 
        	String sql = "DELETE FROM produtos WHERE cod_produto=?";
        	PreparedStatement stm = ConnectionDB.preparedStament(sql);
        	stm.setInt(1, codProduto);
        	ConnectionDB.runPreparedStatment(stm);
        	System.out.println("Produto excluido com exito.");
        } catch (SQLException ex) {
        	System.out.println("Erro ao excluir dados \nErro: "+ex);
        }
        ConnectionDB.Desconectar();
    }
    public  void listarTodos(){
    		String sql = "SELECT * FROM PRODUTOS ORDER BY nome_produto";
    		int codProduto;
    		String nomeProduto;
    		double precoProduto;
    		int codCategoriaProduto;
    		try {
    			ConnectionDB.Conectar();
    			PreparedStatement stm = ConnectionDB.preparedStament(sql);
    			ResultSet result = stm.executeQuery();
    		while(result.next()) {
    				codProduto = result.getInt("cod_produto");
    				nomeProduto = result.getString("nome_produto");
    				precoProduto = result.getDouble("preco_produto");
    				codCategoriaProduto = result.getInt("cod_categoria");
    				System.out.println(codProduto + "|" + nomeProduto + "|" + precoProduto + "|" + codCategoriaProduto);
    		}
    		}catch(SQLException ex) {
    			System.out.println("Erro ao listar dados \n");
    		}
    }
}
