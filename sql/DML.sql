INSERT INTO `javase4th_tutorial`.`director` (`name`, `phone`, `address`) VALUES ('James Cameron', '111111', 'Somewher in london');

UPDATE `javase4th_tutorial`.`director` 
SET `phone` = '222222',
    address='none' WHERE (`id` = '2');

ALTER TABLE `javase4th_tutorial`.`director` 
ADD COLUMN `gender` VARCHAR(1) NULL AFTER `address`;

DELETE FROM director
WHERE id = 5;

SELECT * FROM movie,actor,movie_actor
WHERE movie.id = 1
AND movie_actor.movie_id = movie.id
AND movie_actor.actor_id = actor.id;

//Get actor in movie 1
SELECT movie.id,movie.name, actor.id, actor.name FROM movie,actor,movie_actor
WHERE movie.id = 1
AND movie_actor.movie_id = movie.id
AND movie_actor.actor_id = actor.id;

//get all movie where actor id 2 is in.
SELECT movie.* FROM actor,movie_actor,movie
WHERE actor.id = 2
AND movie_actor.actor_id = actor.id
AND movie.id = movie_actor.movie_id;

SELECT * FROM movie
LEFT JOIN movie_actor
ON (movie.id = movie_actor.movie_id); 

SELECT * FROM movie_actor
RIGHT JOIN movie
ON (movie.id = movie_actor.movie_id); 

SELECT movie.id,movie.name, actor.id, actor.name FROM movie
INNER JOIN actor
INNER JOIN movie_actor
WHERE movie.id = 1
AND movie_actor.movie_id = movie.id
AND movie_actor.actor_id = actor.id;

SELECT id,name as movie_name 
From movie

SELECT id,name,TIMESTAMPDIFF(YEAR, birthday, CURDATE()) AS age
FROM javase4th_tutorial.actor;

SELECT * FROM javase4th_tutorial.actor
WHERE gender != 'F';

SELECT CONCAT_WS(':','First name','Second name','Last Name');

SELECT COUNT(*) from movie;

SELECT AVG(TIMESTAMPDIFF(YEAR, birthday, CURDATE())) AS age
FROM javase4th_tutorial.actor;

SELECT * 
FROM javase4th_tutorial.actor
ORDER by birthday;

SELECT * FROM javase4th_tutorial.actor
ORDER by birthday DESC;

SELECT * FROM javase4th_tutorial.actor
ORDER by year(birthday),2 DESC;

SELECT * FROM javase4th_tutorial.actor
LIMIT 4;

SELECT * FROM javase4th_tutorial.actor
LIMIT 2,2;

SELECT count(*),gender FROM javase4th_tutorial.actor
GROUP By Gender;

SELECT movie_id,count(*) FROM javase4th_tutorial.movie_actor
GROUP BY movie_id;