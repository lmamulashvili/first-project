# Automated Test Suite for Saucedemo E-Commerce Website

## Overview
This repository contains an automated test suite for the e-commerce website [Saucedemo](https://www.saucedemo.com/). The suite includes a range of test cases to ensure the functionality and reliability of key features on the site.

## Test Cases
We have implemented 10 test cases, covering both positive and negative scenarios:

### Authentication
- **Login with Correct Data:** Verifies successful login with valid credentials.
- **Login with Incorrect Data:** Checks the behavior with invalid credentials.
- **Login with Empty Data:** Tests the response to empty login fields.
- **Logout:** Ensures the logout functionality works correctly.

### Home Page
- **Scroll to Page Bottom:** Validates the ability to scroll to the bottom of the home page.

### Social Links
- **Opening Social Links:** Tests the functionality of social media links.

### Cart
- **Add Products to Cart:** Confirms that products can be added to the shopping cart.
- **Remove Products from Cart:** Checks the functionality to remove items from the cart.

### Ordering
- **Successful Order:** Tests the complete process of placing an order successfully.
- **Failed Order:** Simulates the scenario of an order failing.

## Execution
To run the tests, use the provided `testng.xml` file.

## Generating Test Report
To generate a test report, first run the tests using `testng`. Then, ensure you are in the root folder of the project in your terminal, and execute the following command:

```bash
allure serve allure-results
```
This will start a localhost server for the Allure report. 
In order to access the report GUI, visit the link provided in the terminal in your preferred browser.

## Tools Used
- **Java 21:** For writing test scripts.
- **Selenium:** To automate browser actions.
- **TestNG:** As a testing framework.
- **JavaFaker:** For generating dynamic test data.
- **Allure Report:** For generating comprehensive test reports.

## Code Organization
The codebase is organized to separate reusable components from specific implementations, enhancing robustness and ease of adding new test cases:
- **Data.java:** Generates inputs using JavaFaker.
- **Objects.java:** Targets specific sections of the webpage, such as social buttons and various inputs.
- **Steps.java:** Contains reusable actions performed on the webpage, like entering username and password, clicking the login button, etc.


