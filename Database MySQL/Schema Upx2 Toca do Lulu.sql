drop database if exists toca_do_lulu_upx;  -- Remove o banco de dados, caso exista
create database toca_do_lulu_upx;          -- Cria o banco de dados
use toca_do_lulu_upx;                      -- Seleciona o banco para os próximos comandos

/* As linhas acima não devem ser executas em serviços online como o sqlite oline*/

CREATE TABLE Pets (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    
    nome VARCHAR(150) NOT NULL,
    sexo VARCHAR(1) NOT NULL,
    raca VARCHAR(50) NOT NULL,
    cor VARCHAR(50) NOT NULL,
    
    nascimento DATE,
    rede_social VARCHAR(100),
    tipo_rede VARCHAR(50),
    
    alergias VARCHAR(500),
    remedios VARCHAR(500),
    vacinacao VARCHAR(500),
    observacoes VARCHAR(500)
    );

CREATE TABLE Tutores (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    
    nome VARCHAR(150) NOT NULL,
	documento_identificador VARCHAR(50) NOT NULL,
    tipo_documento VARCHAR(50) NOT NULL,
	nascimento DATE NOT NULL,
	endereco VARCHAR(200) NOT NULL,
    
	celular INT,
    email VARCHAR(100),
	rede_social VARCHAR(100),
    tipo_rede VARCHAR(50)
    );

CREATE TABLE Veterinarios (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	
    nome VARCHAR(150) NOT NULL,
	documento_identificador VARCHAR(50) NOT NULL,
	tipo_documento VARCHAR(50) NOT NULL,
    crmv VARCHAR(20) NOT NULL,
	nascimento DATE NOT NULL,
    endereco VARCHAR(200) NOT NULL,
    
	celular INT,
	email VARCHAR(100)
  );
  
  CREATE TABLE Servicos (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    
    tipo_servico VARCHAR(50) NOT NULL,
    nome VARCHAR(150) NOT NULL,
    documento_identificador VARCHAR(50) NOT NULL,
	tipo_documento VARCHAR(50) NOT NULL,
    nascimento DATE NOT NULL,
    endereco VARCHAR(200) NOT NULL,
    
    celular INT,
	email VARCHAR(100)
  );

 CREATE TABLE Tutores_Pets (
	id_tutor INT,
    id_pet INT,
    
    FOREIGN KEY (id_tutor) REFERENCES Tutores(id),
    FOREIGN KEY (id_pet) REFERENCES Pets(id),
    
	PRIMARY KEY(id_tutor, id_pet)
	);
  
  CREATE TABLE Veterinarios_Pets (
	id_veterinario INT,
    id_pet INT,
    
    FOREIGN KEY (id_veterinario) REFERENCES Veterinarios(id),
    FOREIGN KEY (id_pet) REFERENCES Pets(id),
    
    PRIMARY KEY(id_veterinario, id_pet)
	);
    
    CREATE TABLE Servicos_Pets (
	id_servico INT,
    id_pet INT,
    
    FOREIGN KEY (id_servico) REFERENCES Servicos(id),
    FOREIGN KEY (id_pet) REFERENCES Pets(id),
    
	PRIMARY KEY(id_servico, id_pet)
	);
    