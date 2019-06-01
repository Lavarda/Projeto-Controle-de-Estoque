package View;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Implementacao.Cargo;
import Implementacao.Funcionario;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JPasswordField;

public class InterfaceCadastros extends InterfacePrincipal {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel fieldFuncionario;
	private JTextField fieldNome;
	private JTextField fieldEmail;
	private JPasswordField FieldSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceCadastros frame = new InterfaceCadastros();
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
	public InterfaceCadastros() throws ParseException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 788, 465);
		fieldFuncionario = new JPanel();
		fieldFuncionario.setForeground(Color.BLACK);
		fieldFuncionario.setBackground(Color.WHITE);
		fieldFuncionario.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(fieldFuncionario);
		fieldFuncionario.setLayout(null);
		
		JButton botaoCancelar = new JButton("Cancelar");
		botaoCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		botaoCancelar.setBackground(Color.WHITE);
		botaoCancelar.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		botaoCancelar.setBounds(32, 241, 89, 23);
		fieldFuncionario.add(botaoCancelar);
		
		JButton botaoLimpar = new JButton("Limpar");
		botaoLimpar.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		botaoLimpar.setBackground(Color.WHITE);
		botaoLimpar.setBounds(131, 241, 98, 23);
		fieldFuncionario.add(botaoLimpar);
		
		JButton botaoCadastrar = new JButton("Cadastrar");
		
		botaoCadastrar.setForeground(Color.BLACK);
		botaoCadastrar.setBackground(Color.WHITE);
		botaoCadastrar.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		botaoCadastrar.setBounds(239, 241, 98, 23);
		fieldFuncionario.add(botaoCadastrar);
		
		JLabel lblNome = new JLabel(" Nome:");
		lblNome.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblNome.setBounds(32, 74, 60, 23);
		fieldFuncionario.add(lblNome);
		
		fieldNome = new JTextField();
		fieldNome.setBackground(Color.WHITE);
		fieldNome.setBounds(112, 78, 192, 20);
		fieldFuncionario.add(fieldNome);
		fieldNome.setColumns(10);
		
		fieldEmail = new JTextField();
		fieldEmail.setBounds(112, 108, 192, 20);
		fieldFuncionario.add(fieldEmail);
		fieldEmail.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblEmail.setBounds(41, 108, 60, 14);
		fieldFuncionario.add(lblEmail);
		
		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblCargo.setBounds(32, 133, 60, 23);
		fieldFuncionario.add(lblCargo);
		
		JLabel lblSalario = new JLabel("Sal\u00E1rio:");
		lblSalario.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblSalario.setBounds(32, 167, 64, 23);
		fieldFuncionario.add(lblSalario);
		
		JComboBox <Cargo> comboBoxCargo = new JComboBox<Cargo>();
		comboBoxCargo.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		comboBoxCargo.setBounds(112, 135, 106, 20);
		fieldFuncionario.add(comboBoxCargo);
		comboBoxCargo.addItem(Cargo.ASSISTENTE);
		comboBoxCargo.addItem(Cargo.GERENTE);
		comboBoxCargo.addItem(Cargo.VENDEDOR);
		
		
		JFormattedTextField fieldSalario = new JFormattedTextField();
		fieldSalario.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		fieldSalario.setBounds(112, 168, 89, 20);
		fieldSalario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####.## R$")));
		fieldFuncionario.add(fieldSalario);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblSenha.setBounds(28, 197, 64, 23);
		fieldFuncionario.add(lblSenha);
		
		FieldSenha = new JPasswordField();
		FieldSenha.setBounds(112, 199, 192, 20);
		fieldFuncionario.add(FieldSenha);
	}
}
