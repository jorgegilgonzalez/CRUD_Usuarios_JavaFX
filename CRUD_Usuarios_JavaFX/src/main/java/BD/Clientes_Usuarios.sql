DROP DATABASE IF EXISTS db_cliente;
CREATE DATABASE   db_cliente DEFAULT CHARACTER SET utf8 ;
USE db_cliente ;

DROP TABLE IF EXISTS usuario ;

CREATE TABLE  usuarios (
  correo_electronico VARCHAR(100) NOT NULL ,
  pass VARCHAR(100) NOT NULL,
  descuentos DOUBLE NULL,
  premium boolean,
  PRIMARY KEY (correo_electronico))ENGINE = InnoDB;
insert into usuarios values('ana@gmail.com', 'ana', 8,true),('juan@gmail.com', 'juan', 10,true),('pedro@gmail.com', 'pedro', 2,false),('alba@gmail.com', 'alba', 30,true);


