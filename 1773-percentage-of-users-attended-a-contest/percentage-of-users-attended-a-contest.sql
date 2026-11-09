# Write your MySQL query statement below
select contest_id,
 ROUND(
        COUNT(*) * 100.0 / (SELECT COUNT(*) FROM Users),
        2
    ) AS percentage
from Register r
GROUP BY contest_id
ORDER BY percentage DESC, contest_id ASC;