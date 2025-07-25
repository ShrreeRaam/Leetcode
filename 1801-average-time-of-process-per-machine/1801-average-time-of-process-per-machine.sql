Select machine_id,
Round(avg(end_time - start_time),3)as processing_time
from (
select
machine_id,
process_id,
 Min(timestamp) as start_time,
 Max(timestamp) as end_time
 from activity 
 group by machine_id,process_id
) As temp
group by machine_id;