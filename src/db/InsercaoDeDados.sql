INSERT INTO funcionarios (cod_categoria, nome_funcionario, matricula_funcionario, senha_funcionario) VALUES ('1', 'Francisco de Assis', '351067', 'senha123');
INSERT INTO funcionarios (cod_categoria, nome_funcionario, matricula_funcionario, senha_funcionario) VALUES ('2', 'Joao Camargo', '743893', 'senha321');
INSERT INTO funcionarios (cod_categoria, nome_funcionario, matricula_funcionario, senha_funcionario) VALUES ('3', 'Julia Amaro', '129876', '123senha');


INSERT INTO telefone_funcionario (cod_funcionario, telefone_funcionario) VALUES ('1', '48991571400');
INSERT INTO telefone_funcionario (cod_funcionario, telefone_funcionario) VALUES ('2', '48984021119');
INSERT INTO telefone_funcionario (cod_funcionario, telefone_funcionario) VALUES ('3', '48999340917');


INSERT INTO cargo_funcionario (cod_funcionario, salario_funcionario, cargo_funcionario) VALUES ('1', '2900', 'Vendedor');
INSERT INTO cargo_funcionario (cod_funcionario, salario_funcionario, cargo_funcionario) VALUES ('2', '2800', 'Asistente Administrativo');
INSERT INTO cargo_funcionario (cod_funcionario, salario_funcionario, cargo_funcionario) VALUES ('3', '3500', 'Gerente');


INSERT INTO cadastro_usuario(nome_usuario, dt_nascimento, email_usuario, sexo_usuario, estado_civil, cpf_usuario, rg_usuario, dt_cadastro, cod_funcionario ) VALUES ('Maria Aparecida', '10/08/1979', 'aparecida@gmail.com', 'Feminino', 'Viuvo', '749.046.520-34', '8456325', '05/04/2014', '1');
INSERT INTO cadastro_usuario(nome_usuario, dt_nascimento, email_usuario, sexo_usuario, estado_civil, cpf_usuario, rg_usuario, dt_cadastro, cod_funcionario ) VALUES ('Josue Carvalho', '23/05/1982', 'carvalho@gmail.com', 'Masculino', 'Casado', '286.092.146-76', '23456789', '12/08/2015', '2');
INSERT INTO cadastro_usuario(nome_usuario, dt_nascimento, email_usuario, sexo_usuario, estado_civil, cpf_usuario, rg_usuario, dt_cadastro, cod_funcionario ) VALUES ('Davi Lucca', '13/09/2000', 'lucca@yahoo.com', 'Masculino', 'Solteiro', '020.453.963-19', '94323787', '19/07/2015', '3');



INSERT INTO telefone_usuario (cod_usuario, telefone_usuario) VALUES ('1', '48996625578');
INSERT INTO telefone_usuario (cod_usuario, telefone_usuario) VALUES ('2', '51984172042');
INSERT INTO telefone_usuario (cod_usuario, telefone_usuario) VALUES ('3', '47991191199');



INSERT INTO endereco_usuario (cod_usuario, cep_usuario, cidade_usuario, bairro_usuario, estado_usuario, numero_residencia_usuario) VALUES ('1', '88345-721', 'Florianopolis', 'Areias', 'SC', '23');
INSERT INTO endereco_usuario (cod_usuario, cep_usuario, cidade_usuario, bairro_usuario, estado_usuario, numero_residencia_usuario) VALUES ('2', '88345-832', 'Curitiba', 'Barreiros', 'PR', '1234');
INSERT INTO endereco_usuario (cod_usuario, cep_usuario, cidade_usuario, bairro_usuario, estado_usuario, numero_residencia_usuario) VALUES ('3', '88235-958', 'Porto Alegre', 'Flores', 'RS', '89');



INSERT INTO filiais (nome_filial, cnpj_filial) VALUES ('Coqueiros', '89.354.617/3832-83');
INSERT INTO filiais (nome_filial, cnpj_filial) VALUES ('Vitoria', '45.678.129/3458-98');
INSERT INTO filiais (nome_filial, cnpj_filial) VALUES ('Trindade', '12.654.968/7328-76');


INSERT INTO endereco_filial (cod_filial, cep_filial, cidade_filial, bairro_filial, estado_filial, numero_loja_filial) VALUES ('1', '88837-234', 'Florianopolis', 'Coqueiros', 'SC', '405');
INSERT INTO endereco_filial (cod_filial, cep_filial, cidade_filial, bairro_filial, estado_filial, numero_loja_filial) VALUES ('2', '88234-982', 'Florianopolis', 'Vitoria', 'SC', '907');
INSERT INTO endereco_filial (cod_filial, cep_filial, cidade_filial, bairro_filial, estado_filial, numero_loja_filial) VALUES ('3', '88133-323', 'Florianopolis', 'Trindade', 'SC', '726');


INSERT INTO telefone_filial (cod_filial, telefone_filial) VALUES ('1', '4832441345');
INSERT INTO telefone_filial (cod_filial, telefone_filial) VALUES ('2', '4833621920');
INSERT INTO telefone_filial (cod_filial, telefone_filial) VALUES ('3', '4832462122');


INSERT INTO fornecedor (nome_fornecedor, email_fornecedor) VALUES ('Genesio Flores', 'floresgenesio@gmail.com');
INSERT INTO fornecedor (nome_fornecedor, email_fornecedor) VALUES ('Vision', 'visiondist@hotmail.com');
INSERT INTO fornecedor (nome_fornecedor, email_fornecedor) VALUES ('Dimebras', 'dimebras@yahoo.com');


INSERT INTO endereco_fornecedor (cod_fornecedor, cep_fornecedor, cidade_fornecedor, bairro_fornecedor, estado_fornecedor, numero_loja_fornecedor) VALUES ('1', '88345-093', 'Florianopolis', 'Estreito', 'SC', '2354');
INSERT INTO endereco_fornecedor (cod_fornecedor, cep_fornecedor, cidade_fornecedor, bairro_fornecedor, estado_fornecedor, numero_loja_fornecedor) VALUES ('2', '88812-346', 'Joinville', 'Biguaçu', 'SC', '23');
INSERT INTO endereco_fornecedor (cod_fornecedor, cep_fornecedor, cidade_fornecedor, bairro_fornecedor, estado_fornecedor, numero_loja_fornecedor) VALUES ('3', '88234-324', 'Chapeco', 'Lagoa', 'SC', '765');

INSERT INTO telefone_fornecedor (cod_fornecedor, telefone_fornecedor) VALUES ('1', '4832445678');
INSERT INTO telefone_fornecedor (cod_fornecedor, telefone_fornecedor) VALUES ('2', '4830660773');
INSERT INTO telefone_fornecedor (cod_fornecedor, telefone_fornecedor) VALUES ('3', '4832856743');


INSERT INTO categoria (nome_categoria) VALUES ('Bebida');
INSERT INTO categoria (nome_categoria) VALUES ('Cerveja');
INSERT INTO categoria (nome_categoria) VALUES ('Sucos');
INSERT INTO categoria (nome_categoria) VALUES ('Destilados');


INSERT INTO produtos (nome_produto, preco_produto, cod_categoria) VALUES ('Agua', '3.50', '1');
INSERT INTO produtos (nome_produto, preco_produto, cod_categoria) VALUES ('Budweiser', '5.00', '2');
INSERT INTO produtos (nome_produto, preco_produto, cod_categoria) VALUES ('Heineken', '6.00', '2');
INSERT INTO produtos (nome_produto, preco_produto, cod_categoria) VALUES ('Suco', '2.00', '3');
INSERT INTO produtos (nome_produto, preco_produto, cod_categoria) VALUES ('Whiskey', '97.00', '4');
INSERT INTO produtos (nome_produto, preco_produto, cod_categoria) VALUES ('Red Label', '126.99', '4');
INSERT INTO produtos (nome_produto, preco_produto, cod_categoria) VALUES ('RedBull', '9.00', '1');



INSERT INTO estoque (cod_produto, cod_fornecedor, qntd_produto) VALUES ('1', '2', '4');
INSERT INTO estoque (cod_produto, cod_fornecedor, qntd_produto) VALUES ('2', '2', '7');
INSERT INTO estoque (cod_produto, cod_fornecedor, qntd_produto) VALUES ('3', '1', '12');
INSERT INTO estoque (cod_produto, cod_fornecedor, qntd_produto) VALUES ('4', '3', '28');
INSERT INTO estoque (cod_produto, cod_fornecedor, qntd_produto) VALUES ('5', '2', '4');
INSERT INTO estoque (cod_produto, cod_fornecedor, qntd_produto) VALUES ('6', '3', '11');
INSERT INTO estoque (cod_produto, cod_fornecedor, qntd_produto) VALUES ('7', '1', '10');


INSERT INTO entrada (cod_produto, dt_entrada_produto, cod_fornecedor) VALUES ('5', '12/04/2019', '3');
INSERT INTO entrada (cod_produto, dt_entrada_produto, cod_fornecedor) VALUES ('4', '10/04/2019', '2');
INSERT INTO entrada (cod_produto, dt_entrada_produto, cod_fornecedor) VALUES ('6', '12/04/2019', '1');


INSERT INTO transferencia_fornecedor (cod_produto, dt_saida_produto, cod_fornecedor) VALUES ('4', '12/04/2019', '2');
INSERT INTO transferencia_fornecedor (cod_produto, dt_saida_produto, cod_fornecedor) VALUES ('5', '13/04/2019', '3');
INSERT INTO transferencia_fornecedor (cod_produto, dt_saida_produto, cod_fornecedor) VALUES ('6', '14/04/2019', '3');


INSERT INTO venda (cod_produto, cod_usuario, dt_compra_produto) VALUES ('5', '1', '13/04/2019');
INSERT INTO venda (cod_produto, cod_usuario, dt_compra_produto) VALUES ('6', '2', '12/04/2019');
INSERT INTO venda (cod_produto, cod_usuario, dt_compra_produto) VALUES ('4', '2', '14/04/2019');


INSERT INTO transferencia_filial (cod_produto, cod_filial, dt_saida_produto_transferencia) VALUES ('3', '1', '23/04/2019');
INSERT INTO transferencia_filial (cod_produto, cod_filial, dt_saida_produto_transferencia) VALUES ('2', '2', '15/04/2019');
INSERT INTO transferencia_filial (cod_produto, cod_filial, dt_saida_produto_transferencia) VALUES ('7', '3', '19/04/2019');