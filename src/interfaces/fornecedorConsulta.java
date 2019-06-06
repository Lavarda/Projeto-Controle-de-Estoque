package interfaces;

public class fornecedorConsulta extends javax.swing.JInternalFrame {

    public fornecedorConsulta() {
        initComponents();
        this.setMaximizable(false);
        this.setClosable(true);
        this.setResizable(true);
        this.setIconifiable(true);
        this.setTitle("Consultar Fornecedores");
        this.setVisible(true);
    }
                        
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        painelPricnipalFornecedorConsulta = new javax.swing.JPanel();
        inputPesquisaFornecedorConsulta = new javax.swing.JTextField();
        botaoPesquisaFornecedorConsulta = new javax.swing.JButton();
        painelTabelaFornecedorConsulta = new javax.swing.JPanel();
        scrollTabelaFornecedorConsulta = new javax.swing.JScrollPane();
        tabelaFornecedorConsulta = new javax.swing.JTable();

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

        setTitle("Consulta Fornecedores");
        setMaximumSize(new java.awt.Dimension(620, 550));
        setMinimumSize(new java.awt.Dimension(620, 550));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(620, 550));
        setVisible(false);

        painelPricnipalFornecedorConsulta.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        painelPricnipalFornecedorConsulta.setMaximumSize(new java.awt.Dimension(620, 500));
        painelPricnipalFornecedorConsulta.setMinimumSize(new java.awt.Dimension(620, 500));
        painelPricnipalFornecedorConsulta.setPreferredSize(new java.awt.Dimension(620, 500));

        botaoPesquisaFornecedorConsulta.setBackground(new java.awt.Color(43, 82, 253));
        botaoPesquisaFornecedorConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/clientes.png"))); // NOI18N
        botaoPesquisaFornecedorConsulta.setText("Pesquisa");
        botaoPesquisaFornecedorConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisaFornecedorConsultaActionPerformed(evt);
            }
        });

        tabelaFornecedorConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome ", "Cnpj", "E-mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scrollTabelaFornecedorConsulta.setViewportView(tabelaFornecedorConsulta);

        javax.swing.GroupLayout painelTabelaFornecedorConsultaLayout = new javax.swing.GroupLayout(painelTabelaFornecedorConsulta);
        painelTabelaFornecedorConsulta.setLayout(painelTabelaFornecedorConsultaLayout);
        painelTabelaFornecedorConsultaLayout.setHorizontalGroup(
            painelTabelaFornecedorConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollTabelaFornecedorConsulta)
        );
        painelTabelaFornecedorConsultaLayout.setVerticalGroup(
            painelTabelaFornecedorConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaFornecedorConsultaLayout.createSequentialGroup()
                .addComponent(scrollTabelaFornecedorConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelPricnipalFornecedorConsultaLayout = new javax.swing.GroupLayout(painelPricnipalFornecedorConsulta);
        painelPricnipalFornecedorConsulta.setLayout(painelPricnipalFornecedorConsultaLayout);
        painelPricnipalFornecedorConsultaLayout.setHorizontalGroup(
            painelPricnipalFornecedorConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPricnipalFornecedorConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPricnipalFornecedorConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(painelTabelaFornecedorConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelPricnipalFornecedorConsultaLayout.createSequentialGroup()
                        .addComponent(inputPesquisaFornecedorConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoPesquisaFornecedorConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelPricnipalFornecedorConsultaLayout.setVerticalGroup(
            painelPricnipalFornecedorConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPricnipalFornecedorConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPricnipalFornecedorConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputPesquisaFornecedorConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoPesquisaFornecedorConsulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelTabelaFornecedorConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPricnipalFornecedorConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 585, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPricnipalFornecedorConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }

    private void botaoPesquisaFornecedorConsultaActionPerformed(java.awt.event.ActionEvent evt) {                                                                
        //defaultTableModel tabelaCliente  = (defaultTableModel) tabelaClientesConsulta.getModel();        
    }                                                               

    private javax.swing.JButton botaoPesquisaFornecedorConsulta;
    private javax.swing.JTextField inputPesquisaFornecedorConsulta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel painelPricnipalFornecedorConsulta;
    private javax.swing.JPanel painelTabelaFornecedorConsulta;
    private javax.swing.JScrollPane scrollTabelaFornecedorConsulta;
    private javax.swing.JTable tabelaFornecedorConsulta;
}
