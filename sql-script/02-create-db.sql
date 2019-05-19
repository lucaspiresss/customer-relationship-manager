-- -----------------------------------------------------
-- Creating database `db_crm_rest`
-- -----------------------------------------------------
CREATE DATABASE  IF NOT EXISTS `db_crm_rest`;
USE `db_crm_rest`;

-- -----------------------------------------------------
-- Creating table `customer`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Dumping data for table `customer`
-- -----------------------------------------------------
INSERT INTO `customer` VALUES 
	(1,'Zula','Dallas','zula@emailemail.com'),
	(2,'Dillon','Oliver','dillon@email.com'),
	(3,'Kristina','Rao','kristina@email.com'),
	(4,'Mary','Isabelle','mary@email.com'),
	(5,'Russel','Corwin','russel@email.com');