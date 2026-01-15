public class BankAccount {
    private int accNo;
    private String accType;
    private double balance;

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }
    
    public int getAccNo() {
        return accNo;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public String getAccType() {
        return accType;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();

        ba.setAccNo(12345);
        ba.setAccType("Savings");
        ba.setBalance(50000.5);

        System.out.println("Account Number : " + ba.getAccNo());
        System.out.println("Account Type : " + ba.getAccType());
        System.out.println("Balance : " + ba.getBalance());
    }
}
