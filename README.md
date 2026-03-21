```
Overview

This project automates the Cleartrip flight search functionality using Selenium WebDriver with Java and TestNG.

The automation simulates a guest user journey to search for flights and validate key information on the results page without proceeding to booking.

This project demonstrates handling of:

Dynamic web elements
Auto-suggestion dropdowns
Calendar date selection
Explicit waits
Result page validations


Use Case

Automate the following scenario on Cleartrip.

Steps
Open https://www.cleartrip.com
Dismiss sign-in popup if displayed
Select Flights tab
Select One Way journey
Enter From city using suggestion list
Enter To city using suggestion list
Pick a future departure date
Click Search Flights
Verify flight results display:
Airline Name
Flight Price

Cleartrip-Automation/
│
├── pom.xml
├── testng.xml
│
├── src/main/java
│   ├── pages
│   │   ├── FlightSearchPage.java
│   │   └── FlightResultsPage.java
│   │
│   ├── base
│   │   └── BaseClass.java
│   │
│   ├── utils
│   │   └── WaitUtils.java
│
├── src/test/java
│   └── tests
│       └── FlightSearchTest.java
│
├── reports
│   └── screenshots
│
└── README.md


Tech Stack
Tool	Version
Java	8+
Selenium WebDriver	4.x
TestNG	7.x
Maven	3.x
ChromeDriver	Latest
```
```
Framework Design

The framework follows Page Object Model (POM).

Components

BaseClass

Driver initialization
Browser setup
Test setup & teardown

Page Classes

Contains locators and actions for Cleartrip pages

Test Classes

Contains TestNG test scenarios

Utils

Explicit waits
Reusable functions

Skills Demonstrated
Selenium WebDriver
TestNG Framework
Page Object Model
Explicit Waits
Dynamic Web Element Handling
Automation Framework Design
Git & GitHub

🚀 Future Improvements
Data Driven Testing (Excel / JSON)
Allure Reporting
CI/CD Integration (GitHub Actions)
Cross Browser Testing
Retry Failed Tests
```
