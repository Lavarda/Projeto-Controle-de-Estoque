package Implementacao;

//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.text.DateFormat;
//import java.util.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Produtos { 
    private int codigoProduto;
    private String nomeProduto;
    private double preco;
    private int codigoCategoria;
    static ConnectionDB db = new ConnectionDB();

    public Produtos(int codigoProduto, String nomeProduto, double preco, int codigoCategoria) {
        this.codigoProduto = codigoProduto;
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.codigoCategoria = codigoCategoria;
    }
    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
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
    	System.out.println(this.codigoProduto + ' ' + this.nomeProduto + ' ' + this.preco +  ' ' + this.codigoCategoria);
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
			JOptionPane.showMessageDialog(null, "Erro ao inserir dados /nErro: "+ex);
		}
       db.Desconectar();
    }
    public void alterar() throws Exception {
    	db.Conectar();
    	try{
    		String sql = "UPDATE PRODUTOS SET nome_produto=?, preco_produto=?,cod_categoria=? WHERE cod_produto=?";
    		PreparedStatement stm = db.preparedStament(sql);
    		stm.setString(1, this.getNomeProduto());
    		stm.setDouble(2, this.getPreco());
    		stm.setInt(3, this.getCodigoCategoria());
    		stm.setInt(4, this.getCodigoProduto());
    		db.runPreparedStatment(stm);
    		JOptionPane.showMessageDialog(null, "Produto alterado com exito.");
    	} catch (SQLException ex) {
    		JOptionPane.showMessageDialog(null,"Erro ao alterar dados /nErro: "+ex);
    	}
    	db.Desconectar();
    }
    public void excluir() throws Exception {
    	db.Conectar();
        try{
        	String sql = "DELETE FROM PRODUTOS WHERE cod_produto=?";
        	PreparedStatement stm = db.preparedStament(sql);
        	stm.setInt(1, this.getCodigoProduto());
        	db.runPreparedStatment(stm);
        	JOptionPane.showMessageDialog(null, "Produto excluido com exito.");
        } catch (SQLException ex) {
        	JOptionPane.showMessageDialog(null, "Erro ao excluir dados /nErro: "+ex);
        }
        db.Desconectar();
    }
    public ArrayList<Produtos> listarTodos() throws Exception {
    	db.Conectar();
    		String sql = "SELECT * FROM PRODUTOS ORDER BY nome_produto";
    		PreparedStatement stm = db.preparedStament(sql);
    		ResultSet lp = stm.executeQuery();

    		ArrayList<Produtos> listaProdutos = new ArrayList<Produtos>();
    		while (lp.next()) {
    			Produtos produtos = new Produtos(codigoProduto, nomeProduto, preco, codigoCategoria);
    			produtos.setCodigoProduto(lp.getInt("codigo_produto"));
    			produtos.setNomeProduto(lp.getString("nome_produto"));
    			produtos.setPreco(lp.getDouble("preco_produto"));
    			produtos.setCodigoCategoria(lp.getInt("cod_categoria"));
 
            listaProdutos.add(produtos);
        }
        return listaProdutos;
    }
    public static void main(String[]args) throws Exception {
    	Produtos p = new Produtos (1, "Cerveja", 3.50, 1);
    	p.inserir();
    }
}
