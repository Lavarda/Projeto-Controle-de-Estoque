package interfaces;

public class InterfaceLogin extends javax.swing.JFrame {

 
    public InterfaceLogin() {
        initComponents();
    }

    private void initComponents() {

        PainelPrincipalLogin = new javax.swing.JPanel();
        txtNomeLogin = new javax.swing.JLabel();
        txtSenhaLogin = new javax.swing.JLabel();
        inputNomeLogin = new javax.swing.JTextField();
        inputSenhaLogin = new javax.swing.JPasswordField();
        checkGerenteLogin = new javax.swing.JRadioButton();
        checkFuncionarioLogin = new javax.swing.JRadioButton();
        botaoEntrarLogin = new javax.swing.JButton();
        scrollTxtPrincipal = new javax.swing.JScrollPane();
        txtPrincipalLogin = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Login");

        PainelPrincipalLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtNomeLogin.setText("Nome Usuario:");

        txtSenhaLogin.setText("Senha:");

        checkGerenteLogin.setText("Gerente");

        checkFuncionarioLogin.setText("Funcionario");

        botaoEntrarLogin.setText("Entrar");
        botaoEntrarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarLoginActionPerformed(evt);
            }
        });

        txtPrincipalLogin.setEditable(false);
        txtPrincipalLogin.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas ultrices risus velit, quis posuere tellus mattis eget. Aenean nec dolor\nsed tortor tristique vestibulum. Cras ac eros ut massa cursus mollis. Proin vel vehicula enim. Suspendisse sit amet orci vitae tellus pulvinar\n\n");
        scrollTxtPrincipal.setViewportView(txtPrincipalLogin);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconLogin.png"))); // NOI18N

        javax.swing.GroupLayout PainelPrincipalLoginLayout = new javax.swing.GroupLayout(PainelPrincipalLogin);
        PainelPrincipalLogin.setLayout(PainelPrincipalLoginLayout);
        PainelPrincipalLoginLayout.setHorizontalGroup(
            PainelPrincipalLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPrincipalLoginLayout.createSequentialGroup()
                .addGroup(PainelPrincipalLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelPrincipalLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PainelPrincipalLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoEntrarLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputSenhaLogin)
                            .addGroup(PainelPrincipalLoginLayout.createSequentialGroup()
                                .addGroup(PainelPrincipalLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomeLogin)
                                    .addComponent(txtSenhaLogin)
                                    .addGroup(PainelPrincipalLoginLayout.createSequentialGroup()
                                        .addComponent(checkGerenteLogin)
                                        .addGap(36, 36, 36)
                                        .addComponent(checkFuncionarioLogin)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(inputNomeLogin))
                        .addGap(18, 18, 18))
                    .addGroup(PainelPrincipalLoginLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(scrollTxtPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        PainelPrincipalLoginLayout.setVerticalGroup(
            PainelPrincipalLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPrincipalLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelPrincipalLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollTxtPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PainelPrincipalLoginLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtNomeLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputNomeLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSenhaLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputSenhaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PainelPrincipalLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkGerenteLogin)
                            .addComponent(checkFuncionarioLogin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoEntrarLogin)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelPrincipalLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelPrincipalLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoEntrarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoEntrarLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelPrincipalLogin;
    private javax.swing.JButton botaoEntrarLogin;
    private javax.swing.JRadioButton checkFuncionarioLogin;
    private javax.swing.JRadioButton checkGerenteLogin;
    private javax.swing.JTextField inputNomeLogin;
    private javax.swing.JPasswordField inputSenhaLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane scrollTxtPrincipal;
    private javax.swing.JLabel txtNomeLogin;
    private javax.swing.JTextPane txtPrincipalLogin;
    private javax.swing.JLabel txtSenhaLogin;
    // End of variables declaration//GEN-END:variables
}
