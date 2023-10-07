drop database if exists toca_teste;  -- Remove o banco de dados, caso exista
create database toca_teste;          -- Cria o banco de dados
use toca_teste;                      -- Seleciona o banco para os próximos comandos

/* As linhas acima não devem ser executas em serviços online como o sqlite oline*/

CREATE TABLE Pet (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(150) NOT NULL,
	nascimento DATE,
    raca VARCHAR(50),
    cor VARCHAR(50),
    alergias VARCHAR(500),
    remedios VARCHAR(500),
    vacinacao VARCHAR(500),
    rede_social VARCHAR(100),
    tipo_rede VARCHAR(50),
    observacoes VARCHAR(500)
    );

CREATE TABLE Tutor (
	documento_identificador VARCHAR(50) PRIMARY KEY NOT NULL,
    tipo_documento VARCHAR(50),
    nome VARCHAR(150) NOT NULL,
	nascimento DATE,
	celular INT,
    email VARCHAR(100),
    endereco VARCHAR(200),
	rede_social VARCHAR(100),
    tipo_rede VARCHAR(50)
    );

CREATE TABLE Veterinario (
	documento_identificador VARCHAR(50) PRIMARY KEY NOT NULL,
	tipo_documento VARCHAR(50),
	nome VARCHAR(150) NOT NULL,
    CRMV VARCHAR(20),
	nascimento DATE,
	celular INT,
	email VARCHAR(100),
	endereco VARCHAR(200)
  );

