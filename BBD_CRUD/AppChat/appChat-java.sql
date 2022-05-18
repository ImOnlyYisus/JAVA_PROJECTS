DROP SCHEMA IF EXISTS `appChat` ;

CREATE SCHEMA IF NOT EXISTS `appChat` DEFAULT CHARACTER SET utf8 ;
USE `appChat` ;

DROP TABLE IF EXISTS `appChat`.`cuenta` ;

CREATE TABLE IF NOT EXISTS `appChat`.`cuenta` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(50) NULL,
  `descripcion` VARCHAR(45) NULL,
  `fecha_creacion` DATETIME NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

DROP TABLE IF EXISTS `appChat`.`usuario` ;

CREATE TABLE IF NOT EXISTS `appChat`.`usuario` (
  `email` VARCHAR(100) NOT NULL,
  `contraseña` VARCHAR(45) NOT NULL,
  `ult_mod_passwd` DATETIME NULL,
  `ult_conexion` DATETIME NULL,
  `key_user` VARCHAR(45) NULL,
  `id_cuenta` INT NOT NULL,
  PRIMARY KEY (`email`),
  INDEX `fk_usuario_cuenta1_idx` (`id_cuenta`),
  CONSTRAINT `fk_usuario_cuenta1`
    FOREIGN KEY (`id_cuenta`)
    REFERENCES `appChat`.`cuenta` (`id`)
    ON DELETE CASCADE
	ON UPDATE CASCADE)
ENGINE = InnoDB;

DROP TABLE IF EXISTS `appChat`.`chat` ;

CREATE TABLE IF NOT EXISTS `appChat`.`chat` (
    `id_chat` INT NOT NULL AUTO_INCREMENT,
    `nombre` VARCHAR(45) NULL,
    `descripcion` VARCHAR(100) NULL,
    `icono` VARCHAR(45) NULL DEFAULT 'iconoEjemplo.png',
    `usuario_email` VARCHAR(50) NOT NULL,
    PRIMARY KEY (`id_chat`),
    INDEX `fk_chat_usuario_idx` (`usuario_email`),
    CONSTRAINT `fk_chat_usuario` FOREIGN KEY (`usuario_email`)
        REFERENCES `appChat`.`usuario` (`email`)
         ON DELETE CASCADE
		ON UPDATE CASCADE
)  ENGINE=INNODB;


INSERT INTO `appchat`.`cuenta` VALUES(1,'roberto123','Viva el betis',now());
INSERT INTO `appchat`.`cuenta` VALUES(2,'femto01','Guts...',now());
INSERT INTO `appchat`.`cuenta` VALUES(3,'jfervic933','Dando clases',now());
INSERT INTO `appchat`.`cuenta` VALUES(4,'im_only_yisus','Jesus estoy en el toilet',now());
INSERT INTO `appchat`.`cuenta` VALUES(5,'hydra88','Hola! estoy usando whatsapp',now());
INSERT INTO `appchat`.`cuenta` VALUES(6,'alex.gb12','Crypto world',now());


INSERT INTO `appchat`.`usuario`VALUES('robertinio@gmail.com','1234roberto',null,null,'uiqwnbfa',1);
INSERT INTO `appchat`.`usuario`VALUES('femto8881@gmail.com','u28fnad',null,null,'uasd34:$"!a',2);
INSERT INTO `appchat`.`usuario`VALUES('jfervic933@gmail.com','vicoapruebame',null,null,'%!eocjq3',3);
INSERT INTO `appchat`.`usuario`VALUES('yisusturtle@gmail.com','9273da',null,null,'571f"·afd',4);
INSERT INTO `appchat`.`usuario`VALUES('hydramovic@gmail.com','dfgfav43314',null,null,'98mu34vtRC·%',5);
INSERT INTO `appchat`.`usuario`VALUES('alejandro12@gmail.com','ggg233da',null,null,'??·!23idmasd',6);

INSERT INTO `appchat`.`chat`VALUES (1,'Furbito dia 8','Pachanguita con los colegas','messi.png','alejandro12@gmail.com');
INSERT INTO `appchat`.`chat`VALUES (2,'Furbito dia 12','Pachanguita con los colegas','messi2.png','alejandro12@gmail.com');
INSERT INTO `appchat`.`chat`VALUES (3,'Club lectura','Recomendar libros','aristoteles.png','jfervic933@gmail.com');
INSERT INTO `appchat`.`chat`VALUES (4,'Cine','Ver doctor stange','marvel.png','hydramovic@gmail.com');
INSERT INTO `appchat`.`chat`VALUES (5,'1DAW','Clase daw','horario.png','robertinio@gmail.com');


