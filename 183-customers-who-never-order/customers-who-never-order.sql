# Write your MySQL query statement below
select name AS Customers
From Customers as c
Left join Orders as o 
on c.id=o.customerId
Where customerId is null; 