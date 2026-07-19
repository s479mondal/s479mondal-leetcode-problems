# Write your MySQL query statement below
select name from salesperson s where not exists(select * from orders as o join company as c on o.com_id=c.com_id where o.sales_id=s.sales_id and c.name='RED');