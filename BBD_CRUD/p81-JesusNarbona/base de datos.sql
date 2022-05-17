CREATE DATABASE  IF NOT EXISTS `java-data-base`;
USE `java-data-base`;

DROP TABLE IF EXISTS `chat`;
CREATE TABLE `chat` (
  `chat_id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `icono` varchar(45) DEFAULT NULL,
  `fecha_creacion` datetime DEFAULT NULL,
  `creador` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`chat_id`),
  UNIQUE KEY `chat_id_UNIQUE` (`chat_id`),
  KEY `fk_emailcreador_idx` (`creador`)
);

INSERT INTO `chat` VALUES (1,'grupoClase','incon1.png','2022-04-30 12:45:16','albamar@gmail.com'),(2,'grupoFutbol','incon2.png','2022-04-30 12:47:21','julio@gmail.com'),(3,'grupoFutbol','incon2.png','2022-04-30 12:47:21','messi@gmail.com'),(4,'1ero DAW','incon3.png','2022-04-30 12:47:21','pacopepe@gmail.com'),(5,'FAMILIA','incon4.png','2022-04-30 12:47:21','pipiolo@gmail.com'),(6,'Cine DoctorStrange','incon5.png','2022-04-30 12:47:21','pipiolo@gmail.com'),(7,'Salida estepona','incon6.png','2022-04-30 12:47:21','vico@gmail.com');

DROP TABLE IF EXISTS `rol`;
CREATE TABLE `rol` (
  `rol_id` int NOT NULL AUTO_INCREMENT,
  `rol_name` varchar(45) DEFAULT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`rol_id`),
  UNIQUE KEY `rol_id_UNIQUE` (`rol_id`)
) ;

INSERT INTO `rol` VALUES (1,'vip','Permisos de vip'),(2,'administrador','Administrador, todos los permisos'),(3,'usuario','Usuario, permisos basicos de usuario'),(4,'colaborador','Colaborador, permisos avanzados');

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE `usuario` (
  `email` varchar(45) NOT NULL,
  `contraseña` varchar(45) DEFAULT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `fecha_creacion` datetime DEFAULT NULL,
  `ult_mod_passwd` datetime DEFAULT NULL,
  `ultima_conexion` datetime DEFAULT NULL,
  `key` varchar(45) DEFAULT NULL,
  `rol_id` int DEFAULT NULL,
  PRIMARY KEY (`email`),
  KEY `rol_id_idx` (`rol_id`)
);

INSERT INTO `usuario` VALUES ('albamar@gmail.com','4123fa','alba12','2022-04-30 13:25:43',NULL,NULL,'kjndfshje',3),('hercules@gmail.com','poedj23','hercules','2022-04-30 13:25:43',NULL,NULL,'adsiu38',4),('julio@gmail.com','asdfgh','julio','2022-04-30 13:25:43',NULL,NULL,'jkvdfsh328',1),('messi@gmail.com','poedj23','messi','2022-04-30 13:25:43',NULL,NULL,'adsiu38',3),('pacopepe@gmail.com','12345','paco','2022-04-30 13:25:43',NULL,NULL,'sadkjhs21e4',3),('pipiolo@gmail.com','12345asd','pipiolo','2022-04-30 13:25:43',NULL,NULL,'123dg22sg',3),('rodolfo@gmail.com','12345asd','rodolfo','2022-04-30 13:25:43',NULL,NULL,'kviof03',3),('vico@gmail.com','09876','vico','2022-04-30 13:25:43',NULL,NULL,'123fdla32',2);