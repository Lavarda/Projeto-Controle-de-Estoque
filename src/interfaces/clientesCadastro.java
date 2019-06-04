/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import javax.swing.JOptionPane;

/**
 *
 * @author Dinopc
 */
public class clientesCadastro extends javax.swing.JInternalFrame {
    /**
     * Creates new form clientesCadastro
     */
    public clientesCadastro() {
        initComponents();
        this.setMaximizable(false);
        this.setClosable(true);
        this.setResizable(true);
        this.setIconifiable(true);
        this.setTitle("Cadastro de Clientes");
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        painelPrincipalClientesCadastro = new javax.swing.JPanel();
        txtClientesCadastro = new javax.swing.JLabel();
        txtDataClientesCadastro = new javax.swing.JLabel();
        txtEmailClientesCadastro = new javax.swing.JLabel();
        txtCpfClientesCadastro = new javax.swing.JLabel();
        txtRgClientesCadastro = new javax.swing.JLabel();
        txtTelClientesCadastro = new javax.swing.JLabel();
        txtCidadeClientesCadastro = new javax.swing.JLabel();
        txtEstadoClientesCadastro = new javax.swing.JLabel();
        txtCepClientesCadastro = new javax.swing.JLabel();
        txtRuaClientesCadastro = new javax.swing.JLabel();
        inputNomeClienteCadastro = new javax.swing.JTextField();
        inputEmailClienteCadastro = new javax.swing.JTextField();
        inputCidadeClientesCadastro = new javax.swing.JTextField();
        inputRuaClientesCadastro = new javax.swing.JTextField();
        botaoLimparClientesCadastro = new javax.swing.JButton();
        botaoSalvarClientesCadastro = new javax.swing.JButton();
        comboBoxSexoClientesCadastro = new javax.swing.JComboBox<>();
        comboBoxEstadoCivilClientesCadastro = new javax.swing.JComboBox<>();
        txtSexoClientesCadastro = new javax.swing.JLabel();
        txtEstadoCivilClientesCadastro = new javax.swing.JLabel();
        comboBoxEstadoClientesCadastro = new javax.swing.JComboBox<>();
        inputDataClientes = new javax.swing.JFormattedTextField();
        inputCpfClientesCadastro = new javax.swing.JFormattedTextField();
        inputTelClientesCadastro = new javax.swing.JFormattedTextField();
        inputCepClientesCadastro = new javax.swing.JFormattedTextField();
        inputRgClientesCadastro = new javax.swing.JFormattedTextField();

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

        painelPrincipalClientesCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        painelPrincipalClientesCadastro.setMaximumSize(new java.awt.Dimension(620, 500));
        painelPrincipalClientesCadastro.setMinimumSize(new java.awt.Dimension(620, 500));
        painelPrincipalClientesCadastro.setPreferredSize(new java.awt.Dimension(620, 500));

        txtClientesCadastro.setText("Nome");

        txtDataClientesCadastro.setText("Data Nascimento");

        txtEmailClientesCadastro.setText("E-mail");

        txtCpfClientesCadastro.setText("CPF");

        txtRgClientesCadastro.setText("RG");

        txtTelClientesCadastro.setText("Telefone");

        txtCidadeClientesCadastro.setText("Cidade");

        txtEstadoClientesCadastro.setText("Estado");

        txtCepClientesCadastro.setText("CEP");

        txtRuaClientesCadastro.setText("Rua");

        botaoLimparClientesCadastro.setBackground(new java.awt.Color(254, 59, 55));
        botaoLimparClientesCadastro.setText("Limpar");
        botaoLimparClientesCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparClientesCadastroActionPerformed(evt);
            }
        });

        botaoSalvarClientesCadastro.setBackground(new java.awt.Color(43, 82, 253));
        botaoSalvarClientesCadastro.setText("Salvar");
        botaoSalvarClientesCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarClientesCadastroActionPerformed(evt);
            }
        });

        comboBoxSexoClientesCadastro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        comboBoxSexoClientesCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSexoClientesCadastroActionPerformed(evt);
            }
        });

        comboBoxEstadoCivilClientesCadastro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado", "Divorciado", "viuvo" }));
        comboBoxEstadoCivilClientesCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxEstadoCivilClientesCadastroActionPerformed(evt);
            }
        });

        txtSexoClientesCadastro.setText("Sexo");

        txtEstadoCivilClientesCadastro.setText("Estado Civil");

        comboBoxEstadoClientesCadastro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA) ", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));

        try {
            inputDataClientes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            inputCpfClientesCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            inputTelClientesCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            inputCepClientesCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        inputCepClientesCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCepClientesCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelPrincipalClientesCadastroLayout = new javax.swing.GroupLayout(painelPrincipalClientesCadastro);
        painelPrincipalClientesCadastro.setLayout(painelPrincipalClientesCadastroLayout);
        painelPrincipalClientesCadastroLayout.setHorizontalGroup(
            painelPrincipalClientesCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalClientesCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrincipalClientesCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelPrincipalClientesCadastroLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoLimparClientesCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoSalvarClientesCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelPrincipalClientesCadastroLayout.createSequentialGroup()
                        .addGroup(painelPrincipalClientesCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRgClientesCadastro)
                            .addComponent(txtEmailClientesCadastro)
                            .addComponent(txtClientesCadastro)
                            .addComponent(txtDataClientesCadastro)
                            .addComponent(inputDataClientes)
                            .addComponent(inputEmailClienteCadastro)
                            .addComponent(txtCpfClientesCadastro)
                            .addComponent(inputNomeClienteCadastro)
                            .addComponent(txtTelClientesCadastro)
                            .addComponent(inputCpfClientesCadastro)
                            .addComponent(inputTelClientesCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(inputRgClientesCadastro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(painelPrincipalClientesCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalClientesCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCidadeClientesCadastro)
                                .addComponent(txtEstadoClientesCadastro)
                                .addComponent(txtCepClientesCadastro)
                                .addComponent(txtRuaClientesCadastro)
                                .addComponent(txtSexoClientesCadastro)
                                .addComponent(inputRuaClientesCadastro)
                                .addComponent(comboBoxEstadoClientesCadastro, 0, 1, Short.MAX_VALUE)
                                .addComponent(inputCidadeClientesCadastro)
                                .addComponent(comboBoxSexoClientesCadastro, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEstadoCivilClientesCadastro)
                                .addComponent(comboBoxEstadoCivilClientesCadastro, 0, 200, Short.MAX_VALUE))
                            .addComponent(inputCepClientesCadastro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelPrincipalClientesCadastroLayout.setVerticalGroup(
            painelPrincipalClientesCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalClientesCadastroLayout.createSequentialGroup()
                .addGroup(painelPrincipalClientesCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClientesCadastro)
                    .addComponent(txtCidadeClientesCadastro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPrincipalClientesCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNomeClienteCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputCidadeClientesCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelPrincipalClientesCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataClientesCadastro)
                    .addComponent(txtEstadoClientesCadastro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPrincipalClientesCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputDataClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxEstadoClientesCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelPrincipalClientesCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailClientesCadastro)
                    .addComponent(txtCepClientesCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPrincipalClientesCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputEmailClienteCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputCepClientesCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelPrincipalClientesCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(painelPrincipalClientesCadastroLayout.createSequentialGroup()
                        .addComponent(txtRuaClientesCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputRuaClientesCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSexoClientesCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxSexoClientesCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(painelPrincipalClientesCadastroLayout.createSequentialGroup()
                        .addComponent(txtCpfClientesCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputCpfClientesCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtRgClientesCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputRgClientesCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGroup(painelPrincipalClientesCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelClientesCadastro)
                    .addComponent(txtEstadoCivilClientesCadastro))
                .addGap(10, 10, 10)
                .addGroup(painelPrincipalClientesCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxEstadoCivilClientesCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputTelClientesCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelPrincipalClientesCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSalvarClientesCadastro)
                    .addComponent(botaoLimparClientesCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipalClientesCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 585, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipalClientesCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void comboBoxEstadoCivilClientesCadastroActionPerformed(java.awt.event.ActionEvent evt) {                                                                    
        // TODO add your handling code here:
    }                                                                   

    private void inputCepClientesCadastroActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        // TODO add your handling code here:
    }                                                        

    private void botaoLimparClientesCadastroActionPerformed(java.awt.event.ActionEvent evt) {                                                            
        inputCepClientesCadastro.setText("");
        inputCidadeClientesCadastro.setText("");
        inputCpfClientesCadastro.setText("");
        inputDataClientes.setText("");
        inputEmailClienteCadastro.setText("");
        inputNomeClienteCadastro.setText("");
        inputRgClientesCadastro.setText("");
        inputRuaClientesCadastro.setText("");
        inputTelClientesCadastro.setText("");        
    }                                                           

    private void botaoSalvarClientesCadastroActionPerformed(java.awt.event.ActionEvent evt) {                                                            
    	String nome;
    	String dtNasc;
    	String email;
    	String cpfString;
    	String sexo;
    	String rgString;
    	String cidade;
    	String estado;
    	String cepString;
    	String rua;
    	String estadoCivil;
    	String telefone;
    	int cpf;
    	
    	try {
    		nome = inputNomeClienteCadastro.getText();
    		System.out.println(nome);
    		
    		dtNasc = inputDataClientes.getText();
    		System.out.println(dtNasc);
    		
    		email = inputEmailClienteCadastro.getText();
    		System.out.println(email);
    		
    		cpfString = inputCpfClientesCadastro.getText();
    		System.out.println(cpfString);
    		
    		rgString = inputRgClientesCadastro.getText();
    		System.out.println(rgString);

    		cidade = inputCidadeClientesCadastro.getText();
    		System.out.println(cidade);
    		
            estado = (String) comboBoxEstadoClientesCadastro.getSelectedItem();
    		System.out.println(estado);
    		
    		cepString = inputCepClientesCadastro.getText();
    		System.out.println(cepString);
    		
    		rua = inputRuaClientesCadastro.getText();
    		System.out.println(rua);
    		
    		telefone = inputTelClientesCadastro.getText();
    		System.out.println(telefone);
    		
            estadoCivil = (String) comboBoxEstadoCivilClientesCadastro.getSelectedItem();
    		System.out.println(estadoCivil);
    		
    		/*
    		cpfString = inputCpfClientesCadastro.getText();
    		cpf = Integer.parseInt(cpfString);
    		System.out.println(cpf);
    		*/
            
            sexo = (String) comboBoxSexoClientesCadastro.getSelectedItem();
            System.out.println(sexo);
            
    	}catch(NumberFormatException e) {
    		
    	}
        
    }                                                           

    private void comboBoxSexoClientesCadastroActionPerformed(java.awt.event.ActionEvent evt) {                                                             

    }                                                            


    // Variables declaration - do not modify                     
    private javax.swing.JButton botaoLimparClientesCadastro;
    private javax.swing.JButton botaoSalvarClientesCadastro;
    private javax.swing.JComboBox<String> comboBoxEstadoCivilClientesCadastro;
    private javax.swing.JComboBox<String> comboBoxEstadoClientesCadastro;
    private javax.swing.JComboBox<String> comboBoxSexoClientesCadastro;
    private javax.swing.JFormattedTextField inputCepClientesCadastro;
    private javax.swing.JTextField inputCidadeClientesCadastro;
    private javax.swing.JFormattedTextField inputCpfClientesCadastro;
    private javax.swing.JFormattedTextField inputDataClientes;
    private javax.swing.JTextField inputEmailClienteCadastro;
    private javax.swing.JTextField inputNomeClienteCadastro;
    private javax.swing.JFormattedTextField inputRgClientesCadastro;
    private javax.swing.JTextField inputRuaClientesCadastro;
    private javax.swing.JFormattedTextField inputTelClientesCadastro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel painelPrincipalClientesCadastro;
    private javax.swing.JLabel txtCepClientesCadastro;
    private javax.swing.JLabel txtCidadeClientesCadastro;
    private javax.swing.JLabel txtClientesCadastro;
    private javax.swing.JLabel txtCpfClientesCadastro;
    private javax.swing.JLabel txtDataClientesCadastro;
    private javax.swing.JLabel txtEmailClientesCadastro;
    private javax.swing.JLabel txtEstadoCivilClientesCadastro;
    private javax.swing.JLabel txtEstadoClientesCadastro;
    private javax.swing.JLabel txtRgClientesCadastro;
    private javax.swing.JLabel txtRuaClientesCadastro;
    private javax.swing.JLabel txtSexoClientesCadastro;
    private javax.swing.JLabel txtTelClientesCadastro;
    // End of variables declaration                   
}