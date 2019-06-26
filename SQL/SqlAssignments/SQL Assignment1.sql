mysql> use employee;
Database changed
mysql> show tables;
+--------------------+
| Tables_in_employee |
+--------------------+
| employees          |
+--------------------+
1 row in set (0.23 sec)


mysql> select * from employees;
+------+-----------+----------+------+--------+-----------------------------+
| id   | firstname | lastname | dept | salary | jobtype                     |
+------+-----------+----------+------+--------+-----------------------------+
|    1 | Ram       | manch    |   20 |  30000 | software engineer           |
|    2 | shaam     | amen     |   20 |  25000 | software engineer           |
|    3 | dham      | iam      |   30 |  23000 | assistant software engineer |
|    5 | ham       | baama    |   40 |  24000 | Business Analyst            |
|    4 | alok      | jam      |   50 |  21000 | senior software engineer    |
+------+-----------+----------+------+--------+-----------------------------+
5 rows in set (0.90 sec)

mysql> select * from employees where dept=20;
+------+-----------+----------+------+--------+-------------------+
| id   | firstname | lastname | dept | salary | jobtype           |
+------+-----------+----------+------+--------+-------------------+
|    1 | Ram       | manch    |   20 |  30000 | software engineer |
|    2 | shaam     | amen     |   20 |  25000 | software engineer |
+------+-----------+----------+------+--------+-------------------+
2 rows in set (0.07 sec)

mysql> update employees set salary=2300 where id=4;
Query OK, 1 row affected (0.89 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from employees;
+------+-----------+----------+------+--------+-----------------------------+
| id   | firstname | lastname | dept | salary | jobtype                     |
+------+-----------+----------+------+--------+-----------------------------+
|    1 | Ram       | manch    |   20 |  30000 | software engineer           |
|    2 | shaam     | amen     |   20 |  25000 | software engineer           |
|    3 | dham      | iam      |   30 |  23000 | assistant software engineer |
|    5 | ham       | baama    |   40 |  24000 | Business Analyst            |
|    4 | alok      | jam      |   50 |   2300 | senior software engineer    |
+------+-----------+----------+------+--------+-----------------------------+
5 rows in set (0.00 sec)

mysql> select * from employees where salary>2500;
+------+-----------+----------+------+--------+-----------------------------+
| id   | firstname | lastname | dept | salary | jobtype                     |
+------+-----------+----------+------+--------+-----------------------------+
|    1 | Ram       | manch    |   20 |  30000 | software engineer           |
|    2 | shaam     | amen     |   20 |  25000 | software engineer           |
|    3 | dham      | iam      |   30 |  23000 | assistant software engineer |
|    5 | ham       | baama    |   40 |  24000 | Business Analyst            |
+------+-----------+----------+------+--------+-----------------------------+
4 rows in set (0.00 sec)

mysql> select * from employees where jobtype='software engineer';
+------+-----------+----------+------+--------+-------------------+
| id   | firstname | lastname | dept | salary | jobtype           |
+------+-----------+----------+------+--------+-------------------+
|    1 | Ram       | manch    |   20 |  30000 | software engineer |
|    2 | shaam     | amen     |   20 |  25000 | software engineer |
+------+-----------+----------+------+--------+-------------------+
2 rows in set (0.02 sec)

mysql> select * from employees where dept in(10,20,40);
+------+-----------+----------+------+--------+-------------------+
| id   | firstname | lastname | dept | salary | jobtype           |
+------+-----------+----------+------+--------+-------------------+
|    1 | Ram       | manch    |   20 |  30000 | software engineer |
|    2 | shaam     | amen     |   20 |  25000 | software engineer |
|    5 | ham       | baama    |   40 |  24000 | Business Analyst  |
+------+-----------+----------+------+--------+-------------------+
3 rows in set (0.07 sec)


mysql> select * from employees where firstname like 's%';
+------+-----------+----------+------+--------+-------------------+
| id   | firstname | lastname | dept | salary | jobtype           |
+------+-----------+----------+------+--------+-------------------+
|    2 | shaam     | amen     |   20 |  25000 | software engineer |
+------+-----------+----------+------+--------+-------------------+
1 row in set (0.07 sec)



mysql> select * from employees where firstname like '_l%';
+------+-----------+----------+------+--------+--------------------------+
| id   | firstname | lastname | dept | salary | jobtype                  |
+------+-----------+----------+------+--------+--------------------------+
|    4 | alok      | jam      |   50 |   2300 | senior software engineer |
+------+-----------+----------+------+--------+--------------------------+
1 row in set (0.00 sec)



mysql> select * from employees where lastname like '%e%';
+------+-----------+----------+------+--------+-------------------+
| id   | firstname | lastname | dept | salary | jobtype           |
+------+-----------+----------+------+--------+-------------------+
|    2 | shaam     | amen     |   20 |  25000 | software engineer |
+------+-----------+----------+------+--------+-------------------+
1 row in set (0.00 sec)



mysql> select * from employees where lastname like '%e_';
+------+-----------+----------+------+--------+-------------------+
| id   | firstname | lastname | dept | salary | jobtype           |
+------+-----------+----------+------+--------+-------------------+
|    2 | shaam     | amen     |   20 |  25000 | software engineer |
+------+-----------+----------+------+--------+-------------------+
1 row in set (0.00 sec)

mysql> select * from employees where firstname like '%aa%';
+------+-----------+----------+------+--------+-------------------+
| id   | firstname | lastname | dept | salary | jobtype           |
+------+-----------+----------+------+--------+-------------------+
|    2 | shaam     | amen     |   20 |  25000 | software engineer |
+------+-----------+----------+------+--------+-------------------+
1 row in set (0.00 sec)

mysql> select * from employees where firstname like '_____';
+------+-----------+----------+------+--------+-------------------+
| id   | firstname | lastname | dept | salary | jobtype           |
+------+-----------+----------+------+--------+-------------------+
|    2 | shaam     | amen     |   20 |  25000 | software engineer |
+------+-----------+----------+------+--------+-------------------+
1 row in set (0.00 sec)

mysql> select * from employees where salary between 20000 and 30000;
+------+-----------+----------+------+--------+-----------------------------+
| id   | firstname | lastname | dept | salary | jobtype                     |
+------+-----------+----------+------+--------+-----------------------------+
|    1 | Ram       | manch    |   20 |  30000 | software engineer           |
|    2 | shaam     | amen     |   20 |  25000 | software engineer           |
|    3 | dham      | iam      |   30 |  23000 | assistant software engineer |
|    5 | ham       | baama    |   40 |  24000 | Business Analyst            |
+------+-----------+----------+------+--------+-----------------------------+
4 rows in set (0.07 sec)