# Write your MySQL query statement below
select name as Customers from customers where id not in (select c.id from Customers as c join orders as o on c.id=o.customerId);