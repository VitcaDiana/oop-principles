package oop_principii.ex6;

public abstract class BankAccount {

    private double balance;
    private String acountNumber;

    public BankAccount(double balance, String acountNumber) {
        this.balance = balance;
        this.acountNumber = acountNumber;
    }

    public abstract double withdraw(double amount) ;
    public abstract double deposit(double amount);

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAcoountNumber() {
        return acountNumber;
    }

    public void setAcoountNumber(String acoountNumber) {
        this.acountNumber = acoountNumber;
    }
}
