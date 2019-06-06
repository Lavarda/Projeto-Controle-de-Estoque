package interfaces;

public class gerenciamentoFornecedor extends javax.swing.JInternalFrame {
  
    public gerenciamentoFornecedor() {
        initComponents();
        this.setMaximizable(false);
        this.setClosable(true);
        this.setResizable(true);
        this.setIconifiable(true);
        this.setTitle("Gerenciamento Chegada/Saida");
        this.setVisible(true);
    }
                    
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        painelPrincipalGerenciarFornecedor = new javax.swing.JPanel();
        txtHorarioSaida = new javax.swing.JLabel();
        txtHorarioChegada = new javax.swing.JLabel();
        txtFornecedor = new javax.swing.JLabel();
        botaoLimparGerenciamentoFornecedor = new javax.swing.JButton();
        botaoSalvarGerenciamentoFornecedor = new javax.swing.JButton();
        txtComentario = new javax.swing.JLabel();
        scrollAdicionarProduto = new javax.swing.JScrollPane();
        inputComentario = new javax.swing.JTextArea();
        inputFornecedor = new javax.swing.JTextField();
        txtProduto = new javax.swing.JLabel();
        inputProduto = new javax.swing.JTextField();
        txtQuantiaProduto = new javax.swing.JLabel();
        inputQuantia = new javax.swing.JTextField();
        inputHoraChegada = new javax.swing.JFormattedTextField();
        inputHoraSaida = new javax.swing.JFormattedTextField();

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

        setTitle("Gerenciamento Chegada/Saida");
        setMaximumSize(new java.awt.Dimension(620, 550));
        setMinimumSize(new java.awt.Dimension(620, 550));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(620, 550));
        setVisible(false);

        painelPrincipalGerenciarFornecedor.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        painelPrincipalGerenciarFornecedor.setMaximumSize(new java.awt.Dimension(620, 500));
        painelPrincipalGerenciarFornecedor.setMinimumSize(new java.awt.Dimension(620, 500));
        painelPrincipalGerenciarFornecedor.setPreferredSize(new java.awt.Dimension(620, 500));

        txtHorarioSaida.setText("Horario Saida");

        txtHorarioChegada.setText("Horario Chegada");

        txtFornecedor.setText("Fornecedor");

        botaoLimparGerenciamentoFornecedor.setBackground(new java.awt.Color(254, 59, 55));
        botaoLimparGerenciamentoFornecedor.setText("Limpar");
        botaoLimparGerenciamentoFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparGerenciamentoFornecedorActionPerformed(evt);
            }
        });

        botaoSalvarGerenciamentoFornecedor.setBackground(new java.awt.Color(43, 82, 253));
        botaoSalvarGerenciamentoFornecedor.setText("Adicionar");
        botaoSalvarGerenciamentoFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarGerenciamentoFornecedorActionPerformed(evt);
            }
        });

        txtComentario.setText("Adicionar comentario");

        inputComentario.setColumns(20);
        inputComentario.setRows(5);
        scrollAdicionarProduto.setViewportView(inputComentario);

        txtProduto.setText("Produto");

        txtQuantiaProduto.setText("Quantia Produtos");

        try {
            inputHoraChegada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            inputHoraSaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout painelPrincipalGerenciarFornecedorLayout = new javax.swing.GroupLayout(painelPrincipalGerenciarFornecedor);
        painelPrincipalGerenciarFornecedor.setLayout(painelPrincipalGerenciarFornecedorLayout);
        painelPrincipalGerenciarFornecedorLayout.setHorizontalGroup(
            painelPrincipalGerenciarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalGerenciarFornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrincipalGerenciarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalGerenciarFornecedorLayout.createSequentialGroup()
                        .addGroup(painelPrincipalGerenciarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(scrollAdicionarProduto)
                            .addGroup(painelPrincipalGerenciarFornecedorLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(painelPrincipalGerenciarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(painelPrincipalGerenciarFornecedorLayout.createSequentialGroup()
                                        .addComponent(botaoLimparGerenciamentoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoSalvarGerenciamentoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelPrincipalGerenciarFornecedorLayout.createSequentialGroup()
                                        .addGroup(painelPrincipalGerenciarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtProduto)
                                            .addComponent(txtHorarioChegada)
                                            .addComponent(inputProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                            .addComponent(inputHoraChegada))
                                        .addGap(18, 18, 18)
                                        .addGroup(painelPrincipalGerenciarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtQuantiaProduto)
                                            .addGroup(painelPrincipalGerenciarFornecedorLayout.createSequentialGroup()
                                                .addGroup(painelPrincipalGerenciarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(inputQuantia)
                                                    .addComponent(txtHorarioSaida)
                                                    .addComponent(inputHoraSaida, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(painelPrincipalGerenciarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtFornecedor)
                                                    .addComponent(inputFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(10, 10, 10)))))
                        .addGap(48, 48, 48))
                    .addGroup(painelPrincipalGerenciarFornecedorLayout.createSequentialGroup()
                        .addComponent(txtComentario)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        painelPrincipalGerenciarFornecedorLayout.setVerticalGroup(
            painelPrincipalGerenciarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalGerenciarFornecedorLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(painelPrincipalGerenciarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHorarioChegada)
                    .addComponent(txtFornecedor)
                    .addComponent(txtHorarioSaida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPrincipalGerenciarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputHoraChegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputHoraSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(painelPrincipalGerenciarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantiaProduto)
                    .addComponent(txtProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPrincipalGerenciarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputQuantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(txtComentario)
                .addGap(26, 26, 26)
                .addComponent(scrollAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(painelPrincipalGerenciarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoLimparGerenciamentoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSalvarGerenciamentoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipalGerenciarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 585, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipalGerenciarFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void botaoLimparGerenciamentoFornecedorActionPerformed(java.awt.event.ActionEvent evt) {                                                                   
       inputComentario.setText("");
       inputFornecedor.setText("");
       inputHoraChegada.setText("");
       inputHoraSaida.setText("");
       inputProduto.setText("");
       inputQuantia.setText("");
    }                                                                  

    private void botaoSalvarGerenciamentoFornecedorActionPerformed(java.awt.event.ActionEvent evt) {                                                                   
    	String comentario;
    	String fornecedor;
    	String horaChegada;
    	String horaSaida;
    	String produto;
    	String quantia;
    	
    	try {
    		comentario = inputComentario.getText();
    		System.out.println(comentario);
    		
    		fornecedor = inputFornecedor.getText();
    		System.out.println(fornecedor);
    		
    		horaChegada = inputHoraChegada.getText();
    		System.out.println(horaChegada);
    		
    		horaSaida = inputHoraSaida.getText();
    		System.out.println(horaSaida);
    		
    		produto = inputProduto.getText();
    		System.out.println(produto);
    		
    		quantia = inputQuantia.getText();
    		System.out.println(quantia);
    		
    		
    	}catch(NumberFormatException e) {
    		
    	}
    }                                                                  
                 
    private javax.swing.JButton botaoLimparGerenciamentoFornecedor;
    private javax.swing.JButton botaoSalvarGerenciamentoFornecedor;
    private javax.swing.JTextArea inputComentario;
    private javax.swing.JTextField inputFornecedor;
    private javax.swing.JFormattedTextField inputHoraChegada;
    private javax.swing.JFormattedTextField inputHoraSaida;
    private javax.swing.JTextField inputProduto;
    private javax.swing.JTextField inputQuantia;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel painelPrincipalGerenciarFornecedor;
    private javax.swing.JScrollPane scrollAdicionarProduto;
    private javax.swing.JLabel txtComentario;
    private javax.swing.JLabel txtFornecedor;
    private javax.swing.JLabel txtHorarioChegada;
    private javax.swing.JLabel txtHorarioSaida;
    private javax.swing.JLabel txtProduto;
    private javax.swing.JLabel txtQuantiaProduto;                
}
