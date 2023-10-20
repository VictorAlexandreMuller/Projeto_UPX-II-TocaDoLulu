drop database if exists toca_do_lulu_upx;  -- Remove o banco de dados, caso exista
create database toca_do_lulu_upx;          -- Cria o banco de dados
use toca_do_lulu_upx;                      -- Seleciona o banco para os próximos comandos

/* As linhas acima não devem ser executas em serviços online como o sqlite oline*/





-- LOGIN --------------------------

CREATE TABLE Usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(255) NOT NULL,
    senha VARCHAR(255) NOT NULL
);
-- Comando para inserir os logins no banco de dados.
-- INSERT INTO usuarios (email, senha) VALUES ('seuemail@example.com', 'senha_hash');





-- PETS TABLES 1-N -----------------------------------------------------------------------------------
-- O Index serve para referenciar a coluna a ser puxada por outra tabela sem este precisar ser uma chave primária
CREATE TABLE Pets_Planos_Valores (
  	plano VARCHAR(50) NOT NULL PRIMARY KEY,
	valor DOUBLE,
    
    INDEX idx_valor (valor)
 );

-- PETS ----------------------------------------------------------------------------------------------

CREATE TABLE Pets (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    
    nome VARCHAR(150) NOT NULL,
    sexo VARCHAR(1) NOT NULL,
    raca VARCHAR(50) NOT NULL,
    cor VARCHAR(50) NOT NULL,
    
    nascimento DATE,
    
    tipo_rede_1 VARCHAR(50),
    rede_social_1 VARCHAR(100),
    tipo_rede_2 VARCHAR(50),
    rede_social_2 VARCHAR(100),
    
    alergias VARCHAR(500),
    remedios VARCHAR(500),
    vacinacao VARCHAR(500),
    observacoes VARCHAR(500),
    
    tipo_plano VARCHAR(50),
    tipo_valor DOUBLE,
    
    FOREIGN KEY (tipo_plano) REFERENCES Pets_Planos_Valores(plano),
    FOREIGN KEY (tipo_valor) REFERENCES Pets_Planos_Valores(valor)
);





-- TUTORES TABLES 1-N --------------------------------------------------------------------------------



-- TUTORES -------------------------------------------------------------------------------------------

CREATE TABLE Tutores (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    
    nome VARCHAR(150) NOT NULL,
    tipo_documento VARCHAR(50) NOT NULL,
	documento_identificador VARCHAR(50) NOT NULL,
	nascimento DATE NOT NULL,
    cep INT,
    logradouro VARCHAR(100) NOT NULL,
    numero VARCHAR(10) NOT NULL,
    bairro VARCHAR(50) NOT NULL,
    UF VARCHAR(2) NOT NULL,
    municipio VARCHAR(50) NOT NULL,
	complemento VARCHAR(50) NOT NULL,
    
    ddd_1 INT,
	celular_1 INT,
    ddd_2 INT,
	celular_2 INT,
    email_1 VARCHAR(100),
    email_2 VARCHAR(100),
    tipo_rede_1 VARCHAR(50),
    rede_social_1 VARCHAR(100),
    tipo_rede_2 VARCHAR(50),
    rede_social_2 VARCHAR(100),
    observacoes VARCHAR(500)
);





-- VETERINARIOS TABLES 1-N --------------------------------------------------------------------------------



-- VETERINARIOS -------------------------------------------------------------------------------------------

CREATE TABLE Veterinarios (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	
    nome VARCHAR(150) NOT NULL,
    tipo_documento VARCHAR(50) NOT NULL,
	documento_identificador VARCHAR(50) NOT NULL,
    crmv VARCHAR(20) NOT NULL,
	nascimento DATE NOT NULL,
    cep INT,
    logradouro VARCHAR(100) NOT NULL,
    numero VARCHAR(10) NOT NULL,
    bairro VARCHAR(50) NOT NULL,
    UF VARCHAR(2) NOT NULL,
    municipio VARCHAR(50) NOT NULL,
	complemento VARCHAR(50) NOT NULL,
    
	ddd_1 INT,
	celular_1 INT,
    ddd_2 INT,
	celular_2 INT,
    email_1 VARCHAR(100),
    email_2 VARCHAR(100),
    valor double,
    observacoes VARCHAR(500)
  );





-- SERVICOS TABLES 1-N --------------------------------------------------------------------------------



-- SERVICOS -------------------------------------------------------------------------------------------

  CREATE TABLE Servicos (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    
    nome VARCHAR(150) NOT NULL,
    servico VARCHAR(50) NOT NULL,
    valor DOUBLE NOT NULL,
    tipo_documento VARCHAR(50) NOT NULL,
    documento_identificador VARCHAR(50) NOT NULL,
    nascimento DATE NOT NULL,
    cep INT,
    logradouro VARCHAR(100) NOT NULL,
    numero VARCHAR(10) NOT NULL,
    bairro VARCHAR(50) NOT NULL,
    UF VARCHAR(2) NOT NULL,
    municipio VARCHAR(50) NOT NULL,
	complemento VARCHAR(50) NOT NULL,
    
	ddd_1 INT,
	celular_1 INT,
    ddd_2 INT,
	celular_2 INT,
    email_1 VARCHAR(100),
    email_2 VARCHAR(100),
    observacoes VARCHAR(500)
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
    