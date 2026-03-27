# Vending Machine Application

## Overview
This project is a console based Vending Machine application developed in Java using Object Oriented Programming (OOP) principles. The application simulates a simple vending machine where users can view products, insert coins, purchase items, check their balance, and return change. The project was built as part of an OOP workshop and follows a UML-based design structure.

## Objectives
The purpose of this project is to practice and apply the main concepts of Object-Oriented Programming, including:
- Abstraction
- Inheritance
- Polymorphism
- Encapsulation
- Interfaces
- Console-based application design
- Unit testing with JUnit
- Packaging the application as a runnable JAR file

## Features
The application includes the following features:
- Display all available products
- Accept valid coin values only
- Reject invalid coin values
- Allow the user to purchase a product if the balance is sufficient
- Reduce product quantity after a successful purchase
- Show the current balance
- Return remaining balance as change
- Interact with the user through a console menu
- Run unit tests for core vending machine logic
- Generate a runnable JAR file that can be executed from the command line

## Valid Coin Values
The vending machine accepts only the following coin values:

- 1 SEK
- 2 SEK
- 5 SEK
- 10 SEK
- 20 SEK
- 50 SEK

Any other value is considered invalid and will be rejected.

## Technologies Used
- Java
- Maven
- JUnit 5

## Project Structure
The project is organized into the following main classes:

- `Product`  
  An abstract base class representing a general product.

- `Snack`, `Beverage`, `Fruit`  
  Subclasses of `Product` representing different product types.

- `IVendingMachine`  
  An interface defining the main vending machine operations.

- `VendingMachineImpl`  
  The main implementation class containing the vending machine logic.

- `ConsoleUI`  
  Handles user interaction through the console menu.

- `Main`  
  Starts the application.

- `VendingMachineImplTest`  
  Contains JUnit tests for the core business logic.

## OOP Concepts Used
This project applies several important OOP principles:

### Abstraction
The `Product` class is abstract and defines common properties for all products.

### Inheritance
`Snack`, `Beverage`, and `Fruit` inherit from the `Product` class.

### Polymorphism
Different product types are handled through a common `Product` reference.

### Encapsulation
Class fields are private and accessed through getters and setters.

### Interface
The `IVendingMachine` interface defines the required behavior of the vending machine.

## How to Run the Application

### Run from IntelliJ IDEA
1. Open the project in IntelliJ IDEA
2. Open `Main.java`
3. Run the `main` method

### Run from Command Line using JAR
After packaging the application, run the following command:

```bash
java -jar target/VendingMachineApp-1.0-SNAPSHOT.jar
