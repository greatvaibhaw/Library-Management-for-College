# 🎓 Library Management System for College

![Java](https://img.shields.io/badge/Built%20With-Java-brightgreen?logo=java)
![Platform](https://img.shields.io/badge/Platform-Cross--Platform-lightgrey)
![License](https://img.shields.io/github/license/greatvaibhaw/Library-Management-for-College)

A desktop-based Java application designed to help college libraries manage their daily operations—depositing, issuing, returning books, and tracking student history.

---

## 📚 Features

- ✔️ **Book Catalog Management**: Add, update, search, and remove books.
- 👤 **User Management**: Create and maintain student/member profiles.
- 🔄 **Issue & Return**: Issue books with issue and due dates; track returns and late penalties.
- 📊 **Fine Calculation**: Automatically compute fines for overdue books based on library policy.
- 📝 **Transaction History**: View history of issued and returned books per user.
- 📄 **Reports**: Generate reports for all current issues, overdue books, and member stats.
- 💾 **Local Persistence**: Data stored in local files or using embedded databases like SQLite (depending on implementation).

---

## 🧰 Tech Stack

| Component             | Technology          |
|-----------------------|---------------------|
| Language              | Java 11+            |
| GUI                   | Swing (AWT/Swing)   |
| Data Storage          | File-based / SQLite |
| Build and Run         | `javac` & `java`    |
| Optional IDEs         | IntelliJ IDEA / NetBeans |

---

## 📸 Screenshots

<p align="center">
  <img src="https://via.placeholder.com/500x250?text=Library+Dashboard" alt="Library Dashboard"/>
  <br/><br/>
  <img src="https://via.placeholder.com/500x250?text=Issue+Book+Screen" alt="Issue Book Screen"/>
</p>

---

## 🛠 Setup & Usage

### 1. Prerequisites
- Java Runtime Environment (JRE) 8 or newer.
- MS Access

### 2. Running the Application

```bash
# Change to project directory
cd Library-Management-for-College

# Compile source files (if needed) and run the main class
javac -d bin src/*.java
java -cp bin MainWindow
