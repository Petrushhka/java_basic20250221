package basic.oop.encap.quiz;

import java.util.Arrays;

public class BanckAccount {
    private int balance;
    private int accountNumber;
    private String accountHolder;

    public void make(int accountNumber,String accountHolder) {
         this.accountNumber = accountNumber;
        this.balance = 0;
        this.accountHolder = accountHolder;
        System.out.println("계좌 정보: " + this.accountNumber + " 예금주: " + this.accountHolder);
    }


    public int getBalance(int accountNumber) {
        if (accountNumber == this.accountNumber)
            return this.balance;
        else{ return -1;}
    };

    //
    public void deposit(int accountNumber, int money) {
        if (accountNumber == this.accountNumber) {
            this.balance += money;
            System.out.println("입금 금액: " + money + " 현재 잔액: " + this.balance);
        }
    }

    public void withdrawal(int accountNumber, int money) {
        if (accountNumber != this.accountNumber) {
            System.out.println("계좌확인 요망!");
        } else {
            if (this.balance >= money) {
                this.balance -= money;
                System.out.println("남은 금액: " + this.balance);
            } else {
                System.out.println("더 큰 금액을 출금할 수 없어요.");
            }
        }
        ;
    }
}

