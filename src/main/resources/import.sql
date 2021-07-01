insert into cozinha (nome) values ('Tailandesa');
insert into cozinha (nome) values ('Indiana');
insert into cozinha (nome) values ('Chinesa');
insert into cozinha (nome) values ('Japonesa');
insert into cozinha (nome) values ('Brasileira');

insert into restaurante (nome, tx_frete, cozinha_id) values ('Thai Gourmet 1', 10.00, 1);
insert into restaurante (nome, tx_frete, cozinha_id) values ('Thai Delivery', 9.50, 1);
insert into restaurante (nome, tx_frete, cozinha_id) values ('Tuk Tuk Comida Indiana', 15.00, 2);
insert into restaurante (nome, tx_frete, cozinha_id) values ('Kako Burguer', 6.00, 5);
insert into restaurante (nome, tx_frete, cozinha_id) values ('Coxinha do Deco', 8.00, 5);

insert into estado (id, nome) values (1, 'Minas Gerais');
insert into estado (id, nome) values (2, 'São Paulo');
insert into estado (id, nome) values (3, 'Ceará');
 
insert into cidade (id, nome, estado_id) values (1, 'Uberlândia', 1);
insert into cidade (id, nome, estado_id) values (2, 'Belo Horizonte', 1);
insert into cidade (id, nome, estado_id) values (3, 'São Paulo', 2);
insert into cidade (id, nome, estado_id) values (4, 'Campinas', 2);
insert into cidade (id, nome, estado_id) values (5, 'Fortaleza', 3);

insert into forma_pagamento (id, descricao) values (1, 'Cartão de crédito');
insert into forma_pagamento (id, descricao) values (2, 'Cartão de débito');
insert into forma_pagamento (id, descricao) values (3, 'Dinheiro');

insert into permissao (id, nome, descricao) values (1, 'CONSULTAR_COZINHAS', 'Permite consultar cozinhas');
insert into permissao (id, nome, descricao) values (2, 'EDITAR_COZINHAS', 'Permite editar cozinhas');