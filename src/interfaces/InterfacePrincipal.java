package interfaces;

public class InterfacePrincipal extends javax.swing.JFrame {

    public InterfacePrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);   
    }

    private void initComponents() {

        telaLinkPrincipal = new javax.swing.JDesktopPane();
        barraMenuTelaPrincipal = new javax.swing.JMenuBar();
        clienteBarraMenu = new javax.swing.JMenu();
        itemCadastroCliente = new javax.swing.JMenuItem();
        itemConsultarCliente = new javax.swing.JMenuItem();
        funcionarioBarraMenu = new javax.swing.JMenu();
        itemConsultarFuncionario = new javax.swing.JMenuItem();
        produtoBarraMenu = new javax.swing.JMenu();
        itemCadastrarProduto = new javax.swing.JMenuItem();
        itemConsultarEstoque = new javax.swing.JMenuItem();
        itemAdicionarProduto = new javax.swing.JMenuItem();
        fornecedorBarraMenu = new javax.swing.JMenu();
        itemCadastrarFornecedor = new javax.swing.JMenuItem();
        itemConsultaFornecedor = new javax.swing.JMenuItem();
        itemGerenciamento = new javax.swing.JMenuItem();
        filiaisBarraMenu = new javax.swing.JMenu();
        itemTransferencia = new javax.swing.JMenuItem();
        itemCadastrarFiliais = new javax.swing.JMenuItem();
        vendasBarraMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setMaximizedBounds(new java.awt.Rectangle(1000, 1000, 1000, 1000));

        telaLinkPrincipal.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout telaLinkPrincipalLayout = new javax.swing.GroupLayout(telaLinkPrincipal);
        telaLinkPrincipal.setLayout(telaLinkPrincipalLayout);
        telaLinkPrincipalLayout.setHorizontalGroup(
            telaLinkPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        telaLinkPrincipalLayout.setVerticalGroup(
            telaLinkPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        barraMenuTelaPrincipal.setForeground(new java.awt.Color(153, 153, 153));
        barraMenuTelaPrincipal.setMargin(new java.awt.Insets(2, 2, 2, 2));

        clienteBarraMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/clientes.png"))); 
        clienteBarraMenu.setText("CLIENTE");
        clienteBarraMenu.setMaximumSize(new java.awt.Dimension(100, 200));
        clienteBarraMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteBarraMenuActionPerformed(evt);
            }
        });

        itemCadastroCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/aleatorio.png")));
        itemCadastroCliente.setText("Cadastrar cliente");
        itemCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadastroClienteActionPerformed(evt);
            }
        });
        clienteBarraMenu.add(itemCadastroCliente);

        itemConsultarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/aleatorio.png"))); 
        itemConsultarCliente.setText("Consultar cliente");
        itemConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultarClienteActionPerformed(evt);
            }
        });
        clienteBarraMenu.add(itemConsultarCliente);

        barraMenuTelaPrincipal.add(clienteBarraMenu);

        funcionarioBarraMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/funcinario.png"))); 
        funcionarioBarraMenu.setText("FUNCIONARIO");
        funcionarioBarraMenu.setMaximumSize(new java.awt.Dimension(120, 100));

        itemConsultarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/aleatorio.png")));
        itemConsultarFuncionario.setText("Consultar Funcionario");
        itemConsultarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultarFuncionarioActionPerformed(evt);
            }
        });
        funcionarioBarraMenu.add(itemConsultarFuncionario);

        barraMenuTelaPrincipal.add(funcionarioBarraMenu);

        produtoBarraMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos.png")));
        produtoBarraMenu.setText("PRODUTO");
        produtoBarraMenu.setMaximumSize(new java.awt.Dimension(100, 100));

        itemCadastrarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/aleatorio.png"))); 
        itemCadastrarProduto.setText("Cadastrar produto");
        itemCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadastrarProdutoActionPerformed(evt);
            }
        });
        produtoBarraMenu.add(itemCadastrarProduto);

        itemConsultarEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/aleatorio.png")));
        itemConsultarEstoque.setText("Consultar estoque");
        itemConsultarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultarEstoqueActionPerformed(evt);
            }
        });
        produtoBarraMenu.add(itemConsultarEstoque);

        itemAdicionarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/aleatorio.png")));
        itemAdicionarProduto.setText("Adicionar Produto ao estoque");
        itemAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAdicionarProdutoActionPerformed(evt);
            }
        });
        produtoBarraMenu.add(itemAdicionarProduto);

        barraMenuTelaPrincipal.add(produtoBarraMenu);

        fornecedorBarraMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fornecedor.png"))); 
        fornecedorBarraMenu.setText("FORNECEDOR");
        fornecedorBarraMenu.setMaximumSize(new java.awt.Dimension(120, 120));
        fornecedorBarraMenu.setMinimumSize(new java.awt.Dimension(120, 120));

        itemCadastrarFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/aleatorio.png")));
        itemCadastrarFornecedor.setText("Cadastrar fornecedor");
        itemCadastrarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadastrarFornecedorActionPerformed(evt);
            }
        });
        fornecedorBarraMenu.add(itemCadastrarFornecedor);

        itemConsultaFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/aleatorio.png"))); 
        itemConsultaFornecedor.setText("Consultar fornecedor");
        itemConsultaFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultaFornecedorActionPerformed(evt);
            }
        });
        fornecedorBarraMenu.add(itemConsultaFornecedor);

        itemGerenciamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/aleatorio.png"))); 
        itemGerenciamento.setText("Gerenciamento chegada/saida");
        itemGerenciamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGerenciamentoActionPerformed(evt);
            }
        });
        fornecedorBarraMenu.add(itemGerenciamento);

        barraMenuTelaPrincipal.add(fornecedorBarraMenu);

        filiaisBarraMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/filiais.png")));
        filiaisBarraMenu.setText("FILIAIS");
        filiaisBarraMenu.setMaximumSize(new java.awt.Dimension(100, 110));

        itemTransferencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/aleatorio.png"))); 
        itemTransferencia.setText("Transferencia");
        itemTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTransferenciaActionPerformed(evt);
            }
        });
        filiaisBarraMenu.add(itemTransferencia);

        itemCadastrarFiliais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/aleatorio.png")));
        itemCadastrarFiliais.setText("Cadastrar filiais");
        itemCadastrarFiliais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadastrarFiliaisActionPerformed(evt);
            }
        });
        filiaisBarraMenu.add(itemCadastrarFiliais);

        barraMenuTelaPrincipal.add(filiaisBarraMenu);

        vendasBarraMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas.png"))); 
        vendasBarraMenu.setText("VENDAS");
        vendasBarraMenu.setMaximumSize(new java.awt.Dimension(100, 100));
        vendasBarraMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendasBarraMenuActionPerformed(evt);
            }
        });

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/aleatorio.png"))); 
        jMenuItem1.setText("Visão diaria");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        vendasBarraMenu.add(jMenuItem1);

        barraMenuTelaPrincipal.add(vendasBarraMenu);

        setJMenuBar(barraMenuTelaPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telaLinkPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telaLinkPrincipal)
        );

        pack();
    }
    
    private void itemCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {
        clientesCadastro telaCadastroUsuario = new clientesCadastro();
        telaLinkPrincipal.add(telaCadastroUsuario);
        telaCadastroUsuario.setVisible(true);
    }

    private void itemTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {
        transferenciaFiliais transferirProduto = new transferenciaFiliais();
        telaLinkPrincipal.add(transferirProduto);
        transferirProduto.setVisible(true);    
   }

    private void clienteBarraMenuActionPerformed(java.awt.event.ActionEvent evt) {
        clientesCadastro telaCadastroUsuario = new clientesCadastro();
        telaLinkPrincipal.add(telaCadastroUsuario);
        telaCadastroUsuario.setVisible(true);
        //this.dispose();
    }

    private void itemConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {
        clientesConsulta consultasClientes = new clientesConsulta();
        telaLinkPrincipal.add(consultasClientes);
        consultasClientes.setVisible(true);
        //this.dispose();
    }

    private void itemConsultarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {
        funcionariosConsulta consultasFuncionarios = new funcionariosConsulta();
        telaLinkPrincipal.add(consultasFuncionarios);
        consultasFuncionarios.setVisible(true);
    }

    private void itemCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {
        produtosCadastro cadastroProdutos = new produtosCadastro();
        telaLinkPrincipal.add(cadastroProdutos);
        cadastroProdutos.setVisible(true);
    }

    private void itemConsultarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {
        estoqueConsulta estoqueConsultaProdutos = new estoqueConsulta();
        telaLinkPrincipal.add(estoqueConsultaProdutos);
        estoqueConsultaProdutos.setVisible(true);
    }

    private void itemAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {
        adicionarProdutoEstoque adicionarProduto = new adicionarProdutoEstoque();
        telaLinkPrincipal.add(adicionarProduto);
        adicionarProduto.setVisible(true);
    }

    private void itemCadastrarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {
        fornecedorCadastro cadastroFornecedor = new fornecedorCadastro();
        telaLinkPrincipal.add(cadastroFornecedor);
        cadastroFornecedor.setVisible(true);    
	}

    private void itemGerenciamentoActionPerformed(java.awt.event.ActionEvent evt) {
        gerenciamentoFornecedor gerenciarFornecimento = new gerenciamentoFornecedor();
        telaLinkPrincipal.add(gerenciarFornecimento);
        gerenciarFornecimento.setVisible(true);    
    }

    private void itemConsultaFornecedorActionPerformed(java.awt.event.ActionEvent evt) {
        fornecedorConsulta consultarFornecedores = new fornecedorConsulta();
        telaLinkPrincipal.add(consultarFornecedores);
        consultarFornecedores.setVisible(true);    
    }

    private void itemCadastrarFiliaisActionPerformed(java.awt.event.ActionEvent evt) {
        filiaisCadastro cadastroFiliais = new filiaisCadastro();
        telaLinkPrincipal.add(cadastroFiliais);
        cadastroFiliais.setVisible(true);    
    }

    private void vendasBarraMenuActionPerformed(java.awt.event.ActionEvent evt) {
     }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
         vendas totalDiaria = new vendas();
        telaLinkPrincipal.add(totalDiaria);
        totalDiaria.setVisible(true);
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfacePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new InterfacePrincipal().setVisible(true);
        });
    }

    private javax.swing.JMenuBar barraMenuTelaPrincipal;
    private javax.swing.JMenu clienteBarraMenu;
    private javax.swing.JMenu filiaisBarraMenu;
    private javax.swing.JMenu fornecedorBarraMenu;
    private javax.swing.JMenu funcionarioBarraMenu;
    private javax.swing.JMenuItem itemAdicionarProduto;
    private javax.swing.JMenuItem itemCadastrarFiliais;
    private javax.swing.JMenuItem itemCadastrarFornecedor;
    private javax.swing.JMenuItem itemCadastrarProduto;
    private javax.swing.JMenuItem itemCadastroCliente;
    private javax.swing.JMenuItem itemConsultaFornecedor;
    private javax.swing.JMenuItem itemConsultarCliente;
    private javax.swing.JMenuItem itemConsultarEstoque;
    private javax.swing.JMenuItem itemConsultarFuncionario;
    private javax.swing.JMenuItem itemGerenciamento;
    private javax.swing.JMenuItem itemTransferencia;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu produtoBarraMenu;
    private javax.swing.JDesktopPane telaLinkPrincipal;
    private javax.swing.JMenu vendasBarraMenu;
}
