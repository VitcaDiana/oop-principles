package oop_principii.ex6;

public abstract class BankAccount {

    int balance;
    String acoountNumber;

    public BankAccount(int balance, String acoountNumber) {
        this.balance = balance;
        this.acoountNumber = acoountNumber;
    }

    public abstract int withdrow(int amount) ;
    public abstract int deposit(int amount);
}
