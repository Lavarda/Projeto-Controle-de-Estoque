CREATE TABLE cadastro_usuario(
	cod_usuario serial,
	nome_usuario varchar(70) NOT NULL,
	dt_nascimento varchar(30) NOT NULL,
	email_usuario varchar(70),
	sexo_usuario varchar(30),
	estado_civil varchar(30),
	cpf_usuario varchar(14) NOT NULL, 
	rg_usuario varchar(20) NOT NULL,
	dt_cadastro varchar(30)
);


CREATE TABLE endereco_usuario(
	cod_usuario integer,
	cep_usuario varchar(10) NOT NULL,
	cidade_usuario varchar(30) NOT NULL,	
	bairro_usuario varchar(30) NOT NULL,
	estado_usuario varchar (2) NOT NULL,
	numero_residencia_usuario numeric NOT NULL 
);


CREATE TABLE telefone_usuario(
	cod_usuario integer,
	telefone_usuario varchar(13) NOT NULL
);

CREATE TABLE funcionarios(
	cod_funcionario serial,
	cod_categoria integer,
	nome_funcionario varchar(70) NOT NULL,
	matricula_funcionario varchar(15) NOT NULL,
	senha_funcionario varchar(30) NOT NULL,
	cod_cargo integer NOT NULL
	);


CREATE TABLE cargo_funcionario(
	cod_cargo serial,
	salario_funcionario numeric NOT NULL,
	nome_cargo varchar(50) NOT NULL
);

CREATE TABLE filiais(
	cod_filial serial,
	nome_filial varchar(50) NOT NULL,
	cnpj_filial varchar(30) NOT NULL
); 

CREATE TABLE endereco_filial(
	cod_filial integer,
	cep_filial varchar(10) NOT NULL,
	cidade_filial varchar(30) NOT NULL,
	bairro_filial varchar(30) NOT NULL,
	estado_filial varchar(2) NOT NULL,
	numero_loja_filial numeric
);

CREATE TABLE telefone_filial(
	cod_filial integer,
	telefone_filial varchar(13)
);


CREATE TABLE fornecedor(
	cod_fornecedor serial,
	nome_fornecedor varchar(70) NOT NULL, 
	cnpj_fornecedor varchar (30) NOT NULL,
	email_fornecedor varchar(70)
);

CREATE TABLE endereco_fornecedor(
	cod_fornecedor integer,
	cep_fornecedor varchar(10) NOT NULL,
	cidade_fornecedor varchar(30) NOT NULL,
	bairro_fornecedor varchar(30) NOT NULL,
	estado_fornecedor varchar(2) NOT NULL,
	numero_loja_fornecedor numeric
);

CREATE TABLE telefone_fornecedor(
	cod_fornecedor integer,
	telefone_fornecedor varchar(13)
);

CREATE TABLE produtos(
	cod_produto serial,
	nome_produto varchar(50) NOT NULL,
	preco_produto numeric NOT NULL,
	cod_categoria integer NOT NULL
);

CREATE TABLE categoria(
	cod_categoria serial,
	nome_categoria varchar(50) NOT NULL
);

CREATE TABLE estoque(
	cod_produto integer,
	cod_fornecedor integer NOT NULL,
	qntd_produto numeric NOT NULL
);

CREATE TABLE entrada(
	cod_entrada serial,
	cod_produto integer NOT NULL,
	dt_entrada_produto varchar(30),
	cod_fornecedor integer
);

CREATE TABLE transferencia_fornecedor(
	cod_saida serial,
	cod_produto integer NOT NULL,
	dt_saida_produto varchar(30),
	cod_fornecedor integer
);

CREATE TABLE venda(
	cod_produto integer NOT NULL,
	cod_usuario integer NOT NULL,
	dt_compra_produto varchar(30)
);

CREATE TABLE transferencia_filial(
	cod_transferencia serial,
	cod_produto integer NOT NULL,
	cod_filial integer NOT NULL,
	dt_saida_produto_transferencia varchar(30)
);
