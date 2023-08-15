package oop_principii.ex6;

public class StudentAccount extends BankAccount {
    private final double maxDepositAmount;

    @Override
    public double withdraw(double amount) {
        //se pot retrage maxim câți bani sunt în cont în momentul retragerii
        if (amount <= getBalance()){
            setBalance(getBalance()-amount);
        }
      return amount;
    }

    @Override
    public double deposit(double amount) {
        //se pot depune maxim “maxDepositAmount” bani o dată
        if (amount <= maxDepositAmount){
            setBalance(getBalance() +amount);
        }
        return amount;
    }

    public StudentAccount(double balance, String acountNumber, double maxDepositAmount) {
        super( balance, acountNumber);
        this.maxDepositAmount = maxDepositAmount;
    }

}
