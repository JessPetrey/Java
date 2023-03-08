public class TestBankAccount {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.deposit("checking", 20);
        account1.deposit("checking", 30);
        account1.withdraw("checking", 10);
        System.out.printf("Checking balance: $%.2f \n", account1.getCheckingBalance());
        account1.deposit("savings", 30);
        account1.withdraw("savings", 10);
        System.out.printf("Savings balance: $%.2f \n", account1.getSavingsBalance());


        System.out.println("Number of accounts made: " + BankAccount.totalAccounts());
        System.out.printf("Sum of all account balances: $%.2f \n", BankAccount.totalBalance());
    }
}