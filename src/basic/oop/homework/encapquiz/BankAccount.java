package basic.oop.homework.encapquiz;

public class BankAccount {

    private int balance;
    private String accountNumber;
    private String accountHolder;

    BankAccount(String Number, String Name, int balance){
        this.balance = balance;
        this.accountHolder = Name;
        this.accountNumber = Number;
    }
    int getBalance() {
        return this.balance;
    }

    void deposit(int cash) {
        if (cash > 0) {
            this.balance += cash;
        };
    };

    void withdraw(int cash){
        if(balance >0){
            this.balance -= cash;
        }
    };



}
