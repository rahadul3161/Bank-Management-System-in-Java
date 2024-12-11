package bankingApplication;

public class Branch {
    private String branchName;
    private int branchCode;

    public Branch(String branchName, int branchCode) {
        this.branchName = branchName;
        this.branchCode = branchCode;}

    public String getBranchName() {
        return branchName;}

    public int getBranchCode() {
        return branchCode;}

    public void getBranchDetails() {
        System.out.println("Name of the Branch: " + branchName);
        System.out.println("Branch routing no.: "+branchCode);}
}
