# 🧠 Java Swing Quiz Application

A desktop-based **Online Quiz Management System** developed using **Java Swing**, **JDBC**, and **MySQL**.  
This project demonstrates core Java concepts, GUI development, and database connectivity in a real-world academic application.

---

## 📌 Project Overview

The **Java Swing Quiz Application** allows users to attempt a multiple-choice quiz with a timer.  
User scores and total time taken are stored in a MySQL database using JDBC, ensuring persistent storage and real-time interaction.

This project was developed as part of an **Academic Course Project**.

---

## ✨ Features

- 🧠 Multiple-choice quiz system  
- ⏱️ Timer-based quiz attempt  
- 📊 Automatic score calculation  
- 🕒 Total time taken tracking  
- 💾 Persistent storage using MySQL  
- 🖥️ Interactive desktop GUI with Java Swing  

---

## 🛠️ Tech Stack

- **Programming Language:** Java  
- **GUI Framework:** Java Swing  
- **Database:** MySQL  
- **Database Connectivity:** JDBC  
- **IDE:** Apache NetBeans  

---

## 🗃️ Database Design

**Database Name:** `quiz_db`

**Table Name:** `quiz_attendance`

| Column Name   | Data Type   | Description |
|--------------|------------|-------------|
| id           | INT (PK)   | Auto-incremented ID |
| name         | VARCHAR(50) | User name |
| score        | INT        | Quiz score |
| time_taken  | INT        | Total time taken (seconds) |
| attempt_time| TIMESTAMP  | Quiz submission time |

---

## 👤 Author
**Shreyansh Singh**  
GitHub: https://github.com/singh-70-9-shreyansh

---

## 📄 License
This project is licensed under the MIT License.
