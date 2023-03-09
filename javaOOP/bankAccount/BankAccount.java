public class BankAccount {
    private String checking;
    private String savings;
    private double checkingBalance;
    private double savingsBalance;

    private static int numberOfAccounts = 0;
    private static double totalAccountsBalance = 0;

    // constructor
    public BankAccount(){
        BankAccount.numberOfAccounts++;
    }

// static methods
    public static int totalAccounts() {return numberOfAccounts;}
    public static double totalBalance() {return totalAccountsBalance;}

//  deposit into either type of account 
    public void deposit(String accountType, double amount){
        BankAccount.totalAccountsBalance += amount;
        if(accountType.equals("checking")){
            this.setCheckingBalance(this.checkingBalance + amount);
        } else {
            this.setSavingsBalance(this.savingsBalance + amount);
        }
    }

// withdraw method
    public void withdraw( String accountType, double amount) {
        if(accountType.equals("checking")){
            if(this.checkingBalance >= amount){
                BankAccount.totalAccountsBalance -= amount;
                this.setCheckingBalance(this.checkingBalance - amount);
            } 
        } else {
            if(this.savingsBalance >= amount){
                BankAccount.totalAccountsBalance -= amount;
                this.setSavingsBalance(this.savingsBalance - amount);
            }
        }
    }

    // get total from checking and savings
    public double getBothBalances(){
        double total = this.getCheckingBalance() + this.getSavingsBalance();
        return total;
    }

// getters and setters
    public double getCheckingBalance() {return checkingBalance;}
    public void setCheckingBalance(double amount){ this.checkingBalance = amount;}

    public double getSavingsBalance() {return savingsBalance;}
    public void setSavingsBalance(double amount){ this.savingsBalance = amount;}

}