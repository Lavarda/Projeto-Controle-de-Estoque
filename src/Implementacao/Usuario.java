package Implementacao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.*;

import Connections.ConnectionDB;

public class Usuario extends Pessoa{
	
	private ArrayList<Produtos> produtos = new ArrayList<Produtos>();
	private Scanner s = new Scanner(System.in);
	static ConnectionDB db = new ConnectionDB();
	private java.util.Date dataAtual = new Date();
	private String dataFormatada = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(dataAtual);
	
	public Usuario(String nome,String email,String numeroCelular,
				   String cpf, String rg,String dataNascimento, String endereco, String sexo, String estadoCivil) {
		super(nome,email,numeroCelular,cpf,rg,dataNascimento,endereco,sexo,estadoCivil);
	}
	
	public void cadastrarUsuario() throws SQLException {
		db.Conectar();
		
		String sql = "insert into cadastro_usuario(cod_usuario,nome_usuario,dt_nascimento_usuario,email_usuario,cpf_usuario"
					  + ",rg_usuario,dt_cadastro_usuario,cod_funcionario) values(?,?,?,?,?,?,?,?)";
		
		PreparedStatement stm = db.preparedStament(sql);
		
		stm.setInt(1, 1);
		stm.setString(2, this.getNome() );
		stm.setString(3, this.getDataNascimento());
		stm.setString(4, this.getEmail());
		stm.setString(5, this.getCpf());
		stm.setString(6, this.getRg() );
		stm.setString(7, this.dataFormatada );
		stm.setInt(8, 1);
		
		db.runPreparedStatment(stm);
		db.Desconectar();
	}
	
	public void modifyUser() throws SQLException {
		db.Conectar();
		
		String sql = "update cadastro_usuario set ? = ? where ? = ?";
		
		PreparedStatement stm = db.preparedStament(sql);
		
		System.out.println("Digitar o nome da coluna que deseja modificar:");
		String column = s.nextLine();
		System.out.println("Digitar novo valor:");
		String modify = s.nextLine();
		System.out.println("Digitar a condição:");
		String condicion = s.nextLine();
		
		stm.setString(1, column);
		stm.setString(2, modify);
		stm.setString(3, column);
		stm.setString(4, condicion);
		
		System.out.println(stm);
		db.runPreparedStatment(stm);
		db.Desconectar();
	}
	
	public void deleteUser() throws SQLException {
		db.Conectar();
		
		String sql = "delete from cadastro_usuario where nome_usuario = ?";
		
		PreparedStatement stm = db.preparedStament(sql);
		
		stm.setString(1, this.getNome() );
		
		db.runPreparedStatment(stm);
		db.Desconectar();
	}
	
	public void produtosComprados() throws SQLException {		
		db.Conectar();
		ResultSet result = db.SelectQuery("SELECT * FROM produtos");
		produtos.clear();
		while ( result.next() ) {
			Produtos produto = new Produtos(result.getInt("cod_produto"), result.getString("nome_produto"), result.getFloat("preco_produto"), result.getInt("cod_categoria") );
			produtos.add(produto);
		}		
		
		for( Produtos i : produtos) {
			System.out.println( i.getCodigoProduto() + " "  + i.getNomeProduto() + " " + i.getPreco() + " " + i.getCodigoCategoria());
		}
		
		db.Desconectar();
	}
	
	public String pesquisarProduto(){
        
        System.out.println("Digite o nome do produto que deseja pesquisar: ");
        String nomeProduto = s.nextLine(); 
        
        for(int i = 0; i < produtos.size(); i ++){
        	if(produtos.get(i).getNomeProduto().equals(nomeProduto)){
                return nomeProduto;
            }else{	
            }
        }
        
        return "false";
        
    }
    
	
//	public static void main(String args[]) throws SQLException {
//		Usuario c = new Usuario("Vitor Lavarda","vitorlavarda.souza@gmail.com","(48) 9854-8350","123.123.13","11123123","21/02/20","Rua tal","M","Solteiro");
//		c.dadosPessoa();
//		c.produtosComprados();
//		String buscaProduto = c.pesquisarProduto();
//		if(buscaProduto.equals("false")){
//			System.out.println("O Produto não foi encontrado");
//		}else {
//			System.out.println("Produto encontrado" + " " + buscaProduto);
//		}
//		c.cadastrarUsuario();
//		c.deleteUser();
//		c.modifyUser();
//	}
	
}
