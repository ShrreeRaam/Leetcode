SELECT *
FROM Patients
WHERE conditions REGEXP '(^| )DIAB1[0-9A-Za-z]*';
