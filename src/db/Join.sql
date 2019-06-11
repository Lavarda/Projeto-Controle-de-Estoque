select nome_usuario, dt_nascimento, email_usuario, sexo_usuario, estado_civil, cpf_usuario, rg_usuario, dt_cadastro, telefone_usuario, cep_usuario, cidade_usuario, bairro_usuario, estado_usuario, numero_residencia_usuario from cadastro_usuario cu
join telefone_usuario tu
on (cu.cod_usuario = tu.cod_usuario)
join endereco_usuario eu
on (tu.cod_usuario = eu.cod_usuario);

create table usuario_table as select nome_usuario, dt_nascimento, email_usuario, sexo_usuario, estado_civil, cpf_usuario, rg_usuario, dt_cadastro, telefone_usuario, cep_usuario, cidade_usuario, bairro_usuario, estado_usuario, numero_residencia_usuario from cadastro_usuario cu
join telefone_usuario tu
on (cu.cod_usuario = tu.cod_usuario)
join endereco_usuario eu
on (tu.cod_usuario = eu.cod_usuario);


select nome_fornecedor, cnpj_fornecedor, email_fornecedor, telefone_fornecedor, cep_fornecedor, cidade_fornecedor, bairro_fornecedor, estado_fornecedor, numero_loja_fornecedor from fornecedor f 
join telefone_fornecedor tf
on (f.cod_fornecedor = tf.cod_fornecedor)
join endereco_fornecedor ef
on (tf.cod_fornecedor = ef.cod_fornecedor);

create table fornecedor_table as select nome_fornecedor, cnpj_fornecedor, email_fornecedor, telefone_fornecedor, cep_fornecedor, cidade_fornecedor, bairro_fornecedor, estado_fornecedor, numero_loja_fornecedor from fornecedor f 
join telefone_fornecedor tf
on (f.cod_fornecedor = tf.cod_fornecedor)
join endereco_fornecedor ef
on (tf.cod_fornecedor = ef.cod_fornecedor);


select nome_filial, cnpj_filial, telefone_filial, cep_filial, cidade_filial, bairro_filial, estado_filial, numero_loja_filial from filiais f
join telefone_filial tf
on (f.cod_filial = tf.cod_filial)
join endereco_filial ef
on (tf.cod_filial = ef.cod_filial);

create table filiais_table as select nome_filial, cnpj_filial, telefone_filial, cep_filial, cidade_filial, bairro_filial, estado_filial, numero_loja_filial from filiais f
join telefone_filial tf
on (f.cod_filial = tf.cod_filial)
join endereco_filial ef
on (tf.cod_filial = ef.cod_filial);


select p.cod_produto, nome_produto, preco_produto, qntd_produto from produtos p
join estoque e
on (p.cod_produto = e.cod_produto);

select nome_produto,nome_categoria from produtos p full outer join categoria c on (p.cod_categoria = c.cod_categoria);


select nome_fornecedor,dt_saida_produto,nome_produto,preco_produto from transferencia_fornecedor tf inner join fornecedor f on (tf.cod_fornecedor = f.cod_fornecedor) join produtos p on (tf.cod_produto = p.cod_produto );

select nome_fornecedor,dt_entrada_produto,nome_produto,preco_produto from entrada tf inner join fornecedor f on (tf.cod_fornecedor = f.cod_fornecedor) join produtos p on (tf.cod_produto = p.cod_produto );


select estado_usuario from endereco_usuario where estado_usuario = 'SC' UNION ALL select estado_fornecedor from endereco_fornecedor where estado_fornecedor = 'SC';

