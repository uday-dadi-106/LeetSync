select d.name as "Department",e.name as "Employee",e.Salary
from Employee e inner join Department d
on e.departmentId =d.id
where e.salary =(
    select max(e2.salary)
    from Employee e2
    where e2.departmentId=e.departmentId
);


