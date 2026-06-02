SELECT e1.name AS Employee,d.name AS DEPARTMENT,e1.salary
FROM Employee e1
JOIN Department d
ON e1.departmentId = d.id
LEFT JOIN Employee e2
ON e1.departmentId = e2.departmentId
AND e2.salary > e1.salary
GROUP BY e1.id,e1.Name,e1.salary,d.Name
HAVING COUNT(DISTINCT e2.salary) < 3;