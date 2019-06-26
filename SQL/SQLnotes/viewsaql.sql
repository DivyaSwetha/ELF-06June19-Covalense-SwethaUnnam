DELIMITER $$

DROP VIEW IF EXISTS `company`.`viewdel`$$

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `viewdel` AS select `employee`.`id` AS `id`,`employee`.`firstname` AS `firstname`,`employee`.`lastname` AS `lastname`,`employee`.`email` AS `email`,`employee`.`job` AS `job`,`employee`.`hiredate` AS `hiredate`,`employee`.`salary` AS `salary`,`employee`.`deptno` AS `deptno` from `employee`$$

DELIMITER ;
DELETE from viewdel where salary=3400;
insert into viewdel values(1,'sam','sk','sm@gmail.com','software engineer',2019-02-14,34000,10);
select * from viewdel where firstname like '%ev';
select upper(firstname) from viewdel;