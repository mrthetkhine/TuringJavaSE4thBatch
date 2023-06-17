CREATE SCHEMA `javase4th_tutorial` ;

CREATE TABLE `javase4th_tutorial`.`movie` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NULL,
  `year` INT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `javase4th_tutorial`.`actor` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NULL,
  `gender` VARCHAR(1) NULL,
  `birthday` DATETIME NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `director` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `movie_director` (
  `movie_id` bigint NOT NULL,
  `director_id` bigint NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `movie_actor` (
  `movie_id` bigint NOT NULL,
  `actor_id` bigint NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
