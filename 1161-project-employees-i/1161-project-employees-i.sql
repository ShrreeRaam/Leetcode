Select p.project_id,
round (Avg(e.experience_years),2) as average_years
from project as p
left join Employee as e
on p.employee_id = e.employee_id 
Group by project_id;
