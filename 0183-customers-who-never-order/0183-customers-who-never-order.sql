Select c.name as Customers 
from Customers as c
left join Orders as o
on c.id = o.customerid
where o.id is null;
