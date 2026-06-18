package Overriding;
class Account{
    int balance = 1000;
    void info(){
        System.out.println(balance);
    }
}
class VIPAccount extends Account
{
    int bonus = 200;
    void info(){
        System.out.println(balance + bonus);
    }

}


public class Main3 {
    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new VIPAccount();
        a1.info();
        a2.info();
    }
}
