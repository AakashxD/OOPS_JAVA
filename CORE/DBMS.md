| Category |       Full Form        |    Used For        |         Commands        |

| **DDL**  | Data Definition Language     | Defining structure      | CREATE, ALTER, DROP, TRUNCATE |
| **DML**  | Data Manipulation Language   | Manipulating data       | INSERT, UPDATE, DELETE        |
| **DCL**  | Data Control Language        | Controlling permissions | GRANT, REVOKE                 |
| **TCL**  | Transaction Control Language | Managing transactions   | COMMIT, ROLLBACK, SAVEPOINT   |
| **DQL**  | Data Query Language          | Querying data           | SELECT                        |



# 1️⃣ DDL — Data Definition Language

- Used to define or change the structure of a database (like tables, schemas, or indexes).

Command	Meaning	Example
CREATE	Creates a new database object (table, view, etc.)	CREATE TABLE STUDENT (NAME VARCHAR(30), ROLLNO INT UNIQUE);
ALTER	Modifies the structure of an existing table	ALTER TABLE STUDENT ADD COLUMN EMAIL VARCHAR(50);
DROP	Deletes a table or database permanently	DROP TABLE STUDENT;
TRUNCATE	Deletes all rows from a table but keeps the structure	TRUNCATE TABLE STUDENT;
RENAME	Changes the name of a table	RENAME TABLE STUDENT TO SCHOOL_STUDENT;

🧠 Note:
DDL statements are auto-committed, meaning they cannot be rolled back once executed.

# ✏️ 2️⃣ DML — Data Manipulation Language

Used to manage data inside tables (insert, update, delete).

Command	Meaning	Example
INSERT	Adds new records	INSERT INTO STUDENT (NAME, ROLLNO) VALUES ('Aakash', 79);
UPDATE	Modifies existing records	UPDATE STUDENT SET NAME = 'Aakash Singh' WHERE ROLLNO = 79;
DELETE	Removes specific records	DELETE FROM STUDENT WHERE ROLLNO = 79;

🧠 Note:
DML commands can be rolled back (they are not auto-committed).

#  3️⃣ DCL — Data Control Language

Used to control access to the database.

Command	Meaning	Example
GRANT	Gives privileges to users	GRANT SELECT, INSERT ON STUDENT TO user1;
REVOKE	Removes privileges from users	REVOKE INSERT ON STUDENT FROM user1;

🧠  Note:
Only Database Administrators (DBAs) typically use DCL commands.

#  4️⃣ TCL — Transaction Control Language

Used to manage transactions in the database (especially after DML operations).

Command	Meaning	Example
COMMIT	Saves all changes permanently	COMMIT;
ROLLBACK	Undo changes since last COMMIT	ROLLBACK;
SAVEPOINT	Marks a point to which you can roll back later	SAVEPOINT before_update;
ROLLBACK TO before_update;



🧩 1️⃣ What is Normalization?

Normalization is the process of organizing data in a database to reduce redundancy (duplicate data) and improve data integrity.

Normalization is a process of reducing redundancy by organizing the data into multiple tables. Normalization leads to better usage of disk spaces and makes it easier to maintain the integrity of the database.  

# Denormalization
DeN is the reverse process of normalization as it combines the tables which have been normalized into a single table so that data retrieval becomes faster. JOIN operation allows us to create a denormalized form of the data by reversing the normalization. 

| Normal Form                  | Rule                                                                               | Example                                      |

| **1NF (First Normal Form)**  | Each column holds atomic (single) values — no repeating groups.                    |  {Maths1, Maths2} → ✅ separate rows/columns |
| **2NF (Second Normal Form)** | 1NF + no partial dependency (non-key column depends on part of composite key).     | Splitting composite-key tables               |
| **3NF (Third Normal Form)**  | 2NF + no transitive dependency (non-key column depends on another non-key column). | Remove derived attributes                    |
| **BCNF (Boyce-Codd)**        | Stronger version of 3NF — every determinant must be a candidate key.               | Used in complex relationships                |




Explain different types of Normalization forms in a DBMS.
Following are the major normalization forms in a DBMS:



Considering the above Table-1 as the reference example for understanding different normalization forms.

1NF: It is known as the first normal form and is the simplest type of normalization that you can implement in a database. A table to be in its first normal form should satisfy the following conditions:
Every column must have a single value and should be atomic.
Duplicate columns from the same table should be removed.
Separate tables should be created for each group of related data and each row should be identified with a unique column.

Table-1 converted to 1NF form

2NF: It is known as the second normal form. A table to be in its second normal form should satisfy the following conditions:
The table should be in its 1NF i.e. satisfy all the conditions of 1NF.
Every non-prime attribute of the table should be fully functionally dependent on the primary key i.e. every non-key attribute should be dependent on the primary key in such a way that if any key element is deleted then even the non_key element will be saved in the database.


Breaking Table-1 into 2 different tables to move it to 2NF.

3NF: It is known as the third normal form. A table to be in its third normal form should satisfy the following conditions:
The table should be in its 2NF i.e. satisfy all the conditions of 2NF.
There is no transitive functional dependency of one attribute on any attribute in the same table.



Breaking Table-1 into 3 different tables to move it to 3NF. 

BCNF: BCNF stands for Boyce-Codd Normal Form and is an advanced form of 3NF. It is also referred to as 3.5NF for the same reason. A table to be in its BCNF normal form should satisfy the following conditions:
The table should be in its 3NF i.e. satisfy all the conditions of 3NF.
For every functional dependency of any attribute A on B
(A->B), A should be the super key of the table. It simply implies that A can’t be a non-prime attribute if B is a prime attribute.



# views
- mutliple table joins -> complex query store in the database virtual table acts like a table and joins also( result not store just query is stored)-> for storing the result Result of Materialised views are stored as snapshot in db.


# Transaction 
A transaction in a database is a sequence of one or more SQL operations (like INSERT, UPDATE, DELETE) that are executed as a single unit of work.

Either all operations succeed, or none of them are applied.

Ensures data consistency, reliability, and integrity in databases.

| Property        | Description                                                                                                              |
| --------------- | ------------------------------------------------------------------------------------------------------------------------ |
| **Atomicity**   | All operations in the transaction are executed **as a single unit**. If one fails, the whole transaction **rolls back**. |
| **Consistency** | The database moves from one **valid state** to another valid state after the transaction.                                |
| **Isolation**   | Transactions are **independent**; intermediate states are **not visible** to other transactions.                         |
| **Durability**  | Once a transaction is committed, the changes are **permanent**, even if the system crashes.               


#  Start Transaction
BEGIN TRANSACTION;

UPDATE Accounts SET balance = balance - 1000 WHERE name = 'Alice';
UPDATE Accounts SET balance = balance + 1000 WHERE name = 'Bob';

-- If both succeed
COMMIT;

- If any operation fails
ROLLBACK;
               |


SELECT marks, name
FROM Marks
WHERE marks > (SELECT AVG(marks) FROM Marks);
