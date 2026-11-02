select
    event_day day,
    emp_id,
    sum(out_time -in_time) as total_time
from Employees
group by 
    emp_id,day;    