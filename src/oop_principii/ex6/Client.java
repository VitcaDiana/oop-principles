package oop_principii.ex6;

public class Client {
    private String firstName;
    private String lastName;

    private BankAccount[] accounts;
    private int numberOfAccounts;


    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        accounts = new BankAccount[20];
        numberOfAccounts = 0;
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
            System.out.println(accounts[i].toString());

        }
    }
    public double deposit(double amount,String acountNumber) throws OPerationNotSupportedException {
        //caut in accounts contul cu numarul accountNumber
        //depozitez in el suma de bani amount
        BankAccount account = findAccountNumber(acountNumber);
        if (account == null) {
            return Integer.MIN_VALUE;
        }
            return account.deposit(amount) ;

        }





    private BankAccount findAccountNumber(String accountNumber){
        //parcugem lista de conturi a clientului curent
        //numarul primit ca parametru cu numarul curent din parcurgere
        for (int i=0; i<numberOfAccounts;i++){
            if (accounts[i].getAcoountNumber().equals(accountNumber)){
                return accounts[i];
            }
        }
        return null;
    }
    //witdrow e la fel ca deposit
    public double withdraw(double amount, String acountNumber) throws OPerationNotSupportedException {
        BankAccount account = findAccountNumber(acountNumber);
        if (account == null) {
            return Integer.MIN_VALUE;
        }
             return account.withdraw(amount);


        }



    public String checkAccountDetails(String accountNumber){
         //cautam contul cu numarul numberAccount
        //afisam atributele pe care le are
        BankAccount account = findAccountNumber(accountNumber);
        if (account == null) {
            return "";
        }
        return account.toString() + this.firstName + this.lastName;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BankAccount[] getAccounts() {
        return accounts;
    }

    public void setAccounts(BankAccount[] accounts) {
        this.accounts = accounts;
    }

    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public void setNumberOfAccounts(int numberOfAccounts) {
        this.numberOfAccounts = numberOfAccounts;
    }
}




