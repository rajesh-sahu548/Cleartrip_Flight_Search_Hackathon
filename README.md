# ✈️ Cleartrip Flight Search Automation

## 📌 Overview
This project automates a guest user journey on Cleartrip to search for flights and validate key information such as airline name and price.

The objective is to simulate real user behavior and validate the flight search functionality without completing a booking.

---

## 🎯 Use Case Covered

1. Open https://www.cleartrip.com  
2. Dismiss sign-in prompt if displayed  
3. Select Flights and One Way journey  
4. Enter From and To cities using suggestion list  
5. Pick a future departure date  
6. Click Search flights  
7. Verify flight results (airline name & price)

---

## 🛠️ Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Maven
- WebDriverManager

---

## 📂 Project Structure

---

## 🚀 How to Run

1. Clone the project
2. Open in Eclipse 
3. Right click project → Maven → Update Project
4. Install TestNG plugin (if not installed)
5. Run test:
   - Right click `testng.xml`
   - Run As → TestNG Suite

---

## ✅ Test Scenario Implemented

| Step | Action | Validation |
|------|-------|-----------|
| 1 | Open website | Page loads successfully |
| 2 | Dismiss popup | No interruption |
| 3 | Select Flights + One Way | Option selected |
| 4 | Enter cities | Suggestion list works |
| 5 | Select future date | Date selected |
| 6 | Click search | Navigates to results |
| 7 | Validate results | Airline & price visible |

---

## ⚠️ Challenges Handled

- Dynamic UI elements
- Auto-suggestion dropdown
- Calendar handling
- Optional login popup
- Asynchronous loading

---

## 💡 Key Features

- Page Object Model (POM) design
- Explicit waits for stability
- Reusable code structure
- Robust locator strategy
- Clean separation of test & page logic

---

## 🔥 Important Notes

- Cleartrip UI is dynamic → locators may change
- Popup may or may not appear → handled safely
- No booking flow included (as per requirement)

---

## 🧠 Interview Explanation

This framework demonstrates:

- Real-world automation of travel website
- Handling dynamic elements
- Writing stable and maintainable test scripts
- Covering both UI interaction and validation

---

## 🚀 Future Enhancements

- Add screenshot on failure
- Add Extent Reports
- Parallel execution
- Data-driven testing (Excel/CSV)
- Retry mechanism for failed tests

---

## 👨‍💻 Author
Suraj Kumar
