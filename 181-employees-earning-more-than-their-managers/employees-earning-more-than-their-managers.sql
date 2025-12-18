# Write your MySQL query statement below
select e.name as Employee
From Employee as e
Join Employee as m
on e.managerId=m.id
Where e.salary>m.salary;