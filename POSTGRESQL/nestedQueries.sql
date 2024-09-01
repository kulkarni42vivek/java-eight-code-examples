SELECT *
FROM products
WHERE price >
 (SELECT AVG(price)
 FROM products)


SELECT *
FROM products
WHERE price > (SELECT AVG(price)
 FROM products)

SELECT *
FROM products
WHERE product_id IN (SELECT product_id
 FROM reviews
 WHERE rating > 4)

SELECT *
FROM tableA
WHERE column IN (SELECT column
FROM tableB
WHERE id IN (SELECT id
FROM tableC))


SELECT products.*,
(SELECT AVG(rating)
FROM reviews
WHERE product_id = products.product_id) AS avg_rating
FROM products

SELECT *
FROM products p
WHERE p.rating > (SELECT AVG(rating) FROM products)
