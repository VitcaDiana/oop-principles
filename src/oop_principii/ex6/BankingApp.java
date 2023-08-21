package oop_principii.ex6;

import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Client client = new Client("Pop", "Maria");

        BankAccount account1= new StudentAccount(2000, "STUD123", 200);
        BankAccount account2= new StudentAccount(2000, "STUD234", 200);
        BankAccount account3 = new SpendingAccount(3000, "SPEND456", 5000);
        BankAccount account4 = new SpendingAccount(3000, "SPEND789", 5000);

        System.out.println(client.addAccount(account1));
        System.out.println(client.addAccount(account2));
        System.out.println(client.addAccount(account3));
        System.out.println(client.addAccount(account4));

      //  System.out.println(client.deposit(400, "STUD123"));
       // System.out.println(client.withdraw(500, "SPEND456"));
        try{
            client.deposit(2001,"STUD123");
        }catch (OPerationNotSupportedException e){
            System.out.println(e.getMessage());
        }

        client.listAccounts();
        System.out.println( client.checkAccountDetails("STUD123"));
    }
}
