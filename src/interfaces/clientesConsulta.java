package interfaces;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Connections.ConnectionDB;

public class clientesConsulta extends javax.swing.JInternalFrame {

    public clientesConsulta() {
        initComponents();
        this.setMaximizable(false);
        this.setClosable(true);
        this.setResizable(true);
        this.setIconifiable(true);
        this.setTitle("Consulta Clientes");
        this.setVisible(true);
    }
                        
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        painelPricnipalClientesConsulta = new javax.swing.JPanel();
        inputPesquisaClientesConsulta = new javax.swing.JTextField();
        botaoPesquisaClientesConsulta = new javax.swing.JButton();
        painelTabelaClientesConsulta = new javax.swing.JPanel();
        scrollTabelaClientesConsulta = new javax.swing.JScrollPane();
        tabelaClientesConsulta = new javax.swing.JTable();

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

        setTitle("Consulta Clientes");
        setMaximumSize(new java.awt.Dimension(620, 550));
        setMinimumSize(new java.awt.Dimension(620, 550));
        setName(""); 
        setPreferredSize(new java.awt.Dimension(620, 550));
        setVisible(false);

        painelPricnipalClientesConsulta.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        painelPricnipalClientesConsulta.setMaximumSize(new java.awt.Dimension(620, 500));
        painelPricnipalClientesConsulta.setMinimumSize(new java.awt.Dimension(620, 500));
        painelPricnipalClientesConsulta.setPreferredSize(new java.awt.Dimension(620, 500));

        botaoPesquisaClientesConsulta.setBackground(new java.awt.Color(43, 82, 253));
        botaoPesquisaClientesConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/clientes.png"))); // NOI18N
        botaoPesquisaClientesConsulta.setText("Pesquisa");
        botaoPesquisaClientesConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisaClientesConsultaActionPerformed(evt);
            }
        });

        tabelaClientesConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "E-mail", "Cpf", "Dt Nasc", "Rg"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scrollTabelaClientesConsulta.setViewportView(tabelaClientesConsulta);

        javax.swing.GroupLayout painelTabelaClientesConsultaLayout = new javax.swing.GroupLayout(painelTabelaClientesConsulta);
        painelTabelaClientesConsulta.setLayout(painelTabelaClientesConsultaLayout);
        painelTabelaClientesConsultaLayout.setHorizontalGroup(
            painelTabelaClientesConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollTabelaClientesConsulta)
        );
        painelTabelaClientesConsultaLayout.setVerticalGroup(
            painelTabelaClientesConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTabelaClientesConsultaLayout.createSequentialGroup()
                .addComponent(scrollTabelaClientesConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelPricnipalClientesConsultaLayout = new javax.swing.GroupLayout(painelPricnipalClientesConsulta);
        painelPricnipalClientesConsulta.setLayout(painelPricnipalClientesConsultaLayout);
        painelPricnipalClientesConsultaLayout.setHorizontalGroup(
            painelPricnipalClientesConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPricnipalClientesConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPricnipalClientesConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(painelTabelaClientesConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelPricnipalClientesConsultaLayout.createSequentialGroup()
                        .addComponent(inputPesquisaClientesConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoPesquisaClientesConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelPricnipalClientesConsultaLayout.setVerticalGroup(
            painelPricnipalClientesConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPricnipalClientesConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPricnipalClientesConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputPesquisaClientesConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoPesquisaClientesConsulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelTabelaClientesConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPricnipalClientesConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 585, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPricnipalClientesConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }

    private void botaoPesquisaClientesConsultaActionPerformed(java.awt.event.ActionEvent evt) {                                                              
        //defaultTableModel tabelaCliente  = (defaultTableModel) tabelaClientesConsulta.getModel();
    	String busca;
    	try {
    		busca = inputPesquisaClientesConsulta.getText();
    		
    		ConnectionDB.Conectar();
    		String sql = "select nome_usuario,email_usuario,cpf_usuario,dt_nascimento,rg_usuario from usuarios_table where nome_usuario = ?";
    		PreparedStatement stm = ConnectionDB.preparedStament(sql);
    		stm.setString(1, busca);
    		ResultSet result = ConnectionDB.runPreparedSelect(stm);
    		
    		while ( result.next() ) {
    			System.out.println(result.getString("nome_usuario") + " " + result.getString("email_usuario") + " " + result.getString("cpf_usuario") + " " + result.getString("dt_nascimento") + " " + result.getString("rg_usuario"));
    		}
    		
    		ConnectionDB.Desconectar();
    	} catch (NumberFormatException e){
    		System.out.println(e);
    	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }                                                             

                  
    private javax.swing.JButton botaoPesquisaClientesConsulta;
    private javax.swing.JTextField inputPesquisaClientesConsulta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel painelPricnipalClientesConsulta;
    private javax.swing.JPanel painelTabelaClientesConsulta;
    private javax.swing.JScrollPane scrollTabelaClientesConsulta;
    private javax.swing.JTable tabelaClientesConsulta;                 

}
