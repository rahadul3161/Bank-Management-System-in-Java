package bankingApplication;

public class Bank1 implements BankingInterface {
    private Account account;
    private String bankName;

    public Bank1(Account account) {
        this.account = account;
        this.bankName = "Bank1";}

    public void deposit(double amount) {
        account.deposit(amount);}

    public void withdraw(double amount) {
        account.withdraw(amount);}

    public double getBalance() {
        return account.getBalance();}

    public String getBankName() {
        return bankName;}
}