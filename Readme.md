# Amazon Automation Assignment

## Overview

This project is an automation framework developed using **Java**, **Selenium WebDriver**, **TestNG**, and **Maven** to automate product search and cart functionality on Amazon.

The framework follows the **Page Object Model (POM)** design pattern and supports **parallel execution** using TestNG.

---

# Assignment Scenarios

## Test Case 1 – iPhone Search

1. Navigate to Amazon.
2. Search for an iPhone device.
3. Open the product details page.
4. Add the product to the shopping cart.
5. Navigate to the cart.
6. Retrieve and print the product price to the console.

---

## Test Case 2 – Samsung Galaxy Search

1. Navigate to Amazon.
2. Search for a Samsung Galaxy device.
3. Open the product details page.
4. Add the product to the shopping cart.
5. Navigate to the cart.
6. Retrieve and print the product price to the console.

---

## Parallel Execution

Both test cases are executed in parallel using TestNG.

---

# Technology Stack

* Java 22
* Selenium WebDriver 4.x
* TestNG 7.x
* Maven
* Chrome Browser
* Page Object Model (POM)

---

# Project Structure

```text
amazon-automationTest
│
├── src
│   ├── main
│   │   └── java
│   │       └── amazon
│   │           └── automationTest
│   │
│   └── test
│       └── java
│           └── amazon
│               └── automationTest
│                   │
│                   ├── basePackage
│                   │   └── BaseClass.java
│                   │
│                   ├── environmentVariables
│                   │   └── Environment Configuration
│                   │
│                   ├── POMPackages
│                   │   └── Page Object Classes
│                   │
│                   ├── screenshots
│                   │   └── Failure Screenshots
│                   │
│                   ├── testLayer
│                   │   ├── IphoneTest.java
│                   │   └── GalaxyTest.java
│                   │
│                   └── utility
│                       └── Utility Classes
│
├── target
│   ├── classes
│   └── test-classes
│
├── test-output
│   ├── AmazonSuite
│   ├── Default suite
│   ├── junitreports
│   └── Suite
│
├── pom.xml
├── testng.xml
└── README.md
```

---

# Framework Design

The framework is implemented using:

* Page Object Model (POM)
* Explicit Waits
* Reusable Base Class
* Utility Methods
* Screenshot Capture Support
* Parallel Test Execution
* Maven Build Management

---

# Prerequisites

Install the following before execution:

* Java JDK 22+
* Maven 3.8+
* Google Chrome Browser
* Compatible ChromeDriver

Verify installation:

```bash
java -version
mvn -version
```

---

# Setup Instructions

Clone the repository:

```bash
<<<<<<< HEAD
git clone https://github.com/devil99-ai/amazon-test.git
=======
git clone  https://github.com/devil99-ai/amazon-test.git
>>>>>>> 37d8859ce8dd49dc9e5ca304ac95b98183457863
```

Navigate to project:

```bash
cd amazon-test
```

Install dependencies:

```bash
mvn clean install
```

---

# Running the Tests

Execute all tests:

```bash
mvn test
```

Run TestNG suite:

```bash
mvn test -DsuiteXmlFile=testng.xml
```

Or from Eclipse:

1. Open the project.
2. Right-click on `testng.xml`.
3. Select **Run As → TestNG Suite**.

---

# Parallel Execution Configuration

```xml
<suite name="AmazonSuite"
       parallel="classes"
       thread-count="2">

    <test name="AmazonTests">
        <classes>
            <class name="amazon.automationTest.testLayer.IphoneTest"/>
            <class name="amazon.automationTest.testLayer.GalaxyTest"/>
        </classes>
    </test>

</suite>
```

This configuration executes both test classes simultaneously.

---

# Reporting

After execution, reports are generated under:

```text
<<<<<<< HEAD
test-output/
=======
Price of iphone is: ₹64,900
Price of galaxy s25 is: ₹62,999
===============================================
Suite
Total tests run: 2, Passes: 2, Failures: 0, Skips: 0
===============================================


>>>>>>> 37d8859ce8dd49dc9e5ca304ac95b98183457863
```

Including:

* HTML Reports
* JUnit Reports
* TestNG Reports

---

# Screenshot Support

Failure screenshots are automatically stored under:

```text
screenshots/
```

for easier debugging and analysis.

---
## LambdaTest Cloud Execution

This framework supports execution on LambdaTest Selenium Grid.

Set variables in config.properties:

username
access_key

Run:

mvn test -DexecutionType=cloud

The tests will execute on LambdaTest's cloud infrastructure and can be monitored from the LambdaTest dashboard.

# Features Implemented

* Product Search Automation
* Add to Cart Functionality
* Product Price Retrieval
* Page Object Model
* Explicit Wait Handling
* Parallel Test Execution
* Screenshot Capture
* TestNG Reporting
* Lambda Test Execution

---

# Notes

Amazon frequently updates its UI and dynamically refreshes page elements. Explicit waits and dynamic element handling have been implemented to improve test stability.

Some products may require additional user interactions depending on Amazon's regional settings and page behavior.

---

# Author

Souvik Sharma

Automation Engineer

* Selenium WebDriver
* Java
* TestNG
* API Testing
* Cloud Automation
* Network & Security Automation
