SELECT emp.Name Employee
FROM Employee emp
INNER JOIN Employee mgr
ON emp.managerId = mgr.id
WHERE emp.salary > mgr.salary