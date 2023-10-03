drop database if exists toca_teste;  -- Remove o banco de dados, caso exista
create database toca_teste;          -- Cria o banco de dados
use toca_teste;                      -- Seleciona o banco para os próximos comandos

/* As linhas acima não devem ser executas em serviços online como o sqlite oline*/

CREATE TABLE Pet (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(150) NOT NULL,
	nascimento DATE
    );

CREATE TABLE Tutor (
	documento_identificador VARCHAR(50) PRIMARY KEY NOT NULL,
    tipo_documento VARCHAR(50),
    nome VARCHAR(150) NOT NULL,
	nascimento DATE,
	celular INT
    );

CREATE TABLE Veterinario (
	documento_identificador VARCHAR(50) PRIMARY KEY NOT NULL,
    tipo_documento VARCHAR(50),
	nome VARCHAR(150) NOT NULL,
	nascimento DATE,
	celular INT
  );

