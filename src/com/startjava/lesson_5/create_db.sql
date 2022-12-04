/* Создать базу */
CREATE DATABASE Jaegers;

/* Подключить базу */
\c jaegers;

/* Создать таблицу */
CREATE TABLE Jaegers (
    id           SERIAL PRIMARY KEY,
    model_name   TEXT,
    mark         CHAR(1),
    height       DOUBLE PRECISION,
    weight       DOUBLE PRECISION,
    status       TEXT,
    origin       TEXT,
    launch       INTEGER,
    kaiju_kill   INTEGER
);