/*
 * DML = Data Manipulation Language
 * Command lines from 'elise-backend-db' folder:
 * psql -h localhost -p 5432 -U postgres -d elise
 * \i data.dml.sql
 * \q
 */
 
-- /* cr�er l'utilisateur admin */
-- INSERT INTO roles (name) values ('ROLE_ADMIN');
-- 
-- /* cr�er des utilisateurs tests */
-- INSERT INTO users (username, password) VALUES ('email@domain.com', '$2a$10$jtjVcOpwmLp4Zqn2vHYLUeTSqnXxrvU3FIzuFI2nt62U1FAAbhq3S');
-- INSERT INTO users (username, password, role_id) VALUES ('clairehalliday73@gmail.com', '$2a$10$jtjVcOpwmLp4Zqn2vHYLUeTSqnXxrvU3FIzuFI2nt62U1FAAbhq3S', (SELECT r.id FROM roles r WHERE r.name = 'ROLE_ADMIN'));

/* cr�er des t�ches � faire */
INSERT INTO tasks (name) VALUES ('Visite a domicile');
INSERT INTO tasks (name) VALUES ('Activites en groupe');
INSERT INTO tasks (name) VALUES ('Appels "Zoom"');

/* cr�er des types des membres */
INSERT INTO type_member (name) VALUES ('Senior');
INSERT INTO type_member (name) VALUES ('Benevole');

/* cr�er des types des membres */
INSERT INTO members (firstname, surname, code_dep, type_id, task_id) VALUES ('Elise','BLANCHE','75','2','1');