ALTER TABLE `online_bank`.`users` 
CHANGE COLUMN `user_id` `user_id` INT NOT NULL ,
ADD PRIMARY KEY (`user_id`);