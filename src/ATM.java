import java.util.Scanner;

public class ATM {
    private static final String CORRECT_PIN = "1234";
    private Account account;

    public ATM(Account account) {
        this.account = account;
    }

    public boolean authenticateUser(String inputPin) {
        return CORRECT_PIN.equals(inputPin);
    }

    public void displayMenu() {
        System.out.println("Welcome to ATM Machine ");
        String optionMenu = """
                1. Check Account Balance
                2. Cash Withdrawal
                3. Deposit
                4. Transaction History
                5. Exit
                """;
        System.out.println(optionMenu);

    }

    public void performTransaction(int choice) {
        Scanner scanner = new Scanner(System.in);
        switch (choice) {
            case 1:
                System.out.println("Current Balance: " + account.checkBalance());
                break;
            case 2:
                System.out.println("Enter amount to withdraw: ");
                double withdrawAmount = scanner.nextDouble();
                account.withdraw(withdrawAmount);
                //log method below
                System.out.println("Withdrawal successful.");
                break;
            case 3:
                System.out.println("Enter amount to deposit: ");
                double depositAmount = scanner.nextDouble();
                account.deposit(depositAmount);
                //log method below
                System.out.println("Deposit successful!");
                break;
            case 4:
                System.out.println("Transaction History:");
                //method transaction here
                break;
            case 5:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM(new Account(1000.00,"12345678", "John Doe"));

        String userPin = "1234";
        if (atm.authenticateUser(userPin)) {
            System.out.println("Authentication successful...\n");

            atm.displayMenu();
            //Proceed to dislay menu and perform transaction

            int choice;
            do {
                choice = scanner.nextInt();
                atm.performTransaction(choice);
            } while (choice != 5);

        } else {
            System.out.println("Authentication failed!");
            //Retry or exit
        }
    }
}
