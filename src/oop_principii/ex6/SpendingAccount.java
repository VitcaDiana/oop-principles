package oop_principii.ex6;


public class SpendingAccount extends BankAccount {
    private double maxWidrawalAmount;

    public SpendingAccount(double balance, String acountNumber, double maxWidrawalAmount) {
        super(balance, acountNumber);
        this.maxWidrawalAmount = maxWidrawalAmount;
    }

    @Override
    public double withdraw(double amount) {
        //se pot retrage cu maxim “maxWithdrawalAmount” RON mai mult decât există în cont în momentul retragerii
        // (exemplu: dacă în cont sunt 5000 de RON, iar maxWithdrawalAmount este 2000 RON, se pot retrage maxim 7000 RON)
if (amount <= getBalance() + maxWidrawalAmount ){
    setBalance(getBalance()-amount);
}
        return amount;
    }

    @Override
    public double deposit(double amount) {
       // oricâți bani se pot depune în cont
        setBalance(getBalance()+amount);
        return amount;
    }


}
