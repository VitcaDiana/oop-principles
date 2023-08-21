package oop_principii.ex6;

public class StudentAccount extends BankAccount {
    private final double maxDepositAmount;

    @Override
    public double withdraw(double amount) throws OPerationNotSupportedException {
        //se pot retrage maxim câți bani sunt în cont în momentul retragerii
        if (amount >= getBalance()) {
            throw new OPerationNotSupportedException("you can not withdraw more than you have from a student account");

        }
        setBalance(getBalance() - amount);
        return getBalance();
    }

    @Override
    public double deposit(double amount) throws OPerationNotSupportedException {
        //se pot depune maxim “maxDepositAmount” bani o dată
        if (amount >= maxDepositAmount) {
     throw new OPerationNotSupportedException("you can not deposit more than " + maxDepositAmount);

        }
        setBalance(getBalance() + amount);
        return getBalance();
    }

    public StudentAccount(double balance, String acountNumber, double maxDepositAmount) {
        super(balance, acountNumber);
        this.maxDepositAmount = maxDepositAmount;
    }

    @Override
    public String toString() {
        return "StudentAccount{" +
                "maxDepositAmount=" + maxDepositAmount +
                "balance= " + getBalance() +
                "AccountNumber= " + getAcoountNumber() +
                '}';


    }
}
