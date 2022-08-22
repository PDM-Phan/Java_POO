package Class_2_Account;
import java.util.Scanner;

public class Account {
    private String numAcc;
    private String owner;
    private double balance;
    private boolean status;
    
    
    public Account() {
        this.numAcc = "";
        this.owner = "";
        this.balance = 0;
        this.status = false;
    }
    
    //Methods...
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
            this.setBalance(50);
        }
    }
    
    public void closeAccount() {
        if (this.getStatus() == false) {
            System.out.println("This account is already innactive.");
        } else {
            if (this.getBalance() < 0) {
                System.out.println("Impossible to close this account while in debt.");
            } else {
                System.out.println("R$" + this.getBalance() + "has been drawee.");
                this.withdrawn(this.getBalance());
                this.setStatus(false);
                System.out.println("Account closed.");
            }
        }
    }
    
    public void deposit(double value) {
        if (this.getStatus()) {
            double b = this.getBalance();
            this.setBalance(b + value);
        }
    }
    
    public void withdrawn(double value) {
        if (this.getStatus()) {
            double b = this.getBalance();
            if (value <= b) {
                this.setBalance(b - value);
            } else {
                System.out.println("Insufficent funds.");
            }
        }
    }
    
    public void monthlyPay() {
        if (this.getStatus())
        this.setBalance(this.getBalance() - 12);
    }
    
    //Getters...
    public String getNumAcc() {
        return this.numAcc;
    }
    
    public String getOwner() {
        return this.owner;
    }
    
    public double getBalance() {
        return this.balance;
    }
    
    public boolean getStatus() {
        return this.status;
    }
    
    //Setters...
    public void setNumAcc(String account) {
        this.numAcc = account;
    }
    
    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        String s = String.format("\nAccount Number: %s\nOwner Name: %s\nBalance: R$%.2f\nStatus: %b\n",
        this.getNumAcc(), this.getOwner(), this.getBalance(), this.getStatus());
        return s;
    }
}
