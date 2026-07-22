# Write your MySQL query statement below
select e.employee_id from Employees e left join salaries s on e.employee_id=s.employee_id where s.employee_id is null union
SELECT s.employee_id
FROM Salaries s
LEFT JOIN Employees e
ON s.employee_id = e.employee_id
WHERE e.employee_id IS NULL order by employee_id