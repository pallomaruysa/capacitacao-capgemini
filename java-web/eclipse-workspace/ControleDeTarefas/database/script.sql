create schema projeto;
use projeto;

select * from colaborador;
select * from tarefa;

SET FOREIGN_KEY_CHECKS = 0;
DROP TABLE IF EXISTS `Colaborador`;
DROP TABLE IF EXISTS `Tarefa`;
SET FOREIGN_KEY_CHECKS = 1;

CREATE TABLE `Colaborador` (
    `idcolaborador` int auto_increment NOT NULL,
    `nomeColaborador` Varchar(30) NOT NULL,
    PRIMARY KEY (`idcolaborador`)
);

CREATE TABLE `Tarefa` (
    `idTarefa` int auto_increment NOT NULL,
    `idColaborador` integer NOT NULL,
    `descrTarefa` Varchar(50),
    `dataHoraInicio` Timestamp,
    `dataHoraFim` Timestamp NOT NULL,
    `statusTarefa` Varchar(15),
    `prioridadeTarefa` Varchar(15),
    PRIMARY KEY (`idTarefa`)
);

ALTER TABLE `Tarefa` ADD FOREIGN key
(`idColaborador`) REFERENCES `Colaborador`(`idcolaborador`);