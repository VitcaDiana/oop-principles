package oop_principii.ex6;

public abstract class BankAccount {

    private double balance;
    private String acountNumber;

    public BankAccount(double balance, String acountNumber) {
        this.balance = balance;
        this.acountNumber = acountNumber;
    }

    public abstract double withdraw(double amount) throws  OPerationNotSupportedException ;
    public abstract double deposit(double amount) throws OPerationNotSupportedException;

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

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", acountNumber='" + acountNumber + '\'' +
                '}';
    }
}
