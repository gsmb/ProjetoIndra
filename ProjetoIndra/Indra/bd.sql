drop table if exists usuario
create table usuario
(
usu_id serial primary key,
usu_nome varchar(60),
usu_sobrenome varchar(60),
usu_email varchar(50),
usu_usuario varchar(32),
usu_senha varchar(32)
);
select * from usuario
