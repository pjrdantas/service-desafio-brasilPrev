# service-desafio-brasilPrev
API REST com as funcionalidades de um cadastro de seus clientes (nome, cpf e endereço)




-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
SHOW WARNINGS;
-- -----------------------------------------------------
-- Schema db_desafio_brasilprev
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `db_desafio_brasilprev` ;

-- -----------------------------------------------------
-- Schema db_desafio_brasilprev
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_desafio_brasilprev` DEFAULT CHARACTER SET utf8 ;
SHOW WARNINGS;
USE `db_desafio_brasilprev` ;

-- -----------------------------------------------------
-- Table `db_desafio_brasilprev`.`tb_address`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_desafio_brasilprev`.`tb_address` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `db_desafio_brasilprev`.`tb_address` (
  `id` INT(10) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT,
  `tb_address_public_place` VARCHAR(100) NOT NULL,
  `tb_address_number` DECIMAL(9,0) NOT NULL,
  `tb_address_complement` VARCHAR(100) NULL DEFAULT NULL,
  `tb_address_district` VARCHAR(100) NOT NULL,
  `tb_address_city` VARCHAR(45) NOT NULL,
  `tb_address_state` VARCHAR(45) NOT NULL,
  `tb_address_zip` VARCHAR(45) NOT NULL,
  `tb_address_type` VARCHAR(45) NOT NULL,
  `tb_address_cpf` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8;

SHOW WARNINGS;
CREATE UNIQUE INDEX `id_UNIQUE` ON `db_desafio_brasilprev`.`tb_address` (`id` ASC) VISIBLE;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `db_desafio_brasilprev`.`tb_customer`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `db_desafio_brasilprev`.`tb_customer` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `db_desafio_brasilprev`.`tb_customer` (
  `id` INT(10) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT,
  `tb_customer_name` VARCHAR(45) NOT NULL,
  `tb_customer_cpf` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8;

SHOW WARNINGS;
CREATE UNIQUE INDEX `idtb_cliente_UNIQUE` ON `db_desafio_brasilprev`.`tb_customer` (`id` ASC) VISIBLE;

SHOW WARNINGS;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
