package Class_2_Account;

public class Main_Program {
    public static void main(String[] args) {
        //Testing classes...
        //Creating the objetts...
        Account acc = new Account();
        Savings sav = new Savings(20);
        acc.openAccount();
        sav.openAccount();
        //Testing their methods...
        acc.deposit(100);
        acc.monthlyPay();
        acc.withdrawn(50);
        System.out.println(acc.toString());
        sav.deposit(50);
        sav.montlhycalculateIncome(6);
        System.out.println(sav.toString());
        acc.closeAccount(); 
        sav.transfer(acc, 20);
    }
}
