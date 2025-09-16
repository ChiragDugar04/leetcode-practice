SELECT
    e.name AS Employee
FROM Employee AS e
JOIN Employee AS o
ON e.managerId=o.id
WHERE e.salary>o.salary