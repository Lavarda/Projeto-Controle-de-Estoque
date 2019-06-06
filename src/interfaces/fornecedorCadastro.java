package interfaces;


import Implementacao.Produtos;

public class fornecedorCadastro extends javax.swing.JInternalFrame {
    public fornecedorCadastro() {
        initComponents();
        this.setMaximizable(false);
        this.setClosable(true);
        this.setResizable(true);
        this.setIconifiable(true);
        this.setTitle("Cadastro de Fornecedores");
        this.setVisible(true);
    }
                     
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        painelPrincipalFornecedorCadastro = new javax.swing.JPanel();
        txtNomeFornecedorCadastro = new javax.swing.JLabel();
        txtDataFornecedorCadastro = new javax.swing.JLabel();
        txtEmailFornecedorCadastro = new javax.swing.JLabel();
        txtNumeroLojaFornecedorCadastro = new javax.swing.JLabel();
        txtRgFornecedorCadastro = new javax.swing.JLabel();
        txtTelFornecedorCadastro = new javax.swing.JLabel();
        txtCidadeFornecedorCadastro = new javax.swing.JLabel();
        txtEstadoFornecedorCadastro = new javax.swing.JLabel();
        txtCepFornecedorCadastro = new javax.swing.JLabel();
        txtBairroFornecedorCadastro = new javax.swing.JLabel();
        inputNomeFornecedorCadastro = new javax.swing.JTextField();
        inputEmailFornecedorCadastro = new javax.swing.JTextField();
        inputCidadeFornecedorCadastro = new javax.swing.JTextField();
        inputBairroFornecedorCadastro = new javax.swing.JTextField();
        botaoLimparFornecedorCadastro = new javax.swing.JButton();
        botaoSalvarFornecedorCadastro = new javax.swing.JButton();
        inputEstadoFornecedorCadastro = new javax.swing.JComboBox<>();
        inputDataFornecedorCadastro = new javax.swing.JFormattedTextField();
        inputNumeroFornecedorCadastro = new javax.swing.JFormattedTextField();
        inputTelefoneFornecedorCadastro = new javax.swing.JFormattedTextField();
        inputCepFornecedorCadastro = new javax.swing.JFormattedTextField();
        inputRgFornecedorCadastro = new javax.swing.JFormattedTextField();

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

        setTitle("Cadastro fornecedor");
        setMaximumSize(new java.awt.Dimension(620, 550));
        setMinimumSize(new java.awt.Dimension(620, 550));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(620, 550));
        setVisible(false);

        painelPrincipalFornecedorCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        painelPrincipalFornecedorCadastro.setMaximumSize(new java.awt.Dimension(620, 500));
        painelPrincipalFornecedorCadastro.setMinimumSize(new java.awt.Dimension(620, 500));
        painelPrincipalFornecedorCadastro.setPreferredSize(new java.awt.Dimension(620, 500));

        txtNomeFornecedorCadastro.setText("Nome Fornecedor");

        txtDataFornecedorCadastro.setText("Data Cadastro");

        txtEmailFornecedorCadastro.setText("E-mail");

        txtNumeroLojaFornecedorCadastro.setText("Numero da loja");

        txtRgFornecedorCadastro.setText("RG");

        txtTelFornecedorCadastro.setText("Telefone");

        txtCidadeFornecedorCadastro.setText("Cidade");

        txtEstadoFornecedorCadastro.setText("Estado");

        txtCepFornecedorCadastro.setText("CEP");

        txtBairroFornecedorCadastro.setText("Bairro/Rua");

        botaoLimparFornecedorCadastro.setBackground(new java.awt.Color(254, 59, 55));
        botaoLimparFornecedorCadastro.setText("Limpar");
        botaoLimparFornecedorCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparFornecedorCadastroActionPerformed(evt);
            }
        });

        botaoSalvarFornecedorCadastro.setBackground(new java.awt.Color(43, 82, 253));
        botaoSalvarFornecedorCadastro.setText("Salvar");
        botaoSalvarFornecedorCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarFornecedorCadastroActionPerformed(evt);
            }
        });

        inputEstadoFornecedorCadastro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA) ", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));

        try {
            inputDataFornecedorCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        inputNumeroFornecedorCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        try {
            inputTelefoneFornecedorCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            inputCepFornecedorCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        inputCepFornecedorCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCepFornecedorCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelPrincipalFornecedorCadastroLayout = new javax.swing.GroupLayout(painelPrincipalFornecedorCadastro);
        painelPrincipalFornecedorCadastro.setLayout(painelPrincipalFornecedorCadastroLayout);
        painelPrincipalFornecedorCadastroLayout.setHorizontalGroup(
            painelPrincipalFornecedorCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalFornecedorCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrincipalFornecedorCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRgFornecedorCadastro)
                    .addComponent(txtEmailFornecedorCadastro)
                    .addComponent(txtNomeFornecedorCadastro)
                    .addComponent(txtDataFornecedorCadastro)
                    .addComponent(inputDataFornecedorCadastro)
                    .addComponent(inputEmailFornecedorCadastro)
                    .addComponent(txtNumeroLojaFornecedorCadastro)
                    .addComponent(inputNomeFornecedorCadastro)
                    .addComponent(inputNumeroFornecedorCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(inputRgFornecedorCadastro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelPrincipalFornecedorCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalFornecedorCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalFornecedorCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCidadeFornecedorCadastro)
                            .addComponent(txtEstadoFornecedorCadastro)
                            .addComponent(txtCepFornecedorCadastro)
                            .addComponent(txtBairroFornecedorCadastro)
                            .addComponent(inputBairroFornecedorCadastro)
                            .addComponent(inputEstadoFornecedorCadastro, 0, 0, Short.MAX_VALUE)
                            .addComponent(inputCidadeFornecedorCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(inputCepFornecedorCadastro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelPrincipalFornecedorCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtTelFornecedorCadastro)
                        .addComponent(inputTelefoneFornecedorCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalFornecedorCadastroLayout.createSequentialGroup()
                        .addComponent(botaoLimparFornecedorCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoSalvarFornecedorCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelPrincipalFornecedorCadastroLayout.setVerticalGroup(
            painelPrincipalFornecedorCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalFornecedorCadastroLayout.createSequentialGroup()
                .addGroup(painelPrincipalFornecedorCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalFornecedorCadastroLayout.createSequentialGroup()
                        .addComponent(txtNomeFornecedorCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputNomeFornecedorCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelPrincipalFornecedorCadastroLayout.createSequentialGroup()
                        .addComponent(txtTelFornecedorCadastro)
                        .addGap(9, 9, 9)
                        .addComponent(inputTelefoneFornecedorCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(painelPrincipalFornecedorCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalFornecedorCadastroLayout.createSequentialGroup()
                        .addComponent(txtDataFornecedorCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputDataFornecedorCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEmailFornecedorCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputEmailFornecedorCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumeroLojaFornecedorCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputNumeroFornecedorCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtRgFornecedorCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputRgFornecedorCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelPrincipalFornecedorCadastroLayout.createSequentialGroup()
                        .addComponent(txtCidadeFornecedorCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputCidadeFornecedorCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEstadoFornecedorCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputEstadoFornecedorCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCepFornecedorCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputCepFornecedorCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBairroFornecedorCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputBairroFornecedorCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(painelPrincipalFornecedorCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSalvarFornecedorCadastro)
                    .addComponent(botaoLimparFornecedorCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(117, 117, 117))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipalFornecedorCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 585, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipalFornecedorCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }                      

    private void inputCepFornecedorCadastroActionPerformed(java.awt.event.ActionEvent evt) {                                                           
    }
   
    private void botaoSalvarFornecedorCadastroActionPerformed(java.awt.event.ActionEvent evt) {   
    	String bairro;
    	String cep;
    	String preco;
    	int nmFornecedor;
    	String numero;
    	String cidade;
    	String data;
    	String email;
    	String nome;
    	String rg;
    	String telefone;
    	
    	try {
    		bairro = inputBairroFornecedorCadastro.getText();
    		System.out.println(bairro);
            

    		cep = inputCepFornecedorCadastro.getText();
    		System.out.println(cep); 
    		

    		numero = inputNumeroFornecedorCadastro.getText();
    		nmFornecedor = Integer.parseInt(numero);
    	
    		
    		cidade = inputCidadeFornecedorCadastro.getText();
    		System.out.println(cidade);
    		
    		data = inputDataFornecedorCadastro.getText();
    		System.out.println(data);
    		
    		email = inputEmailFornecedorCadastro.getText();
    		System.out.println(email);
    		
    		nome  = inputNomeFornecedorCadastro.getText();
    		System.out.println(nome);
    		
    		rg = inputRgFornecedorCadastro.getText();
    		System.out.println(rg);
    		
    		telefone = inputTelefoneFornecedorCadastro.getText();
    		System.out.println(telefone);

    	}catch(NumberFormatException e) {
    		
    	}
    
    }

    private void botaoLimparFornecedorCadastroActionPerformed(java.awt.event.ActionEvent evt) {                                                              
    	inputBairroFornecedorCadastro.setText("");
    	inputCepFornecedorCadastro.setText(""); // string
    	inputCidadeFornecedorCadastro.setText("");
    	inputDataFornecedorCadastro.setText(""); // string
    	inputEmailFornecedorCadastro.setText("");
    	inputNomeFornecedorCadastro.setText("");
    	inputNumeroFornecedorCadastro.setText(""); // integer
    	inputRgFornecedorCadastro.setText(""); // string
    	inputTelefoneFornecedorCadastro.setText(""); //string
    }                                                             
                 
    private javax.swing.JButton botaoLimparFornecedorCadastro;
    private javax.swing.JButton botaoSalvarFornecedorCadastro;
    private javax.swing.JTextField inputBairroFornecedorCadastro;
    private javax.swing.JFormattedTextField inputCepFornecedorCadastro;
    private javax.swing.JTextField inputCidadeFornecedorCadastro;
    private javax.swing.JFormattedTextField inputDataFornecedorCadastro;
    private javax.swing.JTextField inputEmailFornecedorCadastro;
    private javax.swing.JComboBox<String> inputEstadoFornecedorCadastro;
    private javax.swing.JTextField inputNomeFornecedorCadastro;
    private javax.swing.JFormattedTextField inputNumeroFornecedorCadastro;
    private javax.swing.JFormattedTextField inputRgFornecedorCadastro;
    private javax.swing.JFormattedTextField inputTelefoneFornecedorCadastro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel painelPrincipalFornecedorCadastro;
    private javax.swing.JLabel txtBairroFornecedorCadastro;
    private javax.swing.JLabel txtCepFornecedorCadastro;
    private javax.swing.JLabel txtCidadeFornecedorCadastro;
    private javax.swing.JLabel txtDataFornecedorCadastro;
    private javax.swing.JLabel txtEmailFornecedorCadastro;
    private javax.swing.JLabel txtEstadoFornecedorCadastro;
    private javax.swing.JLabel txtNomeFornecedorCadastro;
    private javax.swing.JLabel txtNumeroLojaFornecedorCadastro;
    private javax.swing.JLabel txtRgFornecedorCadastro;
    private javax.swing.JLabel txtTelFornecedorCadastro;                  
}
