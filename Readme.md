# Amazon Automation Engineering Assignment

## Overview

This project is an automated test framework developed using **Java**, **Selenium WebDriver**, **TestNG**, and **Maven** to automate product search and cart operations on Amazon.

The framework follows the **Page Object Model (POM)** design pattern and supports **parallel execution** using TestNG.

---

## Assignment Requirements

### Test Case 1

1. Navigate to Amazon.
2. Search for an iPhone device.
3. Open the product details page.
4. Add the product to the shopping cart.
5. Navigate to the cart.
6. Retrieve and print the product price in the console.

### Test Case 2

1. Navigate to Amazon.
2. Search for a Samsung Galaxy device.
3. Open the product details page.
4. Add the product to the shopping cart.
5. Navigate to the cart.
6. Retrieve and print the product price in the console.

### Parallel Execution

Both test cases are executed in parallel using TestNG.

---

## Technology Stack

* Java 22
* Selenium WebDriver 4.27.0
* TestNG 7.10.2
* Maven
* Chrome Browser
* Page Object Model (POM)

---

## Framework Structure

```text
├───src
│   ├───main
│   │   └───java
│   │       └───amazon
│   │           └───automationTest
│   └───test
│       └───java
│           └───amazon
│               └───automationTest
│                   ├───basePackage
│                   ├───environmentVariables
│                   ├───POMPackages
│                   ├───screenshots
│                   ├───testLayer
│                   └───utility
├───target
│   ├───classes
│   │   ├───amazon
│   │   │   └───automationTest
│   │   └───META-INF
│   │       └───maven
│   │           └───amazon
│   │               └───automationTest
│   └───test-classes
│       └───amazon
│           └───automationTest
│               ├───basePackage
│               ├───environmentVariables
│               ├───POMPackages
│               ├───screenshots
│               ├───testLayer
│               └───utility
└───test-output
    ├───AmazonSuite
    ├───Default suite
    ├───junitreports
    └───Suite

```

---

## Prerequisites

* Java JDK 22 or higher
* Maven 3.9+
* Google Chrome Browser
* ChromeDriver compatible with installed Chrome version

---

## Installation

Clone the repository:

```bash
git clone <repository-url>
```

Navigate to project directory:

```bash
cd amazon-automation-assignment
```

Install dependencies:

```bash
mvn clean install
```

---

## Running the Tests

Run all tests:

```bash
mvn test
```

Run TestNG Suite:

```bash
mvn test -DsuiteXmlFile=testng.xml
```

Or execute directly from Eclipse/IntelliJ:

1. Right-click `testng.xml`
2. Select **Run As → TestNG Suite**

---

## Parallel Execution Configuration

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

This configuration executes the iPhone and Galaxy test cases simultaneously.

---

## Features Implemented

* Selenium WebDriver automation
* TestNG test execution
* Parallel execution support
* Page Object Model design pattern
* Explicit waits
* Dynamic element handling
* Product price retrieval
* Console reporting

---

## Notes

Amazon's UI is dynamic and may change frequently. To improve stability:

* Explicit waits are used wherever required.
* Dynamic locators are implemented for cart navigation.
* Retry mechanisms can be added to handle stale element scenarios.

---

## Sample Console Output

```text
iPhone Price : $999.99
Galaxy Price : $849.99
```

---

## Author

Souvik Sharma

Automation Engineer | Selenium | Java | TestNG | API Testing | Cloud Automation
