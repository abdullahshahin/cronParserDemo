# cronParserDemo

This application is designed to parse cron job expressions. It supports standard cron syntax and provides functionality for validating and extracting specific values from cron expressions.

## Prerequisites

- Java 17 or higher
- Gradle 8.x or higher

## Getting Started

1. **Clone the repository:**

   ```bash
   git clone https://github.com/abdullahshahin/cronParserDemo
   cd cronParserDemo
   ```
2. **Build the application:**

Before running the application, ensure that you build the project:

    ```bash
    ./gradlew clean build
    ```

3. **Running the Application:**

After building, you can run the application with the following command:

    ```bash
    ./gradlew run --args="*/15 0 1,15 * 1-5 /usr/bin/find"
    ```
    
This command parses the provided cron expression and outputs the result.

## Notes
Make sure Java and Gradle are correctly installed and configured.
The application parses cron expressions and outputs detailed information for each time field.
