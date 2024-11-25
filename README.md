# ATM Simulation in Java

## Overview
This Java program simulates a basic ATM (Automated Teller Machine) system. It allows users to create accounts, authenticate using a username and PIN, and perform banking transactions such as withdrawals, deposits, and balance inquiries. The system uses Java's `HashMap` to store user data and balances, ensuring quick access to account information.

---

## Features
```plaintext
1. User Registration:
   - New users can create an account by providing a username and PIN.

2. User Authentication:
   - Existing users can log in using their username and PIN.

3. Banking Transactions:
   - Withdraw Funds: Withdraw a specified amount if the balance is sufficient.
   - Deposit Funds: Add funds to the user's account.
   - Check Balance: View the current account balance.

4. Session Management:
   - Users can perform multiple transactions during a session until they choose to exit.
```

---

## How It Works
```plaintext
1. User Login/Registration:
   - When the program starts, users are prompted to log in with a username.
   - If the username does not exist, the user is prompted to create an account by entering a PIN.

2. Authenticated Session:
   - After successful authentication, the user can perform various transactions by selecting options from a menu.
   - The session remains active until the user explicitly chooses to exit.

3. Persistent Menu:
   - Users can return to the main menu to perform additional transactions until they exit.

```

---

## Code Structure
The program consists of the following:
1. Main Class:
    - Handles the program's flow, including login, registration, and session initiation.

2. `printMenu` Method:
    - Displays the list of available options to the user.

3. `handleOption` Method:
    - Executes the user's chosen transaction (withdraw, deposit, check balance, or exit).

4. `handleUserSession` Method:
    - Manages the session for the authenticated user, allowing repeated transactions.


## How to Use
1. Run the Program:
    - Compile and execute the program in a Java-supported IDE or command line.

2. Follow Prompts:
    - Enter a username.
    - If new, create an account by entering a PIN.
    - If existing, log in by entering the correct PIN.

3. Choose Transactions:
    - Select an option from the menu to withdraw, deposit, or check your balance.
    - After each transaction, return to the menu or exit.

4. End Session:
    - Choose to exit from the menu or indicate that you do not want to perform further transactions.


## Example Output
```plaintext
Welcome to the ATM. Please enter your username and pin to proceed.
Enter your username: JohnDoe
User doesn't exist, please enter pin to create a new account
Enter your pin: 1234
Account created successfully!

Enter your username: JohnDoe
User exists, please enter your pin
Enter your pin: 1234
Correct pin, Welcome JohnDoe
Please select an option
1. Withdraw
2. Deposit
3. Check balance
4. Exit
```

## Dependencies
- Java SE 8 or above
- No external libraries required.

## Notes
- The program does not save data permanently. All information is stored in memory and is lost when the program exits.
- Input validation is minimal. Avoid entering invalid inputs (e.g., text where numbers are expected) to prevent runtime errors.


## Future Enhancements
- Add persistent storage (e.g., a database or file system) for user data and balances.
- Implement enhanced security measures such as PIN encryption.
- Include input validation to handle invalid inputs gracefully.
- Add an admin interface to manage user accounts.


## Conclusion
This ATM simulation program provides a basic framework for managing user accounts and performing banking transactions. It demonstrates the use of Java's `HashMap` for storing user data and balances, as well as the flow of user authentication and session management. The program can be extended with additional features and security measures to create a more robust and secure banking system.

