PROCEDURES:-



----->Creating procedure

DELIMITER $$

CREATE
    /*[DEFINER = { user | CURRENT_USER }]*/
    PROCEDURE `company`.`spemployee`()
    /*LANGUAGE SQL
    | [NOT] DETERMINISTIC
    | { CONTAINS SQL | NO SQL | READS SQL DATA | MODIFIES SQL DATA }
    | SQL SECURITY { DEFINER | INVOKER }
    | COMMENT 'string'*/
    BEGIN
SELECT * from employee;
    END$$

DELIMITER ;

----->calling spemployee procedure:-

call spemployee()

------->Altering procedure

DELIMITER $$

DROP PROCEDURE IF EXISTS `company`.`spemployee`$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `spemployee`(IN ids int)
BEGIN
SELECT * from employee where id=ids;
    END$$

DELIMITER ;

call spemployee(10)


Examples:-
Example1;-

DELIMITER $$

DROP PROCEDURE IF EXISTS `company`.`spemployee`$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `spemployee`(IN ids int, IN name varchar(50))
BEGIN
SELECT * from employee where id=ids or firstname=name;
    END$$

DELIMITER ;

call spemployee(10,'ram')

Example2:-
DELIMITER $$

DROP PROCEDURE IF EXISTS `company`.`spemployee`$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `spemployee`(IN sal int)
BEGIN
SELECT * from employee where salary>sal;
    END$$

DELIMITER ;

call spemployee(40000)

