use presly;
DROP TABLE IF EXISTS contactsbank;
CREATE TABLE contactsbank
(
	id serial PRIMARY KEY,
	first_name VARCHAR
	(250) NOT NULL,
	last_name VARCHAR
	(250) NOT NULL,
	email VARCHAR
	(250) DEFAULT NULL
);

INSERT INTO 
	contactsbank
	(first_name, last_name, email)
VALUES
	('Catherine phiri', 'Nurse', 'cathy.phiri@lsk.co.uk'),
	('Marcus Gavey', 'Teacher', 'mucus.gavey@jka.zm'),
	('Nikolas Marvin ', 'Engineer', 'nikolas.marvina@gmail.ru'),
	('MySQL Mwemba', 'Technologist', 'marvin.mwemba@pba.zm'),
	('Elvis Presly', 'Scientist', 'elvis.presly@prg.cz');
SELECT *
from contactsbank