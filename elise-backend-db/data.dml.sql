/*
 * DML = Data Manipulation Language
 * Command lines from 'elise-backend-db' folder:
 * psql -h localhost -p 5432 -U postgres -d elise
 * \i data.dml.sql
 * \q
 */
 
/* cr�er l'utilisateur admin */
INSERT INTO roles (name) values ('ROLE_ADMIN');

/* cr�er des utilisateurs tests */
INSERT INTO users (username, password) VALUES ('email@domain.com', '$2a$12$JlHeu4p9.kyXbBE93wXjy.arqsdfXyk93UT/1xwTHxJwqlUKflBha');
INSERT INTO users (username, password, role_id) VALUES ('clairehalliday73@gmail.com', '$2a$12$JlHeu4p9.kyXbBE93wXjy.arqsdfXyk93UT/1xwTHxJwqlUKflBha', (SELECT r.id FROM roles r WHERE r.name = 'ROLE_ADMIN'));
INSERT INTO users (username, password, role_id) VALUES ('clairehalliday@gmail.com', '$2a$12$JlHeu4p9.kyXbBE93wXjy.arqsdfXyk93UT/1xwTHxJwqlUKflBha', (SELECT r.id FROM roles r WHERE r.name = 'ROLE_ADMIN'));

/* cr�er des t�ches � faire */
INSERT INTO tasks (name) VALUES ('Visite a domicile');
INSERT INTO tasks (name) VALUES ('Activites en groupe');
INSERT INTO tasks (name) VALUES ('Appels "Zoom"');

/* cr�er des types des membres */
INSERT INTO member_types (name) VALUES ('Senior');
INSERT INTO member_types (name) VALUES ('Benevole');

/* cr�er des types des membres */
INSERT INTO members (firstname, surname, code_dep, member_type_id, task_id) VALUES ('Elise','BLANCHE','75','2','1');