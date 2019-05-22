CREATE TABLE cadastro_usuario(
	cod_usuario serial,
	nome_usuario varchar(70),
	dt_nascimento varchar(30),
	email_usuario varchar(70),
	sexo_usuario varchar(30),
	estado_civil varchar(30),
	cpf_usuario varchar(14), 
	rg_usuario varchar(20),
	dt_cadastro varchar(30),
	cod_funcionario integer
);

CREATE TABLE telefone_usuario(
	cod_usuario integer,
	telefone_usuario varchar(13)
);

CREATE TABLE endereco_usuario(
	cod_usuario integer,
	cep_usuario varchar(10),
	cidade_usuario varchar(30),
	bairro_usuario varchar(30),
	estado_usuario varchar (2),
	numero_residencia_usuario numeric
);

CREATE TABLE funcionarios(
	cod_funcionario serial,
	cod_categoria integer,
	nome_funcionario varchar (70),
	matricula_funcionario varchar (15),
	senha_funcionario varchar(30)
	);


CREATE TABLE telefone_funcionario(
	cod_funcionario integer,
	telefone_funcionario varchar(13)

);

CREATE TABLE cargo_funcionario(
	cod_funcionario integer,
	salario_funcionario numeric,
	cargo_funcionario varchar(50)
);

CREATE TABLE filiais(
	cod_filial serial,
	nome_filial varchar(50),
	cnpj_filial varchar(30)
); 

CREATE TABLE endereco_filial(
	cod_filial integer,
	cep_filial varchar(10),
	cidade_filial varchar(30),
	bairro_filial varchar(30),
	estado_filial varchar(2),
	numero_loja_filial numeric
);

CREATE TABLE telefone_filial(
	cod_filial integer,
	telefone_filial varchar(13)
);


CREATE TABLE fornecedor(
	cod_fornecedor serial,
	nome_fornecedor varchar(70), 
	cnpj_fornecedor varchar (30),
	email_fornecedor varchar(70)
);

CREATE TABLE endereco_fornecedor(
	cod_fornecedor integer,
	cep_fornecedor varchar(10),
	cidade_fornecedor varchar(30),
	bairro_fornecedor varchar(30),
	estado_fornecedor varchar(2),
	numero_loja_fornecedor numeric
);

CREATE TABLE telefone_fornecedor(
	cod_fornecedor integer,
	telefone_fornecedor varchar(13)
);

CREATE TABLE produtos(
	cod_produto serial,
	nome_produto varchar(50),
	preco_produto numeric,
	cod_categoria integer
);

CREATE TABLE categoria(
	cod_categoria serial,
	nome_categoria varchar(50)
);

CREATE TABLE estoque(
	cod_produto integer,
	cod_fornecedor integer,
	qntd_produto numeric
);

CREATE TABLE entrada(
	cod_entrada serial,
	cod_produto integer,
	dt_entrada_produto varchar(30),
	cod_fornecedor integer
);

CREATE TABLE transferencia_fornecedor(
	cod_saida serial,
	cod_produto integer,
	dt_saida_produto varchar(30),
	cod_fornecedor integer
);

CREATE TABLE venda(
	cod_produto integer,
	cod_usuario integer,
	dt_compra_produto varchar(30)
);

CREATE TABLE transferencia_filial(
	cod_transferencia serial,
	cod_produto integer,
	cod_filial integer,
	dt_saida_produto_transferencia varchar(30)
);