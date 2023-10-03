drop database if exists toca_teste;  -- Remove o banco de dados, caso exista
create database toca_teste;          -- Cria o banco de dados
use toca_teste;                      -- Seleciona o banco para os próximos comandos

/* As linhas acima não devem ser executas em serviços online como o sqlite oline*/

CREATE TABLE pet (
  Nome VARCHAR(150) NOT NULL,
  Nascimento DATE,
  ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT)

CREATE TABLE tutor (
  Nome VARCHAR(150) NOT NULL,
  Nascimento DATE,
  Celular INT,
  CPF INT PRIMARY KEY NOT NULL,
   (`CPF`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `toca_teste`.`veterinario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `toca_teste`.`veterinario` (
  `Nome` VARCHAR(150) NULL DEFAULT NULL,
  `Nascimento` DATE NULL DEFAULT NULL,
  `Celular` INT NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;