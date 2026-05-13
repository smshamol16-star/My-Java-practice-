# 🚀 Mini Projects Collection

A comprehensive collection of beginner-friendly Java mini-projects designed to practice core programming concepts and build practical skills.

## 📋 Table of Contents

1. [Calculator](#calculator)
2. [Number Guessing Game](#number-guessing-game)
3. [Bank ATM System](#bank-atm-system)
4. [Banking Program Beginner](#banking-program-beginner)
5. [Temperature Converter](#temperature-converter)
6. [Weight Converter](#weight-converter)
7. [Compound Interest Calculator](#compound-interest-calculator)
8. [Student Report Card](#student-report-card)

---

## 📱 Calculator

**Purpose:** A simple calculator application that performs basic arithmetic operations.

### Features
- ➕ Addition, Subtraction, Multiplication, Division
- 🔢 Square Root calculation
- ⚡ Power operation
- ✅ Input validation

### How to Use
```bash
java miniProjects.Calculator
```

**Example:**
```
Enter the 1st number:- 10
Enter an operator (+,-,/,*,^,r):- +
Enter the 2nd number:- 5
15.0
```

### Supported Operators
| Operator | Operation | Example |
|----------|-----------|---------|
| `+` | Addition | 10 + 5 = 15 |
| `-` | Subtraction | 10 - 5 = 5 |
| `*` | Multiplication | 10 * 5 = 50 |
| `/` | Division | 10 / 5 = 2 |
| `^` | Power | 2 ^ 3 = 8 |
| `r` | Square Root | √16 = 4 |

**Learn From This:** Switch statements, Math operations, Error handling

---

## 🎮 Number Guessing Game

**Purpose:** An interactive game where the user guesses a random number within a limited number of attempts.

### Features
- 🎯 Random number generation (1-100)
- 📊 Limited attempts (7 tries)
- 💬 Smart hints (Too high/Too low)
- 🏆 Attempt counter

### How to Use
```bash
java miniProjects.NumberGuessingGame
```

**Example:**
```
Guess a number among(1-100)
Enter the number that you have choosed:- 50
Too low
Enter the number that you have choosed:- 75
Too high
Enter the number that you have choosed:- 60
Correct! You got it in 3 attempts!
```

**Learn From This:** Loops, Conditional statements, Random number generation

---

## 🏦 Bank ATM System

**Purpose:** A simple ATM simulation system with PIN authentication and withdrawal functionality.

### Features
- 🔐 PIN protection (Default PIN: 4321)
- 💰 Account balance display
- 🏧 Withdrawal functionality
- ✔️ Balance validation

### How to Use
```bash
java miniProjects.BankAtmSystem
```

**Example:**
```
What is your name:- John
What is PIN:- 4321
Your balance is 50000.0
How much tk do you want to withdrawal?- 5000
Withdrawal successful! Remaining balance: 45000.0
```

### Default Credentials
- **Name:** Any name
- **PIN:** 4321
- **Initial Balance:** 50,000 BDT

**Learn From This:** User input handling, Conditional logic, Data validation

---

## 🏧 Banking Program Beginner

**Purpose:** A simple bank management system with deposit, withdrawal, and balance checking functionality using static methods and loops.

### Features
- 💰 Display current account balance
- 💵 Deposit money with validation
- 🏧 Withdraw money with balance check
- 🔄 Continuous menu loop
- ✅ Input validation for negative amounts
- ✔️ Prevents overdrawing

### How to Use
```bash
java miniProjects.BankingProgramBeginner
```

**Example:**
```
***************
Banking Program
***************
1. Show Balance
2. Deposit 
3. Withdraw 
4. Exit 
***************
Enter your choice(1-4): 1
***************
$20000.00
```

### Menu Options
| Choice | Action |
|--------|--------|
| 1 | Show current balance |
| 2 | Deposit money |
| 3 | Withdraw money |
| 4 | Exit program |

### Initial Balance
- **Starting Balance:** $20,000.00

### Main Methods
- `showBalance(double balance)` - Displays formatted balance
- `deposit()` - Handles deposits with validation
- `withdraw(double balance)` - Handles withdrawals with balance check
- `main(String[] args)` - Controls program flow with while loop

### Validation Rules
- **Deposit:** Rejects negative amounts
- **Withdrawal:** Prevents overdrawing and negative amounts
- **Menu:** Shows error for invalid choices

**Learn From This:** While loops, Static methods, Switch statements, Input validation, Parameter passing

---

## 🌡️ Temperature Converter

**Purpose:** Convert temperature between Celsius and Fahrenheit.

### Features
- 🔄 Bidirectional conversion
- 📏 Accurate temperature formulas
- 💯 Formatted output

### How to Use
```bash
java miniProjects.TemperatureConverter
```

**Example:**
```
Enter the temperature:- 32
Convert to Celsius or Fahrenheit?(C or F):- C
0.00°C
```

### Formulas Used
- **Fahrenheit to Celsius:** (F - 32) × 5/9
- **Celsius to Fahrenheit:** (C × 9/5) + 32

**Learn From This:** Ternary operators, String manipulation, Math operations

---

## ⚖️ Weight Converter

**Purpose:** Convert weight between kilograms and pounds.

### Features
- 🔄 Two-way conversion
- 🎯 Accurate conversion ratios
- 📊 Formatted decimal output

### How to Use
```bash
java miniProjects.WeightConverter
```

**Example:**
```
 Weight conversion Program
 1: Convert lbs to kgs
 2: Convert kgs to lbs
Choose an option 1 or 2 :- 1
Enter the weight in lbs:- 100
The new weight in kgs is 45.36.
```

### Conversion Rates
- **1 lbs = 0.45359 kgs**
- **1 kg = 2.20462 lbs**

**Learn From This:** Conditional statements, Formatted output, Simple calculations

---

## 📈 Compound Interest Calculator

**Purpose:** Calculate future value of an investment with compound interest.

### Features
- 💹 Compound interest formula implementation
- 📊 Customizable investment parameters
- 💰 Precise decimal output

### How to Use
```bash
java miniProjects.CompooundingInterretCalculator
```

**Example:**
```
Enter your present value here please:- 10000
Enter the rate here please, in %:- 5
Tell us the compound time please:- 4
Tell us for how much year you want to invest- 2
Your future value will be:- 11038.13
```

### Formula
```
Future Value = Principal × (1 + Rate/CompoundTime)^(Years × CompoundTime)
```

**Learn From This:** Math.pow(), User input handling, Financial calculations

---

## 📜 Student Report Card

**Purpose:** Calculate student grades and generate a report card based on marks.

### Features
- 👤 Student name input
- 📊 Average calculation
- 🎓 Grade assignment (A-F)
- 🏆 Highest subject mark tracking
- 🍀 Lucky number generator

### How to Use
```bash
java miniProjects.StudentReportCard
```

**Example:**
```
Enter your name here:- Alice
Hello ALICE
Enter 1st subject number that you have got:- 85
Enter 2nd subject number that you have got:- 90
Enter 3rd subject number that you have got:- 88
The average number is 87.66666666666667.
You have got A.
Your highest number is 90
Your lucky number is 42.
```

### Grading System
| Average | Grade |
|---------|-------|
| 90-100 | A |
| 80-89 | B |
| 70-79 | C |
| 60-69 | D |
| Below 60 | F |

**Learn From This:** Conditional statements, Math operations, Random generation, String manipulation

---

## 🛠️ Technologies & Concepts Used

### Java Concepts
- ✅ Variables & Data Types
- ✅ Input/Output (Scanner)
- ✅ Conditional Statements (if-else, switch)
- ✅ Loops (do-while, while)
- ✅ Methods & Functions
- ✅ Static Methods
- ✅ Random Number Generation
- ✅ String Operations
- ✅ Parameters & Return Values

### Built-in Classes
- `java.util.Scanner` - User input
- `java.util.Random` - Random number generation
- `java.lang.Math` - Mathematical operations

---

## 💡 How to Run These Projects

### Prerequisites
- Java Development Kit (JDK) 11 or higher installed
- A terminal/command prompt
- Any text editor or IDE (VS Code, IntelliJ IDEA, etc.)

### Steps to Compile & Run

```bash
# Navigate to the project root
cd My-Java-practice-

# Compile all Java files
javac src/miniProjects/*.java

# Run any project
java -cp src miniProjects.Calculator
java -cp src miniProjects.NumberGuessingGame
java -cp src miniProjects.BankAtmSystem
java -cp src miniProjects.BankingProgramBeginner
java -cp src miniProjects.TemperatureConverter
java -cp src miniProjects.WeightConverter
java -cp src miniProjects.CompooundingInterretCalculator
java -cp src miniProjects.StudentReportCard
```

---

## 🎯 Learning Objectives

These mini-projects help you practice:
- 📝 Writing clean, readable Java code
- 🔍 Debugging and fixing common errors
- 🧠 Problem-solving with programming logic
- 💬 Handling user input and output
- 🧮 Mathematical and financial calculations
- 🎮 Building interactive applications
- 🔄 Working with loops and methods

---

## 📈 Difficulty Level

| Project | Difficulty | Concepts |
|---------|-----------|----------|
| Temperature Converter | ⭐ Easy | Ternary operators, Math |
| Weight Converter | ⭐ Easy | If-else, Math |
| Calculator | ⭐⭐ Medium | Switch statements, Methods |
| Number Guessing Game | ⭐⭐ Medium | Loops, Random, Conditionals |
| Bank ATM System | ⭐⭐ Medium | Input validation, Logic flow |
| Banking Program Beginner | ⭐⭐ Medium | While loops, Static methods, Switch |
| Compound Interest Calculator | ⭐⭐⭐ Medium | Math formulas, Precision |
| Student Report Card | ⭐⭐⭐ Medium | Multiple calculations, Logic |

---

## 📝 Notes

- These are beginner-level projects meant for learning
- Code follows basic Java conventions
- Feel free to modify and enhance these projects
- Add more features to make them more practical
- Each project demonstrates different Java concepts

---

## 👤 Author

**smshamol16-star** - Java Practice Projects

---

## 📄 License

This project is open source and available for educational purposes.

---

**Happy Coding! 🎉**
