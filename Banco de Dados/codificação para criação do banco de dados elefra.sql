-- Criação do Banco de Dados Elefra O.S --

-- Criação da tabela Clientes --

CREATE TABLE clientes
(
  codigo_cliente serial NOT NULL,
  nome_cliente character varying(100),
  email character varying(100),
  telefone character varying(15),
  celular character varying(15),
  senha character varying(10),
  observacao character varying(500),
  nome_cidade character varying(100),
  estado character varying(100),
  codigo_historico integer,
  cliente character varying(50),
  codigo_cidade integer,
  login_usuario character varying(15),
  CONSTRAINT clientes_pkey PRIMARY KEY (codigo_cliente),
  CONSTRAINT pk_cidades FOREIGN KEY (codigo_cidade)
      REFERENCES cidades (codigo_cidade)
      )

-- Criação da tabela Histórico --

CREATE TABLE historicos
(
  codigo_historico integer NOT NULL,
  pendente character varying(500),
  tb_concluido character varying(500),
  observacao character varying(500),
 data_inicio date,
 data_termino date,
  CONSTRAINT historicos_pkey PRIMARY KEY (codigo_historico)
  )

-- Criação da tabela Avicultores --

CREATE TABLE avicultores
(
  codigo_avicultor integer NOT NULL,
  nome_avicultor character varying(80),
  codigo_historico integer,
  CONSTRAINT avicultores_pkey PRIMARY KEY (codigo_avicultor),
  CONSTRAINT pk_historicos FOREIGN KEY (codigo_historico)
      REFERENCES historicos (codigo_historico)
      )

-- Criação da tabela Eletricistas --

CREATE TABLE eletricistas
(
  codigo_eletricista integer NOT NULL,
  nome_eletricista character varying(80),
  codigo_historico integer,
  CONSTRAINT eletricistas_pkey PRIMARY KEY (codigo_eletricista),
  CONSTRAINT pk_historicos FOREIGN KEY (codigo_historico)
      REFERENCES historicos (codigo_historico)
      )

-- Criação da tabela Cidades --

CREATE TABLE cidades
(
  codigo_cidade integer NOT NULL,
  nome_cidade character varying(50),
  estado character varying(50),
  CONSTRAINT cidades_pkey PRIMARY KEY (codigo_cidade)
)
