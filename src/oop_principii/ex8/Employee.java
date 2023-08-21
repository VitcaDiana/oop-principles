package oop_principii.ex8;

public class Employee {
    private String firstName;
    private String lastName;
    private int salary;
    private Adress adress;

    public Employee(String firstName, String lastName, int salary, Adress adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.adress = adress;
    }

    public String getName() {
        return this.firstName + " "+ this.lastName;
    }
    public String getAdressStreet(){
        return this.adress.getStreet();
    }
    public String addressAttributes(){
       return this.adress.toString();
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}
