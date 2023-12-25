CREATE TABLE company
(
    id           INT PRIMARY KEY,
    company_name VARCHAR(255)
);

CREATE TABLE employee
(
    id       INT PRIMARY KEY,
    username VARCHAR(255),
    FOREIGN KEY (id) REFERENCES company (id)
);

CREATE TABLE car
(
    id    INT PRIMARY KEY,
    brand VARCHAR(255),
    model VARCHAR(255),
    FOREIGN KEY (id) REFERENCES company (id)
);
