create database zoo;
use zoo;

create table urso_pardo(
	id int not null auto_increment primary key,
	data_cadastro datetime not null,
	data_nascimento datetime not null,
	nome varchar(100) not null,
	codigo_dono int not null
);

create table panter_negra(
	id int not null auto_increment primary key,
	data_cadastro datetime not null,
	data_nascimento datetime not null,
	nome varchar(100) not null,
	codigo_dono int not null
);

create table lobo(
	id int not null auto_increment primary key,
	data_cadastro datetime not null,
	data_nascimento datetime not null,
	nome varchar(100) not null,
	codigo_dono int not null
);

create table dono(
	id int not null auto_increment primary key,
	nome varchar(100) not null,
	cpf varchar (20) not null
);

alter table urso_pardo add constraint fk_urso_pardo_dono foreign key (codigo_dono)
			references dono(id);
alter table panter_negra add constraint fk_pantera_negra_dono foreign key (codigo_dono)
			references dono(id);
alter table lobo add constraint fk_lobo_dono foreign key (codigo_dono)
			references dono(id);
			

		-- tipo animal
alter table urso_pardo add column tipo_animal varchar(50) not null;
alter table panter_negra add column tipo_animal varchar(50) not null;
alter table lobo add column tipo_animal varchar(50) not null;
		
		-- sexo
alter table urso_pardo add column sexo varchar(10) not null;
alter table panter_negra add column sexo varchar(10) not null;
alter table lobo add column sexo varchar(10) not null;

		-- idade
alter table urso_pardo add column idade int not null;
alter table panter_negra add column idade int not null;
alter table lobo add column idade int not null;


select * from urso_pardo;
select * from panter_negra;
select * from lobo;
select * from dono;