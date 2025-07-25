Select v.customer_id,count(*) as count_no_trans
From Visits as v
Left join Transactions as t
on v.visit_id = t.visit_id
where t.transaction_id is null
Group by v.customer_id;