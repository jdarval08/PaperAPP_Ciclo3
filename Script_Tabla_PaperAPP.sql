-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema PaperAPP_Ciclo3_DB
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema PaperAPP_Ciclo3_DB
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `PaperAPP_Ciclo3_DB` DEFAULT CHARACTER SET utf8 ;
USE `PaperAPP_Ciclo3_DB` ;

-- -----------------------------------------------------
-- Table `PaperAPP_Ciclo3_DB`.`table1`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PaperAPP_Ciclo3_DB`.`table1` (
  `idProducto` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idProducto`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
