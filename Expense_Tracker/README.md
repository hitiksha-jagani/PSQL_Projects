### Expense Tracker ###

## Overview ##

This project is a simple expense tracking system created to revise and strengthen SQL concepts while practicing Java and JDBC database connectivity. The goal is to insert, view, sort, filter, and delete expense records using SQL queries executed from a Java application.

## Database Structure ##

This project uses one PostgreSQL table named expenses, containing the following fields:

| Column | Type                 | Description                            |
| ------ | -------------------- | -------------------------------------- |
| id     | SERIAL (Primary Key) | Unique identifier for each expense     |
| amount | NUMERIC              | Money spent for that expense           |
| date   | DATE                 | The date on which the expense occurred |

This simple structure allows storage and retrieval of expense data while keeping the learning process focused and beginner-friendly.

## What I Learned ##

Through this project, I revised and practiced:

🔹 SQL Concepts

* CREATE TABLE
* INSERT, UPDATE, DELETE
* SELECT queries
* Sorting + filtering
* Date-based queries

🔹 Java + JDBC

* Establishing database connection
* Executing SQL from Java code
* Handling results using ResultSet
* Managing CRUD operations
* Linking application logic with database logic

## Tech Stack ##

* Java
* PostgreSQL
* JDBC
* psql CLI tool

## Screenshots ##

1. Insert new expense
   
<img width="1844" height="1046" alt="Screenshot from 2025-12-19 10-25-22" src="https://github.com/user-attachments/assets/54cd2431-4fc7-4f5f-bd39-9024c4263826" />
  
2. Fetch all expenses

<img width="1844" height="1046" alt="Screenshot from 2025-12-19 10-32-19" src="https://github.com/user-attachments/assets/d5f21351-1d63-49a2-a97f-9c5a14abf40d" />

3. Fetch expense for a particular date

<img width="1844" height="1046" alt="Fetch_For_Date" src="https://github.com/user-attachments/assets/9fd26d80-5d62-412e-8b25-42a9184b2453" />

4. Fetch recently added expenses

<img width="1844" height="1046" alt="Fetch_Recently" src="https://github.com/user-attachments/assets/b2498a93-7366-487a-8d9f-baca60d8df6f" />

5. Fetch the lowest expense

<img width="1862" height="1052" alt="Screenshot from 2025-12-18 17-56-37" src="https://github.com/user-attachments/assets/3c0ad7e1-d0a9-4ca3-aa95-8d6829d84a7f" />

6. Fetch the highest expense

<img width="1844" height="1046" alt="Fetch_Highest" src="https://github.com/user-attachments/assets/97aafe03-06a0-4aee-9793-d397675cce13" />

7. Sort expenses by date

<img width="1844" height="1046" alt="Short_By_Date" src="https://github.com/user-attachments/assets/6dbdf4ee-00ac-47d2-9f57-76754b14e976" />

8. Sort expenses by amount

<img width="1844" height="1046" alt="Short_By_Amount" src="https://github.com/user-attachments/assets/fdf75f1e-9bab-4d6c-abe3-bf3c4270bf1c" />

9. Count total expenses

<img width="1844" height="1046" alt="Total" src="https://github.com/user-attachments/assets/6ecf97d8-851a-4a10-9624-17d79c6e0658" />

10. Delete expense by date

<img width="1844" height="1046" alt="Delete_By_Date" src="https://github.com/user-attachments/assets/5153d3f1-22d6-4e67-b7f1-9540709d89c1" />

11. Delete all expenses

<img width="1844" height="1046" alt="Delete_All" src="https://github.com/user-attachments/assets/ffc35843-ca70-49a5-a4f0-31bd05d36422" />

12. Exit

<img width="1844" height="1046" alt="Exit" src="https://github.com/user-attachments/assets/a7facc2a-82b0-41a0-9df2-3e90415ee1f2" />
