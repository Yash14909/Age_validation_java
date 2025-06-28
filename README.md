# Age Validation - Java Exception Handling

This Java project demonstrates the use of **custom exceptions** in Java. The program asks the user to enter their age and throws a custom `AgeException` if the age is less than 18.

---

## 🚀 Features

- Prompts the user for their age
- Throws a custom `AgeException` for invalid age input
- Demonstrates exception handling using `try-catch`

---

## 🧾 File Structure


1.) P12P1.java # Main class to input age and validate
2.) AgeException.java # Custom exception class
3.) README.md # Project overview and usage instructions
4.).gitignore # Files to be ignored by Git


---

## 🛠️ How to Run

### 1. Compile the Java files:
```bash
javac P12P1.java AgeException.java

java P12P1

💡 Sample Output

Enter your age: 17
Invalid age

Enter your age: 20
Valid age
