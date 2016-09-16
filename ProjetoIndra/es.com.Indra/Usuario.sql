DROP TABLE IF EXISTS usuario;

create table usuario
(
usu_id serial primary key,
usu_nome varchar(60),
usu_email varchar(40),
usu_senha varchar(32),
authority varchar(15)
);

SELECT * FROM usuario;