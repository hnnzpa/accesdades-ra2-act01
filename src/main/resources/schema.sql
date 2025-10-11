DROP TABLE IF EXISTS students;

CREATE TABLE students (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(100) NOT NULL,
    cognom VARCHAR(100),
    age INT NOT NULL CHECK (age > 0),
    cicle VARCHAR(150) NOT NULL,
    any_academic INT NOT NULL CHECK (any_academic >= 0)
);