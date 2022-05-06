/*
 * DDL = Data Definition Language
 * Command lines from 'elise-backend-db' folder:
 * psql -h localhost -p 5432 -U postgres -d elise
 * \i schema.ddl.sql
 * \q
 */
CREATE TABLE roles (
	id SERIAL PRIMARY KEY,
	name varchar(20) UNIQUE NOT NULL
);

CREATE TABLE users (
	id SERIAL PRIMARY KEY,
	username varchar(255) UNIQUE NOT NULL,
	password varchar(60) NOT NULL,
	role_id INTEGER, -- on ne met pas "NOT NUll" car on peut detenir zero role.
	CONSTRAINT fk_role_id
    	FOREIGN KEY (role_id)
    	REFERENCES roles(id)
);

CREATE TABLE tasks (
	id SERIAL PRIMARY KEY,
	name varchar(255) UNIQUE NOT NULL
);

CREATE TABLE type_member (
	id SERIAL PRIMARY KEY,   
	name varchar(50) UNIQUE NOT NULL
);

CREATE TABLE members (
	id SERIAL PRIMARY KEY,
	firstname varchar(255) NOT NULL,
	surname varchar(255) NOT NULL,
	code_dep varchar(20) NOT NULL,
	type_id INTEGER,	
	task_id INTEGER, 
	CONSTRAINT fk_type_id
    	FOREIGN KEY (type_id)
    	REFERENCES type_member(id),
	CONSTRAINT fk_task_id
    	FOREIGN KEY (task_id)
    	REFERENCES tasks(id)
);