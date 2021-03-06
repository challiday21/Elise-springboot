/*
 * DML = Data Manipulation Language
 * Command lines from 'elise-backend-db' folder:
 * psql -h localhost -p 5432 -U postgres -d elise
 * \i data.dml.sql
 * \q
 */
 
/* cr?er l'utilisateur admin */
INSERT INTO roles (name) values ('ROLE_ADMIN');

/* cr?er des utilisateurs tests */
/*INSERT INTO users (username, password, role_id) VALUES ('clairehalliday@gmail.com', '$2a$12$e9uXaGxdqJvoymb3UyiWK.qbDbRms02bAPWb2C4EXh7mMHI87EvyS', (SELECT r.id FROM roles r WHERE r.name = 'ROLE_ADMIN'));
INSERT INTO users (username, password) VALUES ('email@domain.com', '$2a$12$BAZcFtS4HmPwZ7Im4agfFeKfOQQhmwjY2JkQkPcZ3YuQPkHC0KuGC');
INSERT INTO users (username, password, role_id) VALUES ('clairehalliday73@gmail.com', '$2a$12$0ph.AL462NV3n4kDx8IZ8uuLaAjI7iMl4CD1POLemhj.neF1ebpvW', (SELECT r.id FROM roles r WHERE r.name = 'ROLE_ADMIN'));*/
INSERT INTO users (username, password, role_id) VALUES ('admin@domain.com', '$2a$12$e9uXaGxdqJvoymb3UyiWK.qbDbRms02bAPWb2C4EXh7mMHI87EvyS', (SELECT r.id FROM roles r WHERE r.name = 'ROLE_ADMIN'));

/* cr?er des t?ches ? faire */
INSERT INTO tasks (name) VALUES ('Visite a domicile');
INSERT INTO tasks (name) VALUES ('Activites en groupe');
INSERT INTO tasks (name) VALUES ('Appels "Zoom"');

/* cr?er des types des membres */
INSERT INTO member_types (name) VALUES ('Senior');
INSERT INTO member_types (name) VALUES ('Benevole');

/* cr?er des membres */
INSERT INTO members (firstname, surname, code_dep, member_type_id, task_id) VALUES ('Elise','BLANCHE','75','2','1');
INSERT INTO members (firstname, surname, code_dep, member_type_id, task_id) VALUES ('Jean','ROUGE','93','2','2');
INSERT INTO members (firstname, surname, code_dep, member_type_id, task_id) VALUES ('Marie','JAUNE','92','2','3');
INSERT INTO members (firstname, surname, code_dep, member_type_id, task_id) VALUES ('Alice','VERTE','75','1','1');
INSERT INTO members (firstname, surname, code_dep, member_type_id, task_id) VALUES ('Pierre','BLEU','92','1','2');
INSERT INTO members (firstname, surname, code_dep, member_type_id, task_id) VALUES ('Michel','LILAC','92','2','3');
INSERT INTO members (firstname, surname, code_dep, member_type_id, task_id) VALUES ('Greta','ROSE','75','2','1');
INSERT INTO members (firstname, surname, code_dep, member_type_id, task_id) VALUES ('Isabelle','VIOLET','93','1','2');
INSERT INTO members (firstname, surname, code_dep, member_type_id, task_id) VALUES ('Robert','BLEU-VERT','75','2','3');
INSERT INTO members (firstname, surname, code_dep, member_type_id, task_id) VALUES ('Steven','NOIR','93','2','1');