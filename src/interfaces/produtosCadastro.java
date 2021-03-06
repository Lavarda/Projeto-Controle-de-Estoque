package interfaces;

import Implementacao.Categoria;
import Implementacao.Produtos;

public class produtosCadastro extends javax.swing.JInternalFrame {
    
    public produtosCadastro() {
        initComponents();
        this.setMaximizable(false);
        this.setClosable(true);
        this.setResizable(true);
        this.setIconifiable(true);
        this.setTitle("Cadastro de Clientes");
        this.setVisible(true);
    }
                         
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        painelPrincipalProdutosCadastro = new javax.swing.JPanel();
        txtNomeProduto = new javax.swing.JLabel();
        txtFornecedor = new javax.swing.JLabel();
        txtPreco = new javax.swing.JLabel();
        botaoLimparProdutosCadastro = new javax.swing.JButton();
        botaoSalvarProdutosCadastro = new javax.swing.JButton();
        inputNomeProduto = new javax.swing.JTextField();
        inputFornecedor = new javax.swing.JTextField();
        inputPreco = new javax.swing.JFormattedTextField();
        txtCategoria = new javax.swing.JLabel();
        dropDown = new javax.swing.JComboBox<>();

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
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(620, 550));
        setVisible(false);

        painelPrincipalProdutosCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        painelPrincipalProdutosCadastro.setMaximumSize(new java.awt.Dimension(620, 500));
        painelPrincipalProdutosCadastro.setMinimumSize(new java.awt.Dimension(620, 500));
        painelPrincipalProdutosCadastro.setPreferredSize(new java.awt.Dimension(620, 500));

        txtNomeProduto.setText("Nome");

        txtFornecedor.setText("Fornecedor");

        txtPreco.setText("Preço");

        botaoLimparProdutosCadastro.setBackground(new java.awt.Color(254, 59, 55));
        botaoLimparProdutosCadastro.setText("Limpar");
        botaoLimparProdutosCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparProdutosCadastroActionPerformed(evt);
            }
        });

        botaoSalvarProdutosCadastro.setBackground(new java.awt.Color(43, 82, 253));
        botaoSalvarProdutosCadastro.setText("Salvar");
        botaoSalvarProdutosCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarProdutosCadastroActionPerformed(evt);
            }
        });

        inputPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        inputPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPrecoActionPerformed(evt);
            }
        });

        txtCategoria.setText("Categoria");

        dropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AGUA POTAVEL", "BEBIDAS A BASE DE ANIS", "BEBIDAS ALCOOLICAS", "BEBIDAS DE SOJA", "BEBIDAS ENERGETICAS", "BEBIDAS ESPORTIVAS", "CAFES", "CHAS" }));

        javax.swing.GroupLayout painelPrincipalProdutosCadastroLayout = new javax.swing.GroupLayout(painelPrincipalProdutosCadastro);
        painelPrincipalProdutosCadastro.setLayout(painelPrincipalProdutosCadastroLayout);
        painelPrincipalProdutosCadastroLayout.setHorizontalGroup(
            painelPrincipalProdutosCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalProdutosCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrincipalProdutosCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelPrincipalProdutosCadastroLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoLimparProdutosCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoSalvarProdutosCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelPrincipalProdutosCadastroLayout.createSequentialGroup()
                        .addGroup(painelPrincipalProdutosCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelPrincipalProdutosCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtNomeProduto, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(inputNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtPreco)
                            .addComponent(inputPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelPrincipalProdutosCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputFornecedor)
                            .addGroup(painelPrincipalProdutosCadastroLayout.createSequentialGroup()
                                .addGroup(painelPrincipalProdutosCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCategoria)
                                    .addComponent(txtFornecedor))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(dropDown, 0, 1, Short.MAX_VALUE))))
                .addGap(216, 216, 216))
        );
        painelPrincipalProdutosCadastroLayout.setVerticalGroup(
            painelPrincipalProdutosCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalProdutosCadastroLayout.createSequentialGroup()
                .addGroup(painelPrincipalProdutosCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalProdutosCadastroLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtNomeProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelPrincipalProdutosCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelPrincipalProdutosCadastroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtFornecedor)))
                .addGap(35, 35, 35)
                .addGroup(painelPrincipalProdutosCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelPrincipalProdutosCadastroLayout.createSequentialGroup()
                        .addComponent(txtPreco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelPrincipalProdutosCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelPrincipalProdutosCadastroLayout.createSequentialGroup()
                        .addComponent(txtCategoria)
                        .addGap(34, 34, 34)))
                .addGap(59, 59, 59)
                .addGroup(painelPrincipalProdutosCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoLimparProdutosCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSalvarProdutosCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(242, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipalProdutosCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 585, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipalProdutosCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }

    private void botaoLimparProdutosCadastroActionPerformed(java.awt.event.ActionEvent evt) {                                                            
    	botaoSalvarProdutosCadastro.setText("");
    	inputFornecedor.setText("");
    	inputNomeProduto.setText("");
    	inputPreco.setText("");
    }                                                           

    private void botaoSalvarProdutosCadastroActionPerformed(java.awt.event.ActionEvent evt) {                                                            
    	String nomeProduto;
    	String categoria;
    	Categoria new_categoria = null;
    	String preco;
    	double precoDouble;
    	try {
    		nomeProduto = inputNomeProduto.getText();
    		categoria = (String) dropDown.getSelectedItem();
    		
			switch ( categoria ) {
    			case "ACHOCOLATADOS":
    				new_categoria = Categoria.ACHOCOLATADOS;
    				break;
    			case "AGUA POTAVEL":
    				new_categoria = Categoria.AGUA;
    				break;
    			case "BEBIDAS ALCOOLICAS":
    				new_categoria = Categoria.ALCOOLICAS;
    				break;
    			case "BEBIDAS DE SOJA":
    				new_categoria = Categoria.SOJA;
    				break;
    			case "BEBIDAS ENERGETICAS":
    				new_categoria = Categoria.ENERGETICAS;
    				break;
    			case "BEBIDAS ESPORTIVAS":
    				new_categoria = Categoria.ESPORTIVAS;
    				break;
    			case "CAFES":
    				new_categoria = Categoria.CAFES;
    				break;
    			case "CHAS":
    				new_categoria = Categoria.CHAS;
    		}
    		preco= inputPreco.getText();
    		precoDouble = Double.parseDouble(preco);

    		Produtos p = new Produtos(nomeProduto,precoDouble,new_categoria);
    		System.out.println("Inserindo produto...");
    		p.inserirProduto();
    		
    	}catch(NumberFormatException e) {
    		System.out.println("Deu erro" + e);
    	}
           
    	}
    private void inputPrecoActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                                                                                                                                         
              
    private javax.swing.JButton botaoLimparProdutosCadastro;
    private javax.swing.JButton botaoSalvarProdutosCadastro;
    private javax.swing.JComboBox<String> dropDown;
    private javax.swing.JTextField inputFornecedor;
    private javax.swing.JTextField inputNomeProduto;
    private javax.swing.JFormattedTextField inputPreco;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel painelPrincipalProdutosCadastro;
    private javax.swing.JLabel txtCategoria;
    private javax.swing.JLabel txtFornecedor;
    private javax.swing.JLabel txtNomeProduto;
    private javax.swing.JLabel txtPreco;         
}
