package interfaces;

import Implementacao.Categoria;
import Implementacao.Produtos;

public class adicionarProdutoEstoque extends javax.swing.JInternalFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public adicionarProdutoEstoque() {
        initComponents();
        this.setMaximizable(false);
        this.setClosable(true);
        this.setResizable(true);
        this.setIconifiable(true);
        this.setTitle("Adicionar Produtos");
        this.setVisible(true);
    }

    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        painelPrincipalAdicionarProdutoEstoque = new javax.swing.JPanel();
        txtNomeProduto = new javax.swing.JLabel();
        txtPreco = new javax.swing.JLabel();
        botaoLimparAdicionarProduto = new javax.swing.JButton();
        botaoSalvarAdicionarProduto = new javax.swing.JButton();
        inputNomeProduto = new javax.swing.JTextField();
        txtComentario = new javax.swing.JLabel();
        scrollAdicionarProduto = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        txtCategoria = new javax.swing.JLabel();
        inputCategoria = new javax.swing.JTextField();
        inputQuantidadeProduto = new javax.swing.JTextField();

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

        painelPrincipalAdicionarProdutoEstoque.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        painelPrincipalAdicionarProdutoEstoque.setMaximumSize(new java.awt.Dimension(620, 500));
        painelPrincipalAdicionarProdutoEstoque.setMinimumSize(new java.awt.Dimension(620, 500));
        painelPrincipalAdicionarProdutoEstoque.setPreferredSize(new java.awt.Dimension(620, 500));

        txtNomeProduto.setText("Nome produto");

        txtPreco.setText("Quantia");

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

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        scrollAdicionarProduto.setViewportView(jTextArea1);

        txtCategoria.setText("Categoria");

        inputCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelPrincipalAdicionarProdutoEstoqueLayout = new javax.swing.GroupLayout(painelPrincipalAdicionarProdutoEstoque);
        painelPrincipalAdicionarProdutoEstoque.setLayout(painelPrincipalAdicionarProdutoEstoqueLayout);
        painelPrincipalAdicionarProdutoEstoqueLayout.setHorizontalGroup(
            painelPrincipalAdicionarProdutoEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalAdicionarProdutoEstoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrincipalAdicionarProdutoEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalAdicionarProdutoEstoqueLayout.createSequentialGroup()
                        .addComponent(txtComentario)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalAdicionarProdutoEstoqueLayout.createSequentialGroup()
                        .addGroup(painelPrincipalAdicionarProdutoEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(scrollAdicionarProduto)
                            .addGroup(painelPrincipalAdicionarProdutoEstoqueLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(painelPrincipalAdicionarProdutoEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(painelPrincipalAdicionarProdutoEstoqueLayout.createSequentialGroup()
                                        .addComponent(botaoLimparAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoSalvarAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelPrincipalAdicionarProdutoEstoqueLayout.createSequentialGroup()
                                        .addGroup(painelPrincipalAdicionarProdutoEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNomeProduto)
                                            .addComponent(inputNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(painelPrincipalAdicionarProdutoEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(inputCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCategoria))
                                        .addGap(28, 28, 28)
                                        .addGroup(painelPrincipalAdicionarProdutoEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(painelPrincipalAdicionarProdutoEstoqueLayout.createSequentialGroup()
                                                .addComponent(txtPreco)
                                                .addGap(116, 116, 116))
                                            .addComponent(inputQuantidadeProduto))))))
                        .addGap(48, 48, 48))))
        );
        painelPrincipalAdicionarProdutoEstoqueLayout.setVerticalGroup(
            painelPrincipalAdicionarProdutoEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalAdicionarProdutoEstoqueLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(painelPrincipalAdicionarProdutoEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeProduto)
                    .addComponent(txtPreco)
                    .addComponent(txtCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPrincipalAdicionarProdutoEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(txtComentario)
                .addGap(18, 18, 18)
                .addComponent(scrollAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelPrincipalAdicionarProdutoEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoLimparAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSalvarAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(182, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipalAdicionarProdutoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 585, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipalAdicionarProdutoEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }                        

    private void botaoLimparAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {                                                            
		inputNomeProduto.setText("");     
		inputCategoria.setText("");
		inputQuantidadeProduto.setText("");
		jTextArea1.setText("");
    }                                                           

    private void inputCategoriaActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void botaoSalvarAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {                                                            
    	String nomeProduto;
    	String categoria;
    	Categoria new_categoria = null;
    	String preco;
    	double precoDouble;
    	try {
    		nomeProduto = inputNomeProduto.getText();
    		categoria = inputCategoria.getText();
    		 
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
    		preco= inputQuantidadeProduto.getText();
    		precoDouble = Double.parseDouble(preco);

    		Produtos p = new Produtos(nomeProduto,precoDouble,new_categoria);
    		System.out.println("Inserindo produto...");
    		p.inserirProduto();
    		
    	}catch(NumberFormatException e) {
    		System.out.println("Deu erro" + e);
    	}
    }                                                           

                  
    private javax.swing.JButton botaoLimparAdicionarProduto;
    private javax.swing.JButton botaoSalvarAdicionarProduto;
    private javax.swing.JTextField inputCategoria;
    private javax.swing.JTextField inputNomeProduto;
    private javax.swing.JTextField inputQuantidadeProduto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel painelPrincipalAdicionarProdutoEstoque;
    private javax.swing.JScrollPane scrollAdicionarProduto;
    private javax.swing.JLabel txtCategoria;
    private javax.swing.JLabel txtComentario;
    private javax.swing.JLabel txtNomeProduto;
    private javax.swing.JLabel txtPreco;
}
