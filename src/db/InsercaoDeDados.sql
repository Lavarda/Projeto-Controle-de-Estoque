INSERT INTO cargo_funcionario (salario_funcionario, nome_cargo) VALUES ('2900', 'Vendedor');
INSERT INTO cargo_funcionario (salario_funcionario, nome_cargo) VALUES ('2800', 'Asistente Administrativo');
INSERT INTO cargo_funcionario (salario_funcionario, nome_cargo) VALUES ('3500', 'Gerente');


INSERT INTO funcionarios (cod_categoria, nome_funcionario, matricula_funcionario, senha_funcionario, cod_cargo) VALUES ('1', 'Francisco de Assis', '351067', 'senha123', '1');
INSERT INTO funcionarios (cod_categoria, nome_funcionario, matricula_funcionario, senha_funcionario, cod_cargo) VALUES ('2', 'Joao Camargo', '743893', 'senha321', '2');
INSERT INTO funcionarios (cod_categoria, nome_funcionario, matricula_funcionario, senha_funcionario, cod_cargo) VALUES ('3', 'Julia Amaro', '129876', '123senha', '3');


INSERT INTO cadastro_usuario(nome_usuario, dt_nascimento, email_usuario, sexo_usuario, estado_civil, cpf_usuario, rg_usuario, dt_cadastro) VALUES ('Maria Aparecida', '10/08/1979', 'aparecida@gmail.com', 'Feminino', 'Viuvo', '749.046.520-34', '8456325', '05/04/2014');
INSERT INTO cadastro_usuario(nome_usuario, dt_nascimento, email_usuario, sexo_usuario, estado_civil, cpf_usuario, rg_usuario, dt_cadastro) VALUES ('Josue Carvalho', '23/05/1982', 'carvalho@gmail.com', 'Masculino', 'Casado', '286.092.146-76', '23456789', '12/08/2015');
INSERT INTO cadastro_usuario(nome_usuario, dt_nascimento, email_usuario, sexo_usuario, estado_civil, cpf_usuario, rg_usuario, dt_cadastro) VALUES ('Davi Lucca', '13/09/2000', 'lucca@yahoo.com', 'Masculino', 'Solteiro', '020.453.963-19', '94323787', '19/07/2015');



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


INSERT INTO fornecedor (nome_fornecedor, cnpj_fornecedor, email_fornecedor) VALUES ('Genesio Flores', '182912891829', 'floresgenesio@gmail.com');
INSERT INTO fornecedor (nome_fornecedor, cnpj_fornecedor, email_fornecedor) VALUES ('Vision', '382392839283', 'visiondist@hotmail.com');
INSERT INTO fornecedor (nome_fornecedor, cnpj_fornecedor, email_fornecedor) VALUES ('Dimebras', '7362783672', 'dimebras@yahoo.com');


INSERT INTO endereco_fornecedor (cod_fornecedor, cep_fornecedor, cidade_fornecedor, bairro_fornecedor, estado_fornecedor, numero_loja_fornecedor) VALUES ('1', '88345-093', 'Florianopolis', 'Estreito', 'SC', '2354');
INSERT INTO endereco_fornecedor (cod_fornecedor, cep_fornecedor, cidade_fornecedor, bairro_fornecedor, estado_fornecedor, numero_loja_fornecedor) VALUES ('2', '88812-346', 'Joinville', 'Biguaçu', 'SC', '23');
INSERT INTO endereco_fornecedor (cod_fornecedor, cep_fornecedor, cidade_fornecedor, bairro_fornecedor, estado_fornecedor, numero_loja_fornecedor) VALUES ('3', '88234-324', 'Chapeco', 'Lagoa', 'SC', '765');


INSERT INTO telefone_fornecedor (cod_fornecedor, telefone_fornecedor) VALUES ('1', '4832445678');
INSERT INTO telefone_fornecedor (cod_fornecedor, telefone_fornecedor) VALUES ('2', '4830660773');
INSERT INTO telefone_fornecedor (cod_fornecedor, telefone_fornecedor) VALUES ('3', '4832856743');


INSERT INTO categoria (nome_categoria) VALUES ('Achocolatado');
INSERT INTO categoria (nome_categoria) VALUES ('Agua');
INSERT INTO categoria (nome_categoria) VALUES ('Alcoolica');
INSERT INTO categoria (nome_categoria) VALUES ('Soja');
INSERT INTO categoria (nome_categoria) VALUES ('Energeticas');
INSERT INTO categoria (nome_categoria) VALUES ('Esportivas');
INSERT INTO categoria (nome_categoria) VALUES ('Cafes');
INSERT INTO categoria (nome_categoria) VALUES ('Chas');
INSERT INTO categoria (nome_categoria) VALUES ('Todas');


INSERT INTO produtos (nome_produto, preco_produto, cod_categoria) VALUES ('Toddynho', '1.99', '1');
INSERT INTO produtos (nome_produto, preco_produto, cod_categoria) VALUES ('Agua Imperatriz', '0.99', '2');
INSERT INTO produtos (nome_produto, preco_produto, cod_categoria) VALUES ('Heineken', '3.99', '3');
INSERT INTO produtos (nome_produto, preco_produto, cod_categoria) VALUES ('Isosource Soya', '18.49', '4');
INSERT INTO produtos (nome_produto, preco_produto, cod_categoria) VALUES ('Nitrix', '8.99', '5');
INSERT INTO produtos (nome_produto, preco_produto, cod_categoria) VALUES ('Powerade', '3.49', '6');
INSERT INTO produtos (nome_produto, preco_produto, cod_categoria) VALUES ('Caboclo', '3.33', '7');
INSERT INTO produtos (nome_produto, preco_produto, cod_categoria) VALUES ('Cha Erva Cidreira', '4.87', '8');



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


INSERT INTO venda (cod_produto, cod_usuario, dt_compra_produto) VALUES ('3', '1', '13/04/2019');
INSERT INTO venda (cod_produto, cod_usuario, dt_compra_produto) VALUES ('6', '2', '12/04/2019');
INSERT INTO venda (cod_produto, cod_usuario, dt_compra_produto) VALUES ('1', '2', '14/04/2019');


INSERT INTO transferencia_filial (cod_produto, cod_filial, dt_saida_produto_transferencia) VALUES ('3', '1', '23/04/2019');
INSERT INTO transferencia_filial (cod_produto, cod_filial, dt_saida_produto_transferencia) VALUES ('2', '2', '15/04/2019');
INSERT INTO transferencia_filial (cod_produto, cod_filial, dt_saida_produto_transferencia) VALUES ('7', '3', '19/04/2019');