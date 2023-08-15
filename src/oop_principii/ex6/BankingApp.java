package oop_principii.ex6;

public class BankingApp {
    public static void main(String[] args) {
        Client client = new Client("Pop", "Maria", 3);

        StudentAccount studentAccount = new StudentAccount(2000, "STUD123",8000);
        SpendingAccount spendingAccount = new SpendingAccount(3000, "SPEND456",5000);

        System.out.println(client.addAccount(studentAccount));
        System.out.println(client.addAccount(spendingAccount));

        System.out.println(client.deposit(400,"STUD123"));
        System.out.println(client.withdraw(500,"SPEND456"));
        client.listAccounts();
        client.checkAccountDetails("STUD123");
    }
}
