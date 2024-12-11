package bankingApplication;

public class BankingApp {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Md Rahadul Islam", 2311231);
        Customer customer2 = new Customer("Md Riyad Hossain", 2311232);

        Account account1 = new Account(100001, customer1);
        Account account2 = new Account(100002, customer2);

        Bank1 bank1 = new Bank1(account1);
        Bank2 bank2 = new Bank2(account2);

        Branch branch1 = new Branch("This is main branch", 1234567891);
        Branch branch2 = new Branch("This is downtown branch", 1234567892);

        System.out.println("*** This is Bank1 Operations ***");
        bank1.deposit(5000);
        bank1.withdraw(1000);
        System.out.println("Now total balance in "+bank1.getBankName()+" is: "+bank1.getBalance());
        System.out.println("");

        System.out.println("*** And this is Bank2 Operations ***");
        bank2.deposit(10000);
        bank2.withdraw(2000);
        System.out.println("Now, total balance in "+bank2.getBankName()+" is: "+bank2.getBalance());
        System.out.println("");

        customer1.getCustomerDetails();
        customer2.getCustomerDetails();
        branch1.getBranchDetails();
        branch2.getBranchDetails();
    }
}

