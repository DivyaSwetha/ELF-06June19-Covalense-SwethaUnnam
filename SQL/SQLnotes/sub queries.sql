select * from employee where job='software engineer' and deptno=30;
select * from employee where salary=(select max(salary) from employee);
select * from employee where salary<(select max(salary) from employee);
select * from employee where salary=(select min(salary) from employee);
select * from employee where salary>(select min(salary) from employee);
select max(salary) from employee where salary<(select max(salary) from employee);
select max(salary) from employee where salary<(select max(salary) from employee);
select firstname,salary from employee where salary=(select max(salary) from employee where salary<(select max(salary) from employee));
select * from employee where salary=(select max(salary) from employee where salary<(select max(salary) from employee));
select * from employee where deptno in(select deptno from employee groupby deptno);
select deptno from employee GROUP BY deptno;
select * from employee where deptno in(select deptno from employee GROUP BY deptno);
select * from employee where deptno in(select deptno from employee GROUP BY salary);
select firstname,salary,deptno from employee where salary=(select max(salary) from employee where deptno in(select deptno from employee group by deptno));
select * from department;
insert into checking(SELECT * FROM department);
select * from checking;


desc check;


