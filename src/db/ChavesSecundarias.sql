ALTER TABLE venda ADD FOREIGN KEY (cod_usuario) REFERENCES cadastro_usuario (cod_usuario);
ALTER TABLE telefone_usuario ADD FOREIGN KEY (cod_usuario) REFERENCES cadastro_usuario (cod_usuario);
ALTER TABLE endereco_usuario ADD FOREIGN KEY (cod_usuario) REFERENCES cadastro_usuario (cod_usuario);


ALTER TABLE funcionarios ADD FOREIGN KEY (cod_cargo) REFERENCES cargo_funcionario (cod_cargo);


ALTER TABLE telefone_filial ADD FOREIGN KEY (cod_filial) REFERENCES filiais (cod_filial);
ALTER TABLE endereco_filial ADD FOREIGN KEY (cod_filial) REFERENCES filiais (cod_filial);


ALTER TABLE telefone_fornecedor ADD FOREIGN KEY (cod_fornecedor) REFERENCES fornecedor (cod_fornecedor);
ALTER TABLE endereco_fornecedor ADD FOREIGN KEY (cod_fornecedor) REFERENCES fornecedor (cod_fornecedor);


ALTER TABLE estoque ADD FOREIGN KEY (cod_produto) REFERENCES produtos (cod_produto);
ALTER TABLE entrada ADD FOREIGN KEY (cod_produto) REFERENCES produtos (cod_produto);
ALTER TABLE transferencia_fornecedor ADD FOREIGN KEY (cod_produto) REFERENCES produtos (cod_produto);
ALTER TABLE venda ADD FOREIGN KEY (cod_produto) REFERENCES produtos (cod_produto);
ALTER TABLE transferencia_filial ADD FOREIGN KEY (cod_produto) REFERENCES produtos (cod_produto);


ALTER TABLE produtos ADD FOREIGN KEY (cod_categoria) REFERENCES categoria (cod_categoria);