import java.util.HashMap;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, String> users = new HashMap<>();
        HashMap<String, Integer> balances = new HashMap<>();
        boolean exit = false;
        System.out.println("Welcome to the ATM. Please enter your username and pin to proceed.");

        while (!exit){
            System.out.println("Enter your username: ");
            String username = sc.nextLine();

            if (!users.containsKey(username)) {
                System.out.println("User doesn't exists, please enter pin to create a new account");
                System.out.println("Enter your pin: ");
                String userPin = sc.nextLine();
                users.put(username, userPin);
                balances.put(username, 0);
                System.out.println("Account created successfully!");
            }else{
                System.out.println("User exists, please enter your pin");
                String userPin = sc.nextLine();

                if(users.get(username).equals(userPin)){
                    System.out.println("Correct pin, Welcome " + username);

                    handleUserSession(username, balances, sc);
                }else {
                    System.out.println("Incorrect pin. Please try again");
                }
            }
        // Prompt the user if they want to exit or continue
        System.out.println("Do you want to perform another transaction? (yes/no)");
        String response = sc.nextLine().toLowerCase();
        if (!response.equals("yes")) {
            exit = true;
            System.out.println("Thank you for using the ATM. Goodbye!");
        }else{
            exit = handleUserSession(username, balances, sc);
        }

        }
    }

    public static void printMenu() {
        System.out.println("Please select an option");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check balance");
        System.out.println("4. Exit");

    }

    public static boolean handleOption(int option, String username, HashMap<String, Integer> balances, Scanner sc) {
        switch (option) {
            case 1:
                System.out.println("Enter amount to withdraw:");
                int withdrawAmount = sc.nextInt();
                sc.nextLine(); // Consume newline
                if (withdrawAmount > balances.get(username)) {
                    System.out.println("Insufficient balance.");
                } else {
                    balances.compute(username, (k, currentBalance) -> (currentBalance == null ? 0 : currentBalance) - withdrawAmount);
                    System.out.println("Amount withdrawn: " + withdrawAmount);
                }
                break;
            case 2:
                System.out.println("Enter amount to deposit:");
                int depositAmount = sc.nextInt();
                sc.nextLine(); // Consume newline
                balances.put(username, balances.get(username) + depositAmount);
                System.out.println("Amount deposited: " + depositAmount);
                break;
            case 3:
                System.out.println("Your balance is: " + balances.get(username));
                break;
            case 4:
                System.out.println("Thank you for using the ATM.");
                return false; // Exit the session
            default:
                System.out.println("Invalid option. Please try again.");
        }
        return true; // Continue the session
    }

    public static boolean handleUserSession(String username, HashMap<String, Integer> balances, Scanner sc) {
        boolean isSessionActive = true;

        while (isSessionActive) {
            printMenu();
            int option = sc.nextInt();
            sc.nextLine(); // Consume the newline
            isSessionActive = handleOption(option, username, balances, sc);

        }
        return true;
    }

}