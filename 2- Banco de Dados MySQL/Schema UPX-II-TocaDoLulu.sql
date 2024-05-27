drop database if exists toca_do_lulu_upx;  -- Remove o banco de dados, caso exista
create database toca_do_lulu_upx DEFAULT CHARACTER SET utf8 DEFAULT COLLATE utf8_general_ci;          -- Cria o banco de dados
use toca_do_lulu_upx;                      -- Seleciona o banco para os próximos comandos

/* As linhas acima não devem ser executas em serviços online como o sqlite oline*/





-- LOGIN --------------------------

CREATE TABLE Usuarios (
    email VARCHAR(70) NOT NULL PRIMARY KEY,
    senha VARCHAR(30) NOT NULL
);
-- Comando para inserir os logins no banco de dados.
-- INSERT INTO usuarios (email, senha) VALUES ('seuemail@example.com', 'senha_hash');





-- PETS TABLES 1-N -----------------------------------------------------------------------------------
-- O Index serve para referenciar a coluna a ser puxada por outra tabela sem este precisar ser uma chave primária
CREATE TABLE Pets_Planos_Valores (
	id int NOT NULL PRIMARY KEY,
  	plano VARCHAR(50) NOT NULL,
	valor DOUBLE(8,2) NOT NULL
 );

INSERT INTO Pets_Planos_Valores (id, plano, valor)
VALUES
	(1, 'Básico', 500.00),
    (2, 'Intermediário', 750.00),
    (3, 'Premium', 1000.00);


-- TUTORES TABLES 1-N --------------------------------------------------------------------------------



-- TUTORES -------------------------------------------------------------------------------------------

CREATE TABLE Tutores (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    
    nome VARCHAR(55) NOT NULL,
    tipo_documento VARCHAR(20) NOT NULL,
	documento_identificador VARCHAR(50) NOT NULL,
	nascimento DATE NOT NULL,
    cep INT NOT NULL,
    logradouro VARCHAR(50) NOT NULL,
    numero VARCHAR(10) NOT NULL,
    bairro VARCHAR(30) NOT NULL,
    UF VARCHAR(24) NOT NULL,
    municipio VARCHAR(30) NOT NULL,
	complemento VARCHAR(30) NOT NULL,
    
    ddd_1 INT NOT NULL,
	celular_1 INT NOT NULL,
    email_1 VARCHAR(70) NOT NULL,
    
    ddd_2 INT,
	celular_2 INT,
    email_2 VARCHAR(70),
    tipo_rede_1 VARCHAR(20),
    rede_social_1 VARCHAR(40),
    tipo_rede_2 VARCHAR(20),
    rede_social_2 VARCHAR(40),
    observacoes VARCHAR(250)
);





-- PETS ----------------------------------------------------------------------------------------------

CREATE TABLE Pets (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    
    nome VARCHAR(50) NOT NULL,
    sexo VARCHAR(1) NOT NULL,
    raca VARCHAR(30) NOT NULL,
    cor VARCHAR(30) NOT NULL,
    
    nascimento DATE,
    
    tipo_rede_1 VARCHAR(30),
    rede_social_1 VARCHAR(50),
    tipo_rede_2 VARCHAR(30),
    rede_social_2 VARCHAR(50),
    
    alergias VARCHAR(150),
    remedios VARCHAR(150),
    vacinacao VARCHAR(250),
    observacoes VARCHAR(250),
    
    id_petsPlanosValores INT NOT NULL,
    id_tutores INT NOT NULL,
    
    FOREIGN KEY (id_petsPlanosValores) REFERENCES Pets_Planos_Valores(id),
    FOREIGN KEY (id_tutores) REFERENCES Tutores(id)
);
-- SET SQL_SAFE_UPDATES = 0;
-- UPDATE Pets 
-- SET nascimento = DATE_FORMAT(nascimento, '%d/%m/%Y') 
-- WHERE nascimento LIKE '__/__/____';
-- SET SQL_SAFE_UPDATES = 1;




-- VETERINARIOS TABLES 1-N --------------------------------------------------------------------------------



-- VETERINARIOS -------------------------------------------------------------------------------------------

CREATE TABLE Veterinarios (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	
    nome VARCHAR(55) NOT NULL,
    tipo_documento VARCHAR(20) NOT NULL,
	documento_identificador VARCHAR(50) NOT NULL,
    crmv VARCHAR(20) NOT NULL,
	nascimento DATE NOT NULL,
    cep INT NOT NULL,
    logradouro VARCHAR(50) NOT NULL,
    numero VARCHAR(10) NOT NULL,
    bairro VARCHAR(30) NOT NULL,
    UF VARCHAR(24) NOT NULL,
    municipio VARCHAR(30) NOT NULL,
	complemento VARCHAR(30) NOT NULL,
    
	ddd_1 INT NOT NULL,
	celular_1 INT NOT NULL,
    email_1 VARCHAR(70) NOT NULL,
    valor double(8,2) NOT NULL,
    
    ddd_2 INT,
	celular_2 INT,
    email_2 VARCHAR(70),
    observacoes VARCHAR(250)
  );





-- SERVICOS TABLES 1-N --------------------------------------------------------------------------------



-- SERVICOS -------------------------------------------------------------------------------------------

  CREATE TABLE Servicos (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    
    nome VARCHAR(55) NOT NULL,
    servico VARCHAR(50) NOT NULL,
    valor DOUBLE(8,2) NOT NULL,
    tipo_documento VARCHAR(20) NOT NULL,
    documento_identificador VARCHAR(50) NOT NULL,
    nascimento DATE NOT NULL,
    cep INT NOT NULL,
    logradouro VARCHAR(50) NOT NULL,
    numero VARCHAR(10) NOT NULL,
    bairro VARCHAR(30) NOT NULL,
    UF VARCHAR(24) NOT NULL,
    municipio VARCHAR(30) NOT NULL,
	complemento VARCHAR(30) NOT NULL,
    
	ddd_1 INT NOT NULL,
	celular_1 INT NOT NULL,
    email_1 VARCHAR(70) NOT NULL,
    
    ddd_2 INT,
	celular_2 INT,
    email_2 VARCHAR(70),
    observacoes VARCHAR(250)
);





-- TABLES N-N --------------------------------------------------------------------------------

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
    