CREATE DATABASE IF NOT EXISTS db_A3 ;

USE db_A3;
/*
DROP TABLE tb_usuarios;
DROP TABLE tb_usuario_projeto;
DROP TABLE tb_projetos;
DROP TABLE tb_usuario_requisito;
DROP TABLE tb_requisitos;
*/
CREATE TABLE IF NOT EXISTS tb_usuarios (
id_usuario int NOT NULL AUTO_INCREMENT,
nome_completo varchar(100) NOT NULL,
nome_usuario varchar(45) UNIQUE NOT NULL,
email varchar(45) NOT NULL UNIQUE,
senha varchar(45) NOT NULL,
telefone varchar(45) NOT NULL,

PRIMARY KEY (id_usuario)
);

CREATE TABLE IF NOT EXISTS tb_usuario_projeto (
id_usuario INT NOT NULL,
id_projeto INT NOT NULL,

PRIMARY KEY (id_usuario, id_projeto)
);

CREATE TABLE IF NOT EXISTS tb_projetos (
id_projeto INT NOT NULL AUTO_INCREMENT,
id_usuario_autor INT NOT NULL,
nome VARCHAR(45) NOT NULL,
descricao VARCHAR(45) NOT NULL,

PRIMARY KEY (id_projeto)
);

CREATE TABLE IF NOT EXISTS tb_usuario_requisito (
id_usuario INT NOT NULL,
id_requisito INT NOT NULL,
horas_trabalhadas INT NOT NULL,

PRIMARY KEY (id_usuario, id_requisito)
);

CREATE TABLE IF NOT EXISTS tb_requisitos (
id_requisito INT NOT NULL AUTO_INCREMENT,
id_projeto INT NOT NULL,
id_usuario_autor INT NOT NULL,
modulo VARCHAR(100),
funcionalidades VARCHAR(45),
data_de_criacao VARCHAR(45) NOT NULL,
autor VARCHAR(45) NOT NULL,
data_da_ultima_alteracao VARCHAR(20),
data_da_ultima_modificacao VARCHAR(20),
versao VARCHAR(45) NOT NULL,
prioridade VARCHAR(45),
complexidade VARCHAR(45),
esforco_estimado VARCHAR(100),
estado VARCHAR(45) NOT NULL,
descricao VARCHAR(100),

PRIMARY KEY (id_requisito)
);
