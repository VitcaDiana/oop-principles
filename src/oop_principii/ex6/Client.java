package oop_principii.ex6;

public class Client {
    private String firstName;
    private String lastName;

    private BankAccount[] accounts;
    private int numberOfAccounts;


    public Client(String firstName, String lastName, int maxNumberOfAccounts) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accounts = new BankAccount[maxNumberOfAccounts];
        this.numberOfAccounts = 0;
    }

    public boolean addAccount(BankAccount account) {
        if (numberOfAccounts < accounts.length){
            accounts[numberOfAccounts]=account;
            numberOfAccounts++;
            return true;
        }
        return false;
    }
    public void listAccounts(){
        for (int i=0; i < numberOfAccounts;i++){
            BankAccount account = accounts[i];
            System.out.println("Account number " + account.getAcoountNumber() + " Balance " + account.getBalance());

        }
    }
    public double deposit(double amount,String acountNumber) {
        //caut in accounts contul cu numarul accountNumber
        //depozitez in el suma de bani amount
        BankAccount account = findAccountNumber(acountNumber);
        if (account != null) {
            account.deposit(amount) ;
            return account.getBalance();
        }
        else {
            return -1;
        }

    }


    public BankAccount findAccountNumber(String accountNumber){
        for (int i=0; i<numberOfAccounts;i++){
            if (accounts[i].getAcoountNumber().equals(accountNumber)){
                return accounts[i];
            }
        }
        return null;
    }
    //witdrow e la fel ca deposit
    public double withdraw(double amount, String acountNumber){
        BankAccount account = findAccountNumber(acountNumber);
        if (account != null){
             account.withdraw(amount);
             return account.getBalance();

        }
        else{
            return -1;
        }

    }
    public void checkAccountDetails(String accountNumber){
         //cautam contul cu numarul numberAccount
        //afisam atributele pe care le are
        BankAccount account = findAccountNumber(accountNumber);
        if (account != null){
            System.out.println("Account number " + account.getAcoountNumber() + " Balance " + account.getBalance());

        }
        else {
            System.out.println("Not found account ");
        }

    }

}




