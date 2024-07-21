# ATM Machine Project

## Overview

This is a simple ATM machine simulation built in Java. It allows users to perform basic banking operations such as checking balance, withdrawing and depositing money, and viewing transaction history.

## Project Structure

- `src/`
  - `main/java/com/atm/`
    - `ATM.java`: Main class for the ATM machine.
    - `Account.java`: Class representing a bank account.
    - `Transaction.java`: Class for handling and logging transactions.
  - `test/java/com/atm/`
    - `ATMTest.java`: Unit tests for the `ATM` class.
    - `AccountTest.java`: Unit tests for the `Account` class.
    - `TransactionTest.java`: Unit tests for the `Transaction` class.
- `build.gradle` (or `pom.xml` if using Maven): Build configuration file.
- `README.md`: Project documentation.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Gradle or Maven (depending on your build system)

### Building the Project

1. **Using Gradle**:
   - Open a terminal and navigate to the project root directory.
   - Run `gradle build` to compile the project.

2. **Using Maven**:
   - Open a terminal and navigate to the project root directory.
   - Run `mvn package` to compile the project.

### Running the Application

1. **Compile the Code**:
   - Run `gradle build` (for Gradle) or `mvn package` (for Maven) to ensure the code is compiled.

2. **Run the Application**:
   - Execute the `ATM` class using your IDE or from the command line:
     ```bash
     java -cp build/libs/ATMProject.jar com.atm.ATM
     ```

### Usage

1. **Start the Application**:
   - Run the application. You will be prompted to enter a PIN.

2. **Menu Options**:
   - **1**: Check Balance
   - **2**: Withdraw
   - **3**: Deposit
   - **4**: Transaction History
   - **5**: Exit

3. **Perform Transactions**:
   - Follow the on-screen instructions to perform various operations.

## Testing

1. **Unit Tests**:
   - Unit tests are provided for the `ATM`, `Account`, and `Transaction` classes.
   - Run the tests using Gradle or Maven:
     - For Gradle: `gradle test`
     - For Maven: `mvn test`

## Notes

- The ATM simulation uses a fixed PIN for authentication (`1234`). In a real-world application, this would be replaced with a secure authentication mechanism.
- Transaction logging is basic and prints to the console. For a real application, you might want to store these logs in a database or file.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact

For any questions or feedback, please reach out to [m.hakiminazli@gmail.com](mailto:m.hakiminazli@gmail.com).
