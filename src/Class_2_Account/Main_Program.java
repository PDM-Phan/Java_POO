package Class_2_Account;

public class Main_Program {
    public static void main(String[] args) {
        //Testing classes...
        Account acc = new Account();
        Savings sav = new Savings(5);
        acc.openAccount();
        sav.openAccount();
        acc.deposit(100);
        acc.monthlyPay();
        acc.withdrawn(50);
        System.out.println(acc.toString());
        sav.monthlyPay();
        sav.deposit(12);
        sav.withdrawn(30);
        System.out.println(sav.toString());
        acc.closeAccount();
        sav.closeAccount();
    }
}
