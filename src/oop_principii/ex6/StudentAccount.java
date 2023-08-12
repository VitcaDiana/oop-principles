package oop_principii.ex6;

public class StudentAccount extends BankAccount {
    private final int maxDepositAmount;

    @Override
    public int withdrow(int amount) {
        return 0;
    }

    @Override
    public int deposit(int amount) {
        return 0;
    }

    public StudentAccount(int balance, String acoountNumber, int maxDepositAmount) {
        super(balance, acoountNumber);
        this.maxDepositAmount = maxDepositAmount;
    }
}
