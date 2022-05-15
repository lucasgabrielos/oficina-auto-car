--Criação da tabela Usuario
create table usuario(
id int primary key auto_increment,
nome varchar(50) not null,
email varchar(100)not null unique,
senha varchar(6)not null,
telefone varchar(30)not null,
cpf varchar(15)not null,
rg varchar(15)not null,
ativo bit not null
);

--Criação da tabela de Endereco
create table endereco(
id int primary key auto_increment,
rua varchar(30) not null,
bairro varchar(30) not null,
cidade varchar(30) not null,
estado char(2) not null,
rg char(10)not null,
numero char(5)not null,
ativo bit not null,
foreign key(IdUsuario),
references usuario(id)
);