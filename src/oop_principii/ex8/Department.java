package oop_principii.ex8;

public class Department {
    private String name;
    private Employee[] employees;
    private int numberOfEmployesAdded;

    public Department(String name, Employee[] employees, int numberOfEmployesAdded) {
        this.name = name;
        this.employees = employees;
        this.numberOfEmployesAdded = numberOfEmployesAdded;
    }

    public int numberOfEmployessByDepartment() {
        return employees.length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public int getNumberOfEmployesAdded() {
        return numberOfEmployesAdded;
    }

    public void setNumberOfEmployesAdded(int numberOfEmployesAdded) {
        this.numberOfEmployesAdded = numberOfEmployesAdded;
    }

    public void printAllEmployees() {
        for (int i = 0; i < numberOfEmployesAdded; i++) {
            System.out.println(employees[i].getName());
        }
    }

    public void printStreetEmployees() {
        for (int i = 0; i < numberOfEmployesAdded; i++) {
            System.out.println(employees[i].getAdress().getStreet());
        }
    }

    public String searchAndPrintEmployeeByName(String employeeName) {
        for (int i = 0; i < numberOfEmployesAdded; i++) {
            if (employees[i].getName().equals(employeeName)) {
                return employees[i].getName();
            }
        }
        return "";
    }

    public String printEmployeAdress(String employeeName) {
        for (int i = 0; i < numberOfEmployesAdded; i++) {
            if (employees[i].getName().equals(employeeName)) {
                return employees[i].addressAttributes();
            }
        }

        return "";
    }
    public String searchAdressByStreet(String streetName){
        for (int i=0; i<numberOfEmployesAdded;i++){
            if (employees[i].getAdress().getStreet().equals(streetName)){
                return employees[i].getAdressStreet();
            }
        }
        return "";
    }

}
