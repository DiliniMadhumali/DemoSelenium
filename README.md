# DemoSelenium2

This project demonstrates basic Selenium WebDriver usage for web browser automation.

## Overview

This repository contains a simple Selenium WebDriver project, designed to showcase fundamental concepts of web automation. It's intended for learning and demonstration purposes.

## Prerequisites

Before running this project, ensure you have the following installed:

-   **Java Development Kit (JDK):** Required for running Java-based Selenium code.
-   **Maven:** For managing project dependencies.
-   **Web Browser:** (Chrome, Firefox, etc.) and the corresponding WebDriver executable.
-   **Selenium WebDriver:** (Dependencies are managed by Maven in this project.)

## Setup

1.  **Clone the Repository:**

    ```bash
    git clone [https://github.com/DiliniMadhumali/DemoSelenium2.git](https://www.google.com/search?q=https://github.com/DiliniMadhumali/DemoSelenium2.git)
    cd DemoSelenium2
    ```

2.  **Install Dependencies:**

    If you are using an IDE like IntelliJ or Eclipse, Maven should automatically download dependencies. Otherwise, you can use the following command:

    ```bash
    mvn clean install
    ```

3.  **Configure WebDriver:**

    -   Download the WebDriver executable for your chosen browser (e.g., ChromeDriver for Chrome, GeckoDriver for Firefox).
    -   Place the WebDriver executable in a directory accessible to your system or specify the path in your code.

## Running the Tests

To run the Selenium tests, use the following Maven command:

```bash
mvn test
