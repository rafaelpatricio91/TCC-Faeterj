create database tcc;
use tcc;

create table administrador
	(
		orgao varchar(25) not null,
		setor varchar(25) not null
	);


create table assunto --DEPENDE DE MATERIA
	(
		id int not null auto_increment primary key,
		nome varchar(25) not null,
		descricao varchar(75) not null,
		id_materia int not null,

		foreign key(id_materia) references materia(id)
	);

create table discursiva --EXTENDS DE QUESTAO
	(
		respostaDiscursiva varchar(600)
	);


create table instituicao
	(
		id int not null auto_increment primary key,
		numero_inscricao varchar(25) not null,
		nome varchar(75) not null,
		uf varchar(2) not null,
		municipio varchar(35) not null
	);