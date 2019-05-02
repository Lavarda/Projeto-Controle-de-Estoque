package View;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.border.BevelBorder;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;

public class InterfaceFornecedor extends InterfacePrincipal {

	private JPanel contentPane;
	private JTextField fieldProdutoFornecido;
	private JTextField fieldCnpjFornecedor;
	private JTextField fieldNomeFornecedor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceFornecedor frame = new InterfaceFornecedor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public InterfaceFornecedor() throws ParseException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 899, 476);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomeFornecedor = new JLabel("Nome Fornecedor:");
		lblNomeFornecedor.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblNomeFornecedor.setBounds(28, 68, 160, 18);
		contentPane.add(lblNomeFornecedor);
		
		JLabel lblCnpjFornecedor = new JLabel("CNPJ Fornecedor:");
		lblCnpjFornecedor.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblCnpjFornecedor.setBounds(28, 109, 160, 18);
		contentPane.add(lblCnpjFornecedor);
		
		JLabel lblProdutoFornecido = new JLabel("Produto Fornecido:");
		lblProdutoFornecido.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblProdutoFornecido.setBounds(28, 152, 160, 18);
		contentPane.add(lblProdutoFornecido);
		
		fieldProdutoFornecido = new JTextField();
		fieldProdutoFornecido.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		fieldProdutoFornecido.setHorizontalAlignment(SwingConstants.LEFT);
		fieldProdutoFornecido.setForeground(Color.BLACK);
		fieldProdutoFornecido.setColumns(10);
		fieldProdutoFornecido.setBackground(Color.WHITE);
		fieldProdutoFornecido.setBounds(198, 156, 160, 25);
		contentPane.add(fieldProdutoFornecido);
		
		fieldCnpjFornecedor = new JTextField();
		fieldCnpjFornecedor.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		fieldCnpjFornecedor.setHorizontalAlignment(SwingConstants.LEFT);
		fieldCnpjFornecedor.setForeground(Color.BLACK);
		fieldCnpjFornecedor.setColumns(10);
		fieldCnpjFornecedor.setBackground(Color.WHITE);
		fieldCnpjFornecedor.setBounds(198, 111, 160, 25);
		contentPane.add(fieldCnpjFornecedor);
		
		fieldNomeFornecedor = new JTextField();
		fieldNomeFornecedor.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		fieldNomeFornecedor.setHorizontalAlignment(SwingConstants.LEFT);
		fieldNomeFornecedor.setForeground(Color.BLACK);
		fieldNomeFornecedor.setColumns(10);
		fieldNomeFornecedor.setBackground(Color.WHITE);
		fieldNomeFornecedor.setBounds(198, 64, 160, 25);
		contentPane.add(fieldNomeFornecedor);
		
		JLabel lblDataDeEntradaProduto = new JLabel("Data de entrada produto:");
		lblDataDeEntradaProduto.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblDataDeEntradaProduto.setBounds(28, 203, 216, 18);
		contentPane.add(lblDataDeEntradaProduto);
		
		JFormattedTextField fieldDataDeEntradaProduto = new JFormattedTextField();
		fieldDataDeEntradaProduto.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		fieldDataDeEntradaProduto.setBounds(252, 205, 106, 20);
		fieldDataDeEntradaProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
		contentPane.add(fieldDataDeEntradaProduto);
		
		JButton botaoCadastrarFornecedor = new JButton("Cadastrar");
		botaoCadastrarFornecedor.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		botaoCadastrarFornecedor.setBounds(134, 364, 121, 23);
		contentPane.add(botaoCadastrarFornecedor);
		
		JButton botaoLimparFornecedor = new JButton("Limpar");
		botaoLimparFornecedor.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		botaoLimparFornecedor.setBounds(265, 364, 89, 23);
		contentPane.add(botaoLimparFornecedor);
		
		JPanel panelDivisao = new JPanel();
		panelDivisao.setBackground(Color.BLACK);
		panelDivisao.setBounds(400, 10, 2, 420);
		contentPane.add(panelDivisao);
		
		JPanel panelBuscaFornecedor = new JPanel();
		panelBuscaFornecedor.setBackground(Color.WHITE);
		panelBuscaFornecedor.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
		panelBuscaFornecedor.setBounds(434, 23, 416, 25);
		contentPane.add(panelBuscaFornecedor);
		panelBuscaFornecedor.setLayout(null);
		
		JLabel lblNomeBuscaFornecedor = new JLabel("Nome");
		lblNomeBuscaFornecedor.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNomeBuscaFornecedor.setBounds(10, 0, 47, 25);
		panelBuscaFornecedor.add(lblNomeBuscaFornecedor);
		
		JLabel lblProdutosBuscaFornecedor = new JLabel("Produtos");
		lblProdutosBuscaFornecedor.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblProdutosBuscaFornecedor.setBounds(112, 0, 77, 25);
		panelBuscaFornecedor.add(lblProdutosBuscaFornecedor);
		
		JLabel lblDataEntregaBuscaFornecedor = new JLabel("Data Entrega");
		lblDataEntregaBuscaFornecedor.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblDataEntregaBuscaFornecedor.setBounds(219, 0, 108, 25);
		panelBuscaFornecedor.add(lblDataEntregaBuscaFornecedor);
	}
}
