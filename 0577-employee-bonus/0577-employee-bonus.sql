SELECT e.name,b.bonus
FROM Employee as e
LEFT join Bonus as b
ON e.empId = b.empId
Where b.bonus < 1000 or b.bonus is null