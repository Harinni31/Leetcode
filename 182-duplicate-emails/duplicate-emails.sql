# Write your MySQL query statement below
select email As Email
From Person 
Group by email
Having Count(email)>1
