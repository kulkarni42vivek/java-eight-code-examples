--DDL — Data Definition Language
--DML — Data Manipulation Language
--DQL — Data Query Language
--DCL — Data Control Language
--TCL — Transaction Control Language

--Main DDL Commands:
--
--CREATE — Make a new database, table, and other objects
--ALTER — Change existing database, table, and other objects
--DROP — Delete databases, tables, and other objects
--TRUNCATE — Delete all data inside the table
--COMMENT — Add comments to objects
--RENAME — Rename objects


--CREATE TABLE students
--Make a table called ‘Students’
--
--ALTER Command The ALTER command is used to change existing database tables . It says database to change tables or objects.
--ALTER TABLE students ADD column hobbies
--Add column ‘hobbies’ to the existing ‘students’ table
--
--DROP Command The DROP command deletes databases, and tables other objects fully. All data inside was also removed.
--Example:
--DROP TABLE students
--
--TRUNCATE/COMMENT/RENAM Command is also there. They work for special tasks like removing all data from a table or renaming objects.
--DDL commands are useful for defining and changing the structure of the database. It creates a “skeleton”. DML commands are then used to put “meat” on this skeleton by inserting, updating, and deleting actual data.
--Constraints in DDL
--Constraints are rules set on data columns while creating tables. This ensures quality data goes inside database tables. Some examples:
--
--
--NOT NULL Constraint — Column cannot accept NULL values. Ensures mandatory data.
--UNIQUE Constraint — Column data must be unique. No duplicates.
--PRIMARY KEY — The column uniquely identifies each row. Important constraint.
--FOREIGN KEY — Reference to the primary key from another table. Connects tables.
--CHECK — Values in a column must pass some condition.
--
--
CREATE TABLE students ( id INT PRIMARY KEY,
name VARCHAR(50) NOT NULL, age INT CHECK (age > 20), course_id INT FOREIGN KEY REFERENCES courses(id) );