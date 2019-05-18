package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
//import javax.swing.border.EmptyBorder;
//import javax.swing.JButton;
import javax.swing.JLabel;
//import java.awt.event.ActionListener;
import java.text.ParseException;
//import java.awt.event.ActionEvent;
//import javax.swing.JTextField;
//import javax.swing.JComboBox;

public class InterfaceEstoque extends InterfacePrincipal{
		
		private static final long serialVersionUID = 1L;
		private JPanel fieldProdutos;
	//	private JTextField fieldCodigo;
	//	private JTextField fieldNome;
	//	private JTextField fieldCategoria;
	//	private JTextField fieldPreco;
	//	private JTextField fieldQuantidade;		
		
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceEstoque frame = new InterfaceEstoque();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}	
		public InterfaceEstoque() throws ParseException{
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 900, 600);
			fieldProdutos = new JPanel();
			fieldProdutos.setForeground(Color.BLACK);
			fieldProdutos.setBackground(Color.WHITE);
			fieldProdutos.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(fieldProdutos);
			fieldProdutos.setLayout(null);
			
			JPanel panelBuscaProdutos = new JPanel();
			panelBuscaProdutos.setBackground(Color.WHITE);
			panelBuscaProdutos.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
			panelBuscaProdutos.setBounds(50, 30, 765, 25);
			fieldProdutos.add(panelBuscaProdutos);
			panelBuscaProdutos.setLayout(null);
			
			JLabel lblBuscaCodigoProdutos = new JLabel("Código");
			lblBuscaCodigoProdutos.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
			lblBuscaCodigoProdutos.setBounds(80, 0, 47, 25);
			panelBuscaProdutos.add(lblBuscaCodigoProdutos);
			
			JLabel lblBuscaNomeProdutos = new JLabel("Nome");
			lblBuscaNomeProdutos.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
			lblBuscaNomeProdutos.setBounds(220, 0, 50, 25);
			panelBuscaProdutos.add(lblBuscaNomeProdutos);
			
			JLabel lblBuscaCodigoCategoria = new JLabel("Categoria");
			lblBuscaCodigoCategoria.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
			lblBuscaCodigoCategoria.setBounds(340, 0, 77, 25);
			panelBuscaProdutos.add(lblBuscaCodigoCategoria);
			
			JLabel lblBuscaPrecoProdutos = new JLabel("Preço");
			lblBuscaPrecoProdutos.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
			lblBuscaPrecoProdutos.setBounds(485, 0, 77, 25);
			panelBuscaProdutos.add(lblBuscaPrecoProdutos);	
			
			JLabel lblBuscaQuantidadeProdutos = new JLabel("Quantidade");
			lblBuscaQuantidadeProdutos.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
			lblBuscaQuantidadeProdutos.setBounds(590, 0, 100, 25);
			panelBuscaProdutos.add(lblBuscaQuantidadeProdutos);
			
			/*JButton botaoAtualizar = new JButton("Atualizar");
			botaoAtualizar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			botaoAtualizar.setForeground(Color.BLACK);
			botaoAtualizar.setBackground(Color.WHITE);
			botaoAtualizar.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
			botaoAtualizar.setBounds(40, 450, 98, 23);
			fieldProdutos.add(botaoAtualizar);
			
			JButton botaoSair = new JButton("Sair");
			botaoSair.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			botaoSair.setForeground(Color.BLACK);
			botaoSair.setBackground(Color.WHITE);
			botaoSair.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
			botaoSair.setBounds(320, 450, 89, 23);
			fieldProdutos.add(botaoSair);*/
		}
}

