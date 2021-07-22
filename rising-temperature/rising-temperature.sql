# Write your MySQL query statement below


select curr.id
from Weather curr
WHERE exists (select 1 from Weather prev where curr.recordDate = DATE_ADD(prev.recordDate, INTERVAL 1 DAY) and curr.Temperature  > prev.Temperature)

order by curr.id
