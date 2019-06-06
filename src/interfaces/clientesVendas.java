package interfaces;

public class clientesVendas extends javax.swing.JInternalFrame {

    public clientesVendas() {
        initComponents();
        this.setMaximizable(false);
        this.setClosable(true);
        this.setResizable(true);
        this.setIconifiable(true);
        this.setTitle("Consulta de Clientes");
        this.setVisible(true);
    }

    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        painelPricnipalClientesCadastro = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

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

        setTitle("Vendas Cliente");
        setMaximumSize(new java.awt.Dimension(580, 480));
        setMinimumSize(new java.awt.Dimension(580, 480));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(580, 480));
        setVisible(false);

        painelPricnipalClientesCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder("Vendas Cliente"));
        painelPricnipalClientesCadastro.setMaximumSize(new java.awt.Dimension(580, 480));
        painelPricnipalClientesCadastro.setMinimumSize(new java.awt.Dimension(580, 480));
        painelPricnipalClientesCadastro.setPreferredSize(new java.awt.Dimension(580, 480));

        jButton1.setText("Pesquisar");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.setColumnSelectionAllowed(true);
        jTable2.setDragEnabled(true);
        jTable2.setInheritsPopupMenu(true);
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout painelPricnipalClientesCadastroLayout = new javax.swing.GroupLayout(painelPricnipalClientesCadastro);
        painelPricnipalClientesCadastro.setLayout(painelPricnipalClientesCadastroLayout);
        painelPricnipalClientesCadastroLayout.setHorizontalGroup(
            painelPricnipalClientesCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPricnipalClientesCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPricnipalClientesCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(painelPricnipalClientesCadastroLayout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelPricnipalClientesCadastroLayout.setVerticalGroup(
            painelPricnipalClientesCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPricnipalClientesCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPricnipalClientesCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPricnipalClientesCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 556, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPricnipalClientesCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 426, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel painelPricnipalClientesCadastro;
}
