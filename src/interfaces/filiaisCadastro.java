package interfaces;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import Connections.ConnectionDB;

public class filiaisCadastro extends javax.swing.JInternalFrame {

    public filiaisCadastro() {
        initComponents();
        this.setMaximizable(false);
        this.setClosable(true);
        this.setResizable(true);
        this.setIconifiable(true);
        this.setTitle("Cadastro de Filiais");
        this.setVisible(true);
    }
                        
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        painelPrincipalCadastroFiliais = new javax.swing.JPanel();
        txtCadastroFiliais = new javax.swing.JLabel();
        txtDataCadastroFiliais = new javax.swing.JLabel();
        txtEmailCadastroFiliais = new javax.swing.JLabel();
        txtCnpjCadastroFiliais = new javax.swing.JLabel();
        txtNumeroLojaCadastroFiliais = new javax.swing.JLabel();
        txtTelClientesCadastro = new javax.swing.JLabel();
        txtCidadeCadastroFiliais = new javax.swing.JLabel();
        txtEstadoCadastroFiliais = new javax.swing.JLabel();
        txtCepCadastroFiliais = new javax.swing.JLabel();
        txtBairroCadastroFiliais = new javax.swing.JLabel();
        inputNomeCadastroFiliais = new javax.swing.JTextField();
        inputEmailCadastroFiliais = new javax.swing.JTextField();
        inputCidadeCadastroFiliais = new javax.swing.JTextField();
        inputBairroCadastroFiliais = new javax.swing.JTextField();
        botaoLimparCadastroFiliais = new javax.swing.JButton();
        botaoSalvarCadastroFiliais = new javax.swing.JButton();
        checkboxCadastroFiliais = new javax.swing.JComboBox<>();
        inputDataCadastroFiliais = new javax.swing.JFormattedTextField();
        inputCnpjCadastroFiliais = new javax.swing.JFormattedTextField();
        inputTelCadastroFiliais = new javax.swing.JFormattedTextField();
        inputCepCadastroFiliais = new javax.swing.JFormattedTextField();
        inputNumeroLojaCadastroFiliais = new javax.swing.JFormattedTextField();

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

        setTitle("Cadastro Filiais");
        setMaximumSize(new java.awt.Dimension(620, 550));
        setMinimumSize(new java.awt.Dimension(620, 550));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(620, 550));
        setVisible(false);

        painelPrincipalCadastroFiliais.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        painelPrincipalCadastroFiliais.setMaximumSize(new java.awt.Dimension(620, 500));
        painelPrincipalCadastroFiliais.setMinimumSize(new java.awt.Dimension(620, 500));
        painelPrincipalCadastroFiliais.setPreferredSize(new java.awt.Dimension(620, 500));

        txtCadastroFiliais.setText("Nome");

        txtDataCadastroFiliais.setText("Data Cadastro");

        txtEmailCadastroFiliais.setText("E-mail");

        txtCnpjCadastroFiliais.setText("Cnpj");

        txtNumeroLojaCadastroFiliais.setText("Numero da loja");

        txtTelClientesCadastro.setText("Telefone");

        txtCidadeCadastroFiliais.setText("Cidade");

        txtEstadoCadastroFiliais.setText("Estado");

        txtCepCadastroFiliais.setText("CEP");

        txtBairroCadastroFiliais.setText("Bairro");

        botaoLimparCadastroFiliais.setBackground(new java.awt.Color(254, 59, 55));
        botaoLimparCadastroFiliais.setText("Limpar");
        botaoLimparCadastroFiliais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparCadastroFiliaisActionPerformed(evt);
            }
        });

        botaoSalvarCadastroFiliais.setBackground(new java.awt.Color(43, 82, 253));
        botaoSalvarCadastroFiliais.setText("Salvar");
        botaoSalvarCadastroFiliais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarCadastroFiliaisActionPerformed(evt);
            }
        });

        checkboxCadastroFiliais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA) ", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));

        try {
            inputDataCadastroFiliais.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            inputCnpjCadastroFiliais.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            inputTelCadastroFiliais.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            inputCepCadastroFiliais.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        inputCepCadastroFiliais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCepCadastroFiliaisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelPrincipalCadastroFiliaisLayout = new javax.swing.GroupLayout(painelPrincipalCadastroFiliais);
        painelPrincipalCadastroFiliais.setLayout(painelPrincipalCadastroFiliaisLayout);
        painelPrincipalCadastroFiliaisLayout.setHorizontalGroup(
            painelPrincipalCadastroFiliaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalCadastroFiliaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrincipalCadastroFiliaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelPrincipalCadastroFiliaisLayout.createSequentialGroup()
                        .addComponent(botaoLimparCadastroFiliais, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoSalvarCadastroFiliais, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelPrincipalCadastroFiliaisLayout.createSequentialGroup()
                        .addGroup(painelPrincipalCadastroFiliaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmailCadastroFiliais)
                            .addComponent(txtCadastroFiliais)
                            .addComponent(txtDataCadastroFiliais)
                            .addComponent(inputDataCadastroFiliais)
                            .addComponent(inputEmailCadastroFiliais)
                            .addComponent(txtCnpjCadastroFiliais)
                            .addComponent(inputNomeCadastroFiliais)
                            .addComponent(txtTelClientesCadastro)
                            .addComponent(inputCnpjCadastroFiliais)
                            .addComponent(inputTelCadastroFiliais, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(painelPrincipalCadastroFiliaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCidadeCadastroFiliais)
                            .addComponent(txtEstadoCadastroFiliais)
                            .addComponent(txtCepCadastroFiliais)
                            .addComponent(txtBairroCadastroFiliais)
                            .addComponent(inputBairroCadastroFiliais)
                            .addComponent(checkboxCadastroFiliais, 0, 200, Short.MAX_VALUE)
                            .addComponent(inputCidadeCadastroFiliais)
                            .addComponent(inputCepCadastroFiliais, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtNumeroLojaCadastroFiliais)
                            .addComponent(inputNumeroLojaCadastroFiliais))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelPrincipalCadastroFiliaisLayout.setVerticalGroup(
            painelPrincipalCadastroFiliaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalCadastroFiliaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrincipalCadastroFiliaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalCadastroFiliaisLayout.createSequentialGroup()
                        .addComponent(txtNumeroLojaCadastroFiliais)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputNumeroLojaCadastroFiliais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCidadeCadastroFiliais)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputCidadeCadastroFiliais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEstadoCadastroFiliais)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkboxCadastroFiliais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCepCadastroFiliais, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputCepCadastroFiliais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBairroCadastroFiliais)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputBairroCadastroFiliais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelPrincipalCadastroFiliaisLayout.createSequentialGroup()
                        .addComponent(txtCadastroFiliais)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputNomeCadastroFiliais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDataCadastroFiliais)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputDataCadastroFiliais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEmailCadastroFiliais)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputEmailCadastroFiliais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCnpjCadastroFiliais)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputCnpjCadastroFiliais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTelClientesCadastro)
                        .addGap(10, 10, 10)
                        .addComponent(inputTelCadastroFiliais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(painelPrincipalCadastroFiliaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSalvarCadastroFiliais)
                    .addComponent(botaoLimparCadastroFiliais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(94, 94, 94))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipalCadastroFiliais, javax.swing.GroupLayout.PREFERRED_SIZE, 585, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipalCadastroFiliais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }                    

    private void inputCepCadastroFiliaisActionPerformed(java.awt.event.ActionEvent evt) {                                                        
    }                                                       

    private void botaoSalvarCadastroFiliaisActionPerformed(java.awt.event.ActionEvent evt) {                                                           
    	String nomeFilial;
    	String cnpjString;
    	String telefoneString;
    	String nmLoja;
    	String cidade;
    	String estado;
    	String cepString;
    	String Bairro;
    	
    	try {
    	
	        estado = (String) checkboxCadastroFiliais.getSelectedItem();
			
			nomeFilial = inputNomeCadastroFiliais.getText();
			
			cnpjString = inputCnpjCadastroFiliais.getText();			
	
			telefoneString = inputTelCadastroFiliais.getText();
			
			nmLoja = inputNumeroLojaCadastroFiliais.getText();
			
			cidade = inputCidadeCadastroFiliais.getText();
			
			cepString = inputCepCadastroFiliais.getText();
		
			Bairro = inputBairroCadastroFiliais.getText();
			
			ConnectionDB.Conectar();
	        String sql = "insert into filiais_table(nome_filial,cnpj_filial,telefone_filial,cep_filial,cidade_filial,bairro_filial,estado_filial,numero_loja_filial) values(?,?,?,?,?,?,?,?);";
	        PreparedStatement stm = ConnectionDB.preparedStament(sql);
	        stm.setString(1, nomeFilial);
	        stm.setString(2, cnpjString);
	        stm.setString(3, telefoneString);
	        stm.setString(4, cepString);
	        stm.setString(5, cidade);
	        stm.setString(6, Bairro);
	        stm.setString(7, estado);
	        stm.setString(8, nmLoja);
	        ConnectionDB.runPreparedStatment(stm);
	        ConnectionDB.Desconectar();
   
	}catch(NumberFormatException e) {
		System.out.println(e);
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
 
    private void botaoLimparCadastroFiliaisActionPerformed(java.awt.event.ActionEvent evt) {                                                           
        checkboxCadastroFiliais.getSelectedItem();
		inputNomeCadastroFiliais.setText("");
		inputDataCadastroFiliais.setText("");
		inputEmailCadastroFiliais.setText("");
		inputCnpjCadastroFiliais.setText("");
		inputTelCadastroFiliais.setText("");
		inputNumeroLojaCadastroFiliais.setText("");
		inputCidadeCadastroFiliais.setText("");
		inputCepCadastroFiliais.setText("");
		inputBairroCadastroFiliais.setText("");
    }                                                          
          
    private javax.swing.JButton botaoLimparCadastroFiliais;
    private javax.swing.JButton botaoSalvarCadastroFiliais;
    private javax.swing.JComboBox<String> checkboxCadastroFiliais;
    private javax.swing.JFormattedTextField inputCepCadastroFiliais;
    private javax.swing.JTextField inputCidadeCadastroFiliais;
    private javax.swing.JFormattedTextField inputCnpjCadastroFiliais;
    private javax.swing.JFormattedTextField inputDataCadastroFiliais;
    private javax.swing.JTextField inputEmailCadastroFiliais;
    private javax.swing.JTextField inputNomeCadastroFiliais;
    private javax.swing.JFormattedTextField inputNumeroLojaCadastroFiliais;
    private javax.swing.JTextField inputBairroCadastroFiliais;
    private javax.swing.JFormattedTextField inputTelCadastroFiliais;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel painelPrincipalCadastroFiliais;
    private javax.swing.JLabel txtCadastroFiliais;
    private javax.swing.JLabel txtCepCadastroFiliais;
    private javax.swing.JLabel txtCidadeCadastroFiliais;
    private javax.swing.JLabel txtCnpjCadastroFiliais;
    private javax.swing.JLabel txtDataCadastroFiliais;
    private javax.swing.JLabel txtEmailCadastroFiliais;
    private javax.swing.JLabel txtEstadoCadastroFiliais;
    private javax.swing.JLabel txtNumeroLojaCadastroFiliais;
    private javax.swing.JLabel txtBairroCadastroFiliais;
    private javax.swing.JLabel txtTelClientesCadastro;               
}
