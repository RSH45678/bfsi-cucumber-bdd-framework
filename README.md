# 🏦 Banking BDD Automation Framework (Selenium + Cucumber + TestNG)

## 📌 Project Overview

This project is a BDD-based Test Automation Framework for a banking domain application built using Selenium WebDriver, Cucumber BDD, TestNG, and Maven following the Page Object Model (POM) design pattern.

It automates:
- Login
- Account Balance Check
- Fund Transfer / Beneficiary Flow
- Logout

---

## 🌐 Application Used

https://parabank.parasoft.com/parabank/index.htm

---

## ⚙️ Tech Stack

- Java
- Selenium WebDriver
- Cucumber BDD
- TestNG
- Maven
- WebDriverManager
- Allure Reporting

---

## 📂 Project Structure

```text
banking-bdd-framework
│
├── src
│   ├── main
│   └── test
│       ├── java
│       │   ├── hooks
│       │   ├── pages
│       │   ├── runners
│       │   ├── StepDefinitions
│       │   └── utils
│       │
│       └── resources
│           └── features
│               ├── login.feature
│               ├── balance.feature
│               ├── beneficiary.feature
│               └── logout.feature
│
├── target
│   ├── allure-results
│   ├── surefire-reports
│   ├── cucumber.json
│   └── cucumber-report.html
│
├── pom.xml
└── .gitignore
```

---

## 🎯 Features Covered

- Login Automation
- Account Balance Verification
- Fund Transfer Workflow
- Logout Validation

---

## ▶️ How to Run the Project

### Run using Maven

```bash
mvn clean test
```

---

## 📊 Reports

### Cucumber Report
```text
target/cucumber-report.html
```

### Allure Report
```text
target/allure-results
```

Run Allure report:
```bash
allure serve target/allure-results
```

---

## 👩‍💻 Resume Project Highlight

- Developed a Banking Domain BDD Automation Framework using Selenium WebDriver, Cucumber BDD, TestNG, and Maven with Page Object Model (POM).

- Automated Login, Balance Check, Fund Transfer, and Logout workflows with reusable feature files, step definitions, and Allure reporting integration.

---

## 🚀 Future Enhancements

- Parallel execution
- Jenkins CI/CD integration
- Cross-browser testing
- Screenshot capture on failure
- Extent Reports integration

