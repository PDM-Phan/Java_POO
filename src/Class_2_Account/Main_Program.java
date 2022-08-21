package Class_2_Account;

public class Main_Program {
    public static void main(String[] args) {
        //Testing classes...
        Account acc = new Account();
        Savings sav = new Savings(5);
        acc.openAccount();
        sav.openAccount();
        System.out.println(acc.toString());
        System.out.println(sav.toString());
    }
}
