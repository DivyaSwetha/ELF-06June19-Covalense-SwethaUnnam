
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
7 rows in set (0.00 sec)

mysql> use company;
Database changed
mysql> show tables;
+-------------------+
| Tables_in_company |
+-------------------+
| checking          |
| department        |
| employee          |
| view1             |
| viewdel           |
+-------------------+
5 rows in set (0.03 sec)

mysql> select * from employee where salary=(select max(salary) from employee);
+----+-----------+----------+-----------------+------+------------+--------+--------+
| id | firstname | lastname | email           | job  | hiredate   | salary | deptno |
+----+-----------+----------+-----------------+------+------------+--------+--------+
| 10 | bajju     | nela     | bajju@gmail.com | ASE  | 2019-05-27 | 320000 |    100 |
+----+-----------+----------+-----------------+------+------------+--------+--------+
1 row in set (0.00 sec)

mysql> select * from employee where salary<(select max(salary) from employee);
+----+-----------+----------+-----------------+-------------------+------------+--------+--------+
| id | firstname | lastname | email           | job               | hiredate   | salary | deptno |
+----+-----------+----------+-----------------+-------------------+------------+--------+--------+
|  1 | sam       | sk       | sm@gmail.com    | software engineer | 0000-00-00 |  34000 |     10 |
|  2 | ram       | raghu    | ram@gmail.com   | mining engineer   | 2019-02-21 |  20000 |     20 |
|  3 | hari      | par      | par@gmail.com   | software engineer | 2019-02-21 |   2000 |     30 |
|  4 | dev       | rev      | dev@gmail.com   | support engineer  | 2015-08-24 |  60000 |     40 |
|  5 | sri       | rev      | sri@gmail.com   | design engineer   | 2019-02-23 |  26000 |     50 |
|  6 | venu      | rmngr    | venu@gmail.com  | software engineer | 2018-06-06 |  50000 |     40 |
|  7 | nag       | rmngr    | nag@gmail.com   | junior developer  | 2019-02-24 | 140000 |     60 |
|  8 | bhargav   | rev      | bhar@gmail.com  | junior developer  | 2019-02-14 |  30000 |     40 |
|  9 | pandu     | rev      | pandu@gmail.com | ASE               | 2019-05-25 |  25000 |     90 |
| 11 | adone     | bang     | ad@gmail.com    | AE                | 2019-03-23 |  33000 |     30 |
+----+-----------+----------+-----------------+-------------------+------------+--------+--------+
10 rows in set (0.00 sec)

mysql> select * from employee where salary=(select min(salary) from employee);
+----+-----------+----------+---------------+-------------------+------------+--------+--------+
| id | firstname | lastname | email         | job               | hiredate   | salary | deptno |
+----+-----------+----------+---------------+-------------------+------------+--------+--------+
|  3 | hari      | par      | par@gmail.com | software engineer | 2019-02-21 |   2000 |     30 |
+----+-----------+----------+---------------+-------------------+------------+--------+--------+
1 row in set (0.00 sec)

mysql> select * from employee where salary>(select min(salary) from employee);
+----+-----------+----------+-----------------+-------------------+------------+--------+--------+
| id | firstname | lastname | email           | job               | hiredate   | salary | deptno |
+----+-----------+----------+-----------------+-------------------+------------+--------+--------+
|  1 | sam       | sk       | sm@gmail.com    | software engineer | 0000-00-00 |  34000 |     10 |
|  2 | ram       | raghu    | ram@gmail.com   | mining engineer   | 2019-02-21 |  20000 |     20 |
|  4 | dev       | rev      | dev@gmail.com   | support engineer  | 2015-08-24 |  60000 |     40 |
|  5 | sri       | rev      | sri@gmail.com   | design engineer   | 2019-02-23 |  26000 |     50 |
|  6 | venu      | rmngr    | venu@gmail.com  | software engineer | 2018-06-06 |  50000 |     40 |
|  7 | nag       | rmngr    | nag@gmail.com   | junior developer  | 2019-02-24 | 140000 |     60 |
|  8 | bhargav   | rev      | bhar@gmail.com  | junior developer  | 2019-02-14 |  30000 |     40 |
|  9 | pandu     | rev      | pandu@gmail.com | ASE               | 2019-05-25 |  25000 |     90 |
| 10 | bajju     | nela     | bajju@gmail.com | ASE               | 2019-05-27 | 320000 |    100 |
| 11 | adone     | bang     | ad@gmail.com    | AE                | 2019-03-23 |  33000 |     30 |
+----+-----------+----------+-----------------+-------------------+------------+--------+--------+
10 rows in set (0.00 sec)

mysql> select max(salary) from employee where salary<(select max(salary) from employee);
+-------------+
| max(salary) |
+-------------+
|      140000 |
+-------------+
1 row in set (0.00 sec)

mysql> select max(salary) from employee where salary<(select max(salary) from employee);
+-------------+
| max(salary) |
+-------------+
|      140000 |
+-------------+
1 row in set (0.00 sec)

mysql> select firstname,salary from employee where salary=(select max(salary) from employee where salary<(select max(salary) from employee));
+-----------+--------+
| firstname | salary |
+-----------+--------+
| nag       | 140000 |
+-----------+--------+
1 row in set (0.00 sec)

mysql> select * from employee where salary=(select max(salary) from employee where salary<(select max(salary) from employee));
+----+-----------+----------+---------------+------------------+------------+--------+--------+
| id | firstname | lastname | email         | job              | hiredate   | salary | deptno |
+----+-----------+----------+---------------+------------------+------------+--------+--------+
|  7 | nag       | rmngr    | nag@gmail.com | junior developer | 2019-02-24 | 140000 |     60 |
+----+-----------+----------+---------------+------------------+------------+--------+--------+
1 row in set (0.00 sec)

mysql> select * from employee where deptno in(select deptno from employee groupby deptno);
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'deptno)' at line 1
mysql> select deptno from employee GROUP BY deptno;
+--------+
| deptno |
+--------+
|     10 |
|     20 |
|     30 |
|     40 |
|     50 |
|     60 |
|     90 |
|    100 |
+--------+
8 rows in set (0.00 sec)

mysql> select firstname,salary,deptno from employee where salary=(select max(salary) from employee where deptno in(select deptno from employee group by deptno));
+-----------+--------+--------+
| firstname | salary | deptno |
+-----------+--------+--------+
| bajju     | 320000 |    100 |
+-----------+--------+--------+
1 row in set (0.00 sec)

mysql> insert into checking(SELECT * FROM department);
ERROR 1062 (23000): Duplicate entry '10' for key 'PRIMARY'
mysql> select * from checking;
+--------+--------------------+-----------+
| deptno | deptname           | location  |
+--------+--------------------+-----------+
|     10 | software developer | banglore  |
|     20 | trainee developer  | hyderabad |
|     30 | Accounts           | chennai   |
+--------+--------------------+-----------+
3 rows in set (0.00 sec)

mysql> select * from checking;
+--------+--------------------+-----------+
| deptno | deptname           | location  |
+--------+--------------------+-----------+
|     10 | software developer | banglore  |
|     20 | trainee developer  | hyderabad |
|     30 | Accounts           | chennai   |
+--------+--------------------+-----------+
3 rows in set (0.00 sec)

mysql> select * from department;
+--------+--------------------+-----------+
| deptno | deptname           | location  |
+--------+--------------------+-----------+
|     10 | software developer | banglore  |
|     20 | trainee developer  | hyderabad |
|     30 | Accounts           | chennai   |
+--------+--------------------+-----------+
3 rows in set (0.00 sec)

mysql> create table newtable();
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ')' at line 1
mysql> create table newtable;
ERROR 1113 (42000): A table must have at least 1 column
mysql> create table newtable(deptno int,deptname varchar(50),location varchar(50));
Query OK, 0 rows affected (0.58 sec)

mysql> insert into newtable(select * from department);
Query OK, 3 rows affected (0.19 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> select * from newtable;
+--------+--------------------+-----------+
| deptno | deptname           | location  |
+--------+--------------------+-----------+
|     10 | software developer | banglore  |
|     20 | trainee developer  | hyderabad |
|     30 | Accounts           | chennai   |
+--------+--------------------+-----------+
3 rows in set (0.00 sec)