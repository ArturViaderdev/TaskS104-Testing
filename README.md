# Task S1 04 Testing

## Description
This project was created for academic purposes as part of the IT Academy Java & Spring specialization.
The goal is to do Junit tests.

The project is structured in three levels of increasing complexity.

## 🛠 Technologies
- Java

##    Project Structure
````bash
├── pom.xml
├── README.md
└── src
    └── main
        └── java
            ├── level1Exercise1
            │   ├── Book.java
            │   ├── exceptions
            │   │   └── NotFoundBookException.java
            │   ├── Library.java
            │   └── Main.java
            ├── level1Exercise2
            │   ├── CalculoDni.java
            │   ├── exceptions
            │   │   └── IncorrectNumberException.java
            │   └── Main.java
            ├── level1Exercise3
            │   └── ListPosAccess.java
            ├── level2Exercise1
            ├── level2Exercise2
            ├── level2Exercise3
            ├── level2Exercise4
            │   └── Data.java
            ├── level2Exercise5
            ├── level2Exercise6
            ├── level2Exercise7
            └── level3Exercise1
                └── Calculator.java
                
````
## 🚀 Instal.lation
1. Clone the repository:
````bash
git clone https://github.com/ArturViaderdev/TaskS104-Testing
````

## The goal

This task aims to put into practice the essential knowledge of testing in Java, using tools such as JUnit 5, AssertJ and the TDD (Test-Driven Development) methodology.  
Through guided and progressive exercises, the goal is that you are able to:

- Correctly organize a Java project with Maven or Gradle, including the dependencies required to run tests.
- Write and execute unit tests with JUnit 5 to verify the behavior of classes and methods.
- Use AssertJ to write clear, precise and expressive assertions.
- Apply the TDD cycle (test, implementation, refactoring) when developing basic functionalities.
- Write modular and testable code, clearly separating business logic from input/output details.

## General recommendations

- Use a project manager (Maven or Gradle) to add the required dependencies.
- Create the test classes in the corresponding test package.
- Make at least one commit with a relevant title for each exercise.
- Follow the good practices document described in Sprint 0 in order to comply with the rules for GitHub repository submissions.
- Write your code in English.

---

## Level 1: JUnit

### Exercise 1: Unit tests with JUnit

In this exercise we will get started in the world of automated testing through a practical example: managing a collection of library books.  
The main objective is to learn how to write unit tests with JUnit 5 to ensure that our logic works correctly. In addition, we will integrate JUnit into the project using a dependency manager such as Maven or Gradle.  
This exercise will allow you to establish a solid foundation in quality-oriented development and start applying good practices that are essential in professional environments.

#### Statement

Create a Java class that manages a collection of library books. This class must provide the following functionalities:

- Add books to the collection.
- Retrieve the complete list of books (preserving insertion order).
- Get the title of a book by its position.
- Add a book at a specific position in the collection.
- Remove a book by its title.
- Return a copy of the list sorted alphabetically.

Implement unit tests with JUnit 5 to validate the behavior of the class. Make sure to cover at least the following cases:

- The collection must not be null after instantiating the class.
- The size of the collection is correct after adding several books.
- The books are found at the expected position once added.
- The method to obtain a book by position returns the correct title.
- Adding a book at a specific position correctly modifies the collection.
- Removing a book by title reduces the size of the collection.
- The sorted list returns the books in alphabetical order (without modifying the original collection).
- Books with duplicate titles must not be allowed.

#### Answer

I created a class that manages a library of books.  
The list of books can be sorted.  
It is not allowed to have two books with the same title.  
Different JUnit tests check the correct behavior of the code.

---

### Exercise 2: Parameterized test

This exercise introduces you to parameterized tests with JUnit 5, a very useful technique for validating the same functionality with different data sets.  
We will work with a very specific functionality: calculating the letter of a Spanish DNI from its number.

You will learn to:

- Write a testable function based on a mathematical formula.
- Apply `@ParameterizedTest` to check multiple cases in an elegant way.
- Analyze the results and detect possible errors if any data does not match the expected value.

#### Statement

- Create a class named `CalculoDni` that contains a public method to calculate the corresponding letter of a DNI, given the number (without the letter).
- Create a test class with JUnit 5 that parameterizes a series of tests to validate the correct behavior of the calculation.
- The test must check at least 10 different DNI numbers with their corresponding letter, validating that the result of the method matches the expected value.
- You must also validate invalid values, such as negative or excessively large numbers, to check that the method correctly handles these situations (for example, by throwing an exception).

#### Answer

I wrote a program that calculates the DNI letter from the number.  
Then I created a test that checks an error is raised for an invalid number and verifies 10 known DNIs.

---

### Exercise 3: Exception handling

In this exercise we will work with throwing and detecting exceptions in Java.  
The goal is to understand how to handle expected errors through automated testing.

#### Statement

- Create a Java class that contains a public method which causes an `ArrayIndexOutOfBoundsException`. This method can, for example, try to access a non-existent position in an array.
- Then, implement a test class with JUnit 5 that verifies that the method throws the expected exception when the corresponding conditions are met.

#### Answer

I created a class that has a list and a method that can access positions in the list.  
When an invalid position is accessed, the `IndexOutOfBoundsException` runtime exception is thrown.  
I wrote a test that checks that the exception is thrown.

---

## Level 2: AssertJ

In this level we will learn how to use AssertJ, a testing library that allows us to write more expressive and readable assertions than traditional JUnit assertions.  
Each proposed exercise focuses on a different AssertJ feature. We recommend checking the official documentation if you need additional help during the practice.

Create the Java classes and/or the tests that validate them to demonstrate the following:

### Exercise 1

- An assertion that shows that the value of two integer objects is equal, and another one that shows that it is not.

#### Answer

I wrote two tests: one to check if two numbers are equal and another to check if two numbers are not equal.  
I used AssertJ.

### Exercise 2

- An assertion that shows that the reference to one object is the same as another, and another one that shows that it is different.

#### Answer

I wrote two assertions: one to check if two objects have the same reference and another to check the opposite.

### Exercise 3

- An assertion that shows that two integer arrays are identical.

#### Answer

I checked that two integer arrays are equal or contain the same elements.

### Exercise 4

- Create an `ArrayList` that contains several types of objects (create those objects as well).  
  Write an assertion to verify the order of the objects in the `ArrayList` according to how they were inserted.  
  Then verify that the previous list contains the objects in any order.  
  Verify that, in the previous list, one of the objects has been added only once.  
  Leave one of the elements not added, and verify that the list does not contain this last one.

#### Answer

I checked the elements inserted into an array list.

### Exercise 5

- Create a map and verify that it contains one of the keys you have added to it.

#### Answer

I checked that a map contains a key.

### Exercise 6

- Cause an `ArrayIndexOutOfBoundsException` in any class.  
  Create an assertion that validates that the exception is thrown when it should be.

#### Answer

I checked that an `IndexOutOfBoundsException` is thrown.

### Exercise 7

- Create an empty `Optional` object.  
  Write the appropriate assertion to verify that it is indeed empty.

#### Answer

I checked that an `Optional` is empty.

---

## Level 3: TDD — Test-Driven Development

In this exercise we will work with Test-Driven Development (TDD) to build step by step a calculator with internal state.  
This approach will help us understand how writing one test at a time allows us to better model our classes and ensure their correct functionality.

### Objective

Learn how to apply the Red → Green → Refactor cycle to design a class iteratively, starting from the needs expressed in each test.

### Exercise 1: Calculator

We will implement a class named `Calculator` that manages an accumulated total, initially 0, and provides operations such as add, subtract, multiply, divide and reset.

🔴 **Step 1 (RED):**  
Create a test class named `CalculatorTest`. Start by writing a single very simple test (for example: “initial total is zero”):

```java
@Test
void calculatorStartsWithTotalZero() {
    Calculator calculator = new Calculator();
    assertThat(calculator.getTotal()).isEqualTo(0);
}
```

🟢 Step 2 (GREEN):
Make the tests pass by implementing only the minimum necessary in the Calculator class.

♻️ Step 3 (REFACTOR):
Refactor if needed.

As you implement the class, cover the following behaviors with tests:

    The initial total is 0.

    The add(x) method increases the total.

    The subtract(x) method decreases the total.

    The multiply(x) method multiplies the total by the given value.

    The divide(x) method correctly updates the total by dividing it by the given value.

    Dividing by zero must throw an ArithmeticException.

    The reset() method must set the total back to 0.

    The getTotal() method must return the current value of the total.

#### Answer

I wrote tests for a calculator class.