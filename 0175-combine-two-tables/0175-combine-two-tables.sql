Select p.firstName,p.lastName,a.city,a.state
from person as p
left join Address as a
on p.personId = a.personId;