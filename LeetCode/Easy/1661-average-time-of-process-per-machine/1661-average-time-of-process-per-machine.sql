SELECT
    machine_id,
    ROUND(AVG(pt), 3) AS processing_time
FROM
(
    SELECT
        a1.machine_id,
        (a2.timestamp - a1.timestamp) AS pt
    FROM Activity a1
    JOIN Activity a2
        ON a1.machine_id = a2.machine_id
    WHERE 
        a1.activity_type = 'start'
        AND a2.activity_type = 'end'
        AND a1.process_id = a2.process_id
) t
GROUP BY machine_id;