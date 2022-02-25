create database office;

use office;

-- SET FOREIGN_KEY_CHECKS = 0;
-- DROP TABLE IF EXISTS `Colaborador`;
-- DROP TABLE IF EXISTS `Tarefa`;
-- SET FOREIGN_KEY_CHECKS = 1;

CREATE TABLE Colaborador (
    idcolaborador int NOT null auto_increment primary key,
    nomeColaborador varchar(100) NOT null,
    cpfColaborador varchar(20) not null
);

CREATE table Tarefa (
    idTarefa int NOT null auto_increment primary key,
    idColaborador int NOT NULL,
    descrTarefa varchar(100),
    dataHoraInicio Timestamp not null,
    dataHoraFim Timestamp NOT NULL,
    statusTarefa varchar(15) not null,
    prioridadeTarefa varchar(15) not null
);

ALTER TABLE Tarefa ADD constraint fk_tarefa_colaborador FOREIGN KEY (idColaborador) REFERENCES Colaborador(idcolaborador);

select * from colaborador c ;
select * from tarefa t ;
