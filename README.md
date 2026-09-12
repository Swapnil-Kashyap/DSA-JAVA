# Java DSA & OOP Practice

A collection of Java programs that I am writing while learning and practicing **Data Structures, Algorithms, Recursion, and Object-Oriented Programming**.

The repository contains small programs and problem-solving exercises that help me understand Java concepts by implementing them myself.

## Topics Covered

- Java basics and programming fundamentals
- Pattern printing
- Arrays
- Searching algorithms
- Recursion
- Bit manipulation
- Object-Oriented Programming (OOP)
- Inheritance
- Encapsulation
- Abstraction
- Getters and setters
- Basic problem-solving programs

## Repository Structure

```text
Java DSA/
│
├── Recursion/
│   ├── Factorial.java
│   ├── LinearSearchRecursion.java
│   ├── BinarySearchRecursion.java
│   └── ...
│
├── Bit manipulation/
│   └── ...
│
├── OOPS/
│   ├── Animal.java
│   ├── Chicken.java
│   ├── EncapsuleStudent.java
│   ├── GETSET.java
│   ├── Horse.java
│   └── ...
│
└── README.md
```

> The exact files and folders may change as I continue adding new programs.

## Example

One of the programs in this repository uses nested loops to print an inverted rotated half-pyramid pattern in Java.

```java
public static void inverted_rotated_half_pyramid(int n) {
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n - 1; j++) {
            System.out.print(" ");
        }

        for (int j = 1; j <= 1; j++) {
            System.out.print("*");
        }

        System.out.println();
    }
}
```

This is part of my practice with Java loops and pattern-based problems.

## How to Run

Make sure Java is installed on your system.

Compile a Java file:

```bash
javac FileName.java
```

Run it:

```bash
java FileName
```

For example:

```bash
javac invertedpyramid.java
java invertedpyramid
```

## Purpose

This repository is mainly for **learning, practice, and tracking my progress in Java and DSA**.

I will keep adding programs as I learn new concepts and solve more problems.

## Author

**Swapnil Kashyap**

---

⭐ This repository is a record of my Java and DSA learning journey.
