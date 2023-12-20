CREATE TABLE if not exists users
(
    id   INT PRIMARY KEY unique,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE if not exists cars
(
    id      INT PRIMARY KEY unique,
    brand   VARCHAR(255) NOT NULL,
    model   VARCHAR(255) NOT NULL,
    user_id INT,
    FOREIGN KEY (user_id) REFERENCES users (id)
);

INSERT INTO users (id, name)
VALUES (1, 'John Doe'),
       (2, 'Jane Smith'),
       (3, 'Michael Johnson'),
       (4, 'Emily Davis'),
       (5, 'David Wilson'),
       (6, 'Sarah Brown'),
       (7, 'Robert Taylor'),
       (8, 'Jennifer Anderson'),
       (9, 'William Martinez'),
       (10, 'Jessica Thomas');


INSERT INTO cars (id, brand, model, user_id)
VALUES (1, 'Toyota', 'Camry', 1),
       (2, 'Honda', 'Civic', 2),
       (3, 'Ford', 'Mustang', 3),
       (4, 'Chevrolet', 'Cruze', 4),
       (5, 'BMW', 'X5', 5),
       (6, 'Mercedes-Benz', 'E-Class', 6),
       (7, 'Audi', 'A4', 3),
       (8, 'Volkswagen', 'Golf', 8),
       (9, 'Nissan', 'Altima', 9),
       (10, 'Hyundai', 'Elantra', 10);