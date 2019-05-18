package View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.Color;

public class InterfaceProdutos extends InterfacePrincipal {
	
	private static final long serialVersionUID = 1L;
	private JPanel fieldProdutos;
	private JTextField fieldNome;
	private JTextField fieldPreco;
	private JTextField fieldQuantidade;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceProdutos frame = new InterfaceProdutos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public InterfaceProdutos() throws ParseException{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 600);
		fieldProdutos = new JPanel();
		fieldProdutos.setForeground(Color.BLACK);
		fieldProdutos.setBackground(Color.WHITE);
		fieldProdutos.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(fieldProdutos);
		fieldProdutos.setLayout(null);
		
		JLabel lblNome = new JLabel(" Nome:");
		lblNome.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblNome.setBounds(32, 74, 60, 23);
		fieldProdutos.add(lblNome);
		
		fieldNome = new JTextField();
		fieldNome.setBackground(Color.WHITE);
		fieldNome.setBounds(100, 78, 310, 20);
		fieldProdutos.add(fieldNome);
		fieldNome.setColumns(10);
		
		
		JLabel lblPreco = new JLabel(" Preço:");
		lblPreco.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblPreco.setBounds(32, 114, 120, 20);
		fieldProdutos.add(lblPreco);
		
		fieldPreco = new JTextField();
		fieldPreco.setBackground(Color.WHITE);
		fieldPreco.setBounds(100, 118, 310, 20);
		fieldProdutos.add(fieldPreco);
		fieldPreco.setColumns(10);
		
		JLabel lblQuantidade = new JLabel(" Quantidade:");
		lblQuantidade.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblQuantidade.setBounds(32, 155, 120, 20);
		fieldProdutos.add(lblQuantidade);
		
		fieldQuantidade = new JTextField();
		fieldQuantidade.setBackground(Color.WHITE);
		fieldQuantidade.setBounds(150, 158, 260, 20);
		fieldProdutos.add(fieldQuantidade);
		fieldQuantidade.setColumns(10);
		
		JLabel lblCategoria = new JLabel(" Categoria:");
		lblCategoria.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblCategoria.setBounds(32, 190, 120, 25);
		fieldProdutos.add(lblCategoria);
		
		JComboBox comboBoxCategoria = new JComboBox();
		comboBoxCategoria.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		comboBoxCategoria.setBounds(135, 195, 275, 20);
		fieldProdutos.add(comboBoxCategoria);
		
		JButton botaoCadastrar = new JButton("Cadastrar");
		botaoCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botaoCadastrar.setForeground(Color.BLACK);
		botaoCadastrar.setBackground(Color.WHITE);
		botaoCadastrar.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		botaoCadastrar.setBounds(40, 450, 98, 23);
		fieldProdutos.add(botaoCadastrar);
		
		JButton botaoLimpar = new JButton("Limpar");
		botaoLimpar.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		botaoLimpar.setForeground(Color.BLACK);
		botaoLimpar.setBackground(Color.WHITE);
		botaoLimpar.setBounds(180, 450, 98, 23);
		fieldProdutos.add(botaoLimpar);
		
		JButton botaoCancelar = new JButton("Cancelar");
		botaoCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		botaoCancelar.setForeground(Color.BLACK);
		botaoCancelar.setBackground(Color.WHITE);
		botaoCancelar.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		botaoCancelar.setBounds(320, 450, 89, 23);
		fieldProdutos.add(botaoCancelar);
		
		JPanel panelDivisao = new JPanel();
		panelDivisao.setBackground(Color.BLACK);
		panelDivisao.setBounds(445, 20, 2, 500);
		fieldProdutos.add(panelDivisao);
		
		JPanel panelBuscaProdutos = new JPanel();
		panelBuscaProdutos.setBackground(Color.WHITE);
		panelBuscaProdutos.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
		panelBuscaProdutos.setBounds(472, 30, 400, 25);
		fieldProdutos.add(panelBuscaProdutos);
		panelBuscaProdutos.setLayout(null);
		
		JLabel lblBuscaNomeProdutos = new JLabel("Nome");
		lblBuscaNomeProdutos.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblBuscaNomeProdutos.setBounds(50, 0, 47, 25);
		panelBuscaProdutos.add(lblBuscaNomeProdutos);
		
		JLabel lblBuscaPrecoProdutos = new JLabel("Preço");
		lblBuscaPrecoProdutos.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblBuscaPrecoProdutos.setBounds(180, 0, 77, 25);
		panelBuscaProdutos.add(lblBuscaPrecoProdutos);
		
		JLabel lblBuscaCodigoCategoria = new JLabel("Categoria");
		lblBuscaCodigoCategoria.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblBuscaCodigoCategoria.setBounds(280, 0, 77, 25);
		panelBuscaProdutos.add(lblBuscaCodigoCategoria);	
	}

}
