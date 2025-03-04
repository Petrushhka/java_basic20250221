package basic.oop.homework.encapquiz;

public class BankAccount {

    private long balance;
    private String accountNumber;
    private String accountHolder;

    BankAccount(String Number, String Name, long balance) {
        this.balance = balance;
        this.accountHolder = Name;
        this.accountNumber = Number;
    }

    long getBalance() {
        return this.balance;
    }

    void deposit(long cash) {
        if (cash > 0) {
            this.balance += cash;
        } else {
            System.out.println("입금액이 올바르지 않습니다!"); return;
        }
        ;
    }

    void withdraw(long cash) {
        if (balance > 0) {
            this.balance -= cash;
        } else {
            System.out.println("출금액이 올바르지 않습니다!"); return;
        }
    }

    ;


}
