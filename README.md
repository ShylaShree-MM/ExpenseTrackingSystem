ExpenseTrackingSystem
A console-based Java application for efficiently tracking daily expenses. This system allows users to add, view, filter, and manage their financial records with ease. Designed for simplicity and precision, it helps users gain better control over their personal or project budgets.

Table of Contents
1.Overview
2.Features
3.Tech Stack
4.Usage
5.Sample Input/Output
6.Future Enhancements

1.Overview
The Expense Tracking System is designed to help users record and monitor their expenses categorized by type, date, and amount. The application supports data filtering to help users analyze spending habits over different time frames or categories.

2.Features
Add, update, and delete expense entries
View complete expense history
Filter expenses by:
  Date range
  Category (e.g., food, travel, utilities)
  Amount range
  Calculate total and average expenses
  User-friendly console interface
  Data stored in structured collections (ArrayList/HashMap)
  
3.Tech Stack
Language: Java
IDE: IntelliJ IDEA / Eclipse / VS Code
Data Handling: In-memory (ArrayList, custom classes)
Optional: File I/O for saving/loading expenses (if implemented)

4.Usage
Choose from the menu:
  Add a new expense
  View all expenses
  Filter expenses
  View summary (total/average)
  Exit
  Follow the on-screen prompts to enter or view data.
Expenses are displayed in tabular format with relevant details.

5.Sample Input/Output
pgsql
Copy
Edit
Welcome to the Expense Tracking System
--------------------------------------
1. Add Expense
2. View Expenses
3. Filter by Category
4. View Summary
5. Exit

Enter your choice: 1
Enter amount: 1500
Enter category: Food
Enter date (yyyy-mm-dd): 2025-05-01
Expense added successfully!

6.Future Enhancements
Export expense reports to CSV
User authentication and profiles
Monthly budget setting and alerts
GUI integration using JavaFX or Swing
Persistent storage with MySQL or file system

