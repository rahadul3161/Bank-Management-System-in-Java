package bankingApplication;

public class Customer {
    private String name;
    private int customerId;
    public Customer(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    public String getName() {
        return name;}

    public int getCustomerId() {
        return customerId;}

    public void getCustomerDetails() {
        System.out.println("Customer Name: "+name);
        System.out.println("Customer ID: "+customerId);
    }
}
