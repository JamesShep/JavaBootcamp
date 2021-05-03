-- create database online_bank;
-- use online_bank;
create table users (
	user_id int,
    username varchar(100),
    password varchar(32),
    first_name varchar(50),
    last_name varchar(50)
);

CREATE TABLE `online_bank`.`transactions` (
  `transaction_id` INT NOT NULL,
  `transaction_date` DATETIME NULL,
  `amount` DECIMAL NULL,
  `type` VARCHAR(1) NULL,
  PRIMARY KEY (`transaction_id`));
