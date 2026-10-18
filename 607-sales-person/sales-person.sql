# Write your MySQL query statement below
select s.Name
from SalesPerson s
where s.sales_id not in ( select o.sales_id from Orders o join Company c ON o.com_id = c.com_id where c.name = 'RED');