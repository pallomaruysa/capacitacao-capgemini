create schema gerenciadordetarefas;

use gerenciadordetarefas;

CREATE table usuario (
    idUsuario int not null auto_increment,
    nome varchar(30) NOT NULL,
    telefone varchar(15) NOT NULL,
    email varchar(50) NOT NULL,
    dataNascimento date NOT NULL,
    cpf varchar(14) NOT NULL,
    senha varchar(40) not null,
    ativo boolean NOT NULL,
    PRIMARY KEY (`idUsuario`)
);

CREATE TABLE tarefa (
    `idTarefa` int NOT null auto_increment,
    `idUsuario` int NOT NULL,
    `titulo` Varchar(50) not null,
    `descricao` text,
    `dataHoraInicio` datetime not null,
    `dataHoraFim` datetime not null,
    `status` varchar(15) not null,
    `prioridade` varchar(15) not null,
    PRIMARY KEY (`idTarefa`)
);

ALTER TABLE tarefa add constraint fk_tarefa_usuario FOREIGN KEY (idUsuario) REFERENCES usuario(idUsuario);

select * from tarefa t ;
select * from usuario u  ;