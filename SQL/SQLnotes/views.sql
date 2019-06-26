Views:-

----->creating view

CREATE
    /*[ALGORITHM = {UNDEFINED | MERGE | TEMPTABLE}]
    [DEFINER = { user | CURRENT_USER }]
    [SQL SECURITY { DEFINER | INVOKER }]*/
    VIEW `company`.`viewdel` 
    AS
    (SELECT * FROM cheking)

In notepad:-

mysql> CREATE    /*[ALGORITHM = {UNDEFINED | MERGE | TEMPTABLE}]    [DEFINER = { user | CURRENT_USER }]    [SQL SECURITY { DEFINER | INVOKER }]*/    VIEW `company`.`view2`     AS    (SELECT * FROM checking)
    -> ;
Query OK, 0 rows affected (0.09 sec)

mysql> select * from view2;
+--------+--------------------+-----------+
| deptno | deptname           | location  |
+--------+--------------------+-----------+
|     10 | software developer | banglore  |
|     20 | trainee developer  | hyderabad |
|     30 | Accounts           | chennai   |
+--------+--------------------+-----------+
3 rows in set (0.01 sec)

----->altering view

DELIMITER $$

DROP VIEW IF EXISTS `company`.`viewdel`$$

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `viewdel` AS select `employee`.`id` AS `id`,`employee`.`firstname` AS `firstname`,`employee`.`lastname` AS `lastname`,`employee`.`email` AS `email`,`employee`.`job` AS `job`,`employee`.`hiredate` AS `hiredate`,`employee`.`salary` AS `salary`,`employee`.`deptno` AS `deptno` from `employee`$$

DELIMITER ;

----->performing operations

DELETE from viewdel where salary=3400;
insert into viewdel values(1,'sam','sk','sm@gmail.com','software engineer',2019-02-14,34000,10);
select * from viewdel where firstname like '%ev';
select upper(firstname) from viewdel;