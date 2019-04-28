import java.awt.BorderLayout;
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
import javax.swing.JToggleButton;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import java.awt.Color;

public class InterfaceCadastros extends JFrame {

	private JPanel fieldFuncionario;
	private JTextField fieldNome;
	private JTextField fieldEmail;
	private JTextField fieldCpf;
	private JTextField fieldRg;
	private JTextField fieldEndereco;

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
		
		JLabel label = new JLabel("");
		label.setBounds(41, 11, 46, 14);
		fieldFuncionario.add(label);
		
		JButton btnBotaocancelar = new JButton("Cancelar");
		btnBotaocancelar.setBackground(Color.WHITE);
		btnBotaocancelar.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		btnBotaocancelar.setBounds(658, 359, 89, 23);
		fieldFuncionario.add(btnBotaocancelar);
		
		JButton btnBotaolimpar = new JButton("Limpar");
		btnBotaolimpar.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		btnBotaolimpar.setBackground(Color.WHITE);
		btnBotaolimpar.setBounds(550, 359, 98, 23);
		fieldFuncionario.add(btnBotaolimpar);
		
		JButton btnBotaocadastrar = new JButton("Cadastrar");
		btnBotaocadastrar.setForeground(Color.BLACK);
		btnBotaocadastrar.setBackground(Color.WHITE);
		btnBotaocadastrar.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		btnBotaocadastrar.setBounds(442, 359, 98, 23);
		fieldFuncionario.add(btnBotaocadastrar);
		
		JLabel lblNome = new JLabel(" Nome:");
		lblNome.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblNome.setBounds(32, 74, 60, 23);
		fieldFuncionario.add(lblNome);
		
		fieldNome = new JTextField();
		fieldNome.setBounds(112, 78, 192, 20);
		fieldFuncionario.add(fieldNome);
		fieldNome.setColumns(10);
		
		fieldEmail = new JTextField();
		fieldEmail.setBounds(112, 108, 192, 20);
		fieldFuncionario.add(fieldEmail);
		fieldEmail.setColumns(10);
		
		fieldCpf = new JTextField();
		fieldCpf.setBounds(112, 139, 192, 20);
		fieldFuncionario.add(fieldCpf);
		fieldCpf.setColumns(10);
		
		fieldRg = new JTextField();
		fieldRg.setBounds(112, 170, 192, 20);
		fieldFuncionario.add(fieldRg);
		fieldRg.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblEmail.setBounds(41, 108, 60, 14);
		fieldFuncionario.add(lblEmail);
		
		JLabel lblCpf = new JLabel(" CPF:");
		lblCpf.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblCpf.setBounds(32, 139, 46, 14);
		fieldFuncionario.add(lblCpf);
		
		JLabel lblRg = new JLabel(" RG:");
		lblRg.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblRg.setBounds(32, 170, 46, 14);
		fieldFuncionario.add(lblRg);
		
		JLabel lblDataNascimento = new JLabel(" Data Nascimento:");
		lblDataNascimento.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblDataNascimento.setBounds(32, 211, 153, 14);
		fieldFuncionario.add(lblDataNascimento);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblTelefone.setBounds(42, 236, 106, 23);
		fieldFuncionario.add(lblTelefone);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o:");
		lblEndereco.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblEndereco.setBounds(41, 270, 106, 23);
		fieldFuncionario.add(lblEndereco);
		
		JLabel lblEstadoCivil = new JLabel("Estado Civil:");
		lblEstadoCivil.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblEstadoCivil.setBounds(42, 304, 106, 23);
		fieldFuncionario.add(lblEstadoCivil);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblSexo.setBounds(41, 338, 60, 23);
		fieldFuncionario.add(lblSexo);
		
		JFormattedTextField fieldDataNascimento = new JFormattedTextField();
		fieldDataNascimento.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		fieldDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
		fieldDataNascimento.setBounds(195, 208, 109, 20);
		fieldFuncionario.add(fieldDataNascimento);
		
		JFormattedTextField fieldTelefone = new JFormattedTextField();
		fieldTelefone.setBounds(139, 240, 165, 20);
		fieldFuncionario.add(fieldTelefone);
		
		fieldEndereco = new JTextField();
		fieldEndereco.setBounds(136, 274, 168, 20);
		fieldFuncionario.add(fieldEndereco);
		fieldEndereco.setColumns(10);
		
		JLabel lblDataAdmissao = new JLabel(" Data admiss\u00E3o:");
		lblDataAdmissao.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblDataAdmissao.setBounds(390, 74, 135, 23);
		fieldFuncionario.add(lblDataAdmissao);
		
		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblCargo.setBounds(397, 104, 60, 23);
		fieldFuncionario.add(lblCargo);
		
		JLabel lblSetor = new JLabel("Setor:");
		lblSetor.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblSetor.setBounds(397, 136, 60, 23);
		fieldFuncionario.add(lblSetor);
		
		JLabel lblSalrio = new JLabel("Sal\u00E1rio:");
		lblSalrio.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblSalrio.setBounds(397, 167, 64, 23);
		fieldFuncionario.add(lblSalrio);
		
		JFormattedTextField fieldDataAdmissao = new JFormattedTextField();
		fieldDataAdmissao.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		fieldDataAdmissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
		fieldDataAdmissao.setBounds(539, 78, 98, 20);
		fieldFuncionario.add(fieldDataAdmissao);
		
		JComboBox comboBoxCargo = new JComboBox();
		comboBoxCargo.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		comboBoxCargo.setBounds(467, 108, 106, 20);
		fieldFuncionario.add(comboBoxCargo);
		
		JComboBox comboBoxEstadoCivil = new JComboBox();
		comboBoxEstadoCivil.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		comboBoxEstadoCivil.setBounds(158, 306, 106, 20);
		fieldFuncionario.add(comboBoxEstadoCivil);
		
		JComboBox comboBoxSexo = new JComboBox();
		comboBoxSexo.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		comboBoxSexo.setBounds(111, 340, 106, 20);
		fieldFuncionario.add(comboBoxSexo);
		
		JComboBox comboBoxSetor = new JComboBox();
		comboBoxSetor.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		comboBoxSetor.setBounds(467, 139, 106, 20);
		fieldFuncionario.add(comboBoxSetor);
		
		JFormattedTextField fieldSalario = new JFormattedTextField();
		fieldSalario.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		fieldSalario.setBounds(467, 170, 109, 20);
		fieldSalario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####.## R$")));
		fieldFuncionario.add(fieldSalario);
	}
}
