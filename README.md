# Java Lambda Expressions Projects

A collection of Java projects created to learn and practice Lambda Expressions and Functional Programming in Java.

The projects start from basic lambda expressions and gradually move toward practical usage of Java's built-in functional interfaces and method references.

---

## Projects

| #   | Project                    | Main Concepts                                   |
| --- | -------------------------- | ----------------------------------------------- |
| 01  | Age Eligibility Checker    | Functional Interface, Lambda Expression         |
| 02  | Lambda Calculator          | Functional Interface, Function, Lambda          |
| 03  | Student Result System      | Predicate, Function, Lambda                     |
| 04  | Hotel Filtering System     | Predicate, Lambda Expression                    |
| 05  | Employee Management System | Predicate, Function, Consumer                   |
| 06  | Product Management System  | Predicate, Function, Consumer, Method Reference |
| 07  | Employee Payroll System    | Predicate, Function, Consumer, Method Reference |

---

## 01. Age Eligibility Checker

### Description

A simple project that checks whether a person is eligible based on their age.

This project demonstrates how a custom functional interface can be used with a lambda expression.

### Concepts Used

- Functional Interface
- Lambda Expression
- Passing behavior as an argument
- Boolean conditions

### Example

```java
AgeChecker checker = age -> age >= 18;
```

---

## 02. Lambda Calculator

### Description

A simple calculator that performs arithmetic operations using Lambda Expressions.

### Operations

- Addition
- Subtraction
- Multiplication
- Division

### Concepts Used

- Functional Interface
- Lambda Expression
- Built-in Functional Interfaces
- Passing behavior as an argument

### Example

```java
Function<Integer, Integer> square = number -> number * number;
```

---

## 03. Student Result System

### Description

A student result management project that uses Lambda Expressions to filter and process student information.

The project demonstrates how functional interfaces can be used with collections.

### Concepts Used

- Lambda Expressions
- Predicate
- Function
- Collection processing
- Object filtering

### Example

```java
Predicate<Student> passed = student -> student.getMarks() >= 40;
```

---

## 04. Hotel Filtering System

### Description

A hotel filtering system that filters hotels based on different conditions such as price and hotel type.

Instead of creating separate classes for every filtering condition, Lambda Expressions are used to provide the filtering logic.

### Concepts Used

- Functional Interface
- Lambda Expression
- Predicate
- Object filtering
- Passing behavior as an argument

### Example

```java
Predicate<Hotel> affordable = hotel -> hotel.getPricePerNight() <= 2000;
```

---

## 05. Employee Management System

### Description

An employee management system that performs different operations on a collection of employees using Java's built-in functional interfaces.

### Operations

- Filter employees
- Find employees based on conditions
- Process employee information
- Display employee information

### Concepts Used

- Predicate
- Function
- Consumer
- Lambda Expressions
- Method References
- Collections

### Example

```java
Predicate<Employee> developmentEmployee =
    employee -> employee.getDepartment().equals("Development");
```

---

## 06. Product Management System

### Description

A product management system that demonstrates how Lambda Expressions and Method References can be used to process product information.

### Operations

- Filter products
- Find products based on price
- Process product information
- Display product information

### Concepts Used

- Predicate
- Function
- Consumer
- Lambda Expressions
- Method References
- Built-in Functional Interfaces

### Example

```java
Predicate<Product> expensiveProduct = product -> product.getPrice() > 1000;
```

---

## 07. Employee Payroll System

### Description

An employee payroll system that demonstrates practical usage of Lambda Expressions and Java Method References.

The system works with employee information such as:

- Employee ID
- Employee Name
- Salary
- Department

### Operations

- Display employees
- Filter employees by department
- Process employee salaries
- Calculate employee bonuses
- Generate employee codes
- Use Predicate
- Use Function
- Use Consumer
- Use Method References
- Use Function Composition

### Concepts Used

- Lambda Expressions
- Predicate
- Function
- Consumer
- BiFunction
- Static Method References
- Instance Method References
- Function Composition
- andThen()

### Example

```java
Function<Employee, Double> getSalary = Employee::getSalary;
```

---

## Java Lambda Concepts Practiced

### 1. Lambda Expression

A Lambda Expression provides a short way to implement a Functional Interface.

```java
(a, b) -> a + b
```

Instead of creating a separate implementation class, the behavior can be written directly.

### 2. Functional Interface

A Functional Interface contains exactly one abstract method.

```java
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}
```

It can then be implemented using a Lambda:

```java
Calculator addition = (a, b) -> a + b;
```

### 3. Predicate

`Predicate<T>` is used when the result should be true or false.

```java
Predicate<Employee> highSalary = employee -> employee.getSalary() > 50000;
```

Example:

```java
if (highSalary.test(employee)) {
    System.out.println(employee);
}
```

### 4. Function

`Function<T, R>` takes one value and returns another value.

```java
Function<Employee, Double> getSalary = Employee::getSalary;
```

Example:

```java
double salary = getSalary.apply(employee);
```

### 5. Consumer

`Consumer<T>` accepts a value but does not return anything.

```java
Consumer<Employee> display = employee -> System.out.println(employee);
```

Example:

```java
display.accept(employee);
```

### 6. Supplier

`Supplier<T>` does not take an input but returns a value.

```java
Supplier<String> message = () -> "Welcome to Employee Payroll System";
```

Example:

```java
System.out.println(message.get());
```

---

## Method References

Method References provide a shorter syntax for certain Lambda Expressions.

| Lambda                             | Method Reference      |
| ---------------------------------- | --------------------- |
| `employee -> employee.getSalary()` | `Employee::getSalary` |
| `employee -> employee.display()`   | `Employee::display`   |

### Static Method Reference

A static method can also be referenced directly.

```java
public static double calculateBonus(double salary) {
    return salary * 0.10;
}
```

Method reference:

```java
Function<Double, Double> calculateBonus = Employee::calculateBonus;
```

### Instance Method Reference

An instance method can be referenced through its class.

```java
Function<Employee, Double> getSalary = Employee::getSalary;
```

This is equivalent to:

```java
Function<Employee, Double> getSalary = employee -> employee.getSalary();
```

---

## Function Composition

Functions can be combined using methods such as `andThen()`.

```java
Function<Employee, String> getName = Employee::getName;

Function<String, String> addMessage = name -> "Employee: " + name;

Function<Employee, String> result = getName.andThen(addMessage);
```

Flow:

```text
Employee -> getName() -> String -> addMessage() -> String
```

---

## Repository Structure

```text
Lambda Projects/
│
├── 01-Age-Eligibility-Checker/
│   └── src
│
├── 02-Lambda-Calculator/
│   └── src
│
├── 03-Student-Result-System/
│   └── src
│
├── 04-Hotel-Filtering-System/
│   └── src
│
├── 05-Employee-Management/
│   └── src
│
├── 06-Product-Management-System/
│   └── src
│
├── 07-Employee-Payroll-System/
│   └── src
│
└── README.md
```

---

## Learning Progression

The projects are designed to gradually increase in difficulty.

```text
Custom Functional Interface
      ↓
Lambda Expression
      ↓
Passing Behavior as Argument
      ↓
Built-in Functional Interfaces
      ↓
Predicate
      ↓
Function
      ↓
Consumer
      ↓
Supplier
      ↓
Method References
      ↓
Static Method References
      ↓
Instance Method References
      ↓
Function Composition
      ↓
Practical Object Processing
```

---

## Learning Goals

The main goal of this repository is to understand:

- Why Lambda Expressions were introduced
- How Lambda Expressions reduce boilerplate code
- How behavior can be passed as an argument
- How Functional Interfaces work
- How Java's built-in Functional Interfaces work
- How to use Predicate
- How to use Function
- How to use Consumer
- How to use Supplier
- How Method References work
- How Static Method References work
- How Instance Method References work
- How Function Composition works
- How Lambda Expressions can be applied to real-world problems

---

## Technologies Used

- Java
- Java Collections Framework
- Lambda Expressions
- Functional Interfaces
- Predicate
- Function
- Consumer
- Supplier
- BiFunction
- Method References
- Function Composition
- Java 8+ Functional Programming Features

---

## Next Step

After completing these Lambda Expression projects, the next major topic is the Java Stream API.

The Lambda Expressions learned in these projects will be heavily used with Streams.

Important Stream operations to learn:

- filter()
- map()
- forEach()
- sorted()
- reduce()
- collect()
- groupingBy()
- counting()
- distinct()
- limit()
- skip()

---

## Author

**Sandeep**

Java | DSA | Backend Development | Functional Programming

---

## Repository Goal

This repository represents a practical learning journey through Java Lambda Expressions.

The projects progress from basic Lambda Expressions and Functional Interfaces to more advanced concepts such as Method References, Function Composition, and practical object processing.
