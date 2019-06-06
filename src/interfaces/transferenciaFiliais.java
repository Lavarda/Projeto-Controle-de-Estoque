package interfaces;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import Connections.ConnectionDB;
import Implementacao.Transferencia;

public class transferenciaFiliais extends javax.swing.JInternalFrame {

    public transferenciaFiliais() {
        initComponents();
        this.setMaximizable(false);
        this.setClosable(true);
        this.setResizable(true);
        this.setIconifiable(true);
        this.setTitle("Transferir Produtos");
        this.setVisible(true);
    }

                      
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        painelPrincipalCadastroCliente = new javax.swing.JPanel();
        txtProdutoCadastroCliente = new javax.swing.JLabel();
        txtQuantiaCadastroCliente = new javax.swing.JLabel();
        botaoLimparAdicionarProduto = new javax.swing.JButton();
        botaoSalvarAdicionarProduto = new javax.swing.JButton();
        inputNomeProdutoCadastroCliente = new javax.swing.JTextField();
        txtComentario = new javax.swing.JLabel();
        scrollAdicionarProduto = new javax.swing.JScrollPane();
        inputAdicionarComentarioCadastroCliente = new javax.swing.JTextArea();
        txtDataCadastroCliente = new javax.swing.JLabel();
        inputDataCadastroCliente = new javax.swing.JFormattedTextField();
        inputFilialCadastroCliente = new javax.swing.JTextField();
        txtFilialCadastroCliente = new javax.swing.JLabel();
        inputQuantia = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setTitle("Cadastro Cliente");
        setMaximumSize(new java.awt.Dimension(620, 550));
        setMinimumSize(new java.awt.Dimension(620, 550));
        setName(""); 
        setPreferredSize(new java.awt.Dimension(620, 550));
        setVisible(false);

        painelPrincipalCadastroCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        painelPrincipalCadastroCliente.setMaximumSize(new java.awt.Dimension(620, 500));
        painelPrincipalCadastroCliente.setMinimumSize(new java.awt.Dimension(620, 500));
        painelPrincipalCadastroCliente.setPreferredSize(new java.awt.Dimension(620, 500));

        txtProdutoCadastroCliente.setText("Cod produto");

        txtQuantiaCadastroCliente.setText("Quantia");

        botaoLimparAdicionarProduto.setBackground(new java.awt.Color(254, 59, 55));
        botaoLimparAdicionarProduto.setText("Limpar");
        botaoLimparAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparAdicionarProdutoActionPerformed(evt);
            }
        });

        botaoSalvarAdicionarProduto.setBackground(new java.awt.Color(43, 82, 253));
        botaoSalvarAdicionarProduto.setText("Adicionar");
        botaoSalvarAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarAdicionarProdutoActionPerformed(evt);
            }
        });

        txtComentario.setText("Adicionar comentario");

        inputAdicionarComentarioCadastroCliente.setColumns(20);
        inputAdicionarComentarioCadastroCliente.setRows(5);
        scrollAdicionarProduto.setViewportView(inputAdicionarComentarioCadastroCliente);

        txtDataCadastroCliente.setText("Data transferencia");

        try {
            inputDataCadastroCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        inputDataCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDataCadastroClienteActionPerformed(evt);
            }
        });

        txtFilialCadastroCliente.setText("Cod Filial");

        javax.swing.GroupLayout painelPrincipalCadastroClienteLayout = new javax.swing.GroupLayout(painelPrincipalCadastroCliente);
        painelPrincipalCadastroCliente.setLayout(painelPrincipalCadastroClienteLayout);
        painelPrincipalCadastroClienteLayout.setHorizontalGroup(
            painelPrincipalCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalCadastroClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrincipalCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalCadastroClienteLayout.createSequentialGroup()
                        .addComponent(txtComentario)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalCadastroClienteLayout.createSequentialGroup()
                        .addGroup(painelPrincipalCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(scrollAdicionarProduto)
                            .addGroup(painelPrincipalCadastroClienteLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(painelPrincipalCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(painelPrincipalCadastroClienteLayout.createSequentialGroup()
                                        .addComponent(botaoLimparAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoSalvarAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelPrincipalCadastroClienteLayout.createSequentialGroup()
                                        .addGroup(painelPrincipalCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtProdutoCadastroCliente)
                                            .addComponent(inputNomeProdutoCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(painelPrincipalCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDataCadastroCliente)
                                            .addComponent(inputDataCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(28, 28, 28)
                                        .addGroup(painelPrincipalCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(painelPrincipalCadastroClienteLayout.createSequentialGroup()
                                                .addComponent(txtQuantiaCadastroCliente)
                                                .addGap(116, 116, 116))
                                            .addComponent(inputQuantia))))))
                        .addGap(48, 48, 48))
                    .addGroup(painelPrincipalCadastroClienteLayout.createSequentialGroup()
                        .addGroup(painelPrincipalCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFilialCadastroCliente)
                            .addComponent(inputFilialCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        painelPrincipalCadastroClienteLayout.setVerticalGroup(
            painelPrincipalCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalCadastroClienteLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(painelPrincipalCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProdutoCadastroCliente)
                    .addComponent(txtQuantiaCadastroCliente)
                    .addComponent(txtDataCadastroCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPrincipalCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNomeProdutoCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputDataCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputQuantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(txtFilialCadastroCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputFilialCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(txtComentario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPrincipalCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoLimparAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSalvarAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipalCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 585, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipalCadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }                        

    private void botaoLimparAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {                                                            
        inputAdicionarComentarioCadastroCliente.setText("");
        inputDataCadastroCliente.setText("");
        inputFilialCadastroCliente.setText("");
        inputNomeProdutoCadastroCliente.setText("");
        inputQuantia.setText("");
    }                                                           

    private void inputDataCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        // TODO add your handling code here:
    }                                                        

    private void botaoSalvarAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {                                                            
//        String quantia;
//    	String comentario;
        String data;
        String codFilial;
        String codProduto;

    	try {
   		
    		data = inputDataCadastroCliente.getText();
    		
    		codFilial = inputFilialCadastroCliente.getText();
    		int new_cod_filial = Integer.parseInt(codFilial);

    		codProduto = inputNomeProdutoCadastroCliente.getText();
    		int new_cod_produto = Integer.parseInt(codProduto);
    		
    		Transferencia t = new Transferencia();
    		t.transferirProdutoFilial(new_cod_produto, new_cod_filial, data);
    		
    	}catch(NumberFormatException e) {
    		
    	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }                                                           

    private javax.swing.JButton botaoLimparAdicionarProduto;
    private javax.swing.JButton botaoSalvarAdicionarProduto;
    private javax.swing.JTextArea inputAdicionarComentarioCadastroCliente;
    private javax.swing.JFormattedTextField inputDataCadastroCliente;
    private javax.swing.JTextField inputFilialCadastroCliente;
    private javax.swing.JTextField inputNomeProdutoCadastroCliente;
    private javax.swing.JTextField inputQuantia;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel painelPrincipalCadastroCliente;
    private javax.swing.JScrollPane scrollAdicionarProduto;
    private javax.swing.JLabel txtComentario;
    private javax.swing.JLabel txtDataCadastroCliente;
    private javax.swing.JLabel txtFilialCadastroCliente;
    private javax.swing.JLabel txtProdutoCadastroCliente;
    private javax.swing.JLabel txtQuantiaCadastroCliente;                  
}
