SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci ;
USE `mydb`;

-- -----------------------------------------------------
-- Table `mydb`.`rol`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `mydb`.`rol` (
  `codi_rol` INT NOT NULL AUTO_INCREMENT ,
  `nomb_rol` VARCHAR(45) NULL ,
  `esta_rol` CHAR(1) NULL ,
  PRIMARY KEY (`codi_rol`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`usuario`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `mydb`.`usuario` (
  `codi_usu` INT NOT NULL AUTO_INCREMENT ,
  `codi_rol` INT NULL ,
  `nomb_usu` VARCHAR(45) NULL ,
  `apel_usu` VARCHAR(45) NULL ,
  `nick_usu` VARCHAR(45) NULL ,
  `pass_usu` VARCHAR(45) NULL ,
  PRIMARY KEY (`codi_usu`) ,
  INDEX `fk_usuario_rol` (`codi_rol` ASC) ,
  CONSTRAINT `fk_usuario_rol`
    FOREIGN KEY (`codi_rol` )
    REFERENCES `mydb`.`rol` (`codi_rol` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`ventas`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `mydb`.`ventas` (
  `codi_ven` INT NOT NULL AUTO_INCREMENT ,
  `codi_usu` INT NULL ,
  `fech_ven` DATETIME NULL ,
  `clie_ven` VARCHAR(50) NULL ,
  `impo_ven` DECIMAL(10,2) NULL ,
  `fopa_ven` CHAR(1) NULL ,
  PRIMARY KEY (`codi_ven`) ,
  INDEX `fk_ventas_usuario` (`codi_usu` ASC) ,
  CONSTRAINT `fk_ventas_usuario`
    FOREIGN KEY (`codi_usu` )
    REFERENCES `mydb`.`usuario` (`codi_usu` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`proveedor`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `mydb`.`proveedor` (
  `codi_prv` INT NOT NULL AUTO_INCREMENT ,
  `nomb_prv` VARCHAR(45) NULL ,
  `telf_prv` VARCHAR(45) NULL ,
  `ruc_prv` VARCHAR(45) NULL ,
  `apel_prv` VARCHAR(45) NULL ,
  `dni_prv` VARCHAR(45) NULL ,
  `celu_prv` VARCHAR(12) NULL ,
  `dire_prv` VARCHAR(100) NULL ,
  PRIMARY KEY (`codi_prv`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`compras`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `mydb`.`compras` (
  `codi_com` INT NOT NULL AUTO_INCREMENT ,
  `fech_com` DATETIME NULL ,
  `ruc_com` VARCHAR(12) NULL ,
  `impo_com` DECIMAL(10,2) NULL ,
  `igv_com` DECIMAL(10,2) NULL ,
  `desc_com` DECIMAL(10,2) NULL ,
  `fopa_com` VARCHAR(45) NULL ,
  `codi_prv` INT NULL ,
  PRIMARY KEY (`codi_com`) ,
  INDEX `fk_compras_proveedor` (`codi_prv` ASC) ,
  CONSTRAINT `fk_compras_proveedor`
    FOREIGN KEY (`codi_prv` )
    REFERENCES `mydb`.`proveedor` (`codi_prv` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`producto`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `mydb`.`producto` (
  `codi_pro` INT NOT NULL AUTO_INCREMENT ,
  `nomb_pro` VARCHAR(50) NULL ,
  `pres_pro` VARCHAR(45) NULL ,
  `unme_pro` VARCHAR(12) NULL ,
  `prev_pro` VARCHAR(45) NULL ,
  `prcu_pro` DECIMAL(10,2) NULL ,
  `stto_pro` INT NULL ,
  `stun_pro` INT NULL ,
  `prct_pro` DECIMAL(10,2) NULL ,
  `seri_pro` VARCHAR(45) NULL ,
  PRIMARY KEY (`codi_pro`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`detalle_venta`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `mydb`.`detalle_venta` (
  `codi_ven` INT NULL ,
  `codi_pro` INT NULL ,
  `cant_dve` INT NULL ,
  `impo_dve` DECIMAL(10,2) NULL ,
  INDEX `fk_detalle_venta_ventas` (`codi_ven` ASC) ,
  INDEX `fk_detalle_venta_producto` (`codi_pro` ASC) ,
  CONSTRAINT `fk_detalle_venta_ventas`
    FOREIGN KEY (`codi_ven` )
    REFERENCES `mydb`.`ventas` (`codi_ven` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_detalle_venta_producto`
    FOREIGN KEY (`codi_pro` )
    REFERENCES `mydb`.`producto` (`codi_pro` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`detalle_compra`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `mydb`.`detalle_compra` (
  `codi_pro` INT NULL ,
  `codi_com` INT NULL ,
  `cant_dco` INT NULL ,
  `impo_dco` DECIMAL(10,2) NULL ,
  INDEX `fk_detalle_compra_producto` (`codi_pro` ASC) ,
  INDEX `fk_detalle_compra_compras` (`codi_com` ASC) ,
  CONSTRAINT `fk_detalle_compra_producto`
    FOREIGN KEY (`codi_pro` )
    REFERENCES `mydb`.`producto` (`codi_pro` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_detalle_compra_compras`
    FOREIGN KEY (`codi_com` )
    REFERENCES `mydb`.`compras` (`codi_com` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`marca`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `mydb`.`marca` (
  `codi_mar` INT NOT NULL AUTO_INCREMENT ,
  `nomb_mar` VARCHAR(45) NULL ,
  `esta_mar` CHAR(1) NULL ,
  PRIMARY KEY (`codi_mar`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`modelo`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `mydb`.`modelo` (
  `codi_mod` INT NOT NULL AUTO_INCREMENT ,
  `codi_mar` INT NULL ,
  `nomb_mod` VARCHAR(45) NULL ,
  `moto_mod` VARCHAR(45) NULL ,
  `añoi_mod` DATETIME NULL ,
  `añof_mod` DATETIME NULL ,
  `aire_mod` VARCHAR(45) NULL ,
  `comb_mod` VARCHAR(45) NULL ,
  `acei_mod` VARCHAR(45) NULL ,
  `esta_mod` CHAR(1) NULL ,
  PRIMARY KEY (`codi_mod`) ,
  INDEX `fk_modelo_marca` (`codi_mar` ASC) ,
  CONSTRAINT `fk_modelo_marca`
    FOREIGN KEY (`codi_mar` )
    REFERENCES `mydb`.`marca` (`codi_mar` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`detalle_modelo`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `mydb`.`detalle_modelo` (
  `codi_mod` INT NULL ,
  `codi_pro` INT NULL ,
  INDEX `fk_detalle_modelo_modelo` (`codi_mod` ASC) ,
  INDEX `fk_detalle_modelo_producto` (`codi_pro` ASC) ,
  CONSTRAINT `fk_detalle_modelo_modelo`
    FOREIGN KEY (`codi_mod` )
    REFERENCES `mydb`.`modelo` (`codi_mod` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_detalle_modelo_producto`
    FOREIGN KEY (`codi_pro` )
    REFERENCES `mydb`.`producto` (`codi_pro` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
