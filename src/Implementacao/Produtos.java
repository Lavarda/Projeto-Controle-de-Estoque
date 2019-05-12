package Implementacao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.*;
import java.sql.*;
import java.util.ArrayList;

public class Produtos { 
    private int codigoProduto;
    private String nomeProduto;
    private double preco;
    private int codigoCategoria;

    public Produtos(int codigoProduto, String nomeProduto, double preco, int codigoCategoria) {
        this.codigoProduto = 0;
        this.nomeProduto = "";
        this.preco = 0.0;
        this.codigoCategoria = 0;
    }

    public Produtos(int codigoProduto) {
        this.codigoProduto = codigoProduto;
        this.nomeProduto = "";
        this.preco = 0.0;
        this.codigoCategoria = 0;
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

    @Override
    public String toString() {
        return getNomeProduto();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Produtos) {
            Produtos p = (Produtos) o;
            if (p.getCodigoProduto() == this.getCodigoProduto()) {
                return true;
            }
        }
        return false;
    }
}
    public void mostrarProduto() {
    	System.out.println(this.codigoProduto + ' ' + this.nomeProduto + ' ' + this.preco +  ' ' + this.codigoCategoria);
    }
    @Override
    public void inserir(Produtos produtos) throws Exception {
    	ConnectionDB c = new ConnectionDB();
        String sql = "INSERT INTO PRODUTO (nome_produto, preco_produto, cod_categoria) VALUES (?, ?, ?, 0)";
        PreparedStatement ps = c.getConnectionDB().prepareStatement(sql);
        ps.setString(1, produtos.getNomeProduto());
        ps.setDouble(2, produtos.getPreco());
        ps.setInt(3,produtos.getCodigoCategoria);
        ps.execute();
        c.confirmar();
    }
    @Override
    public void alterar(Produtos produtos) throws Exception {
    	ConnectionDB c = new ConnectionDB();
        String sql = "UPDATE PRODUTO SET nome_produto=?, preco_produto=?,cod_categoria=? WHERE cod_produto=?";
        PreparedStatement ps = c.getConnectionDB().prepareStatement(sql);
        ps.setString(1, produtos.getNomeProduto());
        ps.setDouble(2, produtos.getPreco());
        ps.setInt(3, produtos.getCodigoCategoria());
        ps.setInt(4, produtos.getCodigoProduto());
        ps.execute();
        c.confirmar();
    }
    @Override
    public void excluir(Produtos produtos) throws Exception {
        ConnectionDB c = new ConnectionDB();
        String sql = "DELETE FROM PRODUTO WHERE cod_produto=?";
        PreparedStatement ps = c.getConnectionDB().prepareStatement(sql);
        ps.setInt(1, produtos.getCodigoProduto());
        ps.execute();
        c.confirmar();
    }
    @Override
    public ArrayList<Produtos> listarTodos() throws Exception {
    	ConnectionDB c = new ConnectionDB();
        String sql = "SELECT * FROM PRODUTO ORDER BY nome_produto";
        PreparedStatement ps = c.getConnectionDB().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        ArrayList listaProdutos = new ArrayList();
        while (rs.next()) {
            Produtos produtos = new Produtos();
            produtos.setCodigoProduto(rs.getInt("codigo_produto"));
            produtos.setNomeProduto(rs.getString("nome_produto"));
            produtos.setPreco(rs.getDouble("preco_produto"));
            produtos.setCodigoCategoria(rs.getInt("cod_categoria"));
 
            listaProdutos.add(produtos);
        }

        return listaProdutos;
    }
}
