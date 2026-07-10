# Write your MySQL query statement below
select a1.name, a2.bonus as bonus from employee a1 left join bonus a2 on a1.empid=a2.empid where a2.bonus < 1000 or bonus is null;