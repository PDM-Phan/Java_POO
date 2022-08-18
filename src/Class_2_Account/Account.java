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
    }
    
    public void closeAccount() {
        if (this.getStatus() == false) {
            System.out.println("This account is already invalid.");
        } else {
            this.setStatus(false);
            this.setBalance(0);
        }
    }
    
    public void deposit(double value) {
        double b = this.getBalance();
        this.setBalance(b + value);
    }
    
    public void withdrawn(double value) {
        double b = this.getBalance();
        this.setBalance(b - value);
    }
    
    public void printAccount() {
        System.out.printf("Account Number: %s\nOwner Name: %s\nBalance: %.2f\nStatus: %b\n",
                this.getNumAcc(), this.getOwner(), this.getBalance(), this.getStatus());
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
}
