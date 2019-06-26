insert into employee values(1,'sam','shaik','sam@gmail.com','software engineer','2019-06-24',34000,10);
select * from employee;
select * from Employee ORDER BY salary DESC; 
select COUNT(*) from employee GROUP BY deptno;
select COUNT(*) from employee where deptno=60 GROUP BY deptno;
select * from employee where job='software engineer' GROUP BY deptno;
select max(salary) from employee GROUP 	BY DEPTNO;




