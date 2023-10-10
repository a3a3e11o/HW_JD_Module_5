CREATE TABLE worker (
    ID serial PRIMARY KEY,
    NAME varchar(1000) NOT NULL CHECK (LENGTH(NAME) >= 2 AND LENGTH(NAME) <= 1000),
    BIRTHDAY date CHECK (EXTRACT(YEAR FROM BIRTHDAY) > 1900),
    LEVEL varchar(20) NOT NULL CHECK (LEVEL IN ('Trainee', 'Junior', 'Middle', 'Senior')),
    SALARY integer CHECK (SALARY >= 100 AND SALARY <= 100000)
);

CREATE TABLE client (
    ID serial PRIMARY KEY,
    NAME varchar(1000) NOT NULL CHECK (LENGTH(NAME) >= 2 AND LENGTH(NAME) <= 1000)
);

CREATE TABLE project (
    ID serial PRIMARY KEY,
    CLIENT_ID integer REFERENCES client(ID),
    START_DATE date,
    FINISH_DATE date
);

CREATE TABLE project_worker (
    PROJECT_ID integer REFERENCES project(ID),
    WORKER_ID integer REFERENCES worker(ID),
    PRIMARY KEY (PROJECT_ID, WORKER_ID)
);