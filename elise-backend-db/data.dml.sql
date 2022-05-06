/*
 * DML = Data Manipulation Language
 * Command lines from 'elise-backend-db' folder:
 * psql -h localhost -p 5432 -U postgres -d elise
 * \i data.dml.sql
 * \q
 */
INSERT INTO roles (name) values ('ROLE_ADMIN');
INSERT INTO users (username, password) VALUES ('email@domain.com', '$2a$10$jtjVcOpwmLp4Zqn2vHYLUeTSqnXxrvU3FIzuFI2nt62U1FAAbhq3S');
INSERT INTO users (username, password, role_id) VALUES ('clairehalliday73@gmail.com', 'ABrandNewStart2022!', (SELECT r.id FROM roles r WHERE r.name = 'ROLE_ADMIN'));