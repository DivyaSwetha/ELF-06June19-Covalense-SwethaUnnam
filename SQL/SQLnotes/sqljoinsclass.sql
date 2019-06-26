JOINS:-

mysql> SELECT * from employee;

+----+-----------+----------+-----------------+-------------------+------------+--------+--------+
| id | firstname | lastname | email           | job               | hiredate   | salary | deptno |
+----+-----------+----------+-----------------+-------------------+------------+--------+--------+
|  1 | sam       | shaik    | sam@gmail.com   | software engineer | 2019-06-24 |   3400 |     10 |
|  2 | ram       | raghu    | ram@gmail.com   | mining engineer   | 2019-02-21 |  20000 |     20 |
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

mysql> SELECT * from department;
+--------+--------------------+-----------+
| deptno | deptname           | location  |
+--------+--------------------+-----------+
|     10 | software developer | banglore  |
|     20 | trainee developer  | hyderabad |
|     30 | Accounts           | chennai   |
+--------+--------------------+-----------+
3 rows in set (0.00 sec)

mysql> SELECT * from checking;
+--------+--------------------+-----------+
| deptno | deptname           | location  |
+--------+--------------------+-----------+
|     10 | software developer | banglore  |
|     20 | trainee developer  | hyderabad |
|     30 | Accounts           | chennai   |
+--------+--------------------+-----------+
3 rows in set (0.00 sec)

mysql> use company;
Database changed
mysql> SELECT * from employee e INNER JOIN department d on e.deptno=d.deptno;
+----+-----------+----------+---------------+-------------------+------------+--------+--------+--------+--------------------+-----------+
| id | firstname | lastname | email         | job               | hiredate   | salary | deptno | deptno | deptname           | location  |
+----+-----------+----------+---------------+-------------------+------------+--------+--------+--------+--------------------+-----------+
|  1 | sam       | shaik    | sam@gmail.com | software engineer | 2019-06-24 |   3400 |     10 |     10 | software developer | banglore  |
|  2 | ram       | raghu    | ram@gmail.com | mining engineer   | 2019-02-21 |  20000 |     20 |     20 | trainee developer  | hyderabad |
|  3 | hari      | par      | par@gmail.com | software engineer | 2019-02-21 |   2000 |     30 |     30 | Accounts           | chennai   |
| 11 | adone     | bang     | ad@gmail.com  | AE                | 2019-03-23 |  33000 |     30 |     30 | Accounts           | chennai   |
+----+-----------+----------+---------------+-------------------+------------+--------+--------+--------+--------------------+-----------+
4 rows in set (0.03 sec)

mysql> SELECT * from department d INNER JOIN  employee e on e.deptno=d.deptno;
+--------+--------------------+-----------+----+-----------+----------+---------------+-------------------+------------+--------+--------+
| deptno | deptname           | location  | id | firstname | lastname | email         | job               | hiredate   | salary | deptno |
+--------+--------------------+-----------+----+-----------+----------+---------------+-------------------+------------+--------+--------+
|     10 | software developer | banglore  |  1 | sam       | shaik    | sam@gmail.com | software engineer | 2019-06-24 |   3400 |     10 |
|     20 | trainee developer  | hyderabad |  2 | ram       | raghu    | ram@gmail.com | mining engineer   | 2019-02-21 |  20000 |     20 |
|     30 | Accounts           | chennai   |  3 | hari      | par      | par@gmail.com | software engineer | 2019-02-21 |   2000 |     30 |
|     30 | Accounts           | chennai   | 11 | adone     | bang     | ad@gmail.com  | AE                | 2019-03-23 |  33000 |     30 |
+--------+--------------------+-----------+----+-----------+----------+---------------+-------------------+------------+--------+--------+
4 rows in set (0.00 sec)

mysql> SELECT * from department d INNER JOIN checking c on d.location=c.location;
+--------+--------------------+-----------+--------+--------------------+-----------+
| deptno | deptname           | location  | deptno | deptname           | location  |
+--------+--------------------+-----------+--------+--------------------+-----------+
|     10 | software developer | banglore  |     10 | software developer | banglore  |
|     20 | trainee developer  | hyderabad |     20 | trainee developer  | hyderabad |
|     30 | Accounts           | chennai   |     30 | Accounts           | chennai   |
+--------+--------------------+-----------+--------+--------------------+-----------+
3 rows in set (0.00 sec)

mysql> SELECT e.firstname,e.hiredate,e.salary,d.deptname,d.location from department d INNER JOIN  employee e on e.deptno=d.deptno;

+-----------+------------+--------+--------------------+-----------+
| firstname | hiredate   | salary | deptname           | location  |
+-----------+------------+--------+--------------------+-----------+
| sam       | 2019-06-24 |   3400 | software developer | banglore  |
| ram       | 2019-02-21 |  20000 | trainee developer  | hyderabad |
| hari      | 2019-02-21 |   2000 | Accounts           | chennai   |
| adone     | 2019-03-23 |  33000 | Accounts           | chennai   |
+-----------+------------+--------+--------------------+-----------+
4 rows in set (0.00 sec)

mysql> SELECT * from employee e LEFT JOIN department d on e.deptno=d.deptno;

+----+-----------+----------+-----------------+-------------------+------------+--------+--------+--------+--------------------+-----------+
| id | firstname | lastname | email           | job               | hiredate   | salary | deptno | deptno | deptname           | location  |
+----+-----------+----------+-----------------+-------------------+------------+--------+--------+--------+--------------------+-----------+
|  1 | sam       | shaik    | sam@gmail.com   | software engineer | 2019-06-24 |   3400 |     10 |     10 | software developer | banglore  |
|  2 | ram       | raghu    | ram@gmail.com   | mining engineer   | 2019-02-21 |  20000 |     20 |     20 | trainee developer  | hyderabad |
|  3 | hari      | par      | par@gmail.com   | software engineer | 2019-02-21 |   2000 |     30 |     30 | Accounts           | chennai   |
| 11 | adone     | bang     | ad@gmail.com    | AE                | 2019-03-23 |  33000 |     30 |     30 | Accounts           | chennai   |
|  4 | dev       | rev      | dev@gmail.com   | support engineer  | 2015-08-24 |  60000 |     40 |   NULL | NULL               | NULL      |
|  5 | sri       | rev      | sri@gmail.com   | design engineer   | 2019-02-23 |  26000 |     50 |   NULL | NULL               | NULL      |
|  6 | venu      | rmngr    | venu@gmail.com  | software engineer | 2018-06-06 |  50000 |     40 |   NULL | NULL               | NULL      |
|  7 | nag       | rmngr    | nag@gmail.com   | junior developer  | 2019-02-24 | 140000 |     60 |   NULL | NULL               | NULL      |
|  8 | bhargav   | rev      | bhar@gmail.com  | junior developer  | 2019-02-14 |  30000 |     40 |   NULL | NULL               | NULL      |
|  9 | pandu     | rev      | pandu@gmail.com | ASE               | 2019-05-25 |  25000 |     90 |   NULL | NULL               | NULL      |
| 10 | bajju     | nela     | bajju@gmail.com | ASE               | 2019-05-27 | 320000 |    100 |   NULL | NULL               | NULL      |
+----+-----------+----------+-----------------+-------------------+------------+--------+--------+--------+--------------------+-----------+
11 rows in set (0.00 sec)

mysql> SELECT * from department d LEFT JOIN employee e on e.deptno=d.deptno;

+--------+--------------------+-----------+------+-----------+----------+---------------+-------------------+------------+--------+--------+
| deptno | deptname           | location  | id   | firstname | lastname | email         | job               | hiredate   | salary | deptno |
+--------+--------------------+-----------+------+-----------+----------+---------------+-------------------+------------+--------+--------+
|     10 | software developer | banglore  |    1 | sam       | shaik    | sam@gmail.com | software engineer | 2019-06-24 |   3400 |     10 |
|     20 | trainee developer  | hyderabad |    2 | ram       | raghu    | ram@gmail.com | mining engineer   | 2019-02-21 |  20000 |     20 |
|     30 | Accounts           | chennai   |    3 | hari      | par      | par@gmail.com | software engineer | 2019-02-21 |   2000 |     30 |
|     30 | Accounts           | chennai   |   11 | adone     | bang     | ad@gmail.com  | AE                | 2019-03-23 |  33000 |     30 |
+--------+--------------------+-----------+------+-----------+----------+---------------+-------------------+------------+--------+--------+
4 rows in set (0.00 sec)

mysql> SELECT * from department d RIGHT JOIN employee e on e.deptno=d.deptno;

+--------+--------------------+-----------+----+-----------+----------+-----------------+-------------------+------------+--------+--------+
| deptno | deptname           | location  | id | firstname | lastname | email           | job               | hiredate   | salary | deptno |
+--------+--------------------+-----------+----+-----------+----------+-----------------+-------------------+------------+--------+--------+
|     10 | software developer | banglore  |  1 | sam       | shaik    | sam@gmail.com   | software engineer | 2019-06-24 |   3400 |     10 |
|     20 | trainee developer  | hyderabad |  2 | ram       | raghu    | ram@gmail.com   | mining engineer   | 2019-02-21 |  20000 |     20 |
|     30 | Accounts           | chennai   |  3 | hari      | par      | par@gmail.com   | software engineer | 2019-02-21 |   2000 |     30 |
|     30 | Accounts           | chennai   | 11 | adone     | bang     | ad@gmail.com    | AE                | 2019-03-23 |  33000 |     30 |
|   NULL | NULL               | NULL      |  4 | dev       | rev      | dev@gmail.com   | support engineer  | 2015-08-24 |  60000 |     40 |
|   NULL | NULL               | NULL      |  5 | sri       | rev      | sri@gmail.com   | design engineer   | 2019-02-23 |  26000 |     50 |
|   NULL | NULL               | NULL      |  6 | venu      | rmngr    | venu@gmail.com  | software engineer | 2018-06-06 |  50000 |     40 |
|   NULL | NULL               | NULL      |  7 | nag       | rmngr    | nag@gmail.com   | junior developer  | 2019-02-24 | 140000 |     60 |
|   NULL | NULL               | NULL      |  8 | bhargav   | rev      | bhar@gmail.com  | junior developer  | 2019-02-14 |  30000 |     40 |
|   NULL | NULL               | NULL      |  9 | pandu     | rev      | pandu@gmail.com | ASE               | 2019-05-25 |  25000 |     90 |
|   NULL | NULL               | NULL      | 10 | bajju     | nela     | bajju@gmail.com | ASE               | 2019-05-27 | 320000 |    100 |
+--------+--------------------+-----------+----+-----------+----------+-----------------+-------------------+------------+--------+--------+
11 rows in set (0.00 sec)

mysql> SELECT e.firstname,e.salary,e.deptno,d.location from employee e INNER JOIN department d on e.deptno=d.deptno;

+-----------+--------+--------+-----------+
| firstname | salary | deptno | location  |
+-----------+--------+--------+-----------+
| sam       |   3400 |     10 | banglore  |
| ram       |  20000 |     20 | hyderabad |
| hari      |   2000 |     30 | chennai   |
| adone     |  33000 |     30 | chennai   |
+-----------+--------+--------+-----------+
4 rows in set (0.00 sec)

mysql> SELECT e.firstname,e.salary from employee e INNER JOIN department d  on e.deptno=d.deptno where e.firstname like 'a%e';

+-----------+--------+
| firstname | salary |
+-----------+--------+
| adone     |  33000 |
+-----------+--------+
1 row in set (0.00 sec)