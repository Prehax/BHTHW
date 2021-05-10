CREATE PROCEDURE `totalSalaryOfDept` (
	in deptName varchar(10)
)
BEGIN
	select sum(salary) as totalSalary
	from employee as e
	join department as d
	on e.deptid = d.deptid
	where d.name = deptName;
END
