SELECT
 customer_id,
 (CASE
 WHEN (SELECT SUM(amount)
 FROM orders o
 WHERE o.customer_id = c.customer_id) between 0 and 100
 THEN ‘Level 1’
 WHEN (SELECT SUM(amount)
 FROM orders o
 WHERE o.customer_id = c.customer_id) between 100 and 1000
 THEN ‘Level 2’
 ELSE ‘Level 3’
 END) AS customer_level
FROM customers c


