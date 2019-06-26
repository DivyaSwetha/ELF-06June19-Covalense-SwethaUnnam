mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| company            |
| cov                |
| employee           |
| information_schema |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
7 rows in set (0.03 sec)

mysql> use company;
Database changed
mysql> show tables;
+-------------------+
| Tables_in_company |
+-------------------+
| checking          |
| department        |
| employee          |
| newtable          |
| view1             |
| viewdel           |
+-------------------+
6 rows in set (0.06 sec)

mysql> select * from employee;
+----+-----------+----------+-----------------+-------------------+------------+--------+--------+
| id | firstname | lastname | email           | job               | hiredate   | salary | deptno |
+----+-----------+----------+-----------------+-------------------+------------+--------+--------+
|  1 | sam       | sk       | sm@gmail.com    | software engineer | 0000-00-00 |  34000 |     10 |
|  2 | ram       | raghu    | ram@gmail.com   | mining engineer   | 2019-02-21 |  40000 |     20 |
|  3 | hari      | par      | par@gmail.com   | software engineer | 2019-02-21 |   2000 |     30 |
|  4 | dev       | rev      | dev@gmail.com   | support engineer  | 2015-08-24 |  60000 |     40 |
|  5 | sri       | rev      | sri@gmail.com   | design engineer   | 2019-02-23 |  26000 |     50 |
|  6 | venu      | rmngr    | venu@gmail.com  | software engineer | 2018-06-06 |  50000 |     40 |
|  7 | nag       | rmngr    | nag@gmail.com   | junior developer  | 2019-02-24 | 140000 |     60 |
|  8 | bhargav   | rev      | bhar@gmail.com  | junior developer  | 2019-02-14 |  30000 |     40 |
|  9 | pandu     | rev      | pandu@gmail.com | ASE               | 2019-05-25 |  25000 |     90 |
| 10 | bajju     | nela     | bajju@gmail.com | ASE               | 2019-05-27 | 320000 |    100 |
| 11 | adone     | bang     | ad@gmail.com    | AE                | 2019-03-23 |  33000 |     30 |
+----+-----------+----------+-----------------+-------------------+------------+--------+--------+
11 rows in set (0.00 sec)

mysql> insert into employee values(1,'sam','shaik','sam@gmail.com','software engineer','2019-06-24',34000,10);
ERROR 1062 (23000): Duplicate entry '1' for key 'PRIMARY'
mysql> select * from Employee ORDER BY salary DESC;
+----+-----------+----------+-----------------+-------------------+------------+--------+--------+
| id | firstname | lastname | email           | job               | hiredate   | salary | deptno |
+----+-----------+----------+-----------------+-------------------+------------+--------+--------+
| 10 | bajju     | nela     | bajju@gmail.com | ASE               | 2019-05-27 | 320000 |    100 |
|  7 | nag       | rmngr    | nag@gmail.com   | junior developer  | 2019-02-24 | 140000 |     60 |
|  4 | dev       | rev      | dev@gmail.com   | support engineer  | 2015-08-24 |  60000 |     40 |
|  6 | venu      | rmngr    | venu@gmail.com  | software engineer | 2018-06-06 |  50000 |     40 |
|  2 | ram       | raghu    | ram@gmail.com   | mining engineer   | 2019-02-21 |  40000 |     20 |
|  1 | sam       | sk       | sm@gmail.com    | software engineer | 0000-00-00 |  34000 |     10 |
| 11 | adone     | bang     | ad@gmail.com    | AE                | 2019-03-23 |  33000 |     30 |
|  8 | bhargav   | rev      | bhar@gmail.com  | junior developer  | 2019-02-14 |  30000 |     40 |
|  5 | sri       | rev      | sri@gmail.com   | design engineer   | 2019-02-23 |  26000 |     50 |
|  9 | pandu     | rev      | pandu@gmail.com | ASE               | 2019-05-25 |  25000 |     90 |
|  3 | hari      | par      | par@gmail.com   | software engineer | 2019-02-21 |   2000 |     30 |
+----+-----------+----------+-----------------+-------------------+------------+--------+--------+
11 rows in set (0.00 sec)

mysql> select COUNT(*) from employee GROUP BY deptno;
+----------+
| COUNT(*) |
+----------+
|        1 |
|        1 |
|        2 |
|        3 |
|        1 |
|        1 |
|        1 |
|        1 |
+----------+
8 rows in set (0.00 sec)

mysql> select COUNT(*) from employee where deptno=60 GROUP BY deptno;
+----------+
| COUNT(*) |
+----------+
|        1 |
+----------+
1 row in set (0.00 sec)

mysql> select * from employee where job='software engineer' GROUP BY deptno;
+----+-----------+----------+----------------+-------------------+------------+--------+--------+
| id | firstname | lastname | email          | job               | hiredate   | salary | deptno |
+----+-----------+----------+----------------+-------------------+------------+--------+--------+
|  1 | sam       | sk       | sm@gmail.com   | software engineer | 0000-00-00 |  34000 |     10 |
|  3 | hari      | par      | par@gmail.com  | software engineer | 2019-02-21 |   2000 |     30 |
|  6 | venu      | rmngr    | venu@gmail.com | software engineer | 2018-06-06 |  50000 |     40 |
+----+-----------+----------+----------------+-------------------+------------+--------+--------+
3 rows in set (0.00 sec)

mysql> select max(salary) from employee GROUP BY DEPTNO;
+-------------+
| max(salary) |
+-------------+
|       34000 |
|       40000 |
|       33000 |
|       60000 |
|       26000 |
|      140000 |
|       25000 |
|      320000 |
+-------------+
8 rows in set (0.00 sec)
