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
5 rows in set (0.00 sec)

mysql> select * from employee;
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
| 10 | bajju     | nela     | bajju@gmail.com | ASE               | 2019-05-27 | 320000 |    100 |
| 11 | adone     | bang     | ad@gmail.com    | AE                | 2019-03-23 |  33000 |     30 |
+----+-----------+----------+-----------------+-------------------+------------+--------+--------+
11 rows in set (0.00 sec)

mysql> select * from employee where job='software engineer' and deptno=30;
+----+-----------+----------+---------------+-------------------+------------+--------+--------+
| id | firstname | lastname | email         | job               | hiredate   | salary | deptno |
+----+-----------+----------+---------------+-------------------+------------+--------+--------+
|  3 | hari      | par      | par@gmail.com | software engineer | 2019-02-21 |   2000 |     30 |
+----+-----------+----------+---------------+-------------------+------------+--------+--------+
1 row in set (0.00 sec)

mysql> SELECT * from employee where job='software engineer'and deptno=40 and salary>5000;
+----+-----------+----------+----------------+-------------------+------------+--------+--------+
| id | firstname | lastname | email          | job               | hiredate   | salary | deptno |
+----+-----------+----------+----------------+-------------------+------------+--------+--------+
|  6 | venu      | rmngr    | venu@gmail.com | software engineer | 2018-06-06 |  50000 |     40 |
+----+-----------+----------+----------------+-------------------+------------+--------+--------+
1 row in set (0.00 sec)

mysql> SELECT * from employee where deptno not in (10,20);
+----+-----------+----------+-----------------+-------------------+------------+--------+--------+
| id | firstname | lastname | email           | job               | hiredate   | salary | deptno |
+----+-----------+----------+-----------------+-------------------+------------+--------+--------+
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
9 rows in set (0.00 sec)

mysql> SELECT * from employee where job!='software engineer' and deptno not in(10,20) and salary BETWEEN 1000 AND 3000;
Empty set (0.00 sec)

mysql> select * from employee where salary not BETWEEN 10000 AND 20000 and deptno not in(10,20,30) and job!='salesmen';
+----+-----------+----------+-----------------+-------------------+------------+--------+--------+
| id | firstname | lastname | email           | job               | hiredate   | salary | deptno |
+----+-----------+----------+-----------------+-------------------+------------+--------+--------+
|  4 | dev       | rev      | dev@gmail.com   | support engineer  | 2015-08-24 |  60000 |     40 |
|  5 | sri       | rev      | sri@gmail.com   | design engineer   | 2019-02-23 |  26000 |     50 |
|  6 | venu      | rmngr    | venu@gmail.com  | software engineer | 2018-06-06 |  50000 |     40 |
|  7 | nag       | rmngr    | nag@gmail.com   | junior developer  | 2019-02-24 | 140000 |     60 |
|  8 | bhargav   | rev      | bhar@gmail.com  | junior developer  | 2019-02-14 |  30000 |     40 |
|  9 | pandu     | rev      | pandu@gmail.com | ASE               | 2019-05-25 |  25000 |     90 |
| 10 | bajju     | nela     | bajju@gmail.com | ASE               | 2019-05-27 | 320000 |    100 |
+----+-----------+----------+-----------------+-------------------+------------+--------+--------+
7 rows in set (0.00 sec)
mysql>  select * from employee order by salary DESC;
+----+-----------+----------+-----------------+-------------------+------------+--------+--------+
| id | firstname | lastname | email           | job               | hiredate   | salary | deptno |
+----+-----------+----------+-----------------+-------------------+------------+--------+--------+
| 10 | bajju     | nela     | bajju@gmail.com | ASE               | 2019-05-27 | 320000 |    100 |
|  7 | nag       | rmngr    | nag@gmail.com   | junior developer  | 2019-02-24 | 140000 |     60 |
|  4 | dev       | rev      | dev@gmail.com   | support engineer  | 2015-08-24 |  60000 |     40 |
|  6 | venu      | rmngr    | venu@gmail.com  | software engineer | 2018-06-06 |  50000 |     40 |
|  1 | sam       | sk       | sm@gmail.com    | software engineer | 0000-00-00 |  34000 |     10 |
| 11 | adone     | bang     | ad@gmail.com    | AE                | 2019-03-23 |  33000 |     30 |
|  8 | bhargav   | rev      | bhar@gmail.com  | junior developer  | 2019-02-14 |  30000 |     40 |
|  5 | sri       | rev      | sri@gmail.com   | design engineer   | 2019-02-23 |  26000 |     50 |
|  9 | pandu     | rev      | pandu@gmail.com | ASE               | 2019-05-25 |  25000 |     90 |
|  2 | ram       | raghu    | ram@gmail.com   | mining engineer   | 2019-02-21 |  20000 |     20 |
|  3 | hari      | par      | par@gmail.com   | software engineer | 2019-02-21 |   2000 |     30 |
+----+-----------+----------+-----------------+-------------------+------------+--------+--------+
11 rows in set (0.00 sec)
mysql> select max(salary) as maximum, min(salary) as minimum, salary as Totalsalary from employee;
+---------+---------+-------------+
| maximum | minimum | Totalsalary |
+---------+---------+-------------+
|  320000 |    2000 |       34000 |
+---------+---------+-------------+
1 row in set (0.00 sec)
mysql> select count(job) as sofwareengineers from employee where job='software engineer' and deptno=10;
+------------------+
| sofwareengineers |
+------------------+
|                1 |
+------------------+
1 row in set (0.00 sec)

-->Highest and lowest salary earned by software engineer
mysql> select max(salary) as Highest, min(salary) as Lowest from employee where job='software engineer';
+---------+--------+
| Highest | Lowest |
+---------+--------+
|   50000 |   2000 |
+---------+--------+
1 row in set (0.00 sec)

mysql> select deptno,sum(salary) as salary from employee group by deptno;
+--------+--------+
| deptno | salary |
+--------+--------+
|     10 |  34000 |
|     20 |  20000 |
|     30 |  35000 |
|     40 | 140000 |
|     50 |  26000 |
|     60 | 140000 |
|     90 |  25000 |
|    100 | 320000 |
+--------+--------+
8 rows in set (0.00 sec)
