
CREATE TABLE emplooye(
	id SERIAL NOT NULL,
	name VARCHAR(50) NOT NULL,
	birtday DATE,
	email VARCHAR(100)
)

UPDATE emplooye
SET name = 'Ali',
	birtday = '1999-12-13',
	email = 'aliveli@4950.com'
WHERE id = 5

UPDATE emplooye
SET name = 'Kerim',
	birtday = '1999-12-03',
	email = 'Karim@4950.com'
WHERE id = 1

UPDATE emplooye
SET name = 'Sinan',
	birtday = '1972-12-03',
	email = 'Canan@4950.com'
WHERE id = 2

UPDATE emplooye
SET name = 'Salih',
	birtday = '1999-12-03',
	email = 'Ucar@4950.com'
WHERE id = 3

UPDATE emplooye
SET name = 'Mahsun',
	birtday = '1999-12-03',
	email = 'Karaca@4950.com'
WHERE id = 4

DELETE FROM emplooye
WHERE id = 3
