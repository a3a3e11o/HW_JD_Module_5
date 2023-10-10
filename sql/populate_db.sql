INSERT INTO worker (NAME, BIRTHDAY, LEVEL, SALARY)
VALUES
    ('Luke Skywalker', '1990-05-15', 'Trainee', 800),
    ('Darth Vader', '1985-12-20', 'Junior', 1200),
    ('Han Solo', '1980-07-10', 'Middle', 3000),
    ('Rey', '1975-03-25', 'Senior', 6000),
    ('Boba Fett', '1993-09-05', 'Trainee', 900),
    ('Finn', '1987-11-30', 'Junior', 1400),
    ('Leia Organa', '1982-06-18', 'Middle', 3500),
    ('Padme Amidala', '1978-02-12', 'Senior', 7000),
    ('Darth Maul', '1995-04-22', 'Trainee', 950),
    ('Darth Sidious', '1989-08-08', 'Junior', 1300);

INSERT INTO client (NAME)
VALUES
    ('Dell Technologies'),
    ('Accenture'),
    ('TD Synnex'),
    ('IBM'),
    ('HP Enterprise');

INSERT INTO project (CLIENT_ID, START_DATE, FINISH_DATE)
VALUES
    (1, '2023-01-10', '2023-04-20'),
    (2, '2023-02-15', '2023-05-25'),
    (3, '2023-03-20', '2023-06-30'),
    (4, '2023-04-25', '2023-08-05'),
    (5, '2023-05-30', '2023-09-10'),
    (1, '2023-06-05', '2023-09-15'),
    (3, '2023-07-10', '2023-10-20'),
    (2, '2023-08-15', '2023-11-25'),
    (5, '2023-09-20', '2023-12-30'),
    (4, '2023-10-25', '2024-01-05');

INSERT INTO project_worker (PROJECT_ID, WORKER_ID)
VALUES
    (1, 1),
    (1, 2),
    (2, 3),
    (2, 4),
    (2, 5),
    (3, 6),
    (3, 7),
    (4, 8),
    (4, 9),
    (5, 10),
    (6, 1),
    (6, 2),
    (6, 3),
    (7, 4),
    (7, 5),
    (8, 6),
    (8, 7),
    (8, 8),
    (9, 9),
    (9, 10),
    (10, 1),
    (10, 2),
    (10, 3),
    (10, 4),
    (10, 5);
