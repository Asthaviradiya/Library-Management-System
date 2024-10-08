# Library Management System

## Introduction
This project is a simple library management system that allows users to perform basic operations like adding books,borrowing books,returning borrowed books and view details of available books.The system is built using **Java** and adhere to **JUnit** for TDD.

## Prerequisites
Before you can run this project, ensure you have the following installed:

* Java (19.0.2 or later)
* JUnit (4.8 or later)
* SDK(18 or above)

## Installation

1.**Clone the repository:**
```bash
git clone https://github.com/yash-dedaniya/Library-Management-System.git
```

## Dependencies
To use JUnit for testing, add the following dependency to your `pm.xml` file:
```xml
<dependency>
   <groupId>org.junit.jupiter</groupId>
   <artifactId>junit-jupiter-api</artifactId>
   <version>5.9.3</version>
   <scope>test</scope>
</dependency>

        <!-- https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine -->
<dependency>
<groupId>org.junit.jupiter</groupId>
<artifactId>junit-jupiter-engine</artifactId>
<version>5.9.3</version>
<scope>test</scope>
</dependency>

<dependency>
<groupId>org.junit.jupiter</groupId>
<artifactId>junit-jupiter-params</artifactId>
<version>5.9.3</version>
<scope>test</scope>
</dependency>
```

## Usage
1. Run the application :
   To run the app first open your bash or command prompt then locate to the directory where you have this 3 .java files
   ```bash
   javac -d . *.java
   java.com.Library.LibraryManagement
   ```

2. Interact with the system
* First enter choice according to shown menu
* **Add a book**: Provide the ISBN,title,author and publication year.
* **Borrow a book**: Enter the ISBN of the book you want to borrow.
* **Return a book**: Enter the ISBN of the book you want to return
* **View Available books**: List all available book

## Testing
* To run the test cases,use the IDE like IntelliJ IDEA, Eclipse which have built-in support for running JUnit tests.
* Locate the "Run" or "Test" menu and select the appropriate option to execute your test class.

## Contributing
Contributions are welcome! Please follow these guidelines:
1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Make your changes and commit them with descriptive messages.
4. Push your changes to your fork.
5. Submit a pull request to the main repository.
