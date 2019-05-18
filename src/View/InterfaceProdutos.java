package View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
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
		setBounds(100, 100, 750, 550);
		fieldProdutos = new JPanel();
		fieldProdutos.setForeground(Color.BLACK);
		fieldProdutos.setBackground(Color.WHITE);
		fieldProdutos.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(fieldProdutos);
		fieldProdutos.setLayout(null);
		
		JLabel lblNome = new JLabel(" Nome:");
		lblNome.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblNome.setBounds(32, 64, 60, 23);
		fieldProdutos.add(lblNome);
		
		fieldNome = new JTextField();
		fieldNome.setBackground(Color.WHITE);
		fieldNome.setBounds(100, 68, 310, 20);
		fieldProdutos.add(fieldNome);
		fieldNome.setColumns(10);
		
		
		JLabel lblPreco = new JLabel(" Preço:");
		lblPreco.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblPreco.setBounds(32, 104, 120, 20);
		fieldProdutos.add(lblPreco);
		
		fieldPreco = new JTextField();
		fieldPreco.setBackground(Color.WHITE);
		fieldPreco.setBounds(100, 108, 310, 20);
		fieldProdutos.add(fieldPreco);
		fieldPreco.setColumns(10);
		
		JLabel lblQuantidade = new JLabel(" Quantidade:");
		lblQuantidade.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblQuantidade.setBounds(32, 185, 120, 20);
		fieldProdutos.add(lblQuantidade);
		
		fieldQuantidade = new JTextField();
		fieldQuantidade.setBackground(Color.WHITE);
		fieldQuantidade.setBounds(150, 188, 260, 20);
		fieldProdutos.add(fieldQuantidade);
		fieldQuantidade.setColumns(10);
		
		JLabel lblCategoria = new JLabel(" Categoria:");
		lblCategoria.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblCategoria.setBounds(32, 220, 120, 25);
		fieldProdutos.add(lblCategoria);
		
		JComboBox comboBoxCategoria = new JComboBox();
		comboBoxCategoria.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		comboBoxCategoria.setBounds(135, 225, 275, 20);
		fieldProdutos.add(comboBoxCategoria);
		
		JButton botaoCadastrar = new JButton("Cadastrar");
		botaoCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botaoCadastrar.setForeground(Color.BLACK);
		botaoCadastrar.setBackground(Color.WHITE);
		botaoCadastrar.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		botaoCadastrar.setBounds(40, 300, 98, 23);
		fieldProdutos.add(botaoCadastrar);
		
		JButton botaoLimpar = new JButton("Limpar");
		botaoLimpar.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		botaoLimpar.setForeground(Color.BLACK);
		botaoLimpar.setBackground(Color.WHITE);
		botaoLimpar.setBounds(180, 300, 98, 23);
		fieldProdutos.add(botaoLimpar);
		
		JButton botaoCancelar = new JButton("Cancelar");
		botaoCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		botaoCancelar.setForeground(Color.BLACK);
		botaoCancelar.setBackground(Color.WHITE);
		botaoCancelar.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		botaoCancelar.setBounds(320, 300, 89, 23);
		fieldProdutos.add(botaoCancelar);
		
	}

}
