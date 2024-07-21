public class Account {

    private double balance;
    private String accountNumber;
    private String accountHolderName;

    public Account(double balance, String accountNumber, String accountHolderName) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public double checkBalance(){
        return balance;
    }

    public void withdraw(double amount){
        if (amount <=balance){
            balance -= amount;
            // Log transaction (could be implemented later)
            // logTransaction("Withdrawal", amount);
        }else {
            System.out.println("Insufficient funds. ");
        }
    }

    public void deposit(double amount){
        balance += amount;
        // Log transaction (could be implemented later)
        // logTransaction("Withdrawal", amount);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
}
