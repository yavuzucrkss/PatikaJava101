SELECT * FROM country WHERE  country LIKE 'A%a'

SELECT * FROM country WHERE LENGTH(country) >= 6 AND country LIKE '%n'

SELECT * FROM film WHERE title ILIKE '%t%' LIMIT 4;

SELECT * FROM film WHERE title LIKE 'C%' and length > 90 and rental_rate = 2.99