# 🏦 Banking Program Beginner

A simple bank management system that demonstrates fundamental Java concepts through practical banking operations.

## 📋 Table of Contents

1. [Overview](#overview)
2. [Features](#features)
3. [How to Run](#how-to-run)
4. [Program Menu](#program-menu)
5. [Method Explanations](#method-explanations)
6. [Example Walkthrough](#example-walkthrough)
7. [Error Handling](#error-handling)
8. [Java Concepts Used](#java-concepts-used)
9. [Testing Checklist](#testing-checklist)

---

## 🎯 Overview

This program simulates a basic bank account system where users can:
- Check their current balance
- Deposit money into their account
- Withdraw money from their account
- Exit the program gracefully

**Initial Balance:** $20,000.00

---

## ✨ Features

| Feature | Description |
|---------|-------------|
| **Show Balance** | Display the current account balance |
| **Deposit Money** | Add funds to the account with validation |
| **Withdraw Money** | Remove funds from the account with balance check |
| **User-Friendly Menu** | Interactive menu with clear options |
| **Input Validation** | Prevents negative amounts and overdrawing |
| **Loop Control** | Continues until user chooses to exit |

---

## 🚀 How to Run

### Prerequisites
- Java Development Kit (JDK) 11 or higher
- Command line/Terminal

### Compilation & Execution

```bash
# Navigate to project directory
cd My-Java-practice-

# Compile the program
javac src/miniProjects/BankingProgramBeginner.java

# Run the program
java -cp src miniProjects.BankingProgramBeginner
```

---

## 📱 Program Menu

When you run the program, you will see:

```
***************
Banking Program
***************
1. Show Balance
2. Deposit 
3. Withdraw 
4. Exit 
***************
Enter your choice(1-4): 
```

### Menu Options

| Option | Action |
|--------|--------|
| **1** | Shows your current account balance |
| **2** | Allows you to deposit money |
| **3** | Allows you to withdraw money |
| **4** | Exits the program with a goodbye message |

---

## 🔧 Method Explanations

### 1. `main(String[] args)`

**Purpose:** Controls the main program flow

**Logic:**
```
1. Initialize balance = $20,000
2. Set isRunning = true
3. WHILE isRunning is true:
   - Display menu
   - Get user choice
   - Execute appropriate action based on choice
   - If choice is 4, set isRunning = false
4. Program ends
```

**Key Variables:**
- `balance` - Stores the account balance (double)
- `choice` - Stores user's menu selection (int)
- `isRunning` - Controls the while loop (boolean)

---

### 2. `showBalance(double balance)`

**Purpose:** Display the current balance

**Parameters:**
- `balance` - The current account balance

**What it does:**
- Uses `printf()` to format the balance as currency
- Displays balance with 2 decimal places
- Format: `$20000.00`

**Example Output:**
```
$20000.00
```

---

### 3. `deposit()`

**Purpose:** Handle money deposits into the account

**Returns:** The deposit amount (double)

**Logic:**
```
1. Ask user: "Enter an amount to be deposited"
2. Read the amount from user
3. IF amount < 0:
   - Print "Invalid deposit"
   - Return 0
4. ELSE:
   - Return the amount
5. In main(), add this amount to balance
```

**Validation:**
- Rejects negative amounts
- Returns 0 if invalid (no change to balance)

**Example Flow:**
```
Enter an amount to be deposited
500
// Returns 500, balance increases by 500
```

---

### 4. `withdraw(double balance)`

**Purpose:** Handle money withdrawals from the account

**Parameters:**
- `balance` - Current account balance (used for validation)

**Returns:** The withdrawal amount (double)

**Logic:**
```
1. Ask user: "Enter an amount to be withdrawn"
2. Read the amount from user
3. IF amount > balance:
   - Print "Insufficient Funds"
   - Return 0
4. ELSE IF amount < 0:
   - Print "Amount can't be negative"
   - Return 0
5. ELSE:
   - Return the amount
6. In main(), subtract this amount from balance
```

**Validations:**
- Prevents overdrawing (withdrawal > balance)
- Prevents negative amounts
- Returns 0 if invalid (no change to balance)

**Example Flow:**
```
Enter an amount to be withdrawn
5000
// If balance >= 5000: Returns 5000, balance decreases by 5000
// If balance < 5000: Prints "Insufficient Funds", returns 0
```

---

## 📝 Example Walkthrough

**Scenario:** Starting balance is $20,000. Perform deposit, withdrawal, and check balance.

### Step 1: Show Initial Balance
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

### Step 2: Make a Deposit
```
***************
Banking Program
***************
1. Show Balance
2. Deposit 
3. Withdraw 
4. Exit 
***************
Enter your choice(1-4): 2
***************
Enter an amount to be deposited
5000
```
**Balance becomes:** $20,000 + $5,000 = **$25,000**

### Step 3: Make a Withdrawal
```
***************
Banking Program
***************
1. Show Balance
2. Deposit 
3. Withdraw 
4. Exit 
***************
Enter your choice(1-4): 3
***************
Enter an amount to be withdrawn
8000
```
**Balance becomes:** $25,000 - $8,000 = **$17,000**

### Step 4: Check Updated Balance
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
$17000.00
```

### Step 5: Exit Program
```
***************
Banking Program
***************
1. Show Balance
2. Deposit 
3. Withdraw 
4. Exit 
***************
Enter your choice(1-4): 4
***************
***************************
Thank you! have a nice day!
***************************
```

---

## ⚠️ Error Handling

### Invalid Menu Choice

**Input:** User enters 5 (invalid option)

**Output:**
```
Enter your choice(1-4): 5
***************
Invalid choice
```

**Behavior:** Menu reappears, user can try again

---

### Invalid Deposit Amount

**Input:** User tries to deposit -1000

**Output:**
```
Enter an amount to be deposited
-1000
Invalid deposit
```

**Result:** Balance remains unchanged

---

### Insufficient Funds for Withdrawal

**Input:** User tries to withdraw $30,000 but only has $20,000

**Output:**
```
Enter an amount to be withdrawn
30000
Insufficient Funds
```

**Result:** Balance remains unchanged

---

### Negative Withdrawal Amount

**Input:** User tries to withdraw -500

**Output:**
```
Enter an amount to be withdrawn
-500
Amount can't be negative
```

**Result:** Balance remains unchanged

---

## 🎓 Java Concepts Used

### 1. **While Loop**
```java
while (isRunning) {
    // Code repeats until isRunning becomes false
}
```
- Used to keep the program running until user selects exit

### 2. **Switch Statement**
```java
switch (choice) {
    case 1 -> showBalance(balance);
    case 2 -> balance += deposit();
    case 3 -> balance -= withdraw(balance);
    case 4 -> isRunning = false;
    default -> System.out.println("Invalid choice");
}
```
- Routes program flow based on user choice
- Modern switch syntax with `->` (arrow operator)

### 3. **Static Methods**
```java
static void showBalance(double balance)
static double deposit()
static double withdraw(double balance)
```
- Methods belong to the class, not instances
- Called without creating objects

### 4. **Parameters & Return Values**
```java
static double deposit()  // Returns double
static void showBalance(double balance)  // Accepts parameter, returns nothing
```

### 5. **Input Validation (If-Else)**
```java
if (amount < 0) {
    return 0;
} else {
    return amount;
}
```

### 6. **Formatted Output (printf)**
```java
System.out.printf("$%.2f\n", balance);
```
- `%f` = floating-point number
- `.2` = 2 decimal places
- `\n` = newline

### 7. **Static Variable (Scanner)**
```java
static Scanner scanner = new Scanner(System.in);
```
- Declared once, used in all methods
- Shared across methods

### 8. **Boolean Variables**
```java
boolean isRunning = true;
// ... later
isRunning = false;  // Stops the loop
```

---

## ✅ Testing Checklist

Use this checklist to verify the program works correctly:

### Basic Operations
- [ ] Show balance displays $20,000.00 initially
- [ ] Deposit 1000 increases balance to $21,000.00
- [ ] Withdraw 5000 decreases balance to $16,000.00
- [ ] Show balance displays updated amount

### Input Validation - Deposits
- [ ] Depositing -100 shows "Invalid deposit" and doesn't change balance
- [ ] Depositing 0 shows "Invalid deposit" and doesn't change balance
- [ ] Depositing 5000.50 (decimal) works correctly

### Input Validation - Withdrawals
- [ ] Withdrawing amount greater than balance shows "Insufficient Funds"
- [ ] Withdrawing -100 shows "Amount can't be negative"
- [ ] Withdrawing 0 shows "Amount can't be negative"
- [ ] Withdrawing exactly the current balance sets balance to 0

### Menu Navigation
- [ ] Invalid menu choice (5) shows "Invalid choice"
- [ ] Pressing 1, 2, 3 multiple times works correctly
- [ ] Pressing 4 exits with goodbye message
- [ ] Program terminates cleanly after exit

### Edge Cases
- [ ] Deposit, then deposit again, balance increases both times
- [ ] Withdraw, then withdraw again, balance decreases both times
- [ ] Alternate deposits and withdrawals several times
- [ ] Check that balance never goes negative

---

## 📚 Code Structure Summary

```
Program Flow:
    ↓
main() method
    ↓
Initialize balance = $20,000
    ↓
While loop starts
    ↓
Display menu
    ↓
Get user choice
    ↓
Switch on choice
    ├─ Case 1: Call showBalance()
    ├─ Case 2: Call deposit(), add to balance
    ├─ Case 3: Call withdraw(), subtract from balance
    └─ Case 4: Set isRunning = false
    ↓
Loop back (if still running)
    ↓
Program ends
```

---

## 💡 Key Takeaways

1. **Loops keep programs running** - while loop continues until a condition changes
2. **Switch statements handle choices** - cleaner than multiple if-else statements
3. **Methods are reusable** - showBalance, deposit, withdraw can be called multiple times
4. **Validation prevents errors** - checking input before processing protects data
5. **Return values pass data** - deposit() and withdraw() return amounts to update balance
6. **Static members are shared** - Scanner is accessible from all methods

---

## 🎯 How This Program Works - Visual Flow

```
START
  ↓
balance = $20,000
isRunning = true
  ↓
┌─────────────────────────────┐
│   Display Menu              │
│   Get User Choice           │
│   ┌────────────────────────┐│
│   │ Is choice == 1?        ││ YES → Show Balance
│   │ Is choice == 2?        ││ YES → Deposit (add to balance)
│   │ Is choice == 3?        ││ YES → Withdraw (subtract from balance)
│   │ Is choice == 4?        ││ YES → isRunning = false
│   │ Else                   ││ YES → Invalid choice
│   └────────────────────────┘│
│                             │
│   Is isRunning true?        │
│   ├─ YES: Loop back         │
│   └─ NO: Continue           │
└─────────────────────────────┘
  ↓
Display "Thank you! have a nice day!"
  ↓
END
```

---

**Created for:** Java Beginners
**Difficulty Level:** ⭐ Beginner
**Status:** Ready to use and learn from

