package bankingApplication;

public class Account {
    private double balance;
    private int accountId;
    private Customer accountHolder;

    public Account(int accountId, Customer accountHolder) {
        this.accountId = accountId;
        this.accountHolder = accountHolder;
        this.balance = 0;}

    public int getAccountId() {
        return accountId;}

    public double getBalance() {
        return balance;}

    public Customer getAccountHolder() {
        return accountHolder;}

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Balance have deposited "+amount);
        System.out.println("Total Balance: "+balance);}

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Balance have withdrawn "+amount);
            /*System.out.println("New Balance after withdraw: "+balance);*/}
        else {
            System.out.println("Insufficient balance.");}
    }
}
