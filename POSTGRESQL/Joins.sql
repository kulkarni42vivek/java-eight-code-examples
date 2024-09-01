SELECT users.name, orders.order_id
FROM users
INNER JOIN orders
ON users.user_id = orders.user_id;


SELECT users.name, orders.order_id
FROM users
RIGHT JOIN orders
ON users.user_id = orders.user_id;

SELECT u1.name AS user1, u2.name AS user2, u1.city
FROM users u1, users u2
WHERE u1.city = u2.city
AND u1.name <> u2.name;


SELECT
 users.name AS user,
 SUM(order_details.qty * products.price) AS total_spend
FROM users
INNER JOIN orders
 ON users.user_id = orders.user_id
INNER JOIN order_details
 ON order_details.order_id = orders.order_id
INNER JOIN products
 ON order_details.product_id = products.product_id
GROUP BY users.user_id
ORDER BY total_spend DESC;

