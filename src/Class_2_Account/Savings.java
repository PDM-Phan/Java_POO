package Class_2_Account;
import java.util.Scanner;

public class Savings extends Account{
    private double income;
    
    public Savings(double income) {
        super();
        this.income = income;
    }
    //Getters and Setters...
    public double getIncome() {
        return this.income;
    }
    
    public void setIncome(double fees) {
        this.income = fees;
    }
    
    @Override
    public void openAccount() {
        if (this.getStatus() == false) {
            Scanner input = new Scanner(System.in);
            String account_input;
            String owner_input;

            while (true) {
                System.out.println("Account Number:");
                account_input = input.nextLine().strip();
                if ("".equals(account_input)) {
                    System.out.println("Type again.");
                } else {
                    this.setNumAcc(account_input);
                    break;
                }
            }
            while (true) {
                System.out.println("Owner Name:");
                owner_input = input.nextLine().strip();
                if ("".equals(owner_input)) {
                    System.out.println("Type again.");
                } else {
                    this.setOwner(owner_input);
                    break;
                }
            }
            this.setStatus(true);
            this.setBalance(150);
        }
    }
    
    @Override
    public void monthlyPay() {
        if (this.getStatus())
        this.setBalance(this.getBalance() - 20);
    }
    
    @Override
    public String toString() {
        String s = super.toString() + 
                   String.format("Income Rate: %.2f", this.getIncome())
                   + "%\n";
        return s;
    }
}
